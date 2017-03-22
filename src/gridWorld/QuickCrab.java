package gridWorld;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class QuickCrab extends CrabCritter
{
	public void act()
	{
		Location possibleLocation1 = this.getLocation().getAdjacentLocation(270).getAdjacentLocation(270),
				possibleLocation2 = this.getLocation().getAdjacentLocation(90).getAdjacentLocation(90);

	}

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		QuickCrab crab = new QuickCrab();

		world.add(crab);
		world.show();
	}

}
