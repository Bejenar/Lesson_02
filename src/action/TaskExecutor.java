package action;
import java.util.Arrays;

import bean.*;

public class TaskExecutor {
	private Digit array[];
	private int size;
	
	public TaskExecutor(Digit array[])
	{
		this.array = array;
		size = array.length;
	}
	
	public void Print()
	{
		for (int i = 0; i < size; i++)
			System.out.println(array[i].getValue() + " ");
	}
	
	private void Space()
	{
		System.out.println("\n=============================\n");
	}
	
	public void task_1()
	{
		int minPos = 0, maxPos = 0;
		for(int i = 1; i < size; i ++)
		{
			if (array[i].getLength() < array[minPos].getLength())
			{
				minPos = i;
			}
			
			if (array[i].getLength() > array[maxPos].getLength())
			{
				maxPos = i;
			}
		}
		
		System.out.println("Minimum length (" +  array[minPos].getLength() + ") - " + array[minPos].getValue());
		System.out.println("Minimum length (" +  array[maxPos].getLength() + ") - " + array[maxPos].getValue());
		Space();
	}
	
	public void task_2()
	{
		Arrays.sort(array, new SortDigits());
		
		System.out.println("sorted array: ");
		for(Digit d : array)
		{
			System.out.print(d.getValue() + " " );
		}
		Space();
	}
	
	public void task_3()
	{
		float medium = 0;
		for(Digit d : array)
		{
			medium += d.getLength();
		}
		medium/= size;
		System.out.println("medium -> " + medium);
		for(Digit d : array)
		{
			if (d.getLength() > medium)
				System.out.println(d.getValue() + " -> " + d.getLength());
		}
		Space();
	}
	
	public void task_4()
	{
		int minPos = 0;
		for(int i = 1; i < size; i++)
		{
			if (array[i].uniqueDigitsNumber() < array[minPos].uniqueDigitsNumber())
			minPos = i;
		}
		
		System.out.println("число, в котором число различных цифр минимально -> " + array[minPos].getValue());
		Space();
	}
	
	public void task_6()
	{
		for(int i = 0; i < size; i++)
			if (array[i].isAscendingOrder())
			{
				System.out.println("Ascending order -> " + array[i].getValue());
				break;
			}
		Space();
	}
	
	public void task_7()
	{
		for(int i = 0; i < size; i++)
			if (array[i].isUniqueDigits())
			{
				System.out.println("Unique digits -> " + array[i].getValue());
				break;
			}
		Space();
	}
	
	public void task_8()
	{
		for(int i = 0; i < size; i++)
			if (array[i].isPalindrom())
			{
				System.out.println("Palindrom -> " + array[i].getValue());
				break;
			}
		Space();
	}
}

