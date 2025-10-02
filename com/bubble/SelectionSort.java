package com.bubble;

public class SelectionSort {

	public static void main(String[] main) {
		int a[]= {39,48,23,52,12,22};
		
		int min; int temp=0;
		for(int i=0; i<a.length; i++) {
			min=i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[min]) {
					min=j;	
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
				
	}
}
