package org.array;

public class Array1 {
	
	public static void main(String[] args) {
		
	int input[] = new int[6];
	
	input[0]= 10;
	input[1]= 20;
	input[2]= 30;
	input[3]= 90;
	
	System.out.println(input[0]);
	
	int input2[] = new int[8];
	input2[0]=10;
	input2[1]=20;
	input2[2]=30;
	input2[3]=90;
	input2[4]=10;
	input2[5]=10;
	input2[6]=40;
	input2[7]=50;
	
	System.out.println("\n" + input2[5]);
	System.out.println("\n" + input2[7]);
	System.out.println("\n" + input2[3]);
	
	int input3[] = new int[7];
	input3[0] = 10;
	input3[1] = 20;
	input3[2] = 30;
	input3[3] = 40;
	input3[4] = 50;
	input3[5] = 60;
	
	System.out.println("\n" +input3[2]);

	int input4[] = new int[7];
	input4[0] = 100;
	input4[1] = 200;
	input4[2] = 300;
	input4[3] = 400;
	input4[4] = 500;
	input4[5] = 600;
	input4[6] = 700;
	
	System.out.println("\n" +input4[4]);
	
	int input5[] = new int[8];
	input5[0] = 105;
	input5[1] = 205;
	input5[2] = 305;
	input5[3] = 405;
	input5[4] = 505;
	input5[5] = 605;
	input5[6] = 705;
	input5[7] = 805;
	
	System.out.println("\n" +input5[7]);
	for (int i = 0; i < input5.length; i++) {
		System.out.println(input5[i]);
	}
	
	
}
}