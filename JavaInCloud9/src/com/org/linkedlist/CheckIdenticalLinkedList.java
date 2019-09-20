package com.org.linkedlist;

import com.org.linkedlist.LinkedListIdentical.Node;

public class CheckIdenticalLinkedList {

	public static void main(String[] args) {
		LinkedListIdentical list = new LinkedListIdentical();
		
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);
		
		Node head2 = new Node(1);
		head2.next = new Node(2);
		head2.next.next = new Node(3);
		head2.next.next.next = new Node(4);
		head2.next.next.next.next = new Node(5);
		//head2.next.next.next.next.next = new Node(6);

		System.out.print("First LinkedList - ");
		list.print(head1);
		
		System.out.print("Second LinkedList - ");
		list.print(head2);
		
		boolean result = list.isIdenticalList(head1, head2);
		System.out.println("Both LinkedLists are identical - " + result);

	}
}

class LinkedListIdentical {

	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public boolean isIdenticalList(Node node1, Node node2){
		if(node1 == null && node2 == null)
			return true;

		Node temp1 = node1;
		Node temp2 = node2;

		while(temp1 != null && temp2 != null){
			if(temp1.data != temp2.data)
				return false;
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		
		//This case is applicable , if one of the list has more nodes
		if(temp1 != null || temp2 != null)
			return false;
		
		return true;
	}

	public void print(Node node){
		if(node == null)
			return;
		Node temp = node;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
