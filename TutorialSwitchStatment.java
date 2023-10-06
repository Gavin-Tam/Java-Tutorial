import java.util.Scanner;

public class TutorialSwitchStatment {
	
public static void main(String[] args) {
	while(true) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please pick on of the following: \n 1 Addition "
			+ "\n 2 Subtraction \n 3 Multiplication \n 4 Division \n 5 Exit");
	int input = scan.nextInt();
	
	if(input == 5 ) {
		System.out.println("Exiting the program.");
		break;
	}else if (input > 5) {
	    continue;
	}

	System.out.println("Please Enter a number:");
	int usernum1 = scan.nextInt();
	if(input == 4 && usernum1 ==0  ) {
		System.out.println("It can't be 0!");
		continue; // continue condition will go back to the beginning of the loop, if this statement is true.
	}
		
	System.out.println("Please Enter a  second number:");
	int usernum2 = scan.nextInt();
	if(input == 4  && usernum2 ==0 ) {
		System.out.println("It can't be 0!");
		continue; 
}
	
	switch(input) {
	case 1:
		System.out.println(usernum1 + usernum2); 
		break;
	case 2:
		System.out.println(usernum1 - usernum2); 
		break;
	case 3:
		System.out.println(usernum1 * usernum2); 
		break;
		
	case 4:
		System.out.println(usernum1 / usernum2); 
		break;
	
		default: 
			System.out.println("Invalid Choice!");
	
	    }

      }
	}
	
	
}

