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
		
		for(Actor a : actors)
		{
			Location loc = a.getLocation();
			if(this.getGrid().get(loc) != null && this.getGrid().get(loc) instanceof Actor)
			{
				this.getGrid().get(loc).moveTo((loc.getCol() == this.getLocation().getCol()) ? new Location(this.getLocation().getRow() - 1, this.getLocation().getCol()) : (loc.getCol() < this.getLocation().getCol())? new Location(this.getLocation().getRow() - 1, this.getLocation().getCol() - 1) : new Location(this.getLocation().getRow() - 1, this.getLocation().getCol() + 1));
			}
		}
		
	}
	
	
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		KingCrab crab = new KingCrab();
		world.add(crab);
		world.show();
	}

}
