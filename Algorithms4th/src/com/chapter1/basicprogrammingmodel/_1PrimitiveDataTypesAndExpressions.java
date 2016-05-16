package com.chapter1.basicprogrammingmodel;

/**
 * Data type is a set o values and operations on those values.
 * 
 * @author rafael
 *
 */
public class _1PrimitiveDataTypesAndExpressions {

	// primitive data type
	int integerType; // 32 bits -2^31 to 2^31-1
	double realNumber; // 64 bits
	boolean booleanType;
	char charType; // 16 bits

	// operator * / + -

	public void init() {
		// literal
		integerType = 0;
		realNumber = 1.0e-15;
		booleanType = true;
		charType = 'a';

		// expression
		integerType = 9 - 6 / 6;
		realNumber = realNumber * integerType;
		booleanType = realNumber > integerType;

		// operators

		// integer * (multiply) / (divide) + (add) - (subtract) % (remainder)
		// double no % (remainder)
		// boolean && (and) || (or) ! (not) ^ (xor)

		// comparisons equal (==), not equal (!=), less than (<), less than or
		// equal (<=), greater than (>), and greater than or equal (>=)

	}

	public void array(int size) {
		int[] newArray = null;
		newArray = new int[size];
		double[] newArrayRealNumbers = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i] + "" + newArrayRealNumbers[i]);
		}
	}

	public static int getMaximunValue(int array[]) {
		// fin the maximun of array values
		int maximun = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximun)
				maximun = array[i];
		}
		System.out.println("\nMAXIMUN");
		System.out.print(maximun);
		return maximun;
	}

	public static int[] getReverseArray(int array[]) {
		int[] reverse = new int[array.length];
		int countReverse = array.length;
		for (int i = 0; i < array.length; i++) {
			countReverse--;
			reverse[countReverse] = array[i];
		}
		System.out.println("\nREVERSE");
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i] + " ");
		}
		return reverse;
	}

	public static int[] getSort(int array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
		System.out.println("\nSORT");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		return array;
	}

	public static boolean primalityTest(int n) {
		boolean flag = true;
		if (n > 1) {
			for (int i = 2; i < n; i++) {
				if (n % 2 == 0)
					flag = false;
			}
		} else {
			flag = false;
		}
		System.out.println("\nPRIMALITY TEST");
		System.out.print(n + " is prime: " + flag);
		return flag;
	}
	
	public static void main(String[] args) {
		int array[] = { 1, 2, 1, 3, 2, 5, 10, 5, 7 };
		getMaximunValue(array);
		getReverseArray(array);
		getSort(array);
		primalityTest(5);
	}

}
