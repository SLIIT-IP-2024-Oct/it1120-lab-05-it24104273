import java.util.Scanner;
public class IT24104273Lab5Q1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//enter the 3 different integers
		
		System.out.print("Enter the first integer :");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second integer :");
		int num2 = input.nextInt();
		
		System.out.print("Enter the third integer :");
		int num3 = input.nextInt();
		
		System.out.println("\n");
		
		// Show the entered numbers
		
		System.out.print("User entered numbers are :"+num1+" "+num2+" "+num3) ;
		
	System.out.println("\n");
		
		// show the smallest number
		
		if ((num1 < num2)&&(num1 < num3))
		{System.out.print("The smallest number is :"+num1);}

        else if ((num2 < num1)&&(num2 < num3))
		{System.out.print("The smallest number is :"+num2);}
		
		else if ((num3 < num1)&&(num3 < num2))
		{System.out.print("The smallest number is :"+num3);}
	
	  System.out.println("\n");
	
	    // show the largest number

        if ((num1 > num2)&&(num1 > num3))
		{System.out.print("The largest number is :"+num1);}

	    else if ((num2 > num1)&&(num2 > num3))
		{System.out.print("The largest number is :"+num2);}

        else if ((num3 > num1)&&(num3 > num2))
        {System.out.print("The largest number is :"+num3);}
	
	  			
	
	}
}