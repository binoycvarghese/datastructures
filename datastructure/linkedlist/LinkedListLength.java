package com.java.datastructure.linkedlist;

public class LinkedListLength {

	static int sizeByIterative(LinkedList list) {
		int size = -1;
		if (list == null || list.head == null) {
			return size;
		}
		
		size++; // 1 - > 2 -> 3->null
		
		LinkedList.Node last = list.head;
		
		while (last != null) {
			size++;
			last = last.next;
		}

		return size;
	}

	
	//// 1 - > 2 -> 3->null
	static int sizeByRecursive(LinkedList.Node node) {
		if (node == null) {
			return 0;
		}
		int x = 1 + sizeByRecursive(node.next);
		return x;
	}

	static int sizeByRecursive(LinkedList list) {
		if (list == null) {
			return -1;
		} else {
			return sizeByRecursive(list.head);
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = LinkedListInsertion.insert(list, 1);
		list = LinkedListInsertion.insert(list, 2);
		list = LinkedListInsertion.insert(list, 3);
		list = LinkedListInsertion.insert(list, 4);
		list = LinkedListInsertion.insert(list, 5);
		System.out.println("Size/length of LinkedList by iterative =  " + sizeByIterative(list));

		System.out.println("Size/length of LinkedList by recursion = " + sizeByRecursive(list));
/*
		
		list = null;
		System.out.println("Size/length of LinkedList by iterative =  " + sizeByIterative(list));

		System.out.println("Size/length of LinkedList by recursion = " + sizeByRecursive(list));

		
		list = new LinkedList();
		list = LinkedListInsertion.insert(list, 1);
		System.out.println("Size/length of LinkedList by iterative =  " + sizeByIterative(list));

		System.out.println("Size/length of LinkedList by recursion = " + sizeByRecursive(list));
	*/
	}

}
