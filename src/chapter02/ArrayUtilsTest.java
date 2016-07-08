package chapter02;

import java.util.ArrayDeque;

public class ArrayUtilsTest {
	private void show() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		int[] arrayInt ={10,20,30,40,50};
		//1. ArrayUtils.intToDouble(..) test
		double[] arrayDouble = ArrayUtils.intToDouble(arrayInt);
		for (double d : arrayDouble) {
			System.out.print(d+" ");
		}
		System.out.println();
		
		//2. ArrayUtils.doubleToInt(..) test
		arrayInt = ArrayUtils.doubleToInt(arrayDouble);
		for (int d : arrayInt) {
			System.out.print(d+" ");
		}
		System.out.println();
		
		//3/ ArrayUtils.concat(..) test
		int[] s1 = {1,2,3,4,5};
		int[] s2 = {6,7,8,9,10};
		
		int [] s12 = ArrayUtils.concat(s1, s2);
		
		for (int i : s12) {
			System.out.print(i+" ");
		}
	}
}
