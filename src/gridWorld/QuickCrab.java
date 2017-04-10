package gridWorld;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class QuickCrab extends CrabCritter
{
	public void act()
	{
		Location possibleLocation1 = this.getLocation().getAdjacentLocation(270).getAdjacentLocation(270),
				possibleLocation2 = this.getLocation().getAdjacentLocation(90).getAdjacentLocation(90);

		if ((this.getGrid().isValid(possibleLocation2) && this.getGrid().isValid(possibleLocation1))
				&& (this.getGrid().get(possibleLocation1) == null && this.getGrid().get(possibleLocation2) == null))
		{
			this.moveTo(((int) (Math.random() * 2) == 0) ? possibleLocation1 : possibleLocation2);
		} else if ((this.getGrid().isValid(possibleLocation2) && this.getGrid().get(possibleLocation2) == null)
				|| (this.getGrid().isValid(possibleLocation1) && this.getGrid().get(possibleLocation1) == null))
		{
			this.moveTo((this.getGrid().isValid(possibleLocation2) && this.getGrid().get(possibleLocation2) == null)
					? possibleLocation2 : possibleLocation1);
		} else
		{
			super.act();
		}

	}

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		QuickCrab crab = new QuickCrab();

		world.add(crab);
		for (int i = 0; i < 8; i++)
			world.add(new Rock());
		world.show();
	}

}
