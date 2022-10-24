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

	public static void main(String[] args) {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);

		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		if ((firstNode.getNext() == secondNode) && (secondNode.getNext() == thirdNode)) {
			System.out.println(firstNode.getKey() + "->" + secondNode.getKey() + "->" + thirdNode.getKey());
			System.out.println(firstNode.getNext());
			System.out.println(secondNode);
			System.out.println(secondNode.getNext());
			System.out.println(thirdNode);

		} else {
			System.out.println("Null");

		}

	}
}
