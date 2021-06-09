import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SubOneIndep extends JFrame {
	
	public SubOneIndep() {
		setTitle("키보드 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("r=red y=yellow b=blue");
		MyKeyListener listener = new MyKeyListener();
		c.addKeyListener(listener);
		la.addKeyListener(listener);
		c.add(la);
		
		setSize(250,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SubOneIndep();
	}

}

class MyKeyListener extends KeyAdapter {
	
	@Override
	public void keyPressed(KeyEvent e) {
		Container co = (Container)e.getSource();
		JLabel lab = (JLabel)e.getSource();
		
		switch(e.getKeyChar()) {
		case 'r':
			lab.setText("붉은색입니다");
			co.setBackground(Color.RED);
			break;
		case 'y':
			lab.setText("노란색입니다");
			co.setBackground(Color.YELLOW);
			break;
		case 'b':
			lab.setText("파란색입니다");
			co.setBackground(Color.BLUE);
			break;
		case 'q':
			System.exit(0);
		}
	}
}