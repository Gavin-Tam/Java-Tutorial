
public class TurtorialOOP {
	/*OOP stands for Object-Oriented Programming.
	 * What are Classes and Objects
	 * Classes and objects are the two main aspects of object-oriented programming.
	 * for example lets take Class Fruit the object would be things Like 
	 * an Orange, Apple, pineapple and so forth. 
	 * For example lets say the class was a pen
	*/ 
	//Attributes
	String type = "Pencil";
	String color = "Blue";
	int point = 10; 
	// Actions of the Attributes 
	static boolean clicked = false; 
	
	  public static void click() {
		clicked = true;
		
	}
	public static void unclick() {
		clicked = false;
	}


	public static void main(String[] args) {
		
		TurtorialOOP pen = new TurtorialOOP();
		
		System.out.println(pen.color);
		System.out.println(pen.type);
		System.out.println(pen.point);
		
		System.out.println(pen.clicked);// this pen is unclicked.

		pen.click(); // here we called the click method which not every-time we call "System.out.println(pen.clicked);" will be true.
		System.out.println(pen.clicked);
		//This pen is clicked.
		System.out.println(pen.clicked);
	}
	

}
