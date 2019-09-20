package com.org.thread.important;

import java.util.LinkedList;
import java.util.List;

interface CustomBlockingQueue<E> {

	/**
	 * Inserts the specified element into this queue only if space
	 * is available else waits for space to become available. 
	 */
	void enqueue(E element) throws InterruptedException;

	/**
	 * Retrieves and removes the front of this queue only if elements are
	 * available, else waits for element to become available.
	 */
	E take() throws InterruptedException;
}

class CustomBlockingQueueImpl<E> implements CustomBlockingQueue<E> {
	
	private List<E> queue;
	private int maxSize;
	
	public CustomBlockingQueueImpl(int maxSize) {
		this.maxSize = maxSize;
		queue = new LinkedList<>();
	}

	@Override
	public synchronized void enqueue(E element) throws InterruptedException {
		while(this.queue.size() == this.maxSize)
			wait();
		
		if(this.queue.size() == 0)
			notifyAll();
		
		this.queue.add(element);
		
	}

	@Override
	public synchronized E take() throws InterruptedException {
		while(this.queue.size() == 0)
			wait();
		
		if(this.queue.size() == this.maxSize)
			notifyAll();
		
		return this.queue.remove(0);
	}
}