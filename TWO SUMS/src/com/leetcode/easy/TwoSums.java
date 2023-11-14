package com.leetcode.easy;

public class TwoSums {
	
	public static int[] TwoSums(int nums[],int target) {
		//System.out.println("In Function");
		int size=nums.length;
		int sum =0;
		//int i,j;
		int result[] =new int[2];
		for(int i=0;i<size-1;i++) {
			//System.out.println("In i for loop for i="+i);
			for(int j=i+1;j<=size-1;j++) {
				//System.out.println("In j for loop for j="+j);
				//System.out.println("i="+i+";j="+j);
				//System.out.println("nums[i]="+nums[i]+";nums[j]="+nums[j]);
				sum = nums[i]+nums[j];
				//System.out.println("sum="+sum);
				if(sum == target) {
				//	System.out.println("i="+i+";j="+j);
					result[0]=i;
					result[1]=j;
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,1,2,3};
		int target = 1;
		int result[] = TwoSums(nums,target);
		System.out.println("["+result[0]+","+result[1]+"]");

	}
	

}
