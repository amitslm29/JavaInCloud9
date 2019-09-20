package com.org.linkedlist;

import com.org.linkedlist.LinkedListFindNthNode.Node;

public class FindNthNodeFromEnd {
	
	public static void main(String[] args) {
		
		LinkedListFindNthNode list = new LinkedListFindNthNode();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		
		System.out.print("LinkedList - ");
		list.print(head);
		
		Node result = list.findNthNode(head, 3);
		System.out.println("3rd node from end in the LinkedList - " + result.data);
	}
}

class LinkedListFindNthNode{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public Node findNthNode(Node node, int n){
		Node first = node;
		Node second = node;
		int count = 0;
		
		while(count < n){
			first = first.next;
			count++;
		}
	
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		return second;
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
