package com.org.linkedlist;

import com.org.linkedlist.LinkedListUnionIntersection.Node;

public class UnionAndIntersectionOfTwoLinkedList {
	
	public static void main(String[] args) {
		LinkedListUnionIntersection list = new LinkedListUnionIntersection();

		Node head1 = new Node(3);
		head1.next = new Node(2);
		head1.next.next = new Node(4);
		head1.next.next.next = new Node(5);
		head1.next.next.next.next = new Node(1);

		Node head2 = new Node(8);
		head2.next = new Node(2);
		head2.next.next = new Node(7);
		head2.next.next.next = new Node(5);
		head2.next.next.next.next = new Node(6);
		head2.next.next.next.next.next = new Node(10);
		head2.next.next.next.next.next.next = new Node(1);
		head2.next.next.next.next.next.next.next = new Node(9);

		Node unionResult = list.union(head1, head2);
		System.out.print("Union of two given array : ");
		list.print(unionResult);
		
		Node intersectionResult = list.intersection(head1, head2);
		System.out.print("Intersection of two given array : ");
		list.print(intersectionResult);
	}
}

class LinkedListUnionIntersection {
	
	Node head;

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
		
	public Node union(Node node1, Node node2){
		if(node1 == null)
			return node2;
		if(node2 == null)
			return node1;
		
		Node t1 = node1;
		Node t2 = node2;
		
		while(t1 != null){
			addNode(t1.data);
			t1 = t1.next;
		}
		
		while(t2 != null){
			if(!isPresent(head, t2.data))
				addNode(t2.data);
			t2 = t2.next;
		}
		
		return head;
	}

	public Node intersection(Node node1, Node node2){
		if(node1 == null || node2 == null)
			return null;
		
		Node t1 = node1;
		
		while(t1 != null){
			if(isPresent(node2, t1.data))
				addNode(t1.data);
			t1 = t1.next;
		}
		return head;
	}
	
	public void addNode(int data){
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public boolean isPresent(Node node, int data){
		if(node == null)
			return false;
		
		Node temp = node;
		
		while(temp != null){
			if(temp.data == data)
				return true;
			temp = temp.next;
		}
		return false;
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


/*
Initialize result list as NULL. Traverse list1 and look for its each element in list2, if the element is present in list2, then add the element to result.

Union (list1, list2):
Initialize result list as NULL. Traverse list1 and add all of its elements to the result.
Traverse list2. If an element of list2 is already present in result then do not insert it to result, otherwise insert.

This method assumes that there are no duplicates in the given lists.
	 */
	
	
	
	/*
	 Method 2 (Use Merge Sort)
In this method, algorithms for Union and Intersection are very similar. First we sort the given lists, then we traverse the sorted lists to get union and intersection.
Following are the steps to be followed to get union and intersection lists.

1) Sort the first Linked List using merge sort. This step takes O(mLogm) time. Refer this post for details of this step.
2) Sort the second Linked List using merge sort. This step takes O(nLogn) time. Refer this post for details of this step.
3) Linearly scan both sorted lists to get the union and intersection. This step takes O(m + n) time. This step can be implemented using the same algorithm as sorted arrays algorithm discussed here.

Time complexity of this method is O(mLogm + nLogn) which is better than method 1’s time complexity.
	 */
	/*
	 * https://www.geeksforgeeks.org/union-and-intersection-of-two-linked-lists/
	 * https://www.wikitechy.com/technology/java-programming-union-intersection-two-linked-lists/
	 */

