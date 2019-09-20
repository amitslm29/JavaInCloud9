package com.org.implementation.linkedlist;

public class LinkedList<E> {
	
	static class Node<E> {
		E data;
		Node<E> next;
		public Node(E data) {
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

	public void addFirst(E data) {
		Node<E> node = new Node<E>(data);
		node.next = head; // It will work even if list is empty
		head= node;
		size++;
	}

	public void addLast(E data) {
		Node<E> node = new Node<E>(data);
		if(head == null) {
			head = node;
		} else {
			Node<E> temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		size++;
	}

	public void addByIndex(E data, int index) {
		if(index < 0 || index > size)
			throw new RuntimeException("Invalid Input !!!");
		else if(index == 0)
			addFirst(data);
		else{
			Node<E> node = new Node<E>(data);
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

	public E removeFirst() {
		if(head == null) // If List has no element
			return null;

		E temp = head.data;
		if(head.next == null){ // If List has single element
			head = null;
		} else {
			head = head.next;
		}
		size--;
		return temp;
	}

	public E removeLast() {

		if(head == null)
			return null;
		if(head.next == null)
			return removeFirst();

		Node<E> previous=null;
		Node<E> current = head;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		E removedNodeValue = current.data;
		previous.next = null;
		size--;
		return removedNodeValue;
	}

	public E removeByIndex(int index) {

		if(index < 0 || index > size-1)
			return null;
		if(index == 0)
			return removeFirst();

		Node<E> current = head;
		int count = 0;

		while(count < index-1){
			current = current.next;
			count++;
		}
		E removedNodeValue = current.next.data;
		current.next = current.next.next;
		size--;
		return removedNodeValue;
	}
	
	public E getFirst() {
		if(head == null)
			return null;
		return head.data;
	}
	
	public E getLast() {
		if(head == null)
			return null;
		if(head.next == null)
			return head.data;
		
		Node<E> temp = head;
		while(temp.next != null)
			temp = temp.next;
		return temp.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size(){
		return size;
	}
	
	public void list() {
		if(head == null)
			return;
		Node<E> temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public boolean contains(E data) {
		if(head == null)
			return false;
		if(head.data == data)
			return true;
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
			if(temp.data == data)
				return true;
		}
		return false;
	}
}
