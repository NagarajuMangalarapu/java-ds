package BinarySearchTree;

import java.util.Stack;

public class Array {

		/*public static void main(String[] args) {
		    int arr[] = {1,2,3,4,5,6,2,8,25,42};
		    int l=Integer.MIN_VALUE,s=Integer.MIN_VALUE;
		   // System.out.println(l);
		    for(int i=0;i<arr.length;i++)
		    {
		        if(arr[i]>l)
		        {
		            l=arr[i];
		        }
		        
		    }
		    for(int i=0;i<arr.length;i++)
		    {
		        if(arr[i]==l)
		            continue;
		            if(arr[i]>s)
		            {
		                s=arr[i];
		            }
		    }
		    System.out.println("second largest: "+s);
		}
		} 
	
	***********
	public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        int arr[][] = {
	                  {15, 30,  20, 19},
	                  {101, 202 , 45 , 60},
	                  {75 , 101 , 500 ,34},
	                  {35 , 28 ,  19 ,  0}
	        };
	        int l=-100;

	         for (int i = 0; i < arr.length; ++i) {
	              for(int j = 0; j < arr[i].length; ++j) {
	              if(arr[i][j]>l)
	                  l=arr[i][j];
	              }
	            }
	         System.out.println(l);
	    }
}

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a=37;
        String val="";
        int arr[][] = {
                {10, 20, 30 ,40},
                  {15, 25, 35, 45},
                  {27 ,29 ,37, 48},
                  {32 ,33 ,39 ,50}

        };

    int i=0,j=3;
//        for( i=0;arr[0][i]<a&&i<3;i++);
//        for( j=0;arr[j][0]<a&&j<3;j++);
//        
//        if(arr[--i][--j]== a)
//            val ="present";
//        else
//            val="not present";
//        System.out.println(val);
        while(i<4&&j>=0)
        {
            if(arr[i][j]== a)
            {
                val = "present";
                break;
            }
            if(arr[i][j]>a)
                j--;
            if(arr[i][j]<a)
                i++;
        }
        if(val.equals("present"));
        else
            val = "not present";


        System.out.println(val);

    }

}



	    int arr[] = new int[1];
	    int li = 0;
	    void add(int item)
	    {
	        if(li == arr.length)
	        {
	            int newArr[] = new int[arr.length*2]; 
	            for(int i=0;i<arr.length;i++)
	            {
	                newArr[i] =  arr[i];
	            }
	            arr=newArr;
	        }
	        arr[li] = item;
	        li++;
	    }
	    void removeItem()
	    {
	        arr[li]=-1;
	        li--;
	    }
	    void insertAt(int index,int value)
	    {
	        if(li == arr.length)
	        {
	            int newArr[] = new int[arr.length*2]; 
	            for(int i=0;i<arr.length;i++)
	            {
	                newArr[i] =  arr[i];
	            }
	            arr=newArr;
	        }
	        for(int i=li;i>=index;i--)
	        {
	            arr[i+1] = arr[i];
	        }
	        arr[index] = value;
	        li++;
	    }

	    void removeAt(int index)
	    {
	        for(int i=index;i<=li;i++)
	        {
	            arr[i] = arr[i+1];
	        }
	        li--;

	    }
	    void getSize()
	    {
	        System.out.println("size"+li);
	    }
	    void getCapacity()
	    {
	        System.out.println("capacity"+arr.length);
	    }
	    int getElementAt(int index)
	    {
	        return arr[index];
	    }
	    boolean GetElement(int value)
	    {
	        for(int i=0;i<li;i++)
	        {
	            if(arr[i]== value)
	                return true;
	        }
	        return false;
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Array d = new Array();
	        d.add(10);
	        d.add(20);
	     //   d.removeItem();
	        d.insertAt(1, 30);
	        System.out.println(d.getElementAt(1));
	        System.out.println(d.GetElement(30));
	        System.out.println("final array is");
	        for(int i=0;i<d.li;i++)
	        {
	            System.out.println(d.arr[i]);
	        }

	    }

	}*/

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }
                           
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void main(String args[]) 
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
                           reverse(stack) ;
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}


