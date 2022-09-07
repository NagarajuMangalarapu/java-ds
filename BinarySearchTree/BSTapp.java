package BinarySearchTree;
class Node 
{
	int data;
	Node left;
	Node right;
}
class BST
{
	public Node insert(Node node , int val)
	{ if(node == null)
		return createNode(val);
	if(node.data>val)
	{
		node.left = insert(node.left , val);
	}
	if(node.data<val)
	{
		node.right = insert(node.right , val); 
	}
	return node;
	}

	public Node createNode(int val)
	{
		Node n = new Node();
		n.data = val;
		n.left = null;
		n.right = null;
		return n;
	}

	  public Node delete(Node node, int val) {
	    if(node == null) {
	      return node;
	    }
	    
	    if(val < node.data) {
	      node.left = delete(node.left, val);
	    } else if(val > node.data) {
	      node.right = delete(node.right, val);
	    } else {
	      if(node.left == null || node.right == null) {
	        Node temp = node.left != null ? node.left : node.right;

	        if(temp == null) {
	          return null;
	        } else {
	          return temp;
	        }
	      } else {
	        Node successor = getSuccessor(node);
	        node.data = successor.data;
	        
	        node.right = delete(node.right, successor.data);
	        return node;
	      }
	    }
	    
	    return node;
	  }
	  
	  public Node getSuccessor(Node node) {
	    if(node == null) {
	      return null;
	    }
	    
	    Node temp = node.right;
	    
	    while(temp.left != null) {
	      temp = temp.left;
	    }
	    
	    return temp;
	  }
	
}
public class BSTapp 
{
	public static void main(String[] args) 
	{
		BST b = new BST();
		Node root = null;
		root = b.insert(root, 9);
		root = b.insert(root, 8);
		root = b.insert(root, 7);
		root = b.insert(root, 6);
		root = b.insert(root, 5);
		root = b.insert(root, 4);
		root = b.insert(root, 3);
		root = b.insert(root, 2);
		b.insert(root, 1);
	System.out.println(b.delete(root,9).data);
	}

}
