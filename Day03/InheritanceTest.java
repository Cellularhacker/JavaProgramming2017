// 2017-08-30 KST InheritanceTest.java
class Computer {
	private String owner;
	
	public Computer(String owner) {
		this.owner = owner;
	}
	
	public void calculate() {
		System.out.println("요청 내용을 계산합니다.");
	}
}

class NotebookComp extends Computer {
	private int battery;
	
	public NotebookComp(String name, int initChag) {
		super(name);
		battery = initChag;
	}
	
	public void charge() {
		battery += 5;
	}
	public void useBattery() {
		battery -= 1;
	}
	public void movingCal() {
		if(getBatteryInfo() < 1) {
			System.out.println("충전히 필요합니다.");
			return;
		}
		System.out.println("이동하면서 ");
		calculate();
		useBattery();
	}
	public int getBatteryInfo() {
		return battery;
	}
}

class TabletNotebook extends NotebookComp {
	private String regstPenModel;
	
	public TabletNotebook(String name, int initChag, String pen) {
		super(name, initChag);
		regstPenModel = pen;
	}
	
	public void write(String penInfo) {
		if(getBatteryInfo() < 1) {
			System.out.println("충전이 필요합니다.");
			return;
		}
		if(!regstPenModel.equals(penInfo)) {
			System.out.println("등록된 펜이 아닙니다.");
			return;
		}
		System.out.println("필기 내용을 처리합니다.");
		useBattery();
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		NotebookComp nc = new NotebookComp("이수종" ,5);
		TabletNotebook tn = new TabletNotebook("정수영", 5, "ISE-241-242");
		nc.movingCal();
		tn.write("ISE-241-242");
	}

}