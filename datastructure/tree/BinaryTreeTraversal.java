package com.java.datastructure.tree;

public class BinaryTreeTraversal {
	
	static void inOrderTraversal(BNode node){
		if(node == null) {
			return;
		}
		inOrderTraversal(node.left);
		System.out.print(node.value+"-->");
		inOrderTraversal(node.right);
		
	}
	
	
	static void preOderTraversal(BNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.value+"-->");
		preOderTraversal(node.left);
		preOderTraversal(node.right);
	}
	
	static void postOderTraversal(BNode node) {
		if(node == null) {
			return;
		}
		postOderTraversal(node.left);
		postOderTraversal(node.right);
		System.out.print(node.value + "-->");
	}
	
	
	public static void main(String[] args) {
		BNode root = new BNode(5);
		BinaryTreeInsertion.insert(root, 3);
		BinaryTreeInsertion.insert(root, 1);
		BinaryTreeInsertion.insert(root, 4);
		BinaryTreeInsertion.insert(root, 15);
		BinaryTreeInsertion.insert(root, 10);
		BinaryTreeInsertion.insert(root, 20);
		
		
		System.out.println();
		//inOrderTraversal(root);
		//System.out.println();
		//preOderTraversal(root);
		//System.out.println();
		postOderTraversal(root);
	}

}
