package datastructures;

import java.util.Currency;
import java.util.HashSet;
import java.util.Stack;


public class LinkedList {
	
	 Node head = null;
	
	 static class Node { 
		  
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
	
	public  LinkedList insert(LinkedList list, Node new_node){
		
		//Node new_node = new Node(data);
		new_node.next= null;
		if( list.head == null){
			list.head = new_node;
		} else {
			Node last = list.head;
			while(last.next!=null){
				last= last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	public  LinkedList deleteBykey(LinkedList list , int key){
		
		Node curNode = list.head;
		Node prev = null;
		System.out.println();
		//case1:
		if(curNode != null && curNode.data == key){
			list.head = curNode.next;
			System.out.println(key + "  found and deleted");
			return list;
		}
		//case2 in middle
		while(curNode!=null && curNode.data!= key){
			prev = curNode;
			curNode= curNode.next;
		}
		if(curNode!=null){
			prev.next = curNode.next;
			System.out.println(key + "  found and deleted");
		}
		//case3 not present
		if(curNode == null){
			System.out.println(key + " Not found");
		}
		return list;
	}
	
	
	
	public  LinkedList deleteAtPosition(LinkedList list , int index){
		
		Node curNode = list.head;
		Node prev = null;
		System.out.println();
		if(index==0 && curNode!= null){
			list.head = curNode.next;
			System.out.println(index + "  position element deleted");
		}
		int counter = 0;
		while (curNode!= null){
			if(counter == index){
				prev.next = curNode.next;
				 System.out.println(index + " position element deleted"); 
	             break;
			}else {
				prev = curNode;
				curNode= curNode.next;
				counter++;
			}
		}
		 if (curNode == null) { 
	          System.out.println(index + " position element not found"); 
	     } 
		return list;
	}
	
	public  void printList(LinkedList list){
		
		Node curNode = list.head;
		System.out.println("=========LinkedList============");
		while(curNode!=null){
			System.out.print(curNode.data + "__");
			curNode= curNode.next;
		}
	}
	
	public void  revereselist(LinkedList list){
		
		Node prev = null; 
        Node current = list.head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        list.head = prev; 
	}
	
	public  boolean detectLoop(Node n) {
		
		HashSet<Node> s = new HashSet<Node>();
		while(n!=null){
			if(s.contains(n))
				return true;
			s.add(n);
			n=n.next;
		}
		return false;
		}
	
	
	
	 public  void printNthFromLast(int n) 
	    { 
	        int len = 0; 
	        Node temp = head; 
	        // 1) count the number of nodes in Linked List 
	        while (temp != null) { 
	            temp = temp.next; 
	            len++; 
	        } 
	  
	        // check if value of n is not more than length of 
	        // the linked list 
	        if (len < n) 
	            return; 
	  
	        temp = head; 
	  
	        // 2) get the (len-n+1)th node from the beginning 
	        for (int i = 1; i < len - n + 1; i++) 
	            temp = temp.next; 
	  
	        System.out.println(temp.data); 
	    } 
	 
	 
	public   void remove_duplicates() { 
	        Node ptr1 = null, ptr2 = null, dup = null; 
	        ptr1 = head; 
	  
	        /* Pick elements one by one */
	        while (ptr1 != null && ptr1.next != null) { 
	            ptr2 = ptr1; 
	  
	            /* Compare the picked element with rest 
	                of the elements */
	            while (ptr2.next != null) { 
	  
	                /* If duplicate then delete it */
	                if (ptr1.data == ptr2.next.data) { 
	  
	                    /* sequence of steps is important here */
	                    dup = ptr2.next; 
	                    ptr2.next = ptr2.next.next; 
	                    System.gc(); 
	                } else /* This is tricky */ { 
	                    ptr2 = ptr2.next; 
	                } 
	            } 
	            ptr1 = ptr1.next; 
	        } 
	    } 
	
	
	
	
	
	  void removeDuplicate(LinkedList list)  
	    { 
		 
	        // Hash to store seen values 
	        HashSet<Integer> hs = new HashSet<>(); 
	      
	        /* Pick elements one by one */
	        Node current = list.head; 
	        Node prev = null; 
	        while (current != null)  
	        { 
	            int curval = current.data; 
	              
	             // If current value is seen before 
	            if (hs.contains(curval)) { 
	                prev.next = current.next; 
	            } else { 
	                hs.add(curval); 
	                prev = current; 
	            } 
	            current = current.next; 
	        } 
	    } 
	 
	  boolean isParlindrome(LinkedList list){
		 
		 Node temp = list.head;
		 boolean ispalin = true;
		 
		 Stack<Integer> stack = new Stack<Integer>();
		 while(temp!=null){
			 stack.push(temp.data);
			 temp = temp.next;
		 }
		 
		 while(head != null){
			 if(head.data == stack.pop()){
				ispalin = true;
			 }else{
				ispalin = false;
				 break;
			 }
			 head= head.next;
		 }
		 
		 return ispalin; 
	 }
	 
	  

	  
	  boolean isParlindrome2(LinkedList list){
		  
		  Node slow = list.head;
		  Node fast = list.head;
		  
		  Node mid_node = null;
		  Node slowprev = list.head;
		  
		  Node second_half;
		  boolean isparlindrome = true;
		  
		  
		  if(list.head!=null && head.next!=null){
			  
			  while(fast!=null && fast.next!=null){
				  fast = fast.next.next;
				  slowprev =  slow;
				  slow = slow.next;
			  }
			  if(fast!=null){
				  mid_node= slow;
				  slow = slow.next;
			  }
			  second_half = slow;
			  slowprev.next = null;
			 
			  
			  //Reverse logic starts from here
			  Node prev = null;
			  Node current = second_half;
			  Node next = null;
			  while (current!=null){
				   next = current.next;
				   current.next= prev;
				   prev = current;
				   current = next;
			  }
			  second_half = prev;
			  
			  //reverse logic ends
			  
			  isparlindrome= compareLists(head, second_half);
				   
			  }
		  
		  return isparlindrome;
	  }
		 
			 
		boolean compareLists(Node head1, Node head2) {
			
			Node temp1 = head1;
			Node temp2 = head2;
			
			while(temp1!=null && temp2!=null){
				if(temp1.data == temp2.data){
					temp1 = temp1.next;
					temp2 = temp2.next;
				} else
					return false;
			}
			
			if (temp1 == null && temp2 == null) 
	            return true;
			
			return false;
	}

	
	  
	public LinkedList getIntersection(Node head1, Node head2){
		
		HashSet<Integer> hset = new HashSet<Integer>();
		Node n1 = head1;
		Node n2 = head2;
		LinkedList result = new LinkedList();
		
		while (n1!= null){
			//if(hset.contains(n1.data)){
				hset.add(n1.data);
			//}
			n1 = n1.next;
		}
		
		while (n2!= null){
			if(hset.contains(n2.data)){
			 result.insert(result, new Node(n2.data));
			}
			n2= n2.next;
		}
		return result;
	}
	  // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
        LinkedList list2 = new LinkedList(); 
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
      

        list = list.insert(list, new Node(1)); 
        list2 = list.insert(list, new Node(52)); 
        list = list.insert(list, new Node(15)); 
        list = list.insert(list2, new Node(125)); 
        list = list.insert(list, new Node(115)); 
        list = list.insert(list, new Node(115)); 
        list = list.insert(list, new Node(115)); 
        list = list.insert(list, new Node(115)); 
        list = list.insert(list, new Node(542)); 
        list = list.insert(list, new Node(51)); 
        list = list.insert(list, new Node(51)); 
        list = list.insert(list, new Node(51)); 

        
        list.printList(list); 
        list.removeDuplicate(list);
        
       
        //list2 = insert(list2,40);
        //list2 = insert(list2,700);
  
        //Print the LinkedList 
        
        list.printList(list); 
       list.deleteBykey(list, 51);
      list.printList(list); 
      list.deleteBykey(list, 125);
      list.printList(list); 
       list.deleteAtPosition(list, 3);
       list.printList(list); 
      

      list.revereselist(list); 
       list.printList(list); 
       System.out.println(list.detectLoop(list.head));
       
     list.printNthFromLast(2);
       
      // list.remove_duplicates();
       
      // printList(list);
        LinkedList listp = new LinkedList();
        listp =  listp.insert(listp, new Node(1)); 
        listp =  listp.insert(listp, new Node(2)); 
        listp =  listp.insert(listp, new Node(2)); 
        listp =  listp.insert(listp, new Node(1)); 
        
        
        System.out.print("IS PALINDROME===========>>");
      //  System.out.println(listp.isParlindrome(listp));
        
        System.out.println(listp.isParlindrome2(listp));
        
        LinkedList listfirst = new LinkedList();
        LinkedList listsecond = new LinkedList();
        LinkedList intersection = new LinkedList(); 
        
        listfirst =  listfirst.insert(listfirst, new Node(1)); 
        listfirst =  listfirst.insert(listfirst, new Node(11)); 
        listfirst =  listfirst.insert(listfirst, new Node(13)); 
        listfirst =  listfirst.insert(listfirst, new Node(61)); 
        listfirst =  listfirst.insert(listfirst, new Node(101)); 
        
        
        listsecond =  listsecond.insert(listsecond, new Node(10)); 
        listsecond =  listsecond.insert(listsecond, new Node(11)); 
        listsecond =  listsecond.insert(listsecond, new Node(101)); 
        listsecond =  listsecond.insert(listsecond, new Node(631)); 
        listsecond =  listsecond.insert(listsecond, new Node(111)); 
        
        
        intersection.printList(intersection.getIntersection(listfirst.head,listsecond.head));
        
        
        
       
    } 

}
