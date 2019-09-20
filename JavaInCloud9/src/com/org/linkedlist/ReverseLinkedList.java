package com.org.linkedlist;

import com.org.linkedlist.LinkedListReverse.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedListReverse list = new LinkedListReverse();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);

		System.out.print("Original LinkedList - ");
		list.print(head);

		System.out.println();
		head = list.reverse(head);
		System.out.print("Reversed LinkedList - ");
		list.print(head);
	}
}


class LinkedListReverse{

	Node head;

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public Node reverse(Node node){
		if(node == null || node.next == null)
			return node;

		Node current = node;
		Node next = null;
		Node previous = null;

		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public void print(Node node){
		if(node == null)
			return;
		Node temp = node;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
