package com.merge;

public class MergeSort {

	int[] array;
	int[] tempMergeArr;
	int length;

	public static void main(String[] args) {
		int[] inputArr = { 39, 21, 12, 67, 19, 10, 50 };
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i + " ");
		}
	}

	public void sort(int[] inputArr) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];
		divideArray(0, length - 1);
	}

	public void divideArray(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

			// divide array on the left hand side
			divideArray(lowerIndex, middle);

			// divide array on the right hand side
			divideArray(middle + 1, higherIndex);

			mergeArray(lowerIndex, middle, higherIndex);
		}
	}

	public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergeArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergeArr[i] <= tempMergeArr[j]) {
				array[k] = tempMergeArr[i];
				i++;
			} else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergeArr[i];
			i++;
			k++;
		}
	}
}
