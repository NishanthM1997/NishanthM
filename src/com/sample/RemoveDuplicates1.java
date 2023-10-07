package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates1 {
	public static void main(String[] args) {
		
		Integer a[]= {10,10,20,60,70,20};
		
		List<Integer> li = Arrays.asList(a);
		
		List<Integer> r=new ArrayList<>();
		
		for (Integer val : li) {
			if (!r.contains(val)) {
				r.add(val);
			} 
		}
		System.out.println(r);
	}
}
