package com.org.linkedlist;

import com.org.linkedlist.LinkedListMerge.Node;

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {

		LinkedListMerge list = new LinkedListMerge();

		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);

		Node head2 = new Node(8);
		head2.next = new Node(9);
		head2.next.next = new Node(10);
		head2.next.next.next = new Node(11);
		head2.next.next.next.next = new Node(12);
		head2.next.next.next.next.next = new Node(13);
		head2.next.next.next.next.next.next = new Node(14);
		head2.next.next.next.next.next.next.next = new Node(15);

		Node result = list.mergeList(head1, head2);
		list.print(result);

	}
}

class LinkedListMerge {

	Node head;

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public Node mergeList(Node node1, Node node2){

		if(node1 == null)
			return node2;
		if(node2 == null)
			return node1;

		Node newHead = new Node(0);

		Node temp = newHead;
		Node temp1 = node1;
		Node temp2 = node2;


		while(temp1 != null && temp2 != null){
			if(temp1.data < temp2.data){
				temp.next = temp1;
				temp1 = temp1.next;
			}else{
				temp.next = temp2;
				temp2 = temp2.next;
			}
			temp = temp.next;
		}

		if(temp1 != null)
			temp.next = temp1;
		if(temp2 != null)
			temp.next = temp2;

		return newHead.next;
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
