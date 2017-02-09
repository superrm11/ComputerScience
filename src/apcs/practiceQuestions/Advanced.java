package apcs.practiceQuestions;

public class Advanced extends Ticket
{
	private double price;
	public Advanced(int daysInAdvanced)
	{
		super();
		if(daysInAdvanced >= 10)
			this.price = 30;
		else
			this.price = 40;
	}
	
	@Override
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	
}
