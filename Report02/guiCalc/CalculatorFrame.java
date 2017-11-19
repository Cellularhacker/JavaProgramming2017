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
		// leftPanel - AC/C +/- %
		JPanel tmpSpecialOp = new JPanel();
		
		tmpSpecialOp.setLayout(new GridLayout(1,3));
		JButton tmpSpecialOp1 = new JButton("AC/C");
		tmpSpecialOp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetNumberText();
				calc.setOp('0');
				if(calc.getOp() != '0' && numberText.getText().equals("0")) {
					calc.setNum1(0);
					calc.setNum2(0);
				}
			}
		});
		
		JButton tmpSpecialOp2 = new JButton("+/-");
		tmpSpecialOp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = numberText.getText();
				if(text.charAt(0) == '-')
					text = text.substring(1);
				else
					text = '-' + text;
				numberText.setText(text);
			}
		});
		
		JButton tmpSpecialOp3 = new JButton("%");
		tmpSpecialOp3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setOp('%');
				calc.setNum1(Double.parseDouble(numberText.getText()));
				resetNumberText();
			}
		});
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
		}
		// leftPanel - Inner Panels (0 .)
		tmpLeftInner[tmpLeftInner.length-1] = new JPanel();
		tmpLeftInner[tmpLeftInner.length-1].setLayout(new GridLayout(1,2));
		tmpLeft.add(tmpLeftInner[tmpLeftInner.length-1]);
		// setting up integer number Buttons 1 to 9.
		for(int i=3, num=1; i>=1; i--) {
			for(int j=0; j<3; j++) {
				JButton tmpNumButton = new JButton(Integer.toString(num));
				tmpNumButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String name = tmpNumButton.getText();
						if(numberText.getText().equals("0"))
							numberText.setText(name);
						else if(calc.getOp() == '=') {
							calc.setNum1(0);
							numberText.setText(name);
						} else
							numberText.setText(numberText.getText() + name);
					}
				});
				tmpLeftInner[i].add(tmpNumButton);
				num++;
			}
		}
		// setting up integer number 0 and . 
		JButton tmpNumButton = new JButton("0");
		tmpNumButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tmpNumButton.getText();
				if(numberText.getText().equals("0"))
					numberText.setText(name);
				else if(calc.getOp() == '=') {
					calc.setNum1(0);
					numberText.setText(name);
				} else
					numberText.setText(numberText.getText() + name);
				
			}
		});
		tmpLeftInner[tmpLeftInner.length-1].add(tmpNumButton);
		JButton tmpDot = new JButton(".");
		tmpDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tmpDot.getText();
				if(numberText.getText().equals("0"))
					numberText.setText("0.");
				else if(calc.getOp() == '=') {
					calc.setNum1(0);
					numberText.setText("0.");
				} else if(numberText.getText().charAt(numberText.getText().length()-1) == '.') {
					numberText.setText(numberText.getText());
				}else
					numberText.setText(numberText.getText() + name);
			}
		});
		tmpLeftInner[tmpLeftInner.length-1].add(tmpDot);
		// finally add the JPanel;tmpLeft
		leftPanel.add(tmpLeft);
		
		// rightPanel
		JPanel tmpRight = new JPanel();
		tmpRight.setLayout(new GridLayout(5,1));
		// rightPanel - adding Operator Buttons
		JButton tmpOpButton1 = new JButton("+");
		tmpOpButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setOp('+');
				calc.setNum1(Double.parseDouble(numberText.getText()));
				resetNumberText();
			}
		});
		
		JButton tmpOpButton2 = new JButton("-");
		tmpOpButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setOp('-');
				calc.setNum1(Double.parseDouble(numberText.getText()));
				resetNumberText();
			}
		});
		
		JButton tmpOpButton3 = new JButton("*");
		tmpOpButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setOp('*');
				calc.setNum1(Double.parseDouble(numberText.getText()));
				resetNumberText();
			}
		});
		
		JButton tmpOpButton4 = new JButton("/");
		tmpOpButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.setOp('/');
				calc.setNum1(Double.parseDouble(numberText.getText()));
				resetNumberText();
			}
		});
		
		JButton tmpOpButton5 = new JButton("=");
		tmpOpButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(calc.getOp() != '0') {
					calc.setNum2(Double.parseDouble(numberText.getText()));
					
					switch(calc.getOp()) {
						case '+':
							numberText.setText(Double.toString(calc.sum()));
							break;
						case '-':
							numberText.setText(Double.toString(calc.subtract()));
							break;
						case '*':
							numberText.setText(Double.toString(calc.product()));
							break;
						case '/':
							numberText.setText(Double.toString(calc.divide()));
							break;
						case '%':
							numberText.setText(Double.toString(calc.modular()));
						default:
							break;
					}
					
					calc.setOp('=');
					calc.setNum1(calc.getNum2());
					calc.setNum2(0);
				}
			}
		});
		
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
	
	public void resetNumberText() {
		numberText.setText("0");
	}
}
