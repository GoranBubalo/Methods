//METHOD
public class Main {
	
	public static void main(String[] args) {
		
		//method = a block of code that is executed whenever it is called upon 
		
		//make a static reference to a static method 
		
		String name = "Bro";
		int age = 21;
		hello(age);
		Name(name);
		
		
		
		int x = 3;
		int y = 4;
		
		System.out.println(add(x,y));
		// OR
		// int z = x + y
		// System.out.println(z)
	}
	
	static void hello(int age){
		System.out.println("Hello, I am " + age + " Years old");
	}
	
	static void Name(String name) {
		System.out.println("My name is " + name + "!!!");
	}
	//Return method 
	static int add(int x, int y) {
		int z = x + y;
		return z;
		
		//OR 
		// return x + y 
	}
}
