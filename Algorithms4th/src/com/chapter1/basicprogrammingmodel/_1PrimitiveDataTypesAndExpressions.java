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

	public int getMaximunValue(int array[]) {
		// fin the maximun of array values
		int maximun = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximun)
				maximun = array[i];
		}
		return maximun;
	}

	public int[] getReverseArray(int array[]) {
		int[] reverse = new int[array.length];
		int countReverse = array.length;
		for (int i = 0; i < array.length; i++) {
			countReverse--;
			reverse[countReverse] = array[i];
		}
		for (int i = 0; i < reverse.length; i++) {
			System.out.println(reverse[i]);
		}
		return reverse;
	}

	public static void main(String[] args) {
		_1PrimitiveDataTypesAndExpressions test = new _1PrimitiveDataTypesAndExpressions();
		int array[] = { 1, 2, 1, 3, 2, 5, 10, 5, 7 };
		//System.out.println(test.getMaximunValue(array));
		int[] reverse = test.getReverseArray(array);
		
	}

}
