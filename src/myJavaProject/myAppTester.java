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
	  wordCount("Reverse of the input number is:");

	  // add a line below to call your myTestMethod from here  then remove the block comment symbols  

	}
	
	//This is a method to reverse the number by recursion
	public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);     // recursive call
	       }
	   }
	
	//this is a new method
		public static void WordCount(String sentenceIs) {
		String eachWordIs=sentenceIs.split(' ');
		System.out.println(eachWordIs);
		for(int x=1;eachWordIs>0;x++) {
		
			return x; 
			
		}
	
	}


	   /* 
	       add your test method in this space then remove the block comment symbols
	       public static void myTestMethod(...){

            

		   }
	 
	   */

}
