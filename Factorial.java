package JavaBasic;

public class Factorial {
	
	public static void factorial(int number) {
		int factorial=1;
		 //It is the number to calculate factorial    
		  for(int i=1;i<=number;i++){    
		     factorial=factorial*i;    
		
		  }
		  System.out.println("Factorial of "+number+" is: "+factorial); 
		  
		  
	}
	
	 static int factorial1(int number) 
	    { 
	        if (number == 0) 
	          return 1; 
	          
	        return number*factorial1(number-1); 
	       
	    } 
	public static void main(String[] args) {
	
       factorial(2);
       System.out.println("Factorial = "+factorial1(10));
	}

}
