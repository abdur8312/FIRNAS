package firnas;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check Odd/Even:");
		int num = input.nextInt();
		if(num % 2 == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		
	}
}
