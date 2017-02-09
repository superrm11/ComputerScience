package apcs.practiceQuestions;

public class StudentAdvanced extends Advanced
{
	
	private final double price;

	public StudentAdvanced(int daysInAdvanced)
	{
		super(daysInAdvanced);
		
		this.price = super.getPrice() / 2.0;
		
		super.setPrice(this.price);
		
	}
	
	public String toString()
	{
		return super.toString() + "/n(Student ID required)";
	}
	
}
