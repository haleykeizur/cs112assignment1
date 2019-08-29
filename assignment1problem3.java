import java.util.Scanner;

public class assignment1problem3
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in); 
		float dollars;
		float tendollars;
		float fivedollars;
		float onedollar;
		float fiftycents;
		float quarters;
		float dimes;
		float pennies;

		System.out.print("Please input an amount in dollars:");
		dollars=Input.nextFloat();
		dollars = dollars*100;
		tendollars = (int) dollars/1000;
		fivedollars = (int) (dollars%1000)/500;
		onedollar = (int) ((dollars%1000)%500)/100;
		fiftycents = (int) ((((dollars%1000)%500)%100)/50);
		quarters = (int) (((((dollars%1000)%500)%100)%50)/25);
		dimes = (int) (((((dollars%1000)%500)%100)%50)%25/10);
		pennies = (int) ((((((dollars%1000)%500)%100)%50)%25%10)/1);

		//dollars = dollars*100;
		//tendollars = (int)dollars/1000;
		//dollars = dollars%1000;
		//fivedollars = (int)dollars/500;
		//dollars = dollars%500;
		//onedollar = (int)dollars/100;
		//dollars = dollars%100;
		//fiftycents = (int)dollars/50;
		//dollars = dollars%50;
		//quarters = (int)dollars/25;
		//dollars = dollars%25;
		//dimes = (int)dollars/10;
		//dollars = dollars%10;
		//pennies = (int)dollars/1;



		
		System.out.println("$10 = " + tendollars);
		System.out.println("$5 = " + fivedollars);
		System.out.println("$1 = " + onedollar);
		System.out.println("50 cents = " + fiftycents);
		System.out.println("Quarters = " + quarters);
		System.out.println("Dimes = " + dimes);
		System.out.println("Pennies = " + pennies);
		
	}
}