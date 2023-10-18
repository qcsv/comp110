import java.util.Scanner;
import java.util.Arrays; 
public class gradeCheck
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		int[] scores = new int[students];
		int best = 0;
		System.out.printf("Enter %d scores: ", students);
		for (int i = 0; i < students; i++)
		{
			scores[i] = input.nextInt();
		}

		//sort sort sort
		Arrays.sort(scores);
		best = scores[students - 1];

		int A, B, C, D;
		A = best - 10;
		B = best - 20;
		C = best - 30;
		D = best - 40;
		for (int i = 0; i < students; i++)
		{
			if (scores[i] >= A)
			{
				System.out.printf("Student %d score is %d and grade is A\n", students - i, scores[i]);
			}
			else if (scores[i] >= B)
			{
				System.out.printf("Student %d score is %d and grade is B\n", students - i, scores[i]);
			}
			else if (scores[i] >= C)
			{
				System.out.printf("Student %d score is %d and grade is C\n", students - i, scores[i]);
			}
			else if (scores[i] >= D)
			{
				System.out.printf("Student %d score is %d and grade is D\n", students - i, scores[i]);
			}
			else
			{
				System.out.printf("Student %d score is %d and grade is F\n", students - i, scores[i]);
			}
		}

//debug		System.out.println(best);


	}
}
