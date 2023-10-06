import java.util.Scanner;

public class TutorialUserinput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Create a Scanner object
		System.out.println("Please Enter your first name:");
		String firstName = scan.next();// Read the user input
		System.out.println("Please Enter your age:");
		int age = scan.nextInt();
		System.out.println("Your first name is " +firstName+ " and your age is " + age);
	}

}
