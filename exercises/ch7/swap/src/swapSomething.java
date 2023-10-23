//swapsomething.java
//does some stuff with arrays
//author RC
import java.util.Scanner;
public class swapSomething 
{
	public static void main(String[] args)
	{
		int data [] = new int [20];
		for (int i = 0; i < data.length; i++)
		{
			data [i] = (int)(Math.random() * 100);
		}
		printData(data); //original data
		selSort(data);
		//int x = 7, y = 9;
		//System.out.println("x=" + x + " ,y=" + y);
		//swap1(x, y);
		//System.out.println("x=" + x + " ,y=" + y);
		//int data [] = {6, 15};
		//System.out.println("data[0]="+data[0]+",data[1]="+data[1]);
		//swap2(data);
		//System.out.println("data[0]="+data[0]+",data[1]="+data[1]);
		//swap1(data[0], data[1]);
		//System.out.println("data[0]="+data[0]+",data[1]="+data[1]);
		//selSort(data);
	}
	public static void swap1(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}
	public static void swap2(int [] data)
	{
		int temp = data[0];
		data[0] = data[1];
		data[1] = temp;
	}
	public static void selSort(int [] data)
	{
		for (int i = 0; i < data.length - 1; i++)
		{
			double currentMin = data[i];
			int currentMinIndex = i;
			for (int j = 1 + i; j < data.length; j++)
			{
				if (currentMin > data[j])
						{
							currentMin = data[j];
							currentMinIndex = j;
						}
			}
			if (currentMinIndex != i)
			{
				data[currentMinIndex] = data[i];
				data[i] = (int)currentMin;
			}
			printData(data);
		}
	}
	public static void swap(int [] data, int index1, int index2)
	{
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
	public static void printData(int [] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.printf("%3d", data[i]);
		}
			System.out.println();
	}
}

