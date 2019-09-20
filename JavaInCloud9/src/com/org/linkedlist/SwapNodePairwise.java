package com.org.linkedlist;

public class SwapNodePairwise {

	public static void main(String[] args) {
		
	}
}

class LinkedListSwapNodePairwise {
	
	Node head;

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public Node pairwiseSwap(Node node){
		if(node == null || node.next == null) 
			return node;
		
		Node current = node;
		Node previous = null;
		
		while(current != null && current.next != null){
			Node temp = current.next;
			current.next = temp.next;
			temp.next = current;
			
			if(previous == null)
				node = temp;
			else
				previous.next = temp;
			
			previous = current;
			current = current.next;
		}
		return node;
	}
}
