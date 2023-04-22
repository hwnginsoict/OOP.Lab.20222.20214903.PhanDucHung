import java.lang.Math;
import java.util.Scanner;

public class Ex_2_2_5_DoubleNumbers {
	public static double sum(double a, double b) {
		return a + b;
	}
	public static double dif(double a, double b) {
		return Math.abs(a-b);
	}
	public static double pdt(double a, double b) {
		return a * b;
	}
	public static double qut(double a, double b) {
		if (b == 0.0) {
			throw new IllegalArgumentException("Error");
		}
		return a/b;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a = keyboard.nextDouble();
		System.out.print("Enter second number: ");
		double b = keyboard.nextDouble();
		keyboard.close();
		System.out.println("Sum: " + sum(a,b));
		System.out.println("Difference: " + dif(a,b));
		System.out.println("Product: " + pdt(a,b));
		System.out.println("Quotient: " + qut(a,b));
	}
}