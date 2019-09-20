package com.org.linkedlist;

import com.org.linkedlist.LinkedListPalindrome.Node;

/*
 * Implementing code without using extra space
 * 
 * Step 1: Get the middle of the linked list.
 * Step 2: Reverse the second half of the linked list.
 * Step 3: Check if the first half and second half are identical.
 * Step 4: If all nodes matched, then return true, else false.
 * 
 * Time complexity - O(n), Space complexity - O(1)
 */
public class CheckPalindromeLinkedList {

	public static void main(String[] args) {
		LinkedListPalindrome list = new LinkedListPalindrome();
		Node head = new Node(4);
		head.next = new Node(3);
		head.next.next = new Node(2);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(2);
		head.next.next.next.next.next = new Node(3);
		head.next.next.next.next.next.next = new Node(4);
		
		System.out.print("LinkedList - ");
		list.print(head);
		
		boolean result = list.isPalindrome(head);
		System.out.println("LinkedList is palindrome - " + result);
	}

}

class LinkedListPalindrome {

	Node head;

	static class Node {
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public boolean isPalindrome(Node node){

		if(node == null || node.next == null)
			return true;

		Node fast = node;
		Node slow = node;
		Node firstHalf = node;
		Node secondHalf = null;

		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}

		//In case LinkedList has odd number of nodes
		if(fast.next == null)
			slow = slow.next;

		secondHalf = reverse(slow);

		while(firstHalf != null && secondHalf != null){
			if(firstHalf.data != secondHalf.data)
				return false;
			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
		}
		return true;
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
		System.out.println();
	}
}