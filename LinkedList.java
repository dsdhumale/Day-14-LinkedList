package com.Bridgelabz.Day14.LinkedList;

public class LinkedList {
	Node head;

//Method for adding data
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
//Method for displaying elements of Linked list

	public void display() {
		if (head == null)
			System.out.println("No elements to display.");

		else {
			Node temp = head;
			while (temp != null) {

				if (temp.next != null)
					System.out.print(temp.data + " -> ");

				else

					System.out.println(temp.data);
				temp = temp.next;

			}
		}

	}

}
