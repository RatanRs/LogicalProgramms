package com.bridgelabzs;

import java.util.Random;
import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */
public class CoupanCode {
	/***
	 * 
	 * @param array
	 * @param number
	 * @return
	 */
	public static boolean isPresent(int array[], int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the range for coupancode ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int random = 0;
		int array1[] = new int[size];
		Random number = new Random();
		boolean return1;
		for (int i = 0; i < array1.length; i++) {
			random = number.nextInt(20) + 1;
			return1 = isPresent(array1, random);
			if (return1 != true) {
				array1[i] = random;
			} else {
				i--;
			}
		}
		System.out.println("The Coupan number generated=");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(" " + array1[i]);
		}
	}
}
