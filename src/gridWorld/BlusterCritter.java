package gridWorld;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class BlusterCritter extends Critter
{

	private final int C;

	public BlusterCritter(int c)
	{
		this.C = c;
	}

	@Override
	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Location currentLocation = this.getLocation();
		
		
		
		return actors;

	}

	@Override
	public void act()
	{
		for (Actor a : this.getActors())
			a.removeSelfFromGrid();
	}

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new BlusterCritter(0));
		world.show();
	}

}
