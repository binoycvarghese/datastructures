package com.java.datastructure.linkedlist;

public class LinkedListLoopDetection {

	static boolean detectLoop(LinkedList list) {
		if (list == null || list.head == null) {
			return false;
		} else {
			return detectLoop(list.head);
		}
	}

	static boolean detectLoop(LinkedList.Node node) {
		
		//1--2--3--4--5--6
		/**
		 * * 1 -- 2--3--4
		 * 		     |  |
		 *           6--5
		 *
		 * first iteration
		 * 
		 * s ->1
		 * f ->1
		 * 
		 * 2nd iteration
		 * 
		 * s->2
		 * f->3
		 * 3rd iteration
		 * s->3
		 * f->5
		 * 4th iteration
		 * s->4
		 * f->3
		 * 5thiteration
		 * 
		 * s->5
		 * f->5
		 */

		LinkedList.Node slow = node, fast = node;//1
		while (slow != null && fast != null && fast.next.next != null) {
			slow = slow.next; //2
			fast = fast.next.next;//3
			if (slow == fast) {
				return true;
			}
		}

		return false;

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

		/**
		 * 1 -- 2--3--4
		 * 		   |  |
		 *         6--5
		 */

		//list.head.next.next.next.next.next.next = list.head.next.next;
		System.out.println(detectLoop(list) ? "loop detected" : "loop is not detected");

		 list = null;
		 System.out.println(detectLoop(list)?"loop detected": "loop is not detected");

	}

}
