package com.bridgelabz;

import java.util.Scanner;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Duplicate elements in the array are: ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[j] + " ");
                    break;
                }
            }
        }
    }
}

