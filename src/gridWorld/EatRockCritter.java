package gridWorld;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class EatRockCritter extends Critter
{
	private int numOfRocks = 0;
	
	public EatRockCritter(Color c)
	{
		this.setColor(c);
	}
	
	public void processActors(ArrayList<Actor> actors)
	{
		for(Actor a : actors)
		{
			if(a instanceof Rock)
			{
				a.removeSelfFromGrid();
				numOfRocks++;
			}
		}
	}
	
	public Location selectMoveLocation(ArrayList<Location> locs)
	{
		return null;
		
	}
	

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		for(int i = 0; i < 10; i++)
			world.add(new Rock());
		world.add(new EatRockCritter(Color.blue));
		world.show();
	}

}
