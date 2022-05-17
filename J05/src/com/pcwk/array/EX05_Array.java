package com.pcwk.array;



public class EX05_Array {

	public static void main(String[] args) {
		char[] alphabet = new char[26];

		char ch = 'A';
		for (int i = 0; i < alphabet.length; i++, ch++) {
			alphabet[i] = ch;
			System.out.println(i + "," + ch);
		}
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println((int) alphabet[i] + "=" + alphabet[i] + ",");
		}
	}

}
