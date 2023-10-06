
public class TutorialMethods {
	
	// The key word void is only use when I am not returning anything.
	static void myfirstmethod()
	{
		System.out.println("I just created my first Method");
	}
	static void newmethod(String fname, int age) {
		System.out.println(fname + " is " + age);
	}
	//Here we are not using the void keyword because we are returning the function. 
	static int add(int a, int b) {
		int sum =  a+b; 
		return sum; 
	}
	
	//Overloading methods
	static int plusMethodInt(int x, int y) {
		  return x + y;
		}

		static double plusMethodDouble(double x, double y) {
		  return x + y;
		}


	public static void main(String[] args) {
		myfirstmethod();
		
		int answer = add(5,5);
	System.out.println("The sum is: " +answer);
		
	
	newmethod("Gavin", 21);
	
	
	int myNum1 = plusMethodInt(8, 5);
	  double myNum2 = plusMethodDouble(4.3, 6.26);
	  System.out.println("int: " + myNum1);
	  System.out.println("double: " + myNum2);
	}

}
