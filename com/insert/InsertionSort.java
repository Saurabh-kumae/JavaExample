package com.insert;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 4, 6, 2, 7, 20, 3 };

		int temp, j;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = temp;
		}
		for (int res : a) {
			System.out.print(res + " ");
		}
	}
}
