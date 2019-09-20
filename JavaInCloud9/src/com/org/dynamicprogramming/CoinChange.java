package com.org.dynamicprogramming;


public class CoinChange {

	public static void main(String[] args) {

		int[] coins = {1,2,3};
		int N = 4;
		int result = coinChange(coins, coins.length, N);
		System.out.println("Total number of ways to get the desired change is : " + result);
	}

	public static int coinChange(int[] coins, int m, int N){

		//If total is 0, return 1 (Solution found)
		if(N == 0)
			return 1;

		//If total become negative, return 0 (No solution found)
		if(N < 0)
			return 0;

		//If no coins left and n is greater than 0 (No solution found)
		if(m <= 0 && N >= 1)
			return 0;

		int incl = coinChange(coins, m, N - coins[m-1]);
		int excl = coinChange(coins, m-1, N);
		return incl + excl;
	}

	
}


/*
For the first problem, all you have to is find the total number of ways so that you can form N by
using the given list of coins.

Logic behind this problem is very simple whether you want to take the current coin to form the N 
i.e. Either you will take the current coin or you won’t and the answer will be the sum of both the cases.

Let coin[] be the array of coins and N is the given number that you have to represent using the list 
of coins and you may assume that you have infinite supply of coins of one type.

So the recurrence for the given problem will be as follows -
func(coin,i−1,N)+func(coin,i,N−coin[i]);

once you get the recurrence, nothing is left for you to do anything other then the optimization because 
the complexity of the above solution is exponential.

https://www.quora.com/What-is-an-easy-way-to-understand-the-coin-change-problem-in-dynamic-programming
 */