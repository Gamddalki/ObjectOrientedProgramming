interface PhoneInterface {
	final int TIMEOUT = 1000;
	void sendCall();
	void recieveCall();
	default void printLogo() {
		System.out.println("** Samaung **");
	}
}

class Calcul {
	public int calculate(int x, int y) {return x+y;}
}

class SamsungPhone extends Calcul implements PhoneInterface {
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	public void recieveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	public void schedule() {
		System.out.println("일정을 관리합니다.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.recieveCall();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.flash();
		phone.schedule();
	}
}
