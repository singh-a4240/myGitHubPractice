 /**
 * Software Engineering - Summer 2020 
 */
package myJavaProject;

import java.util.Scanner;
public class myAppTester {
	
 public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  int n=0;
	  System.out.println("Hello Software Engineering World");
	  System.out.println("Input your number and press enter: ");
	  n = input.nextInt();
	  System.out.print("Reverse of the input number is:");
	  reverseMethod(n);
	  System.out.println();
  
	  displayCharacteInRow('s', 8);

	}
	
	
	public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);   
	       }
	   }


	   
	       //add your test method in this space then remove the block comment symbols
		static void displayCharacteInRow(char c,int n){
			if(n >= 1) {
			System.out.print(c);
			displayCharacteInRow(c, n - 1);
		}
	}

	 
	   

}
