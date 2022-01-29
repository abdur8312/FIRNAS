package firnas;

public class LargestNumber {
	public static void main(String[] args) {
		int n1 = 444,n2 = 54,n3 = 6;
		if(n1 > n2 && n1 > n3)
			System.out.println(n1 + " is largest");
		else if(n2 > n1 && n2 > n3)
			System.out.println(n2 + " is largest");
		else
			System.out.println(n3 + " is largest");
	}
}
