package JavaBasic;

public class PrimeNumbers {

	public static void checkPrime(int number) {
		
	for (int i = 2; i <= number; i++) {
    boolean isPrime = true;
    if (number <= 1)
    isPrime = false;
	// check to see if the number is prime
	for (int j = 2; j < i; j++) {
    if (i % j == 0) {
	isPrime = false;
	break;
   }
}
   // print the number
	if (isPrime)
	    System.out.println(i + " " + " IS A PRIME NUMBER");
	else {
	    System.out.println(i + "  IS NOT A PRIME NUMBER");
	}
  }
}
   public static void checkOneNumberPrime(int num) {

	boolean isPrime = true;
	if (num <= 1)
	    isPrime = false;
    // Check from 2 to n-1
	for (int i = 2; i < num; i++)
	if (num % i == 0)
	isPrime = false;
    //isPrime = true;
    if (isPrime)
	  System.out.println(num + "  is Prime");
	else
	  System.out.println(num + "  is Not Prime");
}

	public static void main(String[] args) {

		 checkPrime(40);

		checkOneNumberPrime(23);
		checkOneNumberPrime(-4);

	}

}
