package hust.soict.dsai.lab01;

import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Ex_6_3_StarsTriangle {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter n: ");
		int n = keyboard.nextInt();
		keyboard.close();
//		String obj;
//		obj = JOptionPane.showInputDialog("Number:");
//		int n = Integer.parseInt(obj);
		for (int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1; j++){
				System.out.print("*");
			}
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}