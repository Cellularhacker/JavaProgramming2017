//2017-10-25 KST MyFrame.java 

import javax.swing.*;

public class MyFrame extends JFrame{
	MyFrame() {
		setTitle("300x300x 스윙 프레임 만들기");
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
