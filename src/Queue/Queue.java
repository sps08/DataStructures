package Queue;

public class Queue {

	
	int front, rear, size;
	int capacity = 5;
	int queue[] = new int[capacity];
	

	
	public void enQueue(int data){
		
		if(!isFull()){
			queue[rear]= data;
			rear= (rear+1)%capacity;
			size= size+1;
		} else{
			System.out.println("Queue is Full");
		}
	}
	
	public void show(){
		
		System.out.print("Elements: ");
		for(int i=0;i<size;i++){
			System.out.print(queue[(front + i)%capacity] + "  ");
		}
		
		
		System.out.println("Array : ----");
		for (int n: queue){
			System.out.println(n);
		}
	}
	
	public int deQueue(){
		 int data = queue[front];
		 
		 if(!isEmpty()){
			 front = (front +1)%capacity;
			 size=size-1;
		 } else{
			 System.out.println("Queue is Empty");
		 }
		 return data;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return (size==0);
	}
	
	public boolean isFull(){
		return (size==capacity);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q= new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		System.out.println(q.getSize());
		q.enQueue(150);
		q.deQueue();
		//q.show();
		System.out.println(q.getSize());
		System.out.println(q.isFull());
		//System.out.println(q.getSize());
		q.show();
		//q.deQueue();
		//q.enQueue(150);q.enQueue(110);q.enQueue(1410);
		//q.show();

	}

}
