
public class Shirt {
public static String color;
public static char size;
public static String  material;

	
Shirt(){} //Default Constructor

Shirt(String newColor, char newSize){ //Constructor 
	color = newColor;
	size = newSize;
}
Shirt(String newColor, char newSize, String newMaterial){ //Constructor 
	color = newColor;
	size = newSize;
	material = newMaterial;
	
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

public static void setMaterial(String newMaterial) {

material = newMaterial;
}
}


