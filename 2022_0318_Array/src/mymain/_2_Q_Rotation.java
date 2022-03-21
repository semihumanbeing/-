package mymain;

import myutil.MyArrays2;
import myutil.RotationMethod;

public class _2_Q_Rotation {

	public static void main(String[] args) {
		
		int number = 5;
		int [][] src = new int [number][number];
		MyArrays2.setArray(src);
		
		System.out.println("---����---");
		MyArrays2.displayArray(src);
		
		System.out.println("---90��������---");
		int [][]rotateResult = RotationMethod.rotate90ToRight(src);
		MyArrays2.displayArray(rotateResult);
		
		System.out.println("---�¿����---");
		int [][]flipResult = RotationMethod.flip(src);
		MyArrays2.displayArray(flipResult);
		
		System.out.println("---�¿����2---");
		int [][]flip2result = RotationMethod.flip2(src);
		MyArrays2.displayArray(flip2result);
		
		System.out.println("---���Ϲ���---");
		int [][]flipUpDownResult = RotationMethod.flipUpDown(src);
		MyArrays2.displayArray(flipUpDownResult);
		
		System.out.println("---���� 2��---");
		int [][]flipDBLResult = RotationMethod.flipDouble(src);
		MyArrays2.displayArray(flipDBLResult);


	}

}
