import java.util.Scanner;
public class IT26102626Lab5Q3{
	
	//Declaring constants
		public static final double ROOMCHARGE = 48000;
		public static final double DISCOUNT1 = 0.1;
		public static final double DISCOUNT2 = 0.2;

	public static void main (String[]args){

	//Declaring variables
	int startDate, endDate,reservedDays;
	double discount,totAmount; 
	
	//Creating a Scanner object to obtain input
	Scanner input = new Scanner (System.in);
	
	//Prompt the user to enter the start and end dates
	System.out.print("Enter Start Date(1 - 31): ");
	startDate = input.nextInt();
	System.out.print("Enter End Date(1 - 31): ");
	endDate = input.nextInt();
	
	//Validate if entered dates are from 1 and 31
	if(startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
		System.out.println("Error : Days must be between 1 and 31");
		//Exit the program
		return;

	//Validate if end date is greater than the start date
	}else if(startDate>endDate){
		System.out.println("Error : Start Date must be less than End Date");
		//Exit the program
		return;
	}
	 
	 //Calculate the number of days reserved
	 reservedDays = endDate - startDate;
	 
	 //Calculating total amount before discount 
	 totAmount = ROOMCHARGE*reservedDays;
	 
	 //Determining discount based on number of days reserved
	 if(reservedDays>=5){
		 discount = totAmount*DISCOUNT2;
	 }else if(reservedDays>=3){
		 discount = totAmount*DISCOUNT1;
	 }else{
		 discount = 0;
	 }
	 
	 //Calculating total amount to be paid after discount
	 totAmount = totAmount - discount;
	 
	 //Displaying the results
	 System.out.println();
	 System.out.println("Room Charge Per Day: " + ROOMCHARGE + "/=");
	 System.out.println("Number of Days Reserved: " + reservedDays);
	 System.out.println("Total Amount to be paid: " + totAmount);
	 
	 
}	
}
