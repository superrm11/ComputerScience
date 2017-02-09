package apcs.practiceQuestions;

public class StudentRecord

{

	private int[] scores; // contains scores.length values

	private double average(int first, int last)

	{
		double average = 0.0;
		int numOfItems = 0;
		for (int i = first; i <= last; i++)
		{
			average += this.scores[i];
			numOfItems++;
		}
		return average / (double) numOfItems;
	}

	private boolean hasImproved()

	{
		for (int i = 1; i < this.scores.length; i++)
		{
			if (this.scores[i] < this.scores[i - 1])
				return false;
		}

		return true;
	}

	public double finalAverage()

	{
		if (this.hasImproved())
		{
			return this.average(this.scores.length / 2, this.scores.length - 1);
		}
		
		return this.average(0, this.scores.length - 1);

	}

}
