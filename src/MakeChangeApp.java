
import java.util.Scanner;


public class MakeChangeApp {

	public static void main(String[] args) {
		double purchase=0, payment=0, i=0;

		cashTendered(purchase, payment, i);
//		wollyWorldReceipt(purchase, payment, i);


	}	
	
	public static double cashTendered(double purchase, double payment, double i) 
	{		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Amount of Purchase $");
		purchase = kb.nextDouble();
		System.out.print("Enter Amount Paid by Customer $");
		payment = kb.nextDouble();
		
		while (purchase <= payment && payment > 0.00) 
		{ 			
			if (payment > purchase) 
			{
				System.out.print("\nThe Amount Owed is: $");

				i = payment - purchase;
				
				System.out.printf("%.2f", i); 
				cashReturn(i);
				kb.close();
				break;
			}
			else if (payment == purchase) {
				System.out.println("Exact Change Paid");
				break;
			}
			
			else 
			{
				System.out.println("1st Enter the amount of purchase."); 
				System.out.println("2nd Enter the amount paid.\n\n");
				break;
			}		
		}
		return i;
	}
	
	public static double cashReturn(double i) 
	{								
//bill denominations
//			     $100:
					if (i >= 100.00 && i < 1000.00)
					{
						i = i / 100.00;
						System.out.println("\n\nReturn: " + i + " Hundred Dollor Bill");
					}							
//				 $50:
					else if (i < 100.00 && i >= 50.00) { 
						i = i / 50.00;
						System.out.println("\n\nReturn: " + i + " Twenty Dollor Bill"); 
					}
//				 $20:
					else if (i < 50.00 && i >= 20.00) { 
						i = i / 20.00;
						System.out.println("\n\nReturn: " + i + " Twenty Dollor Bill"); 
					}
//				 $10:
					else if (i < 20.00 && i >= 10.00){	
						i = i / 10.00;
						System.out.println("\n\nReturn: " + i + " Ten Dollor Bill");
					}					
//				 $5:
					else if (i < 10.00 && i >= 5.00){
						i = i / 5.00;
						System.out.println("\n\nReturn: " + i + " Twenty Dollor Bill");
					}
//				 $1: 
					else if (i < 5.00 && i >= 1){
						i = i / 1.00;
						System.out.println("\n\nReturn: " + i + " One Dollar Bill");
					}
//////////////////////////////////////////////////////////////////////////////////////

// 		      	0.25:
					else if (i <= 0.99 && i >= 0.25) {
						i = i / 0.25;
						System.out.println("\n\nReturn: " + i + " Quarters"); 
					}
//			 	0.10:
					else if (i < 0.25 && i >= 0.10){
						i = i / 0.10;
						System.out.println("\n\nReturn: " + i + " Dimes");
					}				
//			 	0.05:
					else if (i < 0.10 && i >= 0.05){
						i = i / 0.05;
						System.out.println("\n\nReturn: " + i + " Nickels");
					}
//				0.01: 
					else if (i < 0.05 && i > 0.00){
						i = i / 0.01;
						System.out.println("\n\nReturn: " + i + " Pennies");
					}
					return i;
		}						
}

	
/*	public static double wollyWorldReceipt(double purchase, double payment, double i){
	System.out.println( "+------------------------+" );
	System.out.println( "|                        |" );
	System.out.println( "|      WOLLY WORLD       |" );
	System.out.println( "| Friday                 |" );
	System.out.println( "| 2019-09-13  23:31 PM   |" );
	System.out.println( "|                        |" );
	System.out.println( "| Purchase = $" + purchase + " | ");
	System.out.println( "|  Amount Tendered = $" + payment + "| ");
	System.out.println( "|                        |" );
	System.out.println( "| Cash Returned = $" + i + " |");
	System.out.println( "|                        |" );
	System.out.println( "|       THANK YOU        |" );
	System.out.println( "|         JASON          |" );
	System.out.println( "+------------------------+" );
	}
}
*/	
