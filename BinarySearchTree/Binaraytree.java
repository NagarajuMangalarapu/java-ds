package BinarySearchTree;

class TreeInorderpreorder
{  int preindex;
	public Node createtreeinpreorder(int inorder[] , int preorder[] , int start , int end)
	{if(start>end)
		return null;
	Node node = createNewnode(preorder[preindex++]);
	if(start == end)
		return node;
	int inIndex = getInindex(node.data , inorder , start , end);
	node.left = createtreeinpreorder(inorder , preorder , start , inIndex-1);
	node.right = createtreeinpreorder(inorder , preorder , inIndex+1 , end);
			
	return node;
		
	
	}
	private int getInindex(int val , int in[] , int start , int end)
	{
		for(int i = start ; i<=end ;i++) 
		{
			if(in[i] == val)
				return i;
		}
		return -1;
	}
	public Node createNewnode(int val)
	{  Node Newnode = new Node();
	Newnode.data = val;
	Newnode.left = null;
	Newnode.right = null;
		
		return Newnode;
	}
}
public class Binaraytree {
	public static void main(String[] args) 
	{
          TreeInorderpreorder ip = new TreeInorderpreorder();
           int InorderArray[] = {40,50,53,55,57,60,65};
           int PreorderArray[] = {55,50,40,53,60,57,65};
           System.out.println(ip.createtreeinpreorder(InorderArray, PreorderArray, 0, InorderArray.length-1).data);
	}

}
