package com.rakuten.prj.util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.rakuten.prj.entity.Triplet; 

	

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
	
	public static List<Triplet> printTriplets(int[] data){
        Arrays.sort(data); 
        List<Triplet> ls = new ArrayList<>();
        Triplet t = new Triplet();
        for (int i = data.length - 1; i >= 0; i--) { 
            int j = 0; 
            int k = i - 1; 
            while (j < k) { 
                if (data[i] == data[j] + data[k]) { 
                	t.setFirst(data[j]);
                	t.setSecond(data[j]);
                	t.setSum(data[i]);
                   
                } 
                else if (data[i] > data[j] + data[k]) 
                    j += 1; 
                else
                    k -= 1; 
            }  
        }
        ls.add(t);
        return ls;
	    } 
	
	
	
	
}
