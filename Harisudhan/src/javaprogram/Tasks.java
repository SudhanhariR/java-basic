package javaprogram;
import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		int year=2024   ;
		if((year%4==0) && (year%100!=0)||(year%400==0))
				System.out.println(year+" is a leap year");
		else
			System.out.println(year+"not a leap year");
		//loop
		for(int i=0;i<=30;i++) {
			if(i%2==0) 
				System.out.println(i);}
       //First natural number
		int a=0;
		for (int i=0; i<=15;i++) {
			a+=i;
			System.out.println(a);
		}
		
		  

	}
		

}
