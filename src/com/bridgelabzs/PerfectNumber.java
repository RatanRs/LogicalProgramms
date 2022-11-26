package com.bridgelabzs;

import java.util.Scanner;
/***
 * 
 * @author Admin
 *
 */

public class PerfectNumber {
	/***
	 * 
	 * @param args
	 */
	 public static void main(String[] args) {
		 /**
		  * Used scanner class to take input  from user. 
		  */
	        Scanner input=new Scanner(System.in);
	        System.out.print("Enter the number ");
	        int number=input.nextInt();
	        int sum=0;
	        for(int i=1;i<number;i++) {
	            if (number % i == 0) {
	                sum = sum + i;
	            }
	        }
	        if (number == sum) {
	            System.out.println(number + " is a perfect number");
	        }
	        else {
	            System.out.println(number + " is not a perfect number");
	        }

	    }
	}

