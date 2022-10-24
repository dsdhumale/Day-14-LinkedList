package com.Bridgelabz.Day14.LinkedList;

public class LinkedListOperation {

	private INode head;

	public INode addNode(INode myNode) {
		if (head == null)
			head = myNode;
		else {
			INode temp = head;
			head = myNode;
			head.setNext(temp);
		}
		return head;
	}

	public void display(INode head) {
		System.out.println(head.getKey());
	}
}
