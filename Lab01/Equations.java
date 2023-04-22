import java.util.Scanner;
import java.lang.Math;

public class Equations {
	public static void FirstOneEquation() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = keyboard.nextDouble();
		if (a==0) {
			keyboard.close();
			throw new IllegalArgumentException("No solution");
		}
		System.out.print("Enter b: ");
		double b = keyboard.nextDouble();
		keyboard.close();
		System.out.println("The solution is x = "+ -b/a);
	}
	public static void FirstTwoEquations() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a11, a12, b1: ");
		double a11 = keyboard.nextDouble();
		double a12 = keyboard.nextDouble();
		double b1 = keyboard.nextDouble();
		System.out.print("Enter a21, a22, b2: ");
		double a21 = keyboard.nextDouble();
		double a22 = keyboard.nextDouble();
		double b2 = keyboard.nextDouble();
		keyboard.close();
		double d = a11*a22 - a21*a12;
		double d1 = b1*a22 - b2*a12;
		double d2 = a11*b2 - a21*b1;
		double x1 = d1/d;
		double x2 = d2/d;
		System.out.println("The solution is x1 = " + x1 + " and x2 = " + x2);
	} 
	public static void SecondEquation() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		keyboard.close();
		double d = b*b -4*a*c;
		if(d < 0) {
			throw new IllegalArgumentException("No solution");
		}
		if(d == 0) {
			double x = -b/(2*a);
			System.out.println("Equation has a solution is x = " + x);
		}
		if(d > 0) {
			double x1 = (-b + Math.sqrt(d))/(2*a);
			double x2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("Equation has solutions x1 = " + x1 +" and x2 = " + x2);
		}
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Type of equation: ");
		int type = keyboard.nextInt();
		System.out.print("Number of variables: ");
		int num = keyboard.nextInt();
//		keyboard.close();
		if (type == 2) {
			SecondEquation();
		}
		else if ((type == 1) && (num == 1)) {
			FirstOneEquation();
		}
		else if ((type == 1) && (num == 2)) {
			FirstTwoEquations();
		}
		keyboard.close();
	}
}