package com.sunbeam;

class BinSearchTree{
	
	//Node Class
	static class Node {
		 private int data;
		 private Node left;
		 private Node right;
		public Node(int val) {
			this.data = val;
			this.left = null;
			this.right = null;
		}
		public int getData() {
			return this.data;
		}
}

	private Node root;
	
	public BinSearchTree() {
		root = null;
	}
	
	//Recursive Add Code 
	public void add(int val) {
		root = addRec(root,val);
	}

	private Node addRec(Node root, int val) {
		
		if(root == null)
		    return new Node(val);
		if (val < root.data) 
			root.left = addRec(root.left,val);
		
		else
			root.right = addRec(root.right,val);
		return root;
	}

	//Recursive Search 
	public Node search (int key) {
		return searchRec(root,key);
	}
	
	private Node searchRec(Node root, int key) {
		if(root ==null || root.data== key)
		return root;
		
		if(key < root.data) 
			return searchRec(root.left,key);
		
		
		return searchRec(root.right,key);
	}

	//Recursive Delete 
	public void delete(int key) {
		root = deleteRec(root,key);
	}
	private Node deleteRec(Node root, int key) {
		if(root == null) 
			return null;
		
		if(key < root.data) 
			root.left = deleteRec(root.left,key);
		else if(key >root.data)
			root.right = deleteRec(root.right,key);
		
		else
		{
			//no child
			if(root.left == null && root.right == null)
				return null;
			
			//only right child 
			else if (root.left == null)
				return root.right;
			
			//only left child 
			else if (root.right == null)
				return root.left;
			
			// two children
			else {
				Node succ = findMin(root.right);
				
				root.data = succ.data;
				
				root.right = deleteRec(root.right,succ.data);
			}
		}
		return root;
}
	//Find Minimum
	private Node findMin(Node right) {
		while(root.left != null)
			root = root.left;
		return root;
	}

	//Preorder
	public void preorder()
	{
		System.out.print("PRE : ");
		preorderRec(root);
		System.out.println();
	}
	private void preorderRec(Node root) {
		if(root == null)
			return;
		System.out.print(root.data +" ");
		
		preorderRec(root.left);
		preorderRec(root.right);
	}

	public void display() {
		inorderRec(root);
	}

	//Recursive InOrder
	public void inorder()
    {
        System.out.print("IN   : ");
        inorderRec(root);
        System.out.println();
    }
	
	private void inorderRec(Node root) {
		if (root == null)
			return;
		inorderRec(root.left);
		System.out.print(root.data +" ");
		inorderRec(root.right);
	}
	
	public void postorder() {
		System.out.print("Post : ");
		postorderRec(root);
		System.out.println();
	}

	private void postorderRec(Node root) {
		if(root == null)
			return;
		postorderRec(root.left);
		postorderRec(root.right);
		System.out.print(root.data +" ");
		}
	
	//Descending Order 
	//Start from Right 
	public void descending() {
		System.out.print("DESC :");
		
		descendingRec(root);
		System.out.println();
	}

	private void descendingRec(Node root) {
		if (root== null)
			return;
		//traverse to Largest 1st
		descendingRec(root.right);
		System.out.print(root.data +" ");
		descendingRec(root.left);
		}
	
	//Height of tree
	public int height() {
		System.out.println();
		return heightRec(root);
		
	}

	private int heightRec(Node root) {
		if(root == null)
			return -1;
		
		int lh =heightRec(root.left);
		int rh =heightRec(root.right);
		return Math.max(lh, rh)+1;
	}
}


public class BSTMain {

	public static void main(String[] args) {
		BinSearchTree t = new BinSearchTree();
		
		t.add(50);
		t.add(25);
		t.add(10);
		t.add(75);
		t.add(90);
		t.add(35);
		t.add(60);
		t.add(15);
		t.add(55);
		t.add(70);
		System.out.println("Nodes inserted successfully");
		System.out.print("Tree Elements: ");
		//t.display();
		
		//Traversals
		System.out.println();
		t.preorder();
		t.inorder();
		t.postorder();
		t.descending();// Descending Order

		//Search 
		BinSearchTree.Node temp = t.search(60);
		System.out.println();
		if(temp != null)
			System.out.print("Found :" +temp.getData());
		else
			System.out.println("Data Not Found!...");
		// Delete
       // t.delete(50);
		
		
		// Height
        System.out.println("Height = "+t.height());
		
	}
}

