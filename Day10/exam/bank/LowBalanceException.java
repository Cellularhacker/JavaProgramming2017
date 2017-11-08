//2017-11-07 KST LowBalanceException.java
package exam.bank;

public class LowBalanceException extends Exception{
	public LowBalanceException(String name) {
		super(name + "님의 계좌에 잔고가 부족합니다.");
	}
}
