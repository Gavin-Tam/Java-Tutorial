import java.util.Scanner;

public class TutorialIfStatement {

	public static void main(String[] args) {
		/*
		 * The while loop is a loop that will repeatedly execute till you 
		 * break it. 
		 * 
		 */
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("If you are a boy please enter B");
		String boy = scan.next();// getting user input
	
		if(boy.equalsIgnoreCase("B")) { 
			/* The line above -is checking is the user entered "B" or "b"
			 * and the IgnoreCase basically allowing lower case and upper 
			 * to be accepted. 
           */
           System.out.println("you are a boy!");
          // Here is where I break the while loop if the user enters "B" or "b".
           break;
		}
		else {
			//Here is where if the user doesn't enter "B" or "b". 
			System.out.println("Since you didn't enter b you must be a girl ");
		}
			
	}

}
