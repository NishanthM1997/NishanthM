package com.sample;

public class ArmstrongNum {
	public static void main(String[] args) {
		
		int num=371,count=0,res=0,rem;
		
		while (num>0) {
			
			num=num/10;
			count++;
		}
		while (num>0) {
			
			rem=num%10;
			res=res+(int)(Math.pow(rem, count));
			num=num/10;
		}
		
		if (res==num) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
		
	}
}
