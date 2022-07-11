package com.looping;

public class LoopingTest {
	public void forLoopBasic(){
		//int[] number ={1,2,3,1,5,3,1,6,8,7,9,1};
		for(int i=1;i<=100;i++){
			System.out.println(i);
		}
		
		for(int i=100;i>=1;i--){
			System.out.println(i);
		}
	}
	
	public void forLoopCheck(){
		int[] number ={1,2,3,1,5,3,1,6,8,7,9,1};
		int count=0;
		for(int i=0;i<=number.length-1;i++){
			System.out.println("index = "+i+",  value = "+number[i]);
			if(number[i]==1){
				count=count+1; //count++;
			}
		}
		System.out.println(count);
	}
	
	public void forLoopStringCheck(){
		String name ="Satyam";
		int count=0;
		for(int i=0;i<=name.length()-1;i++){
			System.out.println("index = "+i+",  value = "+name.charAt(i));
			
			if("a".equals(String.valueOf(name.charAt(i)))){
				count=count+1; //count++;
			}
		}
		System.out.println(count);
	}
	
	public void stringReverse(){
		String name ="Satyam";
		for(int i=name.length()-1;i>=0;i--){
			System.out.print(name.charAt(i));
		}
	}
	
	public void findOddEvenNumbers(){
		int[] number ={1,2,3,1,5,3,1,6,8,7,9,1};
		for(int i=0;i<number.length;i++){
			if(number[i]%2==0){
				System.out.println("It is a Even Number = "+number[i]);
			}else{
				System.out.println("It is a Odd  Number = "+number[i]);
			}
		}

	}
	
	public void printArrayElements(){
		int[] number ={1,2,3,1,5,3,1,6,8,7,9,1};
		for(int a : number){
			System.out.println(a);
		}
	}
	
	public void whileLoopTest(){
		int[] number ={1,2,3,1,5,3,1,6,8,7,9,1};
		int i=0;
		while(i<number.length){
			if(number[i]%2==0){
				System.out.println("It is a Even Number = "+number[i]);
			}else{
				System.out.println("It is a Odd  Number = "+number[i]);
			}
			i++;
		}
		
		
		while(i<number.length && 1==0){
			if(number[i]%2==0){
				System.out.println("It is a Even Number = "+number[i]);
			}else{
				System.out.println("It is a Odd  Number = "+number[i]);
			}
			i++;
		}
	}
	
	public void doWhileLoopTest(){
		int[] number ={1,2,3,1,5,3,1,6,8,7,9,1};
		int i=0;
		do{
			System.out.println("In Do while Loop");
			
		}while(i==1);
	}
	
	public static void main(String[] args) {
		LoopingTest lt = new LoopingTest();
		lt.whileLoopTest();
	}
}
