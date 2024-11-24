import java.util.Scanner;
public class IT24104273Lab5Q2
{
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introducted: ");
		int num = input.nextInt();
		
		System.out.print("\n");
		
		if (num == 0)
		{System.out.print("No Prize");}
	
	    else if (num == 1)
		{System.out.print("Prize is a : Pen");}	
	
	    else if (num == 2)
		{System.out.print("Prize is a : Umbrella");}

        else if (num == 3)
        {System.out.print("Prize is a : Bag");}	
	
	    else if (num == 4)
		{System.out.print("Prize is a : Travelling Chair");}	

	    else if (num >= 5)
		{System.out.print("Prize is a : Headphone");}
	
	    else if (num < 0)
		{System.out.print("Input must be a number 0 or greater");}
		
		
		
	}
	
}