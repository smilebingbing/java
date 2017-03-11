package com.atguigu.javaweb;

public class Authority {

	//显示到页面上的权限的名字
	private String displayName;
	
	//权限对应的URL地址:一个权限对应着一个URL
	private String url;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Authority(String displayName, String url) {
		super();
		this.displayName = displayName;
		this.url = url;
	}
	
	
}
