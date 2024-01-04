package overloading;

public class Studentdata {
	public void student(int id) {
		System.out.println(id);
		
	}
	public void student(String name ) {
		System.out.println(name);
		
	}
	public void student(float mark) {
		System.out.println(mark);
	}
	public void student(long phonenumber){
		System.out.println(phonenumber);
		
	}

	public static void main(String[] args) {
		// Method overloading
		Studentdata obj = new Studentdata();
		obj.student(1);
		obj.student("Sudhan");
		obj.student(99.9f);
		obj.student(7397094022l);
	
		
		 
	}

}
