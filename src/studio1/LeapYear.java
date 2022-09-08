package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter Year: ");
			int n0 = in.nextInt();
			boolean leapYear1 = (n0 % 4 == 0) && (n0 % 100 != 0 || n0 % 400 == 0);
			
			System.out.println(leapYear1);
			
	}

}
