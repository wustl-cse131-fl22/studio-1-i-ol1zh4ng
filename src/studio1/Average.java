package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first value: ");
		int n0 = in.nextInt();
		System.out.print("Enter second value: ");
		int n1 = in.nextInt();
		
		double averageNumber = (double)(n0 + n1) / 2;
		System.out.println("The average is: " + averageNumber);
	}

}
