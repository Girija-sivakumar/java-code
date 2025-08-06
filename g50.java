package com.ece;

public class g50 {
	public static void main(String args[]) {
		char ch='!';
		boolean uppercase=(ch>='A')&&(ch<='Z');
		boolean lowercase=(ch>='a')&&(ch<='z');
		boolean digit=(ch>='0')&&(ch<='9');
		boolean result=(uppercase||lowercase||digit);
		System.out.println(!result);
		
		
	}

}
