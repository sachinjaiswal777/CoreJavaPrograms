package com.array;

public class ArrayDemo {
	
	public static void main(String[] args) {
		String[] strArray = {"A","V","c"};
		//Integer[] integerArray = new Integer[10];
		int[] intArray = new int[10];
		intArray[0] = 10;
		intArray[8] = 2;
		intArray[9] = 1;
		intArray[7] = 3;
		intArray[6] = 4;
		intArray[5] = 5;
		intArray[4] = 6;
		intArray[3] = 7;
		intArray[1] = 9;
		intArray[2] = 8;
		
		int[] intArrayTwo = {1,2,3,4,5,6,9,7,10,8};
		/*for(int i=0;i<intArray.length;i++){
			System.out.println(intArray[i]);
		}*/
		
		
		
		
		int[][] intMultiArray = new int[3][4];
		intMultiArray[0][0] = 1;
		intMultiArray[0][1] = 2;
		intMultiArray[0][2] = 3;
		intMultiArray[1][0] = 4;
		intMultiArray[1][1] = 5;
		intMultiArray[1][2] = 6;
		intMultiArray[2][0] = 7;
		intMultiArray[2][1] = 8;
		intMultiArray[2][2] = 9;
		//System.out.println(intMultiArray.length);
		
		for(int i=0;i<3;i++){ //i=2
			for(int j=0;j<4;j++){ //j=0,1,2
				System.out.println(intMultiArray[i][j]);
			}			
		}
	
	}
	
}
