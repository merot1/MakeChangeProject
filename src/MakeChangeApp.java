
import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		double input=0, i=0, dol=0, c=0;

		Scanner kb = new Scanner(System.in);

		System.out.print("Enter Total of Purchase $:");
		input = kb.nextDouble();
		

		
		double cust = cashBack(input, i);
		double bills = dollars(i, dol, c);
		double cents = cents(c, i);

		System.out.println("Give the following change to the customer $: ");

		System.out.println("Give: " + cust + " as: ");
		System.out.println(bills + "Dollar Bills");
		System.out.println(cents + " Coins");

		kb.close();

	}
	
	
	public static double cashBack(double input, double i) 
	{
		i = 0;
		while (input <= 1000.00) 
		{ 
			
			if (input <= 1000.00 && input >= 0.00) 
			{
				i = 1000.00 - input;
//				return i;
			}

			else 
			{
				System.out.println("Enter an amount less than $1000 and higher than $0.00"); 
				i = input;
			}		
		}
		return i;
	}
	
	public static double dollars(double i, double dol, double c) 
	{	
							
			switch((int)i) 
			{
				case 100:
					if (i <= 1000.00)
					{
						dol = i / 100.00;
						System.out.println("Return: " + dol + " One Hundred Dollor Bills");
					}							
				case 50:
					if (i < 100.00 && i >= 50.00) { 
						dol = i / 50.00;
						System.out.println("Return: " + dol + " Twenty Dollor Bills"); 
					}
				case 20:
					if (i < 50.00 && i >= 20.00) { 
						dol = i / 20.00;
						System.out.println("Return: " + dol + " Twenty Dollor Bills"); 
					}
				case 10:
					if (i < 20.00 && i >= 10.00){	
						dol = i / 10.00;
						System.out.println("Return: " + dol + " Ten Dollor Bills");
					}					
				case 5:
					if (i < 10.00 && i >= 5.00){
						dol = i / 5.00;
						System.out.println("Return: " + dol + " Twenty Dollor Bills");
					}
				case 1: 
					if (i < 5.00 && i >= 1){
						dol = i / 1.00;
						System.out.println("Return: " + dol + " One Dollar Bills");
					}
/*				case changeDue:
					if (i < 1.00){
						c = i;
						double cents = cents(c);
						break;
					}
*/				}	
			
			return dol;
			
	   }






	public static double cents(double c, double i) 
		{
			

		
		
//		For 0.25:
			if (c <= 0.99 && c >= 0.25) {
				c = c / 0.25;
				System.out.println("Return: " + c + " Quarters"); 
				}
//		For 0.10:
			else if (c < 0.25 && c >= 0.10){
				c = c / 0.10;
				System.out.println("Return: " + c + " Dimes");
				}				
//		For 0.05:
			else if (c < 0.10 && c >= 0.05){
				c = c / 0.05;
				System.out.println("Return: " + c + " Nickels");
				}
//		For 0.01: 
			else if (c < 0.05){
				c = c / 0.01;
				System.out.println("Return: " + c + " Pennies");
				}

			return c;
		}					
	
}


/*	
	public class wollyworldReceipt(int dol, double c double input, double i)
	{
	public static void main( String[] args ) {
	System.out.println( "+------------------------+" );
	System.out.println( "|                        |" );
	System.out.println( "|      WOLLY WORLD       |" );
	System.out.println( "| Friday                 |" );
	System.out.println( "| 2019-09-13  23:31 PM   |" );
	System.out.println( "|                        |" );
	System.out.println( "| Purchase = $" + dol + c + " | ");
	System.out.println( "|  Amount Tendered = $" + input + "| ");
	System.out.println( "|                        |" );
	System.out.println( "| Cash Returned = $" + dol + c + " |");
	System.out.println( "|                        |" );
	System.out.println( "|       THANK YOU        |" );
	System.out.println( "|         JASON          |" );
	System.out.println( "+------------------------+" );
	}
}
*/	
