
public class TutorialSetters_Getters {
String name;
int age; 


	public static void main(String[] args) {
		TutorialSetters_Getters a = new TutorialSetters_Getters();
        a.setName("Gavin");
		a.s(21);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		a.printDetails();
	}
	 //setter set within the parameter to variable 
	public void setName(String name) { 
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//Getters just get the variable 
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	
	public void printDetails() {
		System.out.println(getName() + ", " + getName());
	}
	

}
