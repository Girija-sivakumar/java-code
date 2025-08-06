package com.ece;
import java.util.Scanner;

public class Practices {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		if(age>18) {
			System.out.println("eligible");
		}
		else if(age==18) {
			System.out.println("wait");
		}
		else {
			System.out.println("not eligible");
		}
	}

}
