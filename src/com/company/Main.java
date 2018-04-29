package com.company;


public class Main {

    public static void main(String[] args) {
		int[]array = new int[20];
		System.out.println("Массив до изменений:");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * 21) - 10);
			System.out.print(array[i]+"\t");
		}
		System.out.println();

		int biggestNegativeIndex =0;
		for (int i = 1; i < array.length;i++) {

			if ((array[i]<0) &&(array[biggestNegativeIndex] < array[i] || array[biggestNegativeIndex]>=0))  {
				biggestNegativeIndex = i;
			}
		}
		System.out.println("Max Negative: "+array[biggestNegativeIndex]);

		int leastPositiveIndex = 0;
		for (int i = 1; i < array.length;i++) {
			if ((array[i]>0)&&(array[leastPositiveIndex] > array[i] || array[leastPositiveIndex] <= 0)) {
				leastPositiveIndex = i;
			}
		}
		System.out.println("Min Positive: "+array[leastPositiveIndex]);

		int temp = array[leastPositiveIndex];
		array[leastPositiveIndex]=array[biggestNegativeIndex];
		array[biggestNegativeIndex]=temp;

        System.out.println("Массив после изменений:");
		for (int i =0; i <array.length; i++){
			System.out.print(array[i]+"\t");
		}
	}

}
