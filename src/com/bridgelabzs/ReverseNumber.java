package com.bridgelabzs;

import java.util.Scanner;

/***
 * 
 * @param args
 */

public class ReverseNumber {
	/***
	 * 
	 * @param args
	 */
	 public static void main(String[] args){
		 /*
		  * Used Scanner Class to take input from user.
		  */
	        Scanner input=new Scanner(System.in);
	        System.out.print("Enter the number ");
	        int number= input.nextInt();
	        int reverse=0;
	        /*
	         * Used while loop to check the condition.
	         */
	        while(number!=0){
	            int remainder=number%10;
	            reverse=reverse*10+remainder;
	            number=number/10;
	        }
	        System.out.println("Reverse of the number is "+reverse);
	    }
	}

