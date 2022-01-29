package firnas;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		a = scan.nextInt();
		System.out.println("Enter another number:");
		b = scan.nextInt();
		int sum = a + b;
		System.out.println("sum of two number is:" +sum);
		
	}
}
