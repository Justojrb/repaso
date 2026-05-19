package repaso;

import java.util.Scanner;

public class Algorithm1 {

public static void main(String[] args) {
	//inputs: three numbers, can be represented by three variables
	int a, b, c;
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	CombineDigits (a, b, c);
	sc.close();
}

/**
 * combine all the digits to form a integer
 * @param a the highest digit
 * @param b the lowest digit
 * @param c the lowest digit
 * @return the combined integer
 */

private static int CombineDigits(int a, int b, int c) {
	if (a > 9 || a <0 || b > 9 || b <0 || c > 9 || c <0) {
		System.out.println("a is not a single digit");
		// throw new invalidargs exception
		return 0;
		
	}
	
	//output
	return 23;
	
}

}
