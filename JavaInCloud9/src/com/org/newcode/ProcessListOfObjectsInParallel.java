package com.org.newcode;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * https://stackoverflow.com/questions/5384415/smart-way-of-processing-list-with-threads
 * https://stackoverflow.com/questions/50189254/how-to-process-a-list-of-objects-in-parallel-processing-in-java
 */
public class ProcessListOfObjectsInParallel {

	public static void main(String[] args) {
		
	}
	
	public static void processList(List<Object> list, int numOfThreads){
		ExecutorService executor = Executors.newFixedThreadPool(numOfThreads);
		for(final Object obj : list){
			executor.execute(new Runnable() {
				@Override
				public void run() {
					doProcessing(obj);
				}
			});
		}		
	}
	
	public static void doProcessing(Object obj){
		// Logic to process each objects
	}
}
