// 2017-11-01 KST InnerClassListener.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class InnerClassListener extends JFrame{
	InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());	//Action Event Listener
		c.add(btn);
		
		setSize(250, 120);
		setVisible(true);
		
		// Innner Class
		class MyActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
			}
		}
	}
	
	public static void main(String[] args) {
		new InnerClassListener();
	}
}