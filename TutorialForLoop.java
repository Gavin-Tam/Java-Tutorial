
public class TutorialForLoop {

	public static void main(String[] args) {
		for (int a = 0; a < 5; a++) {
		    System.out.println(a);
		}      
		System.out.println("----------");
		// less than or equal to 5
		for (int b = 0; b <= 5; b++) {
		    System.out.println(b);
		}
		System.out.println("----------");

		int[] grade = { 98, 100, 50, 65, 75, 55 };
		for (int c = 0; c < grade.length; c++) {
		    System.out.println(grade[c]);
		}
		System.out.println("----------");
		for( int d =0; d < 5; d++) {
			System.out.println("Hello world");
			
		}
	}

}
