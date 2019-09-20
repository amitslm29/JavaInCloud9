package com.org.linkedlist;

import java.util.Stack;

import com.org.linkedlist.LinkedListPrintReverse.Node;

public class PrintLinkedListReverseOrder {
	
	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		
		LinkedListPrintReverse list = new LinkedListPrintReverse();
		list.printReverseUsingRecursion(head);
		System.out.println();
		list.printReverseUsingStack(head);
	}

}

class LinkedListPrintReverse {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void printReverseUsingRecursion(Node node){
		if(node == null)
			return;
		printReverseUsingRecursion(node.next);
		System.out.print(node.data + " -> ");
	}
	
	public void printReverseUsingStack(Node node){
		if(node == null)
			return;
		
		Stack<Node> stack = new Stack<>();
		Node temp = node;
		while(temp != null){
			stack.push(temp);
			temp = temp.next;
		}
		
		while(!stack.empty()){
			System.out.print(stack.pop().data + " -> ");
		}
	}
}