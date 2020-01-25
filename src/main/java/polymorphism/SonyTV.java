package polymorphism;

public class SonyTV implements TV {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println(" SonyTV =======> 전원 켠다");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println(" SonyTV =======> 전원 끈다.");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println(" SonyTV =======> 소리 올린다.");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println(" SonyTV =======> 소리 내린다.");
	}

}
