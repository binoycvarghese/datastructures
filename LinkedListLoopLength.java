package com.java.datastructure.linkedlist;

public class LinkedListLoopLength {

	static int getLoopLength(LinkedList list) {
		if (list == null || list.head == null) {
			return 0;
		} else {
			return getLoopLength(list.head);
		}
	}

	static int getLoopLength(LinkedList.Node node) {

		LinkedList.Node slow = node, fast = node;
		while (slow != null && fast != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return getLoopLengthCount(slow);
			}
		}

		return 0;

	}

	static int getLoopLengthCount(LinkedList.Node node) {
		int length = 1;
		LinkedList.Node temp = node;
		while (temp.next != node) {
			length++;
			temp = temp.next;
		}

		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list = LinkedListInsertion.insert(list, 1);
		list = LinkedListInsertion.insert(list, 2);
		list = LinkedListInsertion.insert(list, 3);
		list = LinkedListInsertion.insert(list, 4);
		list = LinkedListInsertion.insert(list, 5);
		list = LinkedListInsertion.insert(list, 6);

		list.head.next.next.next.next.next.next = list.head.next.next;

		System.out.println("length of LinkedList = " + getLoopLength(list));

	}

}
