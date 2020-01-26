package Stack;

import java.util.Stack;

class Node {
	
	int data;
	Node next;
}


public class StackwithLinkedlist {

	private Node top;
	
	public void StackwithLinkedlist(){
		this.top=null;
	}
	
	public void push(int x){
		
		Node node = new Node();
		
		if(node==null){
			return;
		}
			node.data= x;
			node.next=top;
			top=node;
	}
	public void pop(){
		
		if(top==null){
			System.out.println("empty stack");
			return;
		}
		
	
		System.out.println("Removing --- "+ peek());
		top = top.next;
		
	}
	
	public boolean isEmpty(){
		
		return top==null;
		
	}
	
	
	public int peek(){

		if(!isEmpty()){
			return top.data;
		}else{
			System.out.println("Stack is empty !");
			return -1;
		}
	}
	
	public void reverse()  {
		
		Node prev, curr, next;
		curr = prev = top;
		
		curr = curr.next;
		prev.next= null;
		
		while(curr!= null){
			next= curr.next;
			curr.next = prev;
			prev=curr;
			curr=next;
		}
		this.top=prev;
	}
 
	
	public void display() 
    { 
        Node s = this.top; 
        while (s != null) { 
            System.out.print(s.data + " "); 
            s = s.next; 
        } 
        System.out.println(); 
    } 
	
	public static void main(String[] args) {
		
		StackwithLinkedlist sl = new StackwithLinkedlist();
		sl.push(4);
		sl.push(80);
		sl.push(45);
		
		System.out.println("element at peek ---" + sl.peek());
		sl.reverse();
		sl.display();
		
		
		
//		sl.pop();
//		sl.pop();
//		sl.pop();
//		sl.pop();
//		sl.pop();
		
		///balance a parenthesis
		
		
		
		
	
	}

}
