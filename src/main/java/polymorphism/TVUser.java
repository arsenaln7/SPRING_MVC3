package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * 19.12.08 [결합도] 높은 프로그램 SamsungTV tv = new SamsungTV(); tv.powerOn();
		 * tv.volumeUp(); tv.volumeDown(); tv.powerOff();
		 * 
		 * LgTV tv = new LgTV(); tv.turnOn(); tv.soundUp(); tv.soundDown();
		 * tv.turnOff();
		 */
		/*
		 * 19.12.08 [인터페이스] 결합도를 좀 낮춘 프로그램 TV tv = null; tv = new SamsungTV();
		 * tv.powerOn(); tv.volumeUp(); tv.volumeDown(); tv.powerOff();
		 * System.out.println("-----"); tv = new LgTV(); tv.powerOn();
		 * tv.volumeUp(); tv.volumeDown(); tv.powerOff(); } TV tv = null; tv =
		 * new SonyTV(); tv.powerOn(); tv.powerOff(); tv.volumeUp();
		 * tv.volumeDown();
		 */

		/*
		 * 19.12.08 [디자인패턴] 디자인 패턴을 이용한 다형성 BeanFactory factory = new
		 * BeanFactory(); TV tv = (TV) factory.getBean(args[0]); tv.powerOn();
		 * tv.powerOff(); tv.volumeUp(); tv.volumeDown();
		 */
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring 컨테이너로부터 필요한 객체를 요청(LookUp) 한다.
		// 2-1. 2번 예하의 내용이 없어도, pre-loading을 통해 자동 객체 생성 된다.
		/*
		 * TV tv = (TV)factory.getBean("tv"); tv.powerOn(); tv.volumeUp();
		 * tv.volumeDown(); tv.powerOff();
		 * 
		 * TV tv1= (TV)factory.getBean("lg"); tv1.powerOn(); tv1.volumeUp();
		 * tv1.volumeDown(); tv1.powerOff();
		 * 
		 * factory.close();
		 */
		/*19.12.10 빈 속성*/
		//2. 스프링 컨테이너로부터 필요한 객체를 요청한다.
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3.스프링 컨테이너를 종료한다.
		factory.close();
	}
}
