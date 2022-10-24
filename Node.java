package com.Bridgelabz.Day14.LinkedList;

public class Node<k> {
	k key;
	Node next;

	public Node(k key) {
		this.key = key;
		this.next = null;
	}

	public k getKey() {
		return key;
	}

	public void setKey(k key) {
		this.key = key;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
