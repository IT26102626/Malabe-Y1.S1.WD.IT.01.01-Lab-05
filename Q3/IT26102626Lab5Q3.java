import java.util.Scanner:
public class IT26102626Lab5Q3{
public static void main (String[]args){
	
	//Declaring constants
		public static final int ROOMCHARGE = 48000;
		public static final double DISCOUNT1 = 0.1;
		public static final double DISCOUNT2 = 0.2;

	int startDate, endDate,reservedDays
	double discount,totAmount;
	Scanner input = new Scanner (System.in);
	System.out.print("Enter Start Date(1 - 31): ");
	startDate = input.nextInt();
	System.out.print("Enter End Date(1 - 31): ");
	EndDate = input.nextInt();
	
	if(startDate<1 || startDate>31 || endDate<1 || endDate>31){
		System.out.println("Error : Days must be between 1 and 31");
		return;

	}else if(startDate>endDate){
		System.out.println("Error : Start Date must be less than End Date");
		return;
	}
	 reservedDays = endDate - startDate;
	 totAmount = ROOMCHARGE*reservedDays;
	 if(reservedDays>=5){
		 discount = totAmount*DISCOUNT1;
	 }else if(reservedDays>=3){
		 discount = totAmount*DISCOUNT2;
	 }else{
		 discount = 0;
	 }
	 totAmount = totAmount - discount;
	 
	 System.out.println();
	 System.out.println("Room Charge Per Day: " + ROOMCHARGE + "/=");
	 System.out.println("Number of Days Reserved: " + reservedDays);
	 System.out.println("Total Amount to be paid: " + totAmount);
	 
	 
}	
}