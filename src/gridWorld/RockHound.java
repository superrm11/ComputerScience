package gridWorld;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;

public class RockHound extends Critter
{
	protected static final double DARKENING_FACTOR = 0.05;

	public void processActors(ArrayList<Actor> actors)
	{
		for (Actor a : actors)
			if (a instanceof Rock)
				a.removeSelfFromGrid();
	}

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new RockHound());
		for (int i = 0; i < 10; i++)
			world.add(new Rock());
		world.show();
	}
}
