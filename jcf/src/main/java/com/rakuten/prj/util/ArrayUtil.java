package com.rakuten.prj.util;
import java.util.Arrays; 

	

public class ArrayUtil {
	public static int getSum(int [] data) {
		int sum=0;
		for(int i=0;i<data.length;i++) {
			sum+=data[i];
		}
		return sum;
	}
	
	public static int getOccurance(int []data,int no) {
		int count=0;
		for(int i=0;i<data.length;i++) {
			if(no==data[i])
				count++;
		}
		return count;
	}
	
	public static void sort(int [] data) {
		Arrays.sort(data,0,data.length);
	}
	
	/**
	 * 
	 * @param items which are comparable
	 */
	
	public static void sort(Comparable[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = i+1; j < items.length; j++) {
				if(items[i].compareTo(items[j])>0) {
					Comparable temp = items[i];
					items[i] = items[j];
					items[j] = temp;
				}
			}
		}
	}
}
