package com.leetcode.easy;

public class PalindromCheck {

	public static boolean PalindromCheck(int x) {
		if((x<0)||(x%10==0)&&(x!=0)) {
			return false;
		}
		else if((x/10)==0){
			return true;
		}
		int temp =x;
		int rev=0;
		int div =0;
		while(temp!=0) {
			
			div = temp%10;
			rev = rev*10 +div;
			temp = temp/10;
		}
		if(x==rev) {
			return true;
		}else {
			return false;
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-121;
		boolean palindrome=PalindromCheck(x);
		if(palindrome) {
			System.out.println(palindrome);
		}else {
			System.out.println(palindrome);
		}
		

	}

}
