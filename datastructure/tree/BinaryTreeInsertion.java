package com.java.datastructure.tree;

public class BinaryTreeInsertion {

	public static void insert(BNode node, int value) {
		if (node.value >= value) {// this condition (node.value >= value) used for  handling the duplicate entry.
			if (node.left == null) {
				System.out.println("Node " + value+" inserted to left "+node.value);
				node.left = new BNode(value);
			} else {
				insert(node.left, value);
			}
		} else if (node.value < value) {
			if (node.right == null) {
				System.out.println("Node " + value+" inserted to right "+node.value);
				node.right = new BNode(value);
			} else {
				insert(node.right, value);
			}
		}
	}

	public static void main(String[] args) {
		BNode root = new BNode(5);
		insert(root, 3);
		insert(root, 1);
		insert(root, 4);
		insert(root, 15);
		insert(root, 10);
		insert(root, 20);
		 insert(root, 3);
		System.out.println("finished");

	}

}
