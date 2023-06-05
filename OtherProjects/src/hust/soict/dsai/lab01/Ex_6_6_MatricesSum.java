package hust.soict.dsai.lab01;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex_6_6_MatricesSum {
	public static ArrayList<ArrayList<Integer>> MatrixDefine(int m, int n){
		Scanner keyboard = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<m; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			for(int j=0; j<n; j++) {
				row.add(keyboard.nextInt());
			}
			matrix.add(row);
		}
		//keyboard.close();
		return matrix;
	}
	public static ArrayList<ArrayList<Integer>> MatrixSum (ArrayList<ArrayList<Integer>> m1, ArrayList<ArrayList<Integer>> m2){
		int m = m1.size();
		int n = m1.get(0).size();
		ArrayList<ArrayList<Integer>> sum = new ArrayList<ArrayList<Integer>>();
		for (int i=0; i<m; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			for(int j=0; j<n; j++) {
				row.add(m1.get(i).get(j) + m2.get(i).get(j));
			}
			sum.add(row);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Size: ");
		int m = keyboard.nextInt();
		int n = keyboard.nextInt();
//		keyboard.close();
//		MatrixDefine(m,n);
		System.out.println("Matrix 1: ");
		ArrayList<ArrayList<Integer>> matrix1 = MatrixDefine(m,n);
		System.out.println("Matrix 2: ");
		ArrayList<ArrayList<Integer>> matrix2 = MatrixDefine(m,n);
		keyboard.close();
		ArrayList<ArrayList<Integer>> sum = MatrixSum(matrix1, matrix2);
		System.out.println("Sum of two matrices is:");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(sum.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}