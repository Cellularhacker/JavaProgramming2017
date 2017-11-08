//2017-11-07 KST Bank.java
package exam.bank;

public class Bank {
	AccountManager manager;
	BankFrame frame;
	
	public Bank() {
		manager = new AccountManager();
		frame = new BankFrame(manager);
	}
	
	public static void main(String[] args) {
		Bank jcom = new Bank();
	}
}
