package project_loop;

import java.util.Scanner;
public class PrimeNo {
	public static void main(String args[]){
		int num,i,count=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Please enter the number");
		num=obj.nextInt();
		if (num==0 || num==1 || num<0){
			System.out.println(num+": is not prime");
		}
		else{
		for(i=2;i<num;i++){
			if(num%i==0){
			count++;
			break;
			}
		}
		if(count==0){
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
		}
	}}
