package com.bridgelabzs;

import java.util.Scanner;
/***
 * 
 * @author Admin
 *
 */

public class PrimeNumber {
	/*
	 *Created method to check number is prime number or not. 
	 */
	static void isPrime(int n){
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number ");
        int number= input.nextInt();
        isPrime(number);
    }
}


