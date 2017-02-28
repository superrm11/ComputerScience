package gridWorld;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{

	public static void main(String[] args)
	{
		DancingBug bug = new DancingBug();
		ActorWorld world = new ActorWorld();
		world.add(bug);
		world.show();
	}

	private int[] moves;

	private int steps = 0;

//	public DancingBug(int[] moves)
//	{
//		this.moves = moves;
//	}

	@Override
	public void act()
	{
		if (this.canMove())
		{
			moves = new int[] {(int)(Math.random() * 360)};
			this.move();
			for (int i = 0; i < this.moves[steps]; i++)
				turn();
			steps++;
			if (steps == moves.length)
				steps = 0;
		}
	}

}
