package com.ece;
import java.util.Scanner;
public class Gifts {
       public static void main(String args[]) {
    	   Scanner scan=new Scanner(System.in);
    	   int m=scan.nextInt();
    	   int n=scan.nextInt();
    	   int result=m%n;
    	   System.out.println(result);
       }
}
