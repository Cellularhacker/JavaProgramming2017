/*
* 2017-11-15 KST
* guiCalc/CalculatorFrame.java
* Cellularhacker
*/
package guiCalc;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class CalculatorFrame extends JFrame implements ActionListener{
	Calculator calc;
	JPanel topPanel, leftPanel, rightPanel;
	JTextField numberText;
	
	public CalculatorFrame(Calculator calc) {
		super("심플 계산기");
		this.calc = calc;
		Container contentPane = getContentPane();
		
		// Size of Window
		this.setSize(320,240);
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT));	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Making inner JPanels
		topPanel = new JPanel();
		
		leftPanel = new JPanel();
		leftPanel.setLayout(new GridLayout(4, 1));
		
		rightPanel = new JPanel();
		rightPanel.setLayout(new GridLayout(4, 1));
		
		
		// Setting up 3 JPanel into the Frame, which is made in BorderLayout;the container.
		contentPane.add(topPanel, BorderLayout.NORTH);	// numberText
		contentPane.add(leftPanel, BorderLayout.CENTER);	// number Buttons
		contentPane.add(rightPanel, BorderLayout.EAST); 	// calculating operators
		
		/* START of Setting up Panels */
		// topPanel
		JPanel tmpTop = new JPanel();
		numberText = new JTextField("0", 22);
		tmpTop.add(numberText);
		topPanel.add(tmpTop);
		// leftPanel
		JPanel tmpLeft = new JPanel();
		tmpLeft.setLayout(new GridLayout(5,1));
		JPanel[] tmpLeftInner = new JPanel[5];
		System.out.println("length=>" + tmpLeftInner.length);
		// leftPanel - AC/C +/- %
		JPanel tmpSpecialOp = new JPanel();
		tmpSpecialOp.setLayout(new GridLayout(1,3));
		JButton tmpSpecialOp1 = new JButton("AC");
		JButton tmpSpecialOp2 = new JButton("+/-");
		JButton tmpSpecialOp3 = new JButton("%");
		// adding Buttons.
		tmpSpecialOp.add(tmpSpecialOp1);
		tmpSpecialOp.add(tmpSpecialOp2);
		tmpSpecialOp.add(tmpSpecialOp3);
		
		tmpLeft.add(tmpSpecialOp);
		// leftPanel - Inner Panels (1 ~ 9)
		for(int i=1; i<=tmpLeftInner.length-2; i++) {
			tmpLeftInner[i] = new JPanel();
			tmpLeftInner[i].setLayout(new GridLayout(1,3));
			tmpLeft.add(tmpLeftInner[i]);
			System.out.println("i=>"+i);
		}
		// leftPanel - Inner Panels (0 .)
		tmpLeftInner[tmpLeftInner.length-1] = new JPanel();
		tmpLeftInner[tmpLeftInner.length-1].setLayout(new GridLayout(1,2));
		tmpLeft.add(tmpLeftInner[tmpLeftInner.length-1]);
		// setting up integer number Buttons 1 to 9.
		for(int i=3, num=1; i>=1; i--) {
			for(int j=0; j<3; j++) {
				JButton tmpNumButton = new JButton(Integer.toString(num));
				tmpLeftInner[i].add(tmpNumButton);
				num++;
			}
		}
		// setting up integer number 0 and . 
		JButton tmpNumButton = new JButton("0");
		tmpLeftInner[tmpLeftInner.length-1].add(tmpNumButton);
		JButton tmpDot = new JButton(".");
		tmpLeftInner[tmpLeftInner.length-1].add(tmpDot);
		// finally add the JPanel;tmpLeft
		leftPanel.add(tmpLeft);
		
		// rightPanel
		JPanel tmpRight = new JPanel();
		tmpRight.setLayout(new GridLayout(5,1));
		// rightPanel - adding Operator Buttons
		JButton tmpOpButton1 = new JButton("+");
		JButton tmpOpButton2 = new JButton("-");
		JButton tmpOpButton3 = new JButton("*");
		JButton tmpOpButton4 = new JButton("/");
		JButton tmpOpButton5 = new JButton("=");
		
		tmpRight.add(tmpOpButton1);
		tmpRight.add(tmpOpButton2);
		tmpRight.add(tmpOpButton3);
		tmpRight.add(tmpOpButton4);
		tmpRight.add(tmpOpButton5);
		
		// finally add the JPanel;tmpRight
		rightPanel.add(tmpRight);
		/* END of Setting up Panels */
		
		
		
		
		// Now Showing the Window!
		setVisible(true);		
	}
	public static void main(String[] args) {
		new CalculatorFrame(new Calculator());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
