package com.springbook.view.controller;

public class ViewResolver {
	public String prefix;
	public String suffix;
	
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getView(String viewName){
		return prefix+viewName+suffix;
	}
	
}
