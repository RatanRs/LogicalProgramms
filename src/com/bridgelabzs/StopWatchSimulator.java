package com.bridgelabzs;

import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */

public class StopWatchSimulator {
	/*
	 * static variables for storing start and end time
	 */
	static double start = 0, stop = 0;

	/**
	 * Function to put start time and print it
	 */
	static void startTime() {
		start = System.currentTimeMillis();
		System.out.println("started at " + start);
	}

	/**
	 * function to put stop time and print it
	 */
	static void stopTime() {
		stop = System.currentTimeMillis();
		System.out.println("stopped at " + stop);
	}

	/**
	 * function to calculate elapsed time and print it
	 */
	static void elapsedTime() {
		System.out.println("elapsed time is " + (stop - start) / 1000);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter 1 to start");
		input.next();
		startTime();
		System.out.println("enter to stop");
		input.next();
		stopTime();
		elapsedTime();
	}
}
