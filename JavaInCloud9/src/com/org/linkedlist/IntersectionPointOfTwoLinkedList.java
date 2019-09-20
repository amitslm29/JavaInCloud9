package com.org.linkedlist;

import com.org.linkedlist.LinkedListIntersectionPoint.Node;

/*
1) Get the node count of both the linkedlist
2) Get the difference of counts d = abs(c1 – c2)
3) Now traverse the bigger list from the first node till d nodes
so that from here onwards both the lists have equal no of nodes.
4) Then we can traverse both the lists in parallel till we come across a common node.
*/
public class IntersectionPointOfTwoLinkedList {
	
	public static void main(String[] args) {
		
		Node head1 = new Node(10);
		head1.next = new Node(20);
		head1.next.next = new Node(30);
		head1.next.next.next = new Node(40);
		head1.next.next.next.next = new Node(50);
		head1.next.next.next.next.next = new Node(60);
		head1.next.next.next.next.next.next = new Node(70);
		head1.next.next.next.next.next.next.next = new Node(80);
		
		Node head2 = new Node(10);
		head2.next = new Node(20);
		head2.next.next = head1.next.next.next.next.next;
		
		LinkedListIntersectionPoint list = new LinkedListIntersectionPoint();
		int result = list.intersectionPoint(head1, head2);
		System.out.println("Intersection point - " + result);
	}

}

class LinkedListIntersectionPoint{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public int intersectionPoint(Node node1, Node node2){
		
		Node current1 = node1;
		Node current2 = node2;
		
		int c1 = getNodeCount(node1);
		int c2 = getNodeCount(node2);
		int difference = Math.abs(c1 - c2);
		
		while(difference > 0){
			if(c1 > c2)
				current1 = current1.next;
			else
				current2 = current2.next;
			difference--;
		}
		
		
		while(current1 != null && current2 != null){
			if(current1.data == current2.data)
				return current1.data;
			current1 = current1.next;
			current2 = current2.next;
		}
		return -1;
	}
	
	
	public int getNodeCount(Node node){
		int count = 0;
		Node temp = node;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}
}
