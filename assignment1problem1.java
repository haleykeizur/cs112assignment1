import java.util.Scanner;

public class assignment1problem1
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in); 
		int seconds;
		System.out.print("Number of seconds:");
		seconds=Input.nextInt();
		int hours = seconds/3600;
		int minutes = (seconds%3600)/60;
		seconds = (seconds%3600)%60;

		
		System.out.println("Hours = " + hours);
		System.out.println("Minutes = " + minutes);
		System.out.println("Seconds = " + seconds);
		
	}
}