import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class VibratingFrame extends JFrame implements Runnable{
	
	Thread th;
	
	public VibratingFrame() {
		setTitle("진동하는 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		setLocation(300,300);
		setVisible(true);
		
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(!th.isAlive())
					return;		//죽었다고 예상을 하는 상황에서 혹시 안죽었을까봐 확인. 스레드가 죽었으면 그냥 두고
				th.interrupt();	//죽지 않았으면 진동스레드한테 보내서 종료시킴
			}
			
		});
		
		th = new Thread(this);
		th.start();
	}
	
	@Override
		public void run() {
			Random r = new Random();
			while(true) {
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					return;
				}
				int x = getX() + r.nextInt()%5;
				int y = getY() + r.nextInt()%5;
				setLocation(x,y);
			}
		}
	
	public static void main(String[] args) {
		new VibratingFrame();
	}
}
