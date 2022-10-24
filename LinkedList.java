package com.Bridgelabz.Day14.LinkedList;

public class LinkedList {
	public static void main(String[] args) {
		INode head;
		LinkedListOperation operation = new LinkedListOperation();
		INode<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);

		head = operation.addNode(firstNode);
		operation.display(head);
		head = operation.addNode(secondNode);
		operation.display(head);
		head = operation.addNode(thirdNode);
		operation.display(head);
	}
}
