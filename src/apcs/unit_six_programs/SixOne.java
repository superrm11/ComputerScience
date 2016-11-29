package apcs.unit_six_programs;

import java.util.*;
public class SixOne
{
    public static void main(String[] args)
    {
        int[] counter = new int[51];
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in numbers between 0-50 inclusive.  Type something outside of that range to quit.");
        int answer = scan.nextInt();
        while(answer<=50 && answer>=0)
        {
            counter[answer]++;
            answer=scan.nextInt();
        }
        for(int i=0; i<counter.length; i++)
        {
            if(counter[i]>0) System.out.println(i + " was entered " + counter[i] + " times");
        }
    }
}






