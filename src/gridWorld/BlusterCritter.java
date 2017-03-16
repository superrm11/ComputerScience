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
		Location[] validLocations = new Location[16];
		int tempDirection = 0;
		Location currentLoc = this.getLocation().getAdjacentLocation(0).getAdjacentLocation(0).getAdjacentLocation(270)
				.getAdjacentLocation(270);
		ArrayList<Actor> actors = this.getActors();
		for (int i = 0; i < validLocations.length; i++)
		{
			validLocations[i] = (this.getGrid().isValid(currentLoc)) ? currentLoc : null;
			currentLoc = currentLoc.getAdjacentLocation(tempDirection += 90);
		}
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
