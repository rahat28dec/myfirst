package JavaBasic;

public class ReverseInteger {
	
	public static void reverseInteger(int number) {
		
	int reverse=0;
	
	while(number!=0) {
		
		reverse =reverse*10 + number%10;
		number=number/10;
		
		}
	
	System.out.println(reverse);
	
}
	
	public static void main(String[] args) {
	
		int a=12345;
		StringBuffer str= new StringBuffer(String.valueOf(a)).reverse();
		
		System.out.println(str);
		reverseInteger(12345);

	}

}
