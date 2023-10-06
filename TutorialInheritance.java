
public class TutorialInheritance {
	
	

	public static void main(String[] args) {
	Mouse1 m1 = new Mouse1();
	Mouse2 m2 = new Mouse2();
	Mouse3 m3 = new Mouse3();

System.out.println("Mouse1");
	m1.leftClick();
	m1.rightClick();
	m1.scrollDown();
	m1.scrollUp();
	m1.setColor("red");
	System.out.println("-----------------");
	System.out.println("Mouse2");
	m2.connect();
	m2.leftClick();
	m2.rightClick();
	m2.scrollDown();
	m2.scrollUp();
	System.out.println("-----------------");
	System.out.println("Mouse3");
	m3.leftClick();
	m3.rightClick();
	m3.scrollDown();
	m3.scrollUp();
	

	


	}

}
