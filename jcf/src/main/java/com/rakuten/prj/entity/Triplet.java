package com.rakuten.prj.entity;

import com.rakuten.prj.util.ArrayUtil;

public class Triplet {

	int first;
	int second;
	int sum;
	/**
	 * @return the first
	 */
	public int getFirst() {
		return first;
	}
	/**
	 * @param first the first to set
	 */
	public void setFirst(int first) {
		this.first = first;
	}
	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}
	
	/**
	 * @param second the second to set
	 */
	public void setSecond(int second) {
		this.second = second;
	}
	/**
	 * @return the sum
	 */
	public int getSum() {
		return sum;
	}
	/**
	 * @param sum the sum to set
	 */
	public void setSum(int sum) {
		this.sum = sum;
	}

	
	public static void main(String[] args) {
		int[] data = { 2,3,4,5,7};
		System.out.println(ArrayUtil.printTriplets(data));
	}
	
}
