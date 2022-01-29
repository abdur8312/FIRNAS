package firnas;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of the rectangle:");
		double length = scan.nextDouble();
		System.out.print("Enter width of the rectangle:");
		double width = scan.nextDouble();
		double Area = length * width;
		System.out.print("Area of the rectangle:" +Area);
	}
}
//nice i've done it
