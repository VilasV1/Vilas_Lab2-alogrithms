package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.Transaction;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the total no. of targets that needs to be achieved");
		int targets = sc.nextInt();
		for (int i = 0; i < targets; i++) {
			System.out.println("Enter the value of target");
			int targetValue = sc.nextInt();
			Transaction ts = new Transaction();
			ts.Service(arr, targetValue);
			System.out.println();
		}
	}
}
