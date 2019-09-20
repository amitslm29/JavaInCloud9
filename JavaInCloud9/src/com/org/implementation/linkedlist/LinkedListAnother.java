package com.org.implementation.linkedlist;

import java.util.NoSuchElementException;

public class LinkedListAnother {
	
	Node head, tail;
	int size;

	class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public LinkedListAnother() {
		head = tail = null;
		size = 0;
	}

	public void addFirst(int data) {
		Node node = new Node(data);
		node.next = head; // It will work even if list is empty
		head= node;
		size++;
	}

	/*
	 * This method is similar to add method of LinkedList.
	 * add() method appends the element to the end of the list.
	 */
	public void addLast(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = tail = node;
		} else{
			tail.next = node; // tail pointer helps us to perform addLast more efficiently
			tail = node;
		}
		size++;
	}
	
	public void addByIndex(int data, int index) {

		Node node = new Node(data);
		if(head == null){
			head = tail = node;
		}
		else{
			int count = 1;
			Node current = head;
			while(count < index-1){
				current = current.next;
				count++;
			}
			Node temp = current.next;
			current.next = node;
			node.next = temp;
		}
		size++;
	}

	public int removeFirst() {
		if(head == null) // If List has no elements
			throw new NoSuchElementException();
		int removedNodeValue = head.data;
		if(head == tail){ // If List has single element
			head = tail = null;
		} else{
			head = head.next;
		}
		size--;
		return removedNodeValue;
	}

	public int removeLast() {
		if(head == null)
			throw new NoSuchElementException();
		if(head == tail)
			return removeFirst();

		Node temp = head;
		while(temp.next != tail) {
			temp = temp.next;
		}
		int removedNodeValue = temp.next.data;
		tail = temp;
		temp.next = null;
		size--;
		return removedNodeValue;
	}

	public int removeByIndex(int index) {

		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		if(index == 0)
			return removeFirst();

		Node current = head;
		int count = 1;

		while(count < index-1){
			current = current.next;
			count++;
		}
		int removedNodeValue = current.next.data;
		current.next = current.next.next;
		size--;
		return removedNodeValue;
	}
	
	public int getFirst() {
		if(head == null)
			return -1;
		return head.data;
	}
	
	public int getLast() {
		if(tail == null)
			return -1;
		return tail.data;
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public int size(){
		return size;
	}
	
	public void list() {
		Node temp = head;
		while(true){
			if(temp == null)
				return;
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public boolean contains(int data) {
		if(head == null)
			return false;
		if(head.data == data)
			return true;
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
			if(temp.data == data)
				return true;
		}
		return false;
	}
}
