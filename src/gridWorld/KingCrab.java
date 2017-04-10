package gridWorld;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class KingCrab extends CrabCritter
{

	public void act()
	{
		ArrayList<Actor> actors = super.getActors();

		for (Actor a : actors)
		{
			Location loc = a.getLocation();
			Location newLoc;
			if (loc.getCol() < this.getLocation().getCol())
				newLoc = new Location(loc.getRow() - 1, loc.getCol() - 1);
			else if (loc.getCol() == this.getLocation().getCol())
				newLoc = new Location(loc.getRow() - 1, loc.getCol());
			else
				newLoc = new Location(loc.getRow() - 1, loc.getCol() + 1);

			if (this.getGrid().isValid(newLoc) && this.getGrid().get(newLoc) == null)
				a.moveTo(newLoc);
			else
				a.removeSelfFromGrid();

		}

		super.act();
	}

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		KingCrab crab = new KingCrab();
		world.add(crab);
		for (int i = 0; i < 8; i++)
			world.add(new Actor());
		world.show();
	}

}
