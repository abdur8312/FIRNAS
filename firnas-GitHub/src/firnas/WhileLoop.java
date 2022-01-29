package firnas;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int number,sum = 0;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter any number:");
		number = num.nextInt();
		while(number <= 10) {
			sum = sum + number;
			number++;
		}
		System.out.format("sum of the numbers in the while loop: %d",sum);
	}
}
