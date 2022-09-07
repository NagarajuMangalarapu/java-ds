package dsTree;

class Node

{
	int data;
	Node left;
	Node right;
	int height;
	
}
class leftsideview
{ int maxLevel;
	public void leftsideviewofTree(Node node,int level)
	{   
		
		if(node == null)
		return ;
		if(level >= maxLevel)
		{
			System.out.print(node.data +" ");
			maxLevel++;
		}
		leftsideviewofTree(node.left , level+1);
		leftsideviewofTree(node.right , level+1);
		
	    
	}
	
	public Node createNode(int value)
	{   Node newNode = new Node();
	    newNode.data = value;
	    newNode.left = null;
	    newNode.right = null;
		return newNode;
	}
	
	
}
public class Tree1
{
public static void main(String args[])
  {
	leftsideview l = new leftsideview();
	Node root = l.createNode(9);
	root.left=l.createNode(8);
	root.left.left = l.createNode(7);
	root.left.right = l.createNode(6);
	root.right = l.createNode(5);
	root.right.left =l.createNode(4);
	root.right.left.right = l.createNode(3);
	root.right.left.right.left = l.createNode(2);
l.leftsideviewofTree(root, 0);
	
  }
}
