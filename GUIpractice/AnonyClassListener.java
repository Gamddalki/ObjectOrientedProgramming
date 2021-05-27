import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonyClassListener extends JFrame {
	public AnonyClassListener() {
		setTitle("내부클래스를 사용하는 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		//btn.addActionListener(new MyActionListener());
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				
				setTitle(b.getText());
			}
		});
		c.add(btn);
		
		setSize(200,120);
		setVisible(true);
	}
	
	/* private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			AnonyClassListener.this.setTitle(b.getText());
		}
		
	} */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonyClassListener();
	}

}
