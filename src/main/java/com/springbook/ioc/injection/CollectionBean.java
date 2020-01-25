package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
	/* -- List 타입 매핑
	 * private List<String> addressList;
	
	public void setAddressList(List<String> addressList){
		this.addressList=addressList;
	}
	
	public List<String> getAddressList(){
		return addressList;
	}*/
	
	/* -- set 타입 매핑 */
	
	/*private Set<String> addressList;
	
	public void setAddressList(Set<String> addressList){
		this.addressList=addressList;
	}*/
	
	/*-- Map 타입 매핑 */
	private Map<String, String> addressList; 
	public void setAddressList(Map<String, String> addressList){
		this.addressList=addressList;
	}
}
