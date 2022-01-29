package firnas;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = number.nextInt();
		System.out.println("Enter another number:");
		int b = number.nextInt();
		int A = a + b;
		System.out.println("The sum of two number is:" +A);
		int S = a - b;
		System.out.println("The subtraction of two number is:" +S);
		int M = a * b;
		System.out.println("The multiplication of two number is:" +M);
		int Q = a / b;
		System.out.println("The quotient of two number is:" +Q);
		int R = a % b;
		System.out.println("The remainder of two number is:" +R);
	}
}
