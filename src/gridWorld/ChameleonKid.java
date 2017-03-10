package gridWorld;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;

public class ChameleonKid extends ChameleonCritter
{

	public ChameleonKid()
	{
		super();
	}

	/**
	 * Randomly selects a neighbor and changes this critter's color to be the
	 * same as that neighbor's. If there are no neighbors, no action is taken.
	 */
	public void processActors(ArrayList<Actor> actors)
	{
		int n = actors.size();
		if (n == 0)
		{
			Color c = getColor();
			int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
			int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
			int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

			setColor(new Color(red, green, blue));
			return;
		}
		int r = (int) (Math.random() * n);

		Actor other = actors.get(r);
		if (other.getLocation().equals(this.getLocation().getAdjacentLocation(this.getDirection()))
				|| other.getLocation().equals(this.getLocation().getAdjacentLocation(this.getDirection())))
			setColor(other.getColor());
	}

}
