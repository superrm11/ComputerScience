package gridWorld;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{	
	private final int[] moves;
	
	private int steps = 0;
	
	public DancingBug(int[] moves)
	{
		this.moves = moves;
	}
	
	@Override
	public void act()
	{
		if(this.canMove())
		{
			this.move();
			for(int i = 0; i < this.moves[steps]; i++)
				turn();
			steps++;
			if(steps == moves.length)
				steps = 0;
		}
	}
	
	
}
