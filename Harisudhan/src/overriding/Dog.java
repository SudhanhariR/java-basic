package overriding;

public class Dog {
	public void animal() {
		System.out.println("Dog is a animal");
	}

	public static void main(String[] args) {
		Cat obj =new Cat();
		obj.animal();
		Dog obj1=new Dog();
		obj1.animal();
		
		

	}

}
