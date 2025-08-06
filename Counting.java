package com.ece;
import java.util.Scanner;

public class Counting {
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int c=0;
		if(n==0) {
			System.out.println(1);
		}
		else {
			while(n!=0){
				c++;
				n=n/10;
			}
		}
		System.out.println(c);
	}
}
