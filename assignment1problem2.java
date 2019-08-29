import java.util.Scanner;

import java.lang.Math;

public class assignment1problem2
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in); 
		double money;
		
		 money = (10000)/(Math.pow((1 + .0299), 10));

		
		System.out.printf("You need to deposit $" + "%.2f", money);
		
		
	}
}