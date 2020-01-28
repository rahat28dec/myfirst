package JavaBasic;

public class SwapString {

	public static void main(String[] args) {
//		
//		String special= "This - text ! has \\\\ /allot # of % special % characters\r\n" ;
//			special=special.replaceAll("[^a-zA-Z0-9]", " ");
//		System.out.println(special);
		String first= "Zobayer";
		String second="Hossain";
		System.out.println(" Before swapping :");
		System.out.println(first);
		System.out.println(second);
		
		
		first= first + second;
		
		second= first.substring(0, first.length()-second.length());
		
		first= first.substring(second.length());
		
		System.out.println("after swapping :");
		System.out.println(first);
		System.out.println(second);

	}

}
