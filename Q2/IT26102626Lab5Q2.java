import java.util.Scanner;
public class IT26102626Lab5Q2{
	public static void main (String[]args){
	
	//Declare variable 
	int newMem;
	
	//Create a Scanner object to get input
	Scanner input = new Scanner(System.in);
	
	//Prompt the user to enter the number of members introduced
	System.out.print("Enter the number of new members introduced: ");
	newMem = input.nextInt();
	
	//Validate that the entered number is greater than or equal to zero
	if(newMem<0){
		System.out.println("Input must be a number 0 or greater");
	}else{
		//Identifying the prize using a switch statement
		switch(newMem){
			case 0:
			System.out.println("No Prize");
			break;
			
			case 1:
			System.out.println("Prize is a : Pen");
			break;
			
			case 2:
			System.out.println("Prize is a : Umbrella");
			break;
			
			case 3:
			System.out.println("Prize is a : Bag");
			break;
			
			case 4:
			System.out.println("Prize is a : Travelling Chair");
			break;
			
			default:
			//Default values are greater than 4
			System.out.println("Prize is a : Headphone");
			break;
		}
	}
	
	}
}