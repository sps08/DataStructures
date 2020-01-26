package Stack;

public class Stack {
	
	int stack[];
	int top;
	public  Stack(int capacity){
		stack  = new int[capacity];
		top= 0;
	}
	
	public void push(int  data){
		if(top==5){
			System.out.println("Stack is full cannot add " + data);
		}
		else{
			stack[top]= data;
			top++;	
		}
	}
	
	public int pop(){
		int data = 0;
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			top--;
			data = stack[top];
			stack[top]= 0;	
		} 
		return data;
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
		//num.show();
		//num.peek();
		//num.pop();

	}

}
