//2017-08-30 KST askTime/Person.java
package askTime;

public class Person {
	private String name;
	private Watch watch;
	
	public Person(String name, Watch watch) {
		this.name = name;
		this.watch = watch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Watch getWatch() {
		return watch;
	}
	public void setWatch(Watch watch) {
		this.watch = watch;
	}
	public String whatTime() {
		if(watch != null)
			return watch.whatTime();
		else
			return "저는 시계가 없어요 ㅜㅜ";
	}
}