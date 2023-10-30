/*
    crapsPlayer.java - plays craps against you

    Written in 2023 by Rishi Cutchin rishincutchin@gmail.com

    To the extent possible under law, the author(s) have dedicated all copyright and related and neighboring rights to this software to the public domain worldwide. This software is distributed without any warranty.

    You should have received a copy of the CC0 Public Domain Dedication along with this software. If not, see <http://creativecommons.org/publicdomain/zero/1.0/>. 
*/
import java.util.Random;
public class crapsPlayer
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		System.out.println("Rishi Cutchin - Project 5: Craps");
		int d1 = rand.nextInt(7);
		//no such thing as a zero roll, if you roll zero assume roll 1
		if (d1 == 0)
		{
			d1 += 1;
		}
		int d2 = rand.nextInt(7);
		if (d2 == 0)
		{
			d2 += 1;
		}
		int sum = d1 + d2;
		System.out.printf("Player rolled %d + %d = %d\n", d1, d2, d1+d2);
		switch(sum)
		{
			case 7:
			case 11:
			System.out.println("Players wins.");
			break;
			case 2:
			case 3:
			case 12:
			System.out.println("Player loses");
			break;
			case 4:
			case 5:
			case 6:
			case 8:
			case 9:
			case 10:
			loopPoints(sum);
			break;
		}

	}
	public static void loopPoints(int goal)
	{
		Random rand = new Random();
		boolean flag = true;
		do
		{
			int d1 = rand.nextInt(6);
			if (d1 == 0)
			{
			d1 += 1;
			}
			int d2 = rand.nextInt(6);
			if (d2 == 0)
			{
			d2 += 1;
			}
			System.out.printf("Player rolled %d + %d = %d\n", d1, d2, d1+d2);
			int sum = d1 + d2;
			if (sum == goal)
			{
				System.out.println("Player wins.");
				flag = false;
			}
			else if (sum == 7)
			{
				System.out.println("Player loses.");
				flag = false;
			}
		}
		while (flag);

			

	}
}
