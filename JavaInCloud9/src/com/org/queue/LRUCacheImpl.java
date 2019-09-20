package com.org.queue;

import java.util.HashMap;

public class LRUCacheImpl{
	
	public static void main(String[] args) {
		
		LRUCache cache = new LRUCache(4);
		cache.put(1, 100);
		cache.put(10, 99);
		cache.put(15, 98);
		cache.put(10, 97);
		cache.put(12, 96);
		cache.put(18, 95);
		cache.put(1, 94);
 
		System.out.println(cache.get(1));
		System.out.println(cache.get(10));
		System.out.println(cache.get(15));
	}
	
}

class LRUCache {

	static class Node {
		int key;
		int value;
		Node previous;
		Node next;
		
		Node(int key, int value){
			this.key = key;
			this.value = value;
			previous = null;
			next = null;
		}
	}
	
	HashMap<Integer, Node> map;
	int capacity;
	Node head;
	Node tail;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new HashMap<>();
		head = null;
		tail = null;
	}
	
	public int get(int key){
		if(map.containsKey(key)){
			Node node = map.get(key);
			remove(node);
			addAtTop(node);
			return node.value;
		}
		return -1;
	}
	
	public void put(int key, int value){
		if(map.containsKey(key)){
			Node node = map.get(key);
			node.value = value;
			remove(node);
			addAtTop(node);
		} 
		else{
			if(map.size() >= capacity){
				map.remove(tail.key);
				remove(tail);
			}
			Node node = new Node(key, value);
			addAtTop(node);
			map.put(key, node);
		}
	}
	
	public void remove(Node node){
		if(node.previous != null)
			node.previous.next = node.next;
		else
			head = head.next;
		
		if(node.next != null)
			node.next.previous = node.previous;
		else
			tail = tail.previous;
	}
	
	public void addAtTop(Node node){
		node.next = head;
		node.previous = null;
		if(head != null)
			head.previous = node;
		head = node;
		
		if(tail == null)
			tail = head;
	}
		
		
}
