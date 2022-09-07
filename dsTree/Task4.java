package dsTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Topview
{
 public void topviewtree(Node node)
 {
	 if(node == null)
		 return;
	 TreeMap<Integer,Integer> m = new TreeMap<Integer,Integer>();
	 Queue<Node> q = new LinkedList<Node>();
	 q.add(node);
	 while(!q.isEmpty())
	 {
		 Node temp = q.remove();
		 int hd = temp.height;
		 if(!m.containsValue(hd))
		 {
			 m.put(hd, temp.data);
		 }
		 if(temp.left != null)
		 {
			 temp.left.height = hd-1;
			 q.add(temp.left);
		 }
		 if(temp.right != null)
		 {
			 temp.right.height = hd+1;
			 q.add( temp.right);
			 
		 }
	 }
	 System.out.println(m.values());
 }
	 
	 public void bottomviewtree(Node node)
	 {
		 if(node == null)
			 return;
		 TreeMap<Integer,Integer> m = new TreeMap<Integer,Integer>();
		 Queue<Node> q = new LinkedList<Node>();
		 q.add(node);
		 while(!q.isEmpty())
		 {
			 Node temp = q.remove();
			 int hd = temp.height;
	
				 m.put(hd, temp.data);
			 
			 if(temp.left != null)
			 {
				 temp.left.height = hd-1;
				 q.add(temp.left);
			 }
			 if(temp.right != null)
			 {
				 temp.right.height = hd+1;
				 q.add( temp.right);
				 
			 }
		 }
		 System.out.println(m.values());
 }
	 

public Node createNode(int value)
	{   Node newNode = new Node();
	    newNode.data = value;
	    newNode.left = null;
	    newNode.right = null;
		return newNode;
	}
}
public class Task4 
{
public static void main(String[] args) {
	Topview l = new Topview();
	
	Node root = l.createNode(1);
	root.left=l.createNode(2);
	root.left.left = l.createNode(4);
	root.left.right = l.createNode(5);
	root.right = l.createNode(3);
	root.right.left =l.createNode(8);
	root.left.right.right = l.createNode(7);
	root.left.right.left = l.createNode(6);
l.topviewtree(root);
l.bottomviewtree(root);
	
}
}
