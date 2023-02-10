package org.array;

public class Array2 {
	public static void main(String[] args) {
		int input2[] = new int[9];
		input2[0]=10;
		input2[1]=20;
		input2[2]=30;
		input2[3]=90;
		input2[4]=10;
		input2[5]=10;
		input2[6]=40;
		input2[7]=50;
		input2[8]=90;
		
		input2[2]=50;
		
		for (int i = 0; i < input2.length; i++) {
			System.out.println(input2[i]);
		}
		
		input2[7]=70;
		for (int i = 0; i < input2.length; i++) {
			System.out.println(input2[i]);
			}
		
		input2[8]=80;
		for (int i = 0; i < input2.length; i++) {
			System.out.println(input2[i]);
		}
		
		input2[5]=100;
		for (int i = 0; i < input2.length; i++) {
			System.out.println(input2[i]);
		}

	}

}

