package com.company;


public class Main {

    public static void main(String[] args) {

Main.randomArray();

	}

    public static void randomArray(){
		int[]array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)((Math.random()*21)-10);
			System.out.println(array[i]);
		}
		int biggestNegativeIndex =0;
		for (int i = 1; i < array.length;i++) {
			if (array[biggestNegativeIndex] < array[i] && array[i] < 0 ) {
				biggestNegativeIndex = i;
			}
		}
		System.out.println("Max Negative: "+array[biggestNegativeIndex]);



		int leastPositiveIndex =19;
		for (int i = 18; i < array.length;i--) {
			if (array[leastPositiveIndex] > array[i] && array[i] > 0 ) {
				leastPositiveIndex = i;
			}
		}
		System.out.println("Min Positive: "+array[leastPositiveIndex]);
    }
}
