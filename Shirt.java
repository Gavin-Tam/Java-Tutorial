
public class Shirt {
public static String color;
public static char size;
	
Shirt(){} //Default Constructor

Shirt(String newColor, char newSize){ //Constructor 
	color = newColor;
	size = newSize;
}

public static void putOn() {
	System.out.println("Shirt is on!");
}

public static void takeOff() {
	System.out.println("Shirt is off!");
}

public static void setColor(String newColor ) {
	color = newColor;
}
public static void setSize(char newSize) {

size = newSize;
}
}
