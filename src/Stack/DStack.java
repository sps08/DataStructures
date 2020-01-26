package Stack;

public class DStack {
	
	
	int capacity = 2;
	int stack[] = new int [capacity];
	int top;
		
	public void push(int  data){
	
		if(size()==capacity){
			expand();	
		}
		stack[top]= data;
		top++;
	}
	
	private void expand() {
		int length = size();
		int newstack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newstack, 0, length);
		stack = newstack;
		capacity *=2;
	}

	public int pop(){
		int data = 0;
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			top--;
			data = stack[top];
			stack[top]= 0;	
			shrink();
		} 
		return data;

	}
	
	private void shrink() {
		// TODO Auto-generated method stub
		int length = size();
		if(length <= (capacity/2)/2)  // (3/4)
			capacity = capacity/2;
			
		int newstack[] = new int[capacity];
		System.arraycopy(stack, 0, newstack, 0, length);
		stack = newstack;
			
	}
	
	public int peek(){
	
		int data = stack[top-1];
			return data;

	}
	public void show(){
		
		for(int n: stack){
			System.out.print(n+ "  ");
		}
	}
	public int size(){
		return top;
		
	}
	
	public boolean isEmpty(){
		return top<=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DStack n = new DStack();
		n.push(20);
		n.push(90);
		n.push(89000);	
		n.push(20);
		n.push(90);
		n.push(8900);
		n.push(920);
		n.push(90);
		n.push(789000);
		System.out.println("Size= " + n.size());
		n.show();
		n.pop();
		n.pop();
	n.pop();
	n.pop();
	n.pop();
/*	n.pop();
	n.pop();
	n.pop();
	n.pop();*/
	
	System.out.println();
	n.show();
	System.out.println("Size= " + n.size());
		
		/*
		Stack num = new Stack(5);
		num.pop();
		//exit;
		num.push(15);
		num.push(7);
		num.push(12);
		
		
		//System.out.println(num.peek());
		num.push(111);
		num.push(82);
		num.push(902);
		
		num.show();
		//System.out.println(num.pop());
		System.out.println("Size is : "+num.size());

*/		
		

	}

}
