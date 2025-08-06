package com.ece;
import java.util.Scanner;
public class Character {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			System.out.println("uppercase");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println("lowercase");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("digit");
		}
		else {
			System.out.println("special character");
		}
	}

}
