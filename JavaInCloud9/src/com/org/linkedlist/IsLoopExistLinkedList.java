package com.org.linkedlist;

import java.util.HashSet;

import com.org.linkedlist.LinkedListLoopExist.Node;

public class IsLoopExistLinkedList {

	public static void main(String[] args) {
		LinkedListLoopExist list = new LinkedListLoopExist();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next = new Node(6);
		head.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next = new Node(8);

		//Creating a loop for testing
		head.next.next.next.next.next.next = head.next.next;

		boolean result = list.isLoopExist(head);
		System.out.println("Loop exist in LinkedList - " + result);

		Node firstNodeInLoop = list.findFirstNodeInLoop(head);
		System.out.println("First node in the loop - " + firstNodeInLoop.data);
	}
}


class LinkedListLoopExist{

	Node head;

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public boolean isLoopExist(Node node){
		Node fast = node;
		Node slow = node;

		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast)
				return true;
		}
		return false;
	}

	public Node findFirstNodeInLoop(Node node){
		Node fast = node;
		Node slow = node;

		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast)
				break;
		}
		
		slow = node;
		
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}

	public boolean isLoopExistUsingHashSet(Node node){

		HashSet<Node> set = new HashSet<>();
		while(node != null){
			if(set.contains(node))
				return true;
			set.add(node);
			node = node.next;
		}
		return false;
	}

	public Node findFirstNodeInLoopUsingHashSet(Node node){

		HashSet<Node> set = new HashSet<>();
		while(node != null){
			if(set.contains(node))
				return node;
			set.add(node);
			node = node.next;
		}
		return null;
	}


}