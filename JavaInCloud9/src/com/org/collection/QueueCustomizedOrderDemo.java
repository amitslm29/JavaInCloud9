package com.org.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueCustomizedOrderDemo {
	
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>(10, new VowelComparator());
		priorityQueue.add("orange");
		priorityQueue.add("fig");
		priorityQueue.add("watermelon");
		priorityQueue.add("lemon");
		while (priorityQueue.size() != 0) {
			System.out.println(priorityQueue.remove());
		}
	}
}

class VowelComparator implements Comparator<String> {

	@Override
	public int compare(String x, String y) {
		if (getVowelCount(x) < getVowelCount(y)) {
			return -1;
		} else if (getVowelCount(x) > getVowelCount(y)) {
			return 1;
		}
		return 0;
	}

	public int getVowelCount(String word) {
		int vowel = 0;
		for (int i = 0; i < word.length(); i++) {
			char chr = word.charAt(i);
			if (chr == 'a' || chr == 'A' || chr == 'e' 
					|| chr == 'E' || chr == 'i' || chr == 'I' 
					|| chr == 'o' || chr == 'O' || chr == 'u' 
					|| chr == 'U')
				vowel++;
		}
		return vowel;
	}
}
