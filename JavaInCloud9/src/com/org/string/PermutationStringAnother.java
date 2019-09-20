package com.org.string;

import java.util.Map;
import java.util.TreeMap;

public class PermutationStringAnother {
	
	public static void main(String[] args) {
		
		String str = "ABBD";
		findPermutation(str);
		
	}
	
	public static void findPermutation(String str) {
		
		Map<Character, Integer> map = new TreeMap<>();
		
		for(char ch : str.toCharArray()){
			if(!map.containsKey(ch))
				map.put(ch, 1);
			else
				map.put(ch, map.get(ch)+1);
		}
		
		char[] input = new char[map.size()];
		int[] count = new int[map.size()];
		int index = 0;
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			input[index] = entry.getKey();
			count[index] = entry.getValue();
			index++;
		}
		
		char[] result = new char[str.length()];
		
		permutationUtil(input, count, result, 0);
		
	}
	
	public static void permutationUtil(char[] input, int[] count, char[] result, int level){
		
		if(level == result.length){
			printArray(result);
			return;
		}
		
		for(int i=0 ; i<input.length ; i++){
			if(count[i] == 0)
				continue;
			else{
				result[level] = input[i];
				count[i]--;
				permutationUtil(input, count, result, level+1);
				count[i]++;
			}
		}
	}
	
	public static void printArray(char[] arr){
		for(char ch : arr)
			System.out.print(ch + " ");
		System.out.println();
	}

}
