import java.util.Scanner;

public class TutorialWhileLoop {

	public static void main(String[] args) {
		/*
		 * The while loop is a loop that will repeatedly execute till you 
		 * break it. 
		 * 
		 */
	while(true)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is 1 + 5 = to?");
		int answer = scan.nextInt();
		
		if(answer == 6) {
			System.out.println("you are Correct!");
			break;
		}else {
			System.out.println("Opps your are inccorect please try again");
		}
	}

}

}
