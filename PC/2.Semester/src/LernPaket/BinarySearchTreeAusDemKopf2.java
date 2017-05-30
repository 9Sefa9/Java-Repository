package LernPaket;

public class BinarySearchTreeAusDemKopf2<Key extends Comparable<Key>, Value> {
//ACHTUNG DIESER CODE HIER IST FALSCH
	private Node root;
	
	private class Node{
		private Key key;
		private Value value;
		private Node left;
		private Node right;
		
		private int count;
		
		public Node(Key key, Value value, int count){
			
			this.key = key;
			this.value = value;
			this.count = count;
		}
	}
	
	// ANLAMADIM! 
	public Node rank(Node root,Key key){
		if(root == null) return null;
		int cmp = key.compareTo(root.key);
		if(cmp<0) rank(root.left,key);
		else if(cmp == 0) return root;
		else{
			
		}
	}
	public Value get(Node root,Key key){
		if(root.key == key) return root.value;
		
		int cmp = key.compareTo(root.key);
		if(cmp>0) get(root.right,key);
		else if(cmp<0) get(root.left,key);
		else return root.value;
		return root.value;
		
	}
	public void delete(Key key){
		root = delete(root,key);
	}
	public Node delete(Node root, Key key){
		return root;
		
	}
	public void deleteMin(Key key){
		root = deleteMin(root,key);
	}
	public Node deleteMin(Node x, Key key){
		return x;
		
	}
	
	public int size(Node x){
		if(x == null) return 0;
		int cmp = key.compareTo(x.key);
		if(cmp<0) x.left = size(x.left,key);
		else if(cmp>0) return x.right = size(x.right);
		else return 1+size(x.left)+size(x.right); 
	}
	public Node searchMin(Node root,Key key){
		if(root.left == null) return root:
		else searchMin(root.left,key);
	}

}












