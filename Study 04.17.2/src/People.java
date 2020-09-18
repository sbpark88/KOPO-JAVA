
public class People {
	String name;
	int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.age + ")"; 
	}

}
