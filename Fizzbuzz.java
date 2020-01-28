package JavaBasic;

public class Fizzbuzz {

	
	
	public static void fizbuz(int a,int b,int number) {
		
		for (int i=1;i<=number;i++) {
		if (i%a==0 && i%b==0) {
			System.out.println(i+ ":The number is FizzBuzz");
		}
	
		else if(i%a==0) {
		
			System.out.println(i+ ":The number is Fizz");
		}
		
		else if(i%b==0) {
			System.out.println(i+ ":The number is Buzz");
		}
		else {
			System.out.println(i);
		}
	}
}
	public static void main(String[] args) {
	
	fizbuz(2,3,50);

	}

}
