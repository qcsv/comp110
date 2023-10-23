/*
    checkSort.java - Check if Array is sorted

    Written in 2023 by Rishi Cutchin rishincutchin@gmail.com

    To the extent possible under law, the author(s) have dedicated all copyright and related and neighboring rights to this software to the public domain worldwide. This software is distributed without any warranty.

    You should have received a copy of the CC0 Public Domain Dedication along with this software. If not, see <http://creativecommons.org/publicdomain/zero/1.0/>. 
*/
import java.util.Scanner;
public class checkSort
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
//		System.out.print("Enter numbers, stop by zero");
		int data [] = new int [10];
		System.out.print("Enter 10 numbers ");
		for (int i = 0; i < data.length; i++)
		{
			data[i] = input.nextInt();
		}
		boolean sorted = true;
		for (int i = 0; i < data.length - 1; i++)
		{
			if (data[i] > data[i + 1])
			{
				sorted = false;
				break;
			}
		}
		if (sorted)
		{
			System.out.println("Data are sorted");
		}
		else
		{
			System.out.println("Data are not sorted");
		}
	}
}
