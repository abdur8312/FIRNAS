package firnas;

import java.util.Scanner;

public class AreaOfaSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the side of the square:");
		double side = scan.nextDouble();
		double Area = side * side;
		System.out.print("Area of the square:" + Area);
	}
}
