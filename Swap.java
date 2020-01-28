package JavaBasic;

public class Swap {

	
	public static void swap(int a,int b) {
		System.out.println(a + " "  + b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a + " "  + b);
	}
	
	public static void swapTemp(int a,int b) {
		int temp = 0;
		temp=a;///a=10,b=20;temp=10
		a=b;
		b=temp;
		
		
		System.out.println(a + " "  + b);
		
		
	}
	
	public static void main(String[] args) {

		
     swap(10,20);
     swapTemp(10,20);
	}

}
