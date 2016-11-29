package apcs.unit_six_programs;

import java.util.Scanner;

public class SixTwo
{

	public static void main(String[] args)
	{
		int[] counter = new int[51];
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in numbers between 0-50 inclusive.  Type something outside of that range to quit.");
        int answer = scan.nextInt();
        while(answer<=25 && answer>=-25)
        {
            counter[answer + 25]++;
            answer=scan.nextInt();
        }
        scan.close();
        for(int i=0; i<counter.length; i++)
        {
            if(counter[i]>0) System.out.println((i - 25) + " was entered " + counter[i] + " times");
        }
	}

}
