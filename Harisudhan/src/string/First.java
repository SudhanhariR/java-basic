package string;

public class First {

	public static void main(String[] args) {
	String color = "Pink";
	char result = color .charAt(0);
	System.out.println(result);
	
	//Concat()
	String first = "Sudhan";
	String last = "Hari";
	String fullname = first .concat(last);
	System.out.println(fullname);
	
	// Contain()
	System.out.println(first.contains("a"));
	System.out.println(last.contains("n"));
	
	//indexof()
	System.out.println(color.indexOf("P"));
	
	//tolowercase
	System.out.println(first.toLowerCase());
	//UPPERCASE
	System.out.println(first.toUpperCase());
	//Lenght()
	System.out.println(fullname.length());
	//IsEmpty()
	System.out.println(first.isEmpty());
	//REPLACE
	String name ="Black is my favo color Black is cool";
	System.out.println(name.replaceAll("Black", "Blue"));
	
	

	}

}
