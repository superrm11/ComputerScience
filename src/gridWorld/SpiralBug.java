package gridWorld;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;

public class SpiralBug extends Bug
{

	
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new SpiralBug(1));
		world.show();
	}
	
	private int steps;
	private int sideLength;

	public SpiralBug(int length)
	{
		steps = 0;
		sideLength = length;
	}

	public void act()
	{
		if (steps < sideLength && canMove())
		{
			move();
			steps++;
		} else
		{
			turn();
			turn();
			steps = 0;
			sideLength++;
		}
	}
	
}
