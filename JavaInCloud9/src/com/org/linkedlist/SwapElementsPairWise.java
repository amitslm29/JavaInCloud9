package com.org.linkedlist;

import com.org.linkedlist.LinkedListSwapPairWise.Node;

public class SwapElementsPairWise {
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		
		LinkedListSwapPairWise list = new LinkedListSwapPairWise();
		list.print(head);
		
		System.out.println();
		list.swapPairwise(head);
		list.print(head);
	}

}

class LinkedListSwapPairWise {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void swapPairwise(Node node) {
		
		if(node == null || node.next == null)
			return;
		
		Node temp = node;
		
		while(temp != null && temp.next != null){
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
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
