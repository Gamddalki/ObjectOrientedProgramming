import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCharEx extends JFrame {
	private JLabel la = new JLabel("엔터 키로 배경 색이 바뀝니다");
	
	public KeyCharEx() {
		super("키보드 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		
		setSize(250,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int r = (int) (Math.random()*256);
			int g = (int) (Math.random()*256);
			int b = (int) (Math.random()*256);
			
			switch(e.getKeyChar()) {
			case '\n':
				la.setText("r=" + r + ", g=" + g + ", b=" + b);
				getContentPane().setBackground(new Color(r,g,b));
				break;
			case 'q':
				System.exit(0);
			}
			
			super.keyPressed(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCharEx();
	}

}
