package com.java.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Socket1 {
//获取本机的域名和IP地址
	public static void main(String[] args) {
		InetAddress address_2 = null;
		try {
			address_2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(address_2);
		InetAddress address_1 = null;
		try {
			address_1 = InetAddress.getByName("Bing-PC");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(address_1);
	}
}
