package com.bridgelabz;

import java.util.Scanner;

public class SortArrayInAscendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        // Bubble sort algorithm
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

