package Week1.Day1;

public class Car {
	
	public void applyBreak() {
		System.out.println("applyBreak");
	}
	public void applyGreat() {
		System.out.println("applyGreat");
	}
	public void switchOnAc() {
		System.out.println("switchOnAc");
	}
	public void applyAcclerate() {
		System.out.println("applyAcclerate");
	}
	
	
	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.applyBreak();
		myCar.applyGreat();
		myCar.switchOnAc();
		myCar.applyAcclerate();
		
		
	}

}
