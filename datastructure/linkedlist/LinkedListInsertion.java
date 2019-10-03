package com.java.datastructure.linkedlist;

import com.java.datastructure.linkedlist.LinkedList.Node;

public class LinkedListInsertion {

	public static LinkedList insert(LinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

	public static void printLinkedList(LinkedList list) {
		Node currentNode = list.head;

		System.out.print("LinkedList ==>: ");
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();

		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);

		printLinkedList(list);

	}

}
