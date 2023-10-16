//initalDiamond.java
//Makes a diamond of your initals with a special character in the middle
//Author: RC
import java.util.Random;
public class initalDiamond

{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int n = rand.nextInt(31 -11) + 11;
		int row;
		System.out.println("RISHI CUTCHIN");
		for (int x = 1; x < n; x++)
		{ 
			for (int y = 0; y < x; y++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		//end square loop
		System.out.println("RISHI CUTCHIN");
		
	}
}
