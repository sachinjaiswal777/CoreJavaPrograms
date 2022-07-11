package com.conditioanlstmt;

public class ConditionalStmtTest {
	
	public void getResult(double percentage){
		if(percentage>=35){
			System.out.println("Your result is: PASS");
		}
	}
	
	public void getPasOrFail(double percentage){
		if(percentage>=35){
			System.out.println("Your result is: PASS");
		}else{
			System.out.println("Your result is: FAIL");
		}
	}
	
	public void getRank(double percentage){
		if(percentage<0 || percentage>100){
			System.out.println("Invalid percentage");
			return;
		}
			
		if(percentage>=75 && percentage<=100){
			System.out.println("Your Rank is: Pass with Distinction");
		}else if(percentage>=60 && percentage<75){
			System.out.println("Your Rank is: 1 st");
		}else if(percentage>=35 && percentage<60){
			System.out.println("Your Rank is: 2 st");
		}else{
			System.out.println("Your Rank is: FAIL");
		}
	}
	
	public void getRankTwo(double percentage){
		if(percentage>=0 && percentage<=100){
			if(percentage>=75 && percentage<=100){
				System.out.println("Your Rank is: Pass with Distinction");
			}else if(percentage>=60 && percentage<75){
				System.out.println("Your Rank is: 1 st");
			}else if(percentage>=35 && percentage<60){
				System.out.println("Your Rank is: 2 st");
			}else{
				System.out.println("Your Rank is: FAIL");
			}
		}else{
			System.out.println("Invalid percentage");
		}
	}
	
	public void getNumberSpelling(int number){		
		switch(number){
			case  1:
				System.out.println("ONE");
			break;
			case  2:
				System.out.println("TWO");
			break;
			case  3:
				System.out.println("THREE");
			break;
			case  100:
				System.out.println("HUNDRED");
			break;
			default :
				System.out.println("Invalid Data");		
		}
	}
	
	public void getColor(String color){		
		switch(color){
			case  "R":
				System.out.println("RED");
			break;
			case  "B":
				System.out.println("BLUE");
			break;
			case  "G":
				System.out.println("GREEN");
			break;
			case  "O":
				System.out.println("ORANGE");
			break;
			default :
				System.out.println("Invalid Data");		
		}
	}
	
	public static void main(String[] args){
		ConditionalStmtTest cst = new ConditionalStmtTest();
		cst.getColor("G");
	}
}

//true !--> false
//false ! -> true