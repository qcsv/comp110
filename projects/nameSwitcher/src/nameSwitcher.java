/*
    nameSwitcher.java - some strange switching of first last and middle name

    Written in 2023 by Rishi Cutchin rishincutchin@gmail.com

    To the extent possible under law, the author(s) have dedicated all copyright and related and neighboring rights to this software to the public domain worldwide. This software is distributed without any warranty.

    You should have received a copy of the CC0 Public Domain Dedication along with this software. If not, see <http://creativecommons.org/publicdomain/zero/1.0/>. 
*/
import java.util.Scanner;
public class nameSwitcher
{
	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter full name: ");
		String userInput = input.nextLine();
		String secondToken = "nil";
		char capitalOne = '0';
		char capitalTwo = '0';
		char capitalThree = '0';
		int inputLength = (userInput.length() - 1);
		int secondTokenIndex = -1;
		boolean middleName = false;
		int secondTokenendIndex = -1;
		boolean sawComma = false;
		boolean sawSpace = false;
		String firstToken = "nil";
		String thirdToken = "nil";
//		boolean sawSecondSpace = false;
		boolean err;
		for (int i = 0; i <= inputLength; i++)
		{
			char ch = userInput.charAt(i);
			if (ch == ',')
			{
				sawComma = true;
				continue;
			}
			if (sawComma)
			{
				if (ch == ' ')
				{
					sawSpace = true;
					sawComma = false;
					continue;
				}
					else
					{
					System.out.println(ch);
					System.out.println("INVALID INPUT");
					break;
					}
			}
			
			if (sawSpace)
			{
				sawSpace = false;
				secondTokenIndex = i;
//debug				System.out.println(secondTokenIndex);
				for (int x = secondTokenIndex; x <= inputLength; x++)
				{
					if (userInput.charAt(x) == ' ')
					{
						middleName = true;
						secondTokenendIndex = x;
						break;
					}
					else if (userInput.charAt(x) == ',')
					{
						System.out.print("INVALID INPUT TWO");
						System.out.println(userInput.charAt(x));
						break;
					}
				}
//debug				System.out.println(secondTokenendIndex);
				firstToken = userInput.substring(1, secondTokenIndex - 2);
				firstToken = firstToken.toLowerCase();
				if (middleName)
				{
					capitalOne = Character.toUpperCase(userInput.charAt(secondTokenIndex));
					secondToken = userInput.substring(secondTokenIndex + 1, secondTokenendIndex);
					secondToken = secondToken.toLowerCase();
					thirdToken = userInput.substring(secondTokenendIndex + 2, inputLength + 1);
					thirdToken= thirdToken.toLowerCase();
					capitalTwo = Character.toUpperCase(userInput.charAt(secondTokenendIndex + 1));
					capitalThree = Character.toUpperCase(userInput.charAt(0));
				}

				
				else
				{
				capitalOne = Character.toUpperCase(userInput.charAt(secondTokenIndex));
				secondToken = userInput.substring(secondTokenIndex + 1, inputLength + 1);
				secondToken = secondToken.toLowerCase();
				capitalTwo = Character.toUpperCase(userInput.charAt(secondTokenendIndex + 1));
				}
			}
				
		}
		if (middleName)
		{
		System.out.printf("%c%s %c%s %c%s \n", capitalOne, secondToken, capitalTwo, thirdToken, capitalThree, firstToken);
		}
		else
		{
			System.out.printf("%c%s %c%s\n", capitalOne, secondToken, capitalTwo, firstToken);
		}
		//debugvalues
		//System.out.println(secondToken);
		//System.out.println(secondTokenIndex);
		//System.out.println(secondTokenendIndex);
		//System.out.println("----------");

		}

	}

