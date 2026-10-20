import java.util.Scanner;
public class IT26102626Lab5Q1{
	public static void main (String[]args){
		//Declare the variables 
		int num1,num2,num3,smallest,largest;
		
		//Create a Scanner object to get user input
		Scanner input = new Scanner (System.in);
		
		//Prompt the user to enter three digits
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		System.out.print("Enter the third integer: ");
		num3 = input.nextInt();
		
		//Set num1 initially to smallest and largest
		smallest = num1;
		largest = num1;
		
		//Compare number 2 with smallest and largest
		if(num2<smallest){
			smallest = num2;
		}
		if(num2>largest){
			largest  = num2;
		}
		
		//Compare number 3 with smallest and largest
		if(num3<smallest){
			smallest = num3;
		}else if(num3>largest){
			largest = num3;
		}
		
		//Display the results
		System.out.println();
		System.out.println("User entered numbers are: " + num1 +" " + num2 + " " + num3);
		System.out.println("The Smallest number is: " + smallest);
		System.out.println("The Largest number is: " + largest);
	}
}