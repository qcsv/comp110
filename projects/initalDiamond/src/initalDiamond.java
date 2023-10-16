//initalDiamond.java
//Makes a diamond of your initals with a special character in the middle
//Author: RC
import java.util.Random;
public class initalDiamond

{
	public static void main(String[] args)
	{
		System.out.println("RISHI CUTCHIN");
		//random number generation
		Random rand = new Random();
		int n = rand.nextInt(31 - 11) + 11;
		if (n % 2 == 0)
		{
		      	n++; //if n is even, icrement by one
		}
		System.out.printf("Number of lines: %d\n", n);
		


		//first triangle
		for (int x = 1; x < n; x++)
		{ 
			for (int bl = 0; bl < n - x; bl++)
			{
				System.out.print(" ");
			}
			for (int y = 0; y < (x * 2) - 1; y++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//barrier line
		for (int l = 0; l < n * 2; l++)
		{
			System.out.print("=");
		}
		System.out.print("\n");


		for (int x = n; x >= 1; x--)
		{ 
			for (int bl = 0; bl < n - x; bl++)
			{
				System.out.print(" ");
			}
			for (int y = 0; y < (x * 2) - 1; y++)
			{
				System.out.print("*");
			}
			System.out.print("\n");              		
		}

	}
}
