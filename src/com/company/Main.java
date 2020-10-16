package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // N is number of elements in array
	    int N, indexOfSmallest, result;
        N = scanner.nextInt();

	    int[] arr = new int[N];
	    for (int i = 0; i < N;i++){
	        int element = scanner.nextInt();
	        arr[i] = element;
        }

        indexOfSmallest = scanner.nextInt();
        result = getWishedSmallNumber(arr, indexOfSmallest);
        System.out.println(result);
    }

    public static int getWishedSmallNumber(int[] arr, int indexOfSmallest){
        // write your code
        return 0;
    }
}
// test case 0 9 12 3 8

