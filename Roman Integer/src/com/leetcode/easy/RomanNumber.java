package com.leetcode.easy;
import java.lang.*;
public class RomanNumber {
	
	public static int Character(char x) {
		switch(x) {
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
		}
		return 0;
	}
	public static int romantoInt(String s) {
		
		int total =0;
		int len = s.length()-2;
		int i,s1,s2;
		//System.out.println("len-2 ="+len);
		for(i=0;i<=len;i++) {
			s1=Character(s.charAt(i));
			//System.out.println("i="+i+",s1="+s1);
			s2=Character(s.charAt(i+1));
			//System.out.println("i+1="+(i+1)+",s2="+s2);
			if(s1>=s2) {
				total = total+s1;
			}
			else {
				total=total-s1;
			}
		}
		s1=Character(s.charAt(i));
		//System.out.println("Out :i="+i+",s1="+s1);
		total = total+s1;
		return total;
		
	}
	public static void main(String[] args) {
		String input="LVIII";
		//System.out.println(input);
		System.out.println(romantoInt(input));
	}
}
