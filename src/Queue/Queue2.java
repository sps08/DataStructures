package Queue;

public class Queue2 {
	
	 int front, rear, size; 
	 int capacity;
	 int array[];
	 
	 
	 public Queue2(int capacity){
		 this.capacity= capacity;
		 front= this.size=0;
		 rear=capacity-1;
		 array = new int[this.capacity];
	 }
	 
	 
	 boolean isFull(Queue2 Queue2){
		return (Queue2.capacity == Queue2.size);
		 
	 }
	 
	 boolean isEmpty(Queue2 Queue2){
		return(Queue2.size==0);
		 
	 }
	 
	 
	 void enQueue2(int item){
		 if(isFull(this)){
			 return;
		 }
		 
	 }
	 
	 
	 int deQueue2(){
		return capacity;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
