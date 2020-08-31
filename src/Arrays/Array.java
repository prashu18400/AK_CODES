package Arrays;

import java.util.Scanner;

public class Array {
	public static void main(String [] args) {
		int[] marks = new int[5];
		int sum=0;
		// int marks[] = new int[5];
		// All values are initialized with 0 after declaration
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements:");
		for(int i=0;i<5;i++)
			marks[i] = sc.nextInt();
		sc.close();
		System.out.println("Array elements are:");
		for(int i=0;i<5;i++) {
			System.out.print(marks[i] + " ");
			sum += marks[i];
		}
		sum /= 5;
		System.out.println();
		System.out.println("Average of array elements is: "+sum);
	}
}
