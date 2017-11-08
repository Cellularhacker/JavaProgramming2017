//2017-11-07 KST BankFrame.java
package exam.bank;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class BankFrame extends JFrame implements ActionListener{
	AccountManager  manager;
	JPanel leftPanel, rightPanel;
	JLabel nameLabel, balanceLabel, wonLabel;
	JTextField nameText, balanceText, wonText;
	JButton newButton, dipositButton, withdrawButton;
	JList<String> nameList;
	DefaultListModel<String> names;
	
	public BankFrame(AccountManager manager) {
		super("계좌 관리 화면");
		this.manager = manager;
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		leftPanel = new JPanel();
		leftPanel.setLayout(new GridLayout(5, 1));
		rightPanel = new JPanel();
		
		nameLabel = new JLabel("이 름 :");
		balanceLabel = new JLabel("잔 액 :");
		wonLabel = new JLabel("원");
		
		nameText = new JTextField("", 20);
		balanceText = new JTextField("", 20);
		wonText = new JTextField("", 20);
		
		newButton = new JButton("새계좌");
		dipositButton = new JButton(" 예  금 ");
		withdrawButton = new JButton(" 출  금 ");
		
		newButton.addActionListener(this);
		dipositButton.addActionListener(this);
		withdrawButton.addActionListener(this);
		
		nameList = new JList<String>();
		nameList.setVisibleRowCount(10);
		names = new DefaultListModel<String>();
		nameList.setModel(names);
		nameList.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String name = nameList.getSelectedValue();
				nameText.setText(name);
				balanceText.setText(manager.getBalance(name));
				wonText.setText("");
			}
		});
		
		JPanel imsi = new JPanel();
		imsi.add(nameLabel);
		imsi.add(nameText);
		leftPanel.add(imsi);
		leftPanel.add(newButton);
		
		JPanel imsi1 = new JPanel();
		imsi1.add(balanceLabel);
		imsi1.add(balanceText);
		leftPanel.add(imsi1);
		
		JPanel imsi2 = new JPanel();
		imsi2.add(wonText);
		imsi2.add(wonLabel);
		leftPanel.add(imsi2);
		
		JPanel imsi3 = new JPanel();
		imsi3.add(dipositButton);
		imsi3.add(withdrawButton);
		leftPanel.add(imsi3);
		
		rightPanel.add(new JScrollPane(nameList));
		
		setLayout(new GridLayout(1, 2));
		
		container.add(leftPanel);
		container.add(rightPanel);
		
		setSize(600, 230);
		int x = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 600) / 2);
		int y = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 230) / 2);
		setLocation(x, y);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String name = "";
		long won;
		try {
			name = nameText.getText();
			names.removeAllElements();
			
			if(ae.getSource() == newButton) {
				manager.newAccount(name);
			} else if (ae.getSource() == dipositButton) {
				won = new Long(wonText.getText()).longValue();
				manager.deposit(name, won);
			} else if (ae.getSource() == withdrawButton) {
				won = new Long(wonText.getText()).longValue();
				manager.withdraw(name, won);
			}
			
			ArrayList<Account> accounts = manager.getAccounts();
			
			for(Account account : accounts) {
				names.addElement(account.getName());
			}
			
			balanceText.setText(manager.getBalance(name));
			wonText.setText("");
		} catch (LowBalanceException e) {
			new MessageBox("잔고부족", e.getMessage());
			resetView(name);
		} catch (Exception e) {
			new MessageBox("Error", e.getMessage());
			resetView(name);
		}
	}
	
	private void resetView(String name) {
		ArrayList<Account> accounts = manager.getAccounts();
		
		for(Account account : accounts) {
			names.addElement(account.getName());
		}
		
		nameText.setText(name);
		balanceText.setText(manager.getBalance(name));
		wonText.setText("");
	}
}
