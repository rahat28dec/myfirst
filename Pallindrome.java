package JavaBasic;

public class Pallindrome {

	public static void PallindromeToCheck(String Name) {

		StringBuffer rev = new StringBuffer(Name.toString()).reverse();

		// System.out.println(rev);
		String reverseString = rev.toString();

		// System.out.println(reverseString);

		if (Name.equalsIgnoreCase(reverseString)) {
            System.out.println("It is a Pallindrome");
       }
          else {
			     System.out.println("It is not a Pallindrome");

		}
}

	public static void main(String[] args) {

		Pallindrome.PallindromeToCheck("Mom");
		Pallindrome.PallindromeToCheck("Amanda");

	}

}
