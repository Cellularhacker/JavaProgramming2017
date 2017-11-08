//2017-11-07 KST AccountManager.java
package exam.bank;

import java.util.*;

public class AccountManager {
	ArrayList<Account> accounts;
	
	public AccountManager() {
		accounts = new ArrayList<Account>();
	}
	
	public void newAccount(String name) {
		accounts.add(new Account(name));
	}
	public void deposit(String name, long amount) {
		for(int i=0; i<accounts.size(); i++) {
			Account account = accounts.get(i);
			if(account.getName().equals(name)) {
				account.deposit(amount);
			}
		}
	}
	public void withdraw(String name, long amount) throws LowBalanceException {
		Iterator<Account> it = accounts.iterator();
		while(it.hasNext()) {
			Account account = it.next();
			if(account.getName().equals(name)) {
				account.widthdraw(amount);
			}
		}
	}
	public String getBalance(String name) {
		String str = null;
		for(Account account : accounts) {
			if(account.getName().equals(name))
				str = new Long(account.getBalance()).toString();
		}
		
		return str;
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
}
