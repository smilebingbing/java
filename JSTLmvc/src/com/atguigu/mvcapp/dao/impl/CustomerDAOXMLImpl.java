package com.atguigu.mvcapp.dao.impl;

import java.util.List;

import com.atguigu.mvcapp.dao.CriteriaCustomer;
import com.atguigu.mvcapp.dao.CustomerDAO;
import com.atguigu.mvcapp.domain.Customer;

public class CustomerDAOXMLImpl implements CustomerDAO {

	@Override
	public List<Customer> getForListWithCriteriaCustomer(CriteriaCustomer cc) {
		// TODO Auto-generated method stub
		System.out.println("getForListWithCriteriaCustomer");
		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		System.out.println("getAll");
		return null;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("save ");
	}

	@Override
	public Customer get(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("get");
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("delete");
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("update");
	}

	@Override
	public long getCountWithName(String name) {
		// TODO Auto-generated method stub
		System.out.println("getCountWithName");
		return 0;
	}

}
