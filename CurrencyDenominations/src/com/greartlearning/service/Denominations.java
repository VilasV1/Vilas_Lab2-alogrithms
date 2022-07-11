package com.greartlearning.service;

public class Denominations {

	public void notesCount(int[] notes, int amount) {
		int[] notesCounter = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					notesCounter[i] = amount / notes[i];
					amount = amount - notesCounter[i] * notes[i];
				}
			}
			if (amount > 0) {
				System.out.println("Exact amount cannot be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give minimum no of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (notesCounter[i] != 0) {
						System.out.println(notesCounter[i] + " of " + notes[i] + " notes.");
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + "*Do not enter Zero '0' in denominations*");
		}

	}
}
