//2017-09-27 KST exception/ExceptionExam.java
package exception;

import java.util.Scanner;

class BadUserException extends Exception {
	public BadUserException(String id) {
		super(id + "는 잘못된 사용자 아이디입니다.");
	}
}
class BadPassException extends Exception {
	public BadPassException(String pass) {
		super(pass + "는 잘못된 암호입니다.");
	}
}
class UserLogin {
	private String id = "aaa";
	private String pass = "bbb";
	
	public boolean login(String id, String pass) throws BadUserException, BadPassException {
		if(!this.id.equals(id))
			throw new BadUserException(id);
		if(!this.pass.equals(pass))
			throw new BadPassException(pass);

		return true;
	}
}
public class ExceptionExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사용자의 아이디를 입력하세요.");
		String id = scan.next();
		System.out.println("사용자의 비밀번호를 입력하세요.");
		String pass = scan.next();
		UserLogin ul = new UserLogin();
		try {
			boolean ok = ul.login(id, pass);
			if(ok)
				System.out.println(id + "님 환영합니다.");
		}catch(BadUserException e) {
			System.out.println(e.getMessage());
		}catch(BadPassException e1) {
			System.out.println(e1.getMessage());
		}
		
		scan.close();
	}
}
