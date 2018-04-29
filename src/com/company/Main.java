package com.company;


public class Main {

    public static void main(String[] args) {//Точка входа в приложение
		int[]array = new int[20];//Создаем массивсостоящий  из 20 целых чисел
		System.out.println("Массив до изменений:");
		for (int i = 0; i < array.length; i++) {//Циклом for при помощи метода random() класса Math заполняем массив с
			array[i] = (int) ((Math.random() * 21) - 10);//числами
			System.out.print(array[i]+"\t");//Выводим массив до изменений на консоль
		}
		System.out.println();

		int biggestNegativeIndex =0;//Заводим переменную для поиска максимального отрицательного числа
		for (int i = 1; i < array.length;i++) {//находим максимальное отрицательное число
			if ((array[i]<0) &&(array[biggestNegativeIndex] < array[i] || array[biggestNegativeIndex]>=0))  {
				biggestNegativeIndex = i;
			}
		}
		System.out.println("Max Negative: "+array[biggestNegativeIndex]);//Выводим на консоль максимальное отрицательное
                                                                         //число
		int leastPositiveIndex = 0;//Заводим переменную для поиска минимального положительного числа
		for (int i = 1; i < array.length;i++) {//находим минимальное положительное число
			if ((array[i]>0)&&(array[leastPositiveIndex] > array[i] || array[leastPositiveIndex] <= 0)) {
				leastPositiveIndex = i;
			}
		}
		System.out.println("Min Positive: "+array[leastPositiveIndex]);//Выводим на экран минимальное положительное число

		int temp = array[leastPositiveIndex];//Меняем местами максимальное отрицательное и минимальое положительное числа
		array[leastPositiveIndex]=array[biggestNegativeIndex];
		array[biggestNegativeIndex]=temp;

        System.out.println("Массив после изменений:");//Выводим на экран измененный массив
		for (int i =0; i <array.length; i++){
			System.out.print(array[i]+"\t");
		}
	}

}
