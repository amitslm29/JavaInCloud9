package com.org.newcode;

/*
 * Given an array of integers representing stock price on single day, find max profit 
 * that can be earned by 1 transaction. So you need to find pair (buyDay,sellDay) where 
 * buyDay < = sellDay and it should maximize the profit.
 * Approach:
 	Lets say we have array arr[] of stock prices.
	We will track two variables :lowestPriceTillThatDay and maxProfit.

	lowestPriceTillThatDay will be initialise to arr[0].
	Iterate over stock price array arr[]
	If current element is greater than lowestPriceTillThatDay
	calculate profit.
	If profit is greater than maxProfit then update the maxProfit.
	If current element is lesser than lowestPriceTillThatDay
	update lowestPriceTillThatDay with current element.
	We will get maxProfit in the end.
	https://java2blog.com/stock-buy-sell-to-maximize-profit/
 */
public class StockBuySellMaximumProfit {
	
	public static void main(String[] args) {
		int[] stock = {100, 91, 70, 15, 99, 65, 21, 90, 1};
		int maximumProfit = stockMaximumProfit(stock);
		System.out.println("Maximum Profit : " + maximumProfit);
	}
	
	public static int stockMaximumProfit(int[] arr){
		
		int size = arr.length;
		int lowestPriceTillDate = arr[0];
		int maxProfit = Integer.MIN_VALUE;
		
		for(int i=1 ; i<size ; i++){
			int profit = 0;
			if(arr[i] > lowestPriceTillDate){
				profit = arr[i] - lowestPriceTillDate;
				if(profit > maxProfit)
					maxProfit = profit;
			}
			else{
				lowestPriceTillDate = arr[i];
			}
		}
		
		return maxProfit;
	}

}
