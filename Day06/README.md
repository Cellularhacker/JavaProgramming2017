### 비정상적인 실행: 예외(Exception)
* RuntimeException을 제외한 나머지 Exception: Checked Exception
=> 예외처리를 하지 않으면 컴파일 에러 발생

* 자바에서 예외처리 방법 2가지
    1) try/catch로 처리
    2) throws선언으로 위임

* b/a => 예외발생 :
> ArithmeticException a = new ArithmeticException();
thorows a;



###### <자바처리예제.java>
* 173th Line -> int result = 3/0;
> ArithmeticException a = new ArithmeticException();
> throw a;