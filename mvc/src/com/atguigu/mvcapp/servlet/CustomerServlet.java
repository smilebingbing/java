package com.atguigu.mvcapp.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.mvcapp.dao.CriteriaCustomer;
import com.atguigu.mvcapp.dao.CustomerDAO;
import com.atguigu.mvcapp.dao.factory.CustomerDAOFactory;
import com.atguigu.mvcapp.dao.impl.CustomerDAOJdbcImpl;
import com.atguigu.mvcapp.domain.Customer;


public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CustomerDAO customerDAO = new CustomerDAOJdbcImpl();
	//private CustomerDAO customerDAO=new CustomerDAOXMLImpl();
	//面向接口的实现
	
	//工厂模式
	//private CustomerDAO customerDAO =CustomerDAOFactory.getInstance().getCustomerDAO();
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	
	}


	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	String method =request.getParameter("method");
		
	//	switch(method){
	//	case "add":add(request,response);break;
	//	case "query": query(request,response);break;
	//	case "delete": delete(request,response);break;
				
	//	}
	
	
	//}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1.获取ServletPath:/edit.do 或/addCustomer.do
		
		String servletPath =req.getServletPath();
		//2.去除/和.do，得到类似于edit这样的字符串
		String methodName =servletPath.substring(1);
		methodName=methodName.substring(0, methodName.length()-3);

		try {
			//3.利用反射获取methodName对应的方法
			Method method =getClass().getDeclaredMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			//4.利用反射调用对应的方法
			method.invoke(this,req,resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//可以有一些响应
			resp.sendRedirect("error.jsp");
		}
		
	}
	

	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String forwardPath="/error.jsp";
		//1. 获取请求参数id
		String idStr=request.getParameter("id");
		int id=-1;
		//2. 调用CustomerDAO的customerDAO.get(id) 获取和id 对应的Customer 对象
		try {
			Customer customer =customerDAO.get(Integer.parseInt(idStr));
			if(customer!=null){
				forwardPath="/updatecustomer.jsp";
				//3. 将customer 放入request 中
				request.setAttribute("customer",customer);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
						
		}
		
				
		//4. 响应updatecustomer.jsp页面: 转发
		request.getRequestDispatcher(forwardPath).forward(request, response);
	}

	
	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//1. 获取表单参数：id name address phone oldName
		String id =request.getParameter("id");
		String name =request.getParameter("name");
		String address =request.getParameter("address");
		String phone =request.getParameter("phone");
		String oldName =request.getParameter("oldName");
		//2. 检验 name 是否已经被占用
		
		//2.1 比较name 和oldName 是否相同，若相同说明name 可用
		//2.1  若不相同，则调用CustomerDAO 的 getCountWithName(String name) 获取name 在数据库中是否存在

		if(!oldName.equalsIgnoreCase(name)){
			long count =customerDAO.getCountWithName(name);
			//2.2  若返回值大于0，则响应 updatecustomer.jsp页面，:
			if(count>0){
			    // 通过转发的方式来响应newcustomer.jsp 
				//2.2.1 在update customer.jsp页面像是一个错误消息:用户名name已经被占用，请重新选择!
				// 在request 中放入一个属性message:用户名name已经被占用，请重新选择!
				// 在页面上通过request.setAttribute("message")的方式来显示
				request.setAttribute("message", "用户名"+name+"已经被占用，请重新选择！");
				//2.2.2 newcustomer.jsp 的表单值可以回显。
				//通过value="<%= request.getParameter("name")==null ? "" : request.getParameter("name") %>" /></td>
				//address ,phone 显示提交表单的新的值，而name 显示oldName,而不是新提交的name
				//来进行回显
				//2.2.3 结束方法:return
				request.getRequestDispatcher("/updatecustomer.jsp").forward(request, response);
				return;
			}
		}
 
		
		
		
		//3. 若验证通过，把表单参数封装为一个Customer 对象customer
		Customer customer = new Customer(name,address,phone);
		customer.setId(Integer.parseInt(id));
		//4. 调用CustomerDAO 的 update(Customer customer) 执行更新操作
		customerDAO.update(customer);
				
		//5. 重定向到query.do
		response.sendRedirect("query.do");
		
	}


	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String idStr =request.getParameter("id");
		int id =0;
		
		try {
			id=Integer.parseInt(idStr);
			customerDAO.delete(id);
		} catch (Exception e) {
			// TODO: handle exception
			response.sendRedirect("query.do");
		}
		
	}


	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		//获取模糊查询的请求参数
		String name =request.getParameter("name");
		String phone =request.getParameter("phone");
		String address = request.getParameter("address");
		
		//把请求参数封装为一个CriteriaCustomer对象
		CriteriaCustomer cc = new CriteriaCustomer(name,address,phone);
				
				
		
		//1.调用CustomerDAO 的getAll()方法，得到Customer 的集合
		List<Customer> customers =customerDAO.getForListWithCriteriaCustomer(cc);
		
		//2.把Customer 的集合放入request中
		request.setAttribute("customers",customers);
		//3. 转发页面到index.jsp(不能使用重定向）
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}


	private void addCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
					
		//1. 获取表单参数： name,address,phone
		String name =request.getParameter("name");
		String address =request.getParameter("address");
		String phone =request.getParameter("phone");
		
		//2. 检验name是否已经被占用
		
		//2.1  调用CustomerDAO 的 getCountWithName(String name) 获取name 在数据库中是否存在
		long count =customerDAO.getCountWithName("name");
		
		//2.2  若返回值大于0，则响应 newcustomer.jsp页面，:
		// 通过转发的方式来响应newcustomer.jsp
		if(count>0){
			//2.2.1 要求在newcustomer.jsp页面像是一个错误消息:用户名name已经被占用，请重新选择!
			// 在request 中放入一个属性message:用户名name已经被占用，请重新选择!
			// 在页面上通过request.setAttribute("message")的方式来显示
			request.setAttribute("message", "用户名"+name+"已经被占用，请重新选择!");
			
			//2.2.2 newcustomer.jsp 的表单值可以回显。
			//通过value="<%= request.getParameter("name")==null ? "" : request.getParameter("name") %>" /></td>
			//来进行回显
			//2.2.3 结束方法:return
			request.getRequestDispatcher("/newcustomer.jsp").forward(request, response);
			return;
		}
		
		
		
		
		//3. 若验证通过，把表单参数封装为一个Customer 对象customer
		Customer customer = new Customer(name,address,phone);
		//4. 调用CustomerDAO 的 save(Customer customer) 执行保存操作
		customerDAO.save(customer);
		
		//5. 重定向到success.jsp页面，
		//使用重定向可以避免表单的重复提交问题
		
		response.sendRedirect("success.jsp");
	}

}