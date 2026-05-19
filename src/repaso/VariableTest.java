package repaso;

public class VariableTest {

	public static void main(String[] args) {
		//primitive variables
		var num1 = 1;
		int num2 = 2;
		int result = num1 + num2;
		System.out.println(result);
		result = sum(num1, num2);
		
		//reference variables
		double result2 = num1 / num2;
		result2 = division(num1, num2);
		System.out.println(result2);
		
		System.out.println(modulo(num1, num2));
	}

	private static char[] modulo(int num1, int num2) {
		return null;
	}

	private static double division(int num1, int num2) {
		return 0;
	}

	private static int sum(int num1, int num2) {
		
		return num1 + num2;
	}

}
