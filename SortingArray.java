
package ArrayBasic;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args)
	{
	int[] b = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30};
	String [] c= {"Rahat", "Rifat","Roney","Adnan","Jisa"};
	display(b, "before");
	Arrays.sort(b);
	display(b, "after");
	
	displays(c, "before");
	Arrays.sort(c);
	displays(c, "after");
	}
	public static void display(int[] array, String when)
	{
	System.out.println("Array values " + when + " sorting:");
	for (int i = 0; i < array.length; i++)
	System.out.print(array[i] + " ");
	System.out.println( );
	}
	
	public static void displays(String[] array, String when)
	{
	System.out.println("Array values " + when + " sorting:");
	for (int i = 0; i < array.length; i++)
	System.out.print(array[i] + " ");
	System.out.println( );
	}

}
