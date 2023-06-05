package hust.soict.dsai.lab01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex_6_5_NumericArray {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = keyboard.nextInt();
		int sum = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.print("Enter array: ");
		for (int i=0; i<size; i++) {
			array.add(keyboard.nextInt());
			sum += array.get(i);
		}
		double avg = sum/size;
		keyboard.close();
		System.out.println("Before sorting: " + array);
		Collections.sort(array);
		System.out.println("After sorting: " + array);
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + avg);
	}
}