package firnas;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		float first = 1.2f,second = 4.33f;
		System.out.println("Before swapping the numbers");
		System.out.println("First number:" + first);
		System.out.println("Second number:" + second);
		
		float temp = first;
		first = second;
		second = temp;
		
		System.out.println("After swapping the numbers");
		System.out.println("First number:" + first);
		System.out.println("Second number:" + second);
	}
}
