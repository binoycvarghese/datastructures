package com.java.datastructure.linkedlist;

public class ReverseLinkedlist {

	static LinkedList.Node reverseIterative(LinkedList.Node node) {
		if (node == null || node.next == null) {
			return node;
		}
		LinkedList.Node previousNode = null, currentNode = node, nextNode = null;
// 1-2-3-4-5-6-null
		
		/**
		 * each iteration 1 
		 * previous  - null node
		 * next 2
		 * 1-null
		 * 
		 * previous =1
		 * current 2    result of 2nd iteration 2-1-null
		 * next =3
		 * previos = 2
		 * current 3
		 * 
		 * 3rd iteration
		 * next 4
		 * current.next = 3-2-1-null
		 * previous =3
		 * current =4
		 * 
		 * 
		 */
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}

		return previousNode;

	}

	public static LinkedList.Node recursiveReverse(LinkedList.Node linkedListNode) {
		//base condition
		if (linkedListNode == null || linkedListNode.next == null) {
			return linkedListNode;
		}

		LinkedList.Node reverseNode = recursiveReverse(linkedListNode.next);

		LinkedList.Node current = reverseNode;
		//for finding the tail node
		while (current.next != null) {
			current = current.next;

		}

		current.next = linkedListNode;
		linkedListNode.next = null;

		return reverseNode;
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
		// 1->2->3->4->5->6-> null
		//System.out.println("reverse by iterative");
		//.head = reverseIterative(list.head);
		//LinkedListInsertion.printLinkedList(list);

		//list.head = recursiveReverse(list.head);

		System.out.println("reverse by recursion");
		list.head = recursiveReverse(list.head);
		LinkedListInsertion.printLinkedList(list);

	}

}
