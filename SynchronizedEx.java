
public class SynchronizedEx {

	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();
		String [] engText = {
				"Slowly walking down the hall ",
				"Faster than a cannon ball ",
				"Where were you while we were getting high? ",
				"Some day you will find me ",
				"Caught beneath the landslide ",
				"In a champagne supernova in the sky ",
				"A champagne supernova in the sky"
		};
		String [] korText = {
			"아주 여린 그 숨결에",
			"나의 마음이 쉴 곳을 찾아 ",
			"나를 감싸 ",
			"내 안에 바람처럼 불어온 엔젤 ",
			"네게서 일어난 온기가 변화시켜 날 ",
			"이젠 두렵지 않아 내 곁엔 네가 있어 ",
			"이 손을 놓지 않을 테니"
		};
		Thread th1 = new WorkerThread(p, engText);
		Thread th2 = new WorkerThread(p, korText);
		
		th1.start();
		th2.start();
	}

}

class SharedPrinter{
	synchronized void print(String text) {
		for(int i=0; i<text.length(); i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}
}

class WorkerThread extends Thread{
	private SharedPrinter p;
	private String [] text;
	public WorkerThread(SharedPrinter p, String [] text) {
		this.p = p;
		this.text = text;
	}
	
	@Override
	public void run() {
		for(int i=0; i<text.length; i++)
			p.print(text[i]);
	}
}