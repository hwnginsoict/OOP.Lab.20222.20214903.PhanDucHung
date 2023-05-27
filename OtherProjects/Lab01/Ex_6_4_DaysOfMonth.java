import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Ex_6_4_DaysOfMonth {
	public static boolean leapYear(int year) {
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)) {
			return true;
		}
		return false;
	}
	public static int monthCheck(String month, int year) {
		
		String[] month31 = {"January", "Jan", "Jan.", "1",
				"March", "Mar", "Mar.", "3",
				"May", "5",
				"July", "Jul", "7",
				"August", "Aug", "Aug.", "8",
				"October", "Oct", "Oct.", "10",
				"December", "Dec", "Dec.", "12"};
		List<String> return31 = (List<String>) Arrays.asList(month31);
		
		String[] month30 = {"April", "Apr", "Apr.", "4",
				"June", "Jun", "6",
				"September", "Sep", "Sept.", "9",
				"November", "Nov", "Nov.", "11"};
		List<String> return30 = (List<String>) Arrays.asList(month30);
		
		String[] feb = {"February", "Feb", "Feb.", "2"};
		List<String> returnfeb = (List<String>) Arrays.asList(feb);
		
		if (return31.contains(month)) {
			return 31;
		}
		else if (return30.contains(month)) {
			return 30;
		}
		else if (returnfeb.contains(month)) {
			if(leapYear(year)) {
				return 29;
			}
			else return 28;
		}
		System.out.println("Can not resolve!");
		throw new IllegalArgumentException("not exists");
	}
	
	
	public static void main(String[] args) throws Exception{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter month: ");
		String month = keyboard.nextLine();
		System.out.print("Enter year: ");
		int year = keyboard.nextInt();
		keyboard.close();
		int result = monthCheck(month,year);
		System.out.println("Number of days in that month is " + result);
		
	}
}