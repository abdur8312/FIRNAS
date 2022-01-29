package firnas;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the base of the Triangle:");
		double base = scan.nextDouble();
		System.out.print("Enter the height of the Triangle:");
		double height = scan.nextDouble();
		double Area = (base * height)/2;
		System.out.print("Area of the Triangle:" + Area);
	}
}
