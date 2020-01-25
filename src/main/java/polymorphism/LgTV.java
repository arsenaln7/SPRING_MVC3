package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
//	@Autowired
//	@Qualifier("apple")
//	@Resource(name="apple")
	@Autowired
	private Speaker speaker;
	
	public LgTV(){
		System.out.println("LGTV ===> 객체생성");
	}
	public void powerOn() {
		System.out.println("LGTV --- 전원 켠다.");
	}
	
	public void powerOff(){
		System.out.println("LGTV --- 전원 끈다.");
	}
	
	public void volumeUp(){
		speaker.volumeUp();
		System.out.println("LGTV --- 소리 올린다.");
	}
	
	public void volumeDown(){
		speaker.volumeDown();
		System.out.println("LGTV --- 소리 내린다.");
	}
}
