package encapsulation;
import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a word to check palindrome or not: ");
		        String input = scanner.nextLine();
                String reversed = "";

		        for (int i = input.length() - 1; i >= 0; i--) {
		            reversed += input.charAt(i);
		        }

		        if (input.equals(reversed)) {
		            System.out.println("Palindrome");
		        } else {
		            System.out.println("Not a Palindrome");
		        }
		        //reverse a number
		        Scanner obj = new Scanner(System.in);
				System.out.println("Enter the value for n: ");
				int n = obj.nextInt();
				    
				int remainder;
				int temp = n;
				int reverse = 0;
				
				
				while(temp!=0)
				{
					remainder = temp %10;
					reverse = (reverse*10)+remainder;
					temp = temp/10;
				}
				
				System.out.println(reverse);


	}

}
