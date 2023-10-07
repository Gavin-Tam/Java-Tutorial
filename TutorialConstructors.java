public class TutorialConstructors {

	public static void main(String[] args) {
	Shirt s1 = new Shirt("White", 'M');
	Shirt s2 = new Shirt("White", 'M',"cotten");
	
System.out.println(s1.color);
System.out.println(s1.size);
System.out.println("--------------");
System.out.println(s2.color);
System.out.println(s2.size);
System.out.println(s2.material);
	}

}

