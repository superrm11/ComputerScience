package gridWorld;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;

public class CircleBug extends Bug
{
	
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new CircleBug(1));
		world.show();
	}
	
	private int steps;
	private int sideLength;

	public CircleBug(int length)
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
			steps = 0;
		}
	}
}
