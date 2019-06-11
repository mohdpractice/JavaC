package project_loop;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]){
		int num,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the whole number");
		num=sc.nextInt();
		int number=num;
		if(num>0){
			for(i=1;i<=number;i++){
				fact=fact*num;
				num--;	
		}	
			System.out.println("factorial:"+fact);
			}
		else {
			System.out.println("Number is negative,Please enter positive number");
		}

	}
}
