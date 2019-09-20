package com.org.linkedlist;

import com.org.linkedlist.LinkedListMiddleElement.Node;

public class FindMiddleElementLinkedList {
	
	public static void main(String[] args) {
		LinkedListMiddleElement list = new LinkedListMiddleElement();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		
		System.out.print("LinkedList - ");
		list.print(head);
		
		int middleElement = list.findMiddleElement(head);
		System.out.println("Middle Element in the LinkedList - " + middleElement);
	}
}


class LinkedListMiddleElement{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public int findMiddleElement(Node node){
		if(node == null)
			throw new RuntimeException("List is Empty !!!");
		
		Node fast = node;
		Node slow = node;
		
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;
	}
	
	public void print(Node node){
		if(node == null)
			return;
		Node temp = node;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}