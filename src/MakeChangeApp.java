
import java.util.Scanner;

public class MakeChangeApp 

{

	public static void main(String[] args) 
	{
		double purchase=0, payment=0, i=0;
		int b100=0, b50=0, b20=0, b10=0, b5=0, b1=0, q=0, d=0, n=0, p=0;
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Amount of Purchase $");
		purchase = kb.nextDouble();
		System.out.print("Enter Amount Paid by Customer $");
		payment = kb.nextDouble();
		
		while (purchase < payment) 
		{ 			
			{
				System.out.print("\nThe Amount Owed is: $");

				i = payment - purchase;
				
				System.out.printf("%.2f", i); 

				kb.close();

//DOLLARS:
//          $100:				
				if (i > 99.00)
				{
					b100 = (int) (i / 100);
					i = i % 100;
					System.out.println("\nReturn: " + b100 + " Hundred Dollor Bill");					
				}							
//			 $50:
				if (i < 100.00) { 
					b50 = (int) (i / 50);
					i = i % 50;	
					System.out.println("Return: " + b50 + " Fifty Dollor Bill");					
				}
//			 $20:
				if (i < 50) { 
					b20 = (int) (i / 20);
					i = i % 20.00;	
					System.out.println("Return: " + b20 + " Twenty Dollor Bill"); 					
				}
//			 $10:
				if (i < 20){	
					b10 = (int) (i / 10);
					i = i % 10.00;
					System.out.println("Return: " + b10 + " Ten Dollor Bill");					
				}					
//			 $5:
				if (i < 10){
					b5 = (int) (i / 5);
					i = i % 5;	
					System.out.println("Return: " + b5 + " Twenty Dollor Bill");					
				}
//			 $1: 
				if (i < 5){
					b1 = (int) (i / 1);
					i = i % 1;
					System.out.println("Return: " + b1 + " One Dollar Bill");					
				}

//CENTS:
//	      	0.25:
				if (i <= 1.00) {
					 q = (int) (i / 0.25);
					 i = i % 0.25;	
					 System.out.println("Return: " + q + " Quarters"); 						
				}
//		 	0.10:
				if (i < 0.25){
					d = (int) (i / 0.10);
					i = i % 0.10;
					System.out.println("Return: " + d + " Dimes");					
				}				
//		 	0.05:
				if (i < 0.10){
					n = (int) (i / 0.05);
					i = i % 0.05;
					System.out.println("Return: " + n + " Nickels");					
				}
//			0.01: 
				if (i < 0.05){
					p = (int) (i / 0.01);
					System.out.println("Return: " + p + " Pennies");
				}
//			
				break;
			}						
		}

//		Exact Change
		if (i == 0.00) 
		{
			System.out.println("\nEXACT CHANGE PAID...");
		}
			
	}
}

////////////////////////////////////////////////////////////////////////////////
	
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
