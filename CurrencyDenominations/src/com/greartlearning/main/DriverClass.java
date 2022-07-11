package com.greartlearning.main;

import java.util.Scanner;

import com.greartlearning.service.Denominations;
import com.greartlearning.service.MergeSort;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		int[] denominations = new int[size];
		System.out.println("Enter the value of currency denominations");
		for (int i = 0; i < size; i++) {
			denominations[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you need to pay");
		int payingAmount = sc.nextInt();
		MergeSort ms = new MergeSort();
		ms.mergeSort(denominations, 0, denominations.length - 1);
		Denominations dc = new Denominations();
		dc.notesCount(denominations, payingAmount);
	}

}
