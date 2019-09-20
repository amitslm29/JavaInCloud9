package com.org.dynamicprogramming;

/*
 * Given a rod of length n and list of prices of rod of length i where 1 <= i <= n.
 * Find the optimal way to cut rod into smaller rods in order to maximize profit.
 */
public class CuttingRod {

	public static void main(String[] args) {
		
		int[] price = {1,5,8,9,10,17,17,20};
		int num = 4;
		
		int result = cuttingRodUsingDP(price, num);
		System.out.println("Maximum Profit : " + result);
		
	}
	
	/*
	 * Time Complexity : O(n^n)
	 * Auxilary Space : O(1)
	 */
	public static int cuttingRodUsingRecursion(int[] price, int num){
		if(num == 0)
			return 0;
		
		int maxValue = Integer.MIN_VALUE;
		for(int i=1 ; i<=num ; i++){
			maxValue = Math.max(maxValue, price[i-1] 
					+ cuttingRodUsingRecursion(price, num-i));
		}
		return maxValue;
	}
	
	/*
	 * Time Complexity : O(n^2)
	 * Auxilary Space : O(n)
	 */
	public static int cuttingRodUsingDP(int[] price, int num){
		int[] result = new int[num+1];
		
		for(int i=1 ; i<=num ; i++){
			int maxValue = Integer.MIN_VALUE;
			for(int j=1 ; j<=i ; j++){
				maxValue = Math.max(maxValue, price[j-1] + result[i-j]);
			}
			
			result[i] = maxValue;
		}
		return result[num];
	}
}