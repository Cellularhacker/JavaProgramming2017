//2017-11-07 KST MessageBox.java
package exam.bank;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MessageBox extends JFrame{
	Label msgLabel;
	Button closeButton;
	
	public MessageBox(String title, String msg) {
		super(title);
		msgLabel = new Label(msg);
		closeButton = new Button("닫  기");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				setVisible(false);
				MessageBox.this.dispose();
			}
		});
		
		setLayout(new FlowLayout());
		
		add(msgLabel);
		add(closeButton);
		
		pack();
		setVisible(true);
	}
}
