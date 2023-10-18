/*
    countTimes.java - Counts times a number 1-11 appears in your input

    Written in 2023 by Rishi Cutchin rishincutchin@gmail.com

    To the extent possible under law, the author(s) have dedicated all copyright and related and neighboring rights to this software to the public domain worldwide. This software is distributed without any warranty.

    You should have received a copy of the CC0 Public Domain Dedication along with this software. If not, see <http://creativecommons.org/publicdomain/zero/1.0/>. 
*/                                                                                                                                                                                                                     
import java.util.Scanner;
public class countTimes
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int nums [] = new int[11];
		System.out.print("Enter nums range 1-10, 0 to stop: ");
		int num = input.nextInt(); 
		while (num != 0)
		{
			nums[num]++;
			num = input.nextInt();
		}
		for (int i = 0; i < nums.length; i++)
		{
			if (nums [i] > 0)
			{
				System.out.println(i + " occurs " + nums[i] + " times");
			}
		}
	}
}
