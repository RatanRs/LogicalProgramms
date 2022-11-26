package com.bridgelabzs;

import java.util.Scanner;
/***
 * 
 * @author Admin
 *
 */

public class FibonacciNumber {
	/***
	 * 
	 * @param args
	 */
	 public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        System.out.print("Enter the number ");
	        int number= input.nextInt();
	        int firstNumber=0;
	        int secondNumber=1;
	        int nextNumber;
	        System.out.println("Fibonacci series  is ");
	        System.out.print(firstNumber+" "+secondNumber+" ");
	        for(int i=2;i<=number;i++){
	            nextNumber=firstNumber+secondNumber;
	            firstNumber=secondNumber;
	            secondNumber=nextNumber;
	            System.out.print(nextNumber+" ");
	        }
	    }

}
