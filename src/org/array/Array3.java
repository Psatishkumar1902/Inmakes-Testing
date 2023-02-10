package org.array;

public class Array3{
	public static void main(String[] args) {
		
		int input[] = new int[7];
		input[0]=100;
		input[1]=200;
		input[2]=300;
		input[3]=400;
		input[4]=500;
		input[5]=600;
		input[6]=700;
		
		input[2]=350;
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		
		int input1[] = new int[9];
		input1[0]=10;
		input1[1]=20;
		input1[2]=30;
		input1[3]=90;
		input1[4]=10;
		input1[5]=10;
		input1[6]=40;
		input1[7]=50;
		input1[8]=30;
		
		input1[6]=90;
		for (int i = 0; i < input1.length; i++) {
			System.out.println(input1[i]);
		}
		
		input1[0]=100;
		for (int i = 0; i < input1.length; i++) {
			System.out.println(input1[i]);
		}
		
		
		
		
		
	
		
		
	}
	
}