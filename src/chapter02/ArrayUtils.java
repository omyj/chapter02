package chapter02;

public class ArrayUtils {

	public static double[] intToDouble(int[] arrayInt) {
		// TODO Auto-generated method stub
		if (arrayInt == null) {
			return null;
		}
		int length = arrayInt.length;

		double[] arrayDouble = new double[length];
		for (int i = 0; i < length; i++) {
			arrayDouble[i] = arrayInt[i];
		}
		return arrayDouble;
	}

	public static int[] doubleToInt(double[] arrayDouble) {
		// TODO Auto-generated method stub
		if (arrayDouble == null) {
			return null;
		}
		int length = arrayDouble.length;

		int[] arrayInt = new int[length];
		for (int i = 0; i < length; i++) {
			arrayInt[i] = (int) arrayDouble[i];
		}
		return arrayInt;
	}

	public static int[] concat(int[] s1, int[] s2) {
		// TODO Auto-generated method stub
		if (s1 == null || s2 == null) {
			return null;
		}
		int length1 = s1 == null ? 0 : s1.length;
		int lenght2 = s2 == null ? 0 : s2.length;
		int index = 0;
		int[] arrays12 = new int[length1 + lenght2];

		for (int i : s1) {
			arrays12[index++] = i;
		}

		for (int i : s2) {
			arrays12[index++] = i;
		}

		return arrays12;
	}

}
