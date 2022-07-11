package com.greatlearning.service;

public class Transaction {

	public void Service(int[] arr, int targetValue) {
		int n = arr.length;
		int sum = 0;
		int i = 0;
		while (sum <= targetValue && i < n) {
			sum = sum + arr[i];
			i++;
		}
		if (sum >= targetValue) {
			System.out.println("Target is achieved after " + (i) + " transactions");

		} else {
			System.out.println("Target is not achieved");
		}

	}

}
