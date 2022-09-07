package dsTree;


class rightsideview
{ int maxLevel;
	public void rightsideviewofTree(Node node,int level)
	{   
		
		if(node == null)
		return ;
		if(level >= maxLevel)
		{
			System.out.print(node.data +" ");
			maxLevel++;
		}
		
		rightsideviewofTree(node.right , level+1);
		rightsideviewofTree(node.left , level+1);
	    
	}
	
	public Node createNode(int value)
	{   Node newNode = new Node();
	    newNode.data = value;
	    newNode.left = null;
	    newNode.right = null;
		return newNode;
	}
	public int height(Node node)
	{  if(node == null)
		return 0;
	
		return 1+Math.max(height(node.left) , height(node.right));
	}
	
}
public class Tree2
{
  public static void main(String args[])
   {
	rightsideview l = new rightsideview();
	Node root = l.createNode(9);
	root.left=l.createNode(8);
	root.left.left = l.createNode(7);
	root.left.right = l.createNode(6);
	root.right = l.createNode(5);
	root.right.left =l.createNode(4);
	root.right.left.right = l.createNode(3);
	root.right.left.right.left = l.createNode(2);
l.rightsideviewofTree(root, 0);
System.out.println();
System.out.println(l.height(root));
	
  }
}
