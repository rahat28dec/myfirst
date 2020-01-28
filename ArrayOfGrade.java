package ArrayBasic;

import java.util.Scanner;

public class ArrayOfGrade {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("How many students grade you want to put in the array? ");
		
		int size= keyboard.nextInt();
		
		double [] grade = new double[size];
		
		System.out.println("Enter the "+ grade.length+  " grades for the student:");
		
		double sum=0;
		
		for(int index=0;index <size;index++) {
			
			grade[index]= keyboard.nextDouble();
			sum= sum + grade[index];
			
			}
		
		double average= sum/grade.length;
		
		System.out.println("The average grade is :" + average);
		System.out.println(grade[0]);
		
		for (double value : grade)
		{
		if (value < average)
		System.out.println(value + " below average.");
		else if (value > average)
		System.out.println(value + " above average.");
		else //value == average
		System.out.println(value + " the average.");
		}
	}

}
