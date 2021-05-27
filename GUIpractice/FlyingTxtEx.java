import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlyingTxtEx extends JFrame {
	private JPanel contentPane = new JPanel();
	private JLabel la = new JLabel("Hello");
	
	public FlyingTxtEx() {
		super("상하좌우 키를 이용해 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		la.setLocation(50,50);
		la.setSize(100, 20);
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		
		setSize(200,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int keyCode = e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY()-10);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+10);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-10, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+10, la.getY());
				break;
			default:
				break;
			}
			
			super.keyPressed(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTxtEx();
	}

}
