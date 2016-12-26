<%@page import="com.atguigu.test.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



     <%
           
           Person person = new Person();
           System.out.print(person.getPersonInfo());
     %>
