package Java8;


interface i {
default void show() {
		System.out.println("defined in I");
	}

}


interface j {
	
	default void show(){
		System.out.println("testing defined in j");
	}
}

 class testme {


	public void show() {
		// TODO Auto-generated method stub
		//j.super.show();
		System.out.println("Class codeme SHOW");
	}

}
public class codeme extends testme implements j {
	
	public static void main(String[] args) {
		
		codeme c = new codeme();
		c.show();
	}

}
