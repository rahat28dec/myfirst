package JavaBasic;

public class StringManupulation {

	public static void main(String[] args) {
		
		String country= "United States of America ";
		
		System.out.println(country.charAt(10));
		System.out.println(country.contains("America"));
		System.out.println(country.indexOf("s"));
		System.out.println(country.indexOf("A", 0));
		System.out.println(country.length());
		System.out.println(country.replace("s", "S"));
		System.out.println(country.toLowerCase());
		System.out.println(country.toUpperCase());
		System.out.println(country.replace("States", "StateS"));
		System.out.println(country.substring(17));
		System.out.println(country.substring(14, 24));
		System.out.println(country.trim());
		char [] a= country.toCharArray();
		System.out.println(a[2]);
	    System.out.println(country.toCharArray());
	    System.out.println(country.compareToIgnoreCase("United States of America "));
	    
	   
	    String country1= country.replaceAll("i", "");
	    System.out.println(country1);
	    int reminder=country1.length()-country.length();
	    System.out.println(reminder);//check how many times i is there
	    
	   ////// reverse the sentence 
	    String result="";
	    
	    String [] arr= country.split("\\s");
	    
	    for (int i=arr.length-1;i>=0;i--) {
	    	
	    	result= result +arr[i]+ " ";
	    	
	    	System.out.println(result);
	    }
	    		
//// reverse each word
	    String [] arr1= country.split("\\s");
	    
	    for (String array :arr1) {
	    	
	    	StringBuffer reverse = new StringBuffer(array.toString()).reverse();
	    	String rev= reverse.toString();
	    	rev= rev + " ";
	    	System.out.print(rev);
	    }
	      
	    
	      //find string length using length method.
//	      int stringLength =country.length();
//	      
//	      //for loop start 0 to total length
//	      for(int i=0; i < stringLength;i++)
//	      {
//	    	  //chatAt method find Position and convert to character.  
//	        char myChar = country.charAt(i);
//	        
//	        //print string to character
//	        System.out.println("Character at "+i+" Position: "+myChar);
//	      }
	    
	    
	}

}
