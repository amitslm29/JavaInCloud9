package com.org.test;

public class LinkedList<E> {

	static class Node<E> {
		E data;
		Node<E> next;
		Node(E data){
			this.data = data;
			next = null;
		}
	}
	
	Node<E> head;
	int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst(E data){
		Node<E> node = new Node<E>(data);
		node.next = head;
		head = node;
		size++;
	}
	
	public void addLast(E data) {
		Node<E> node = new Node<E>(data);
		if(head == null)
			head = node;
		else{
			Node<E> temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			
			temp.next = node;
			
		}
		size++;
	}
	
	public void addByIndex(E data, int index) {
		if(index < 0 || index > size)
			throw new RuntimeException("Invalid Entry");
		Node<E> node = new Node<E>(data);
		if(index == 0)
			addFirst(data);
		else{
			int count = 0;
			Node<E> current = head;
			while(count < index-1){
				current = current.next;
				count++;
			}
			
			Node<E> temp = current.next;
			current.next = node;
			node.next = temp;
			size++;
			
		}
	}
}
