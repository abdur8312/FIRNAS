package firnas;

import java.util.Scanner;

public class VowelorNot {
	public static void main(String[] args) {
		Scanner vowel = new Scanner(System.in);
		System.out.println("Enter the character to check:");
		char VOW = vowel.next().charAt(0);
		if(VOW == 'a' || VOW == 'e' || VOW == 'i' || VOW == 'o' || VOW == 'u')
			System.out.println(VOW + " is vowel");
		else
			System.out.println(VOW + " is not a vowel");
	}
}
