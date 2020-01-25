package com.springbook.ioc.injection;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollcetionBeanClient {
	public static void main(String[] args){
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");

				/*CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
				List<String> addressList = bean.getAddressList();
				for(String a : addressList){
					System.out.println(a.toString());
				}
				
				factory.close()*/;
	}
}
