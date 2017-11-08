// 2017-11-07 KST Account.java
package exam.bank;

public class Account {
	private String name;
	private long balance;
	
	public Account(String name) {
		this.name = name;
	}
	
	public void deposit(long amount) {
		this.balance = this.balance + amount;
	}
	public void widthdraw(long amount) throws LowBalanceException{
		if(balance < amount)
			throw new LowBalanceException(name);
		else
			balance = balance - amount;
	}
	public long getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
}
