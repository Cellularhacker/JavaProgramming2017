// 2017-11-01 KST IndepClassListener.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class IndepClassListener extends JFrame{
	IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());	//Action Event Listener
		c.add(btn);
		
		setSize(250, 120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new IndepClassListener();
	}
}

// Independent Class
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}