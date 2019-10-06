package run;

import action.TaskExecutor;
import bean.*;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Digit a[] = new Digit[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = new Digit(scan.nextInt());
		}
		scan.close();
		
		TaskExecutor taskExecutor = new TaskExecutor(a);

		taskExecutor.task_1();
		taskExecutor.task_2();
		taskExecutor.task_3();
		taskExecutor.task_4();
		taskExecutor.task_6();
		taskExecutor.task_7();
		taskExecutor.task_8();
	}

}
