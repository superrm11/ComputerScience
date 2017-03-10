package gridWorld;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class RockHound extends Critter
{
	protected static final double DARKENING_FACTOR = 0.05;
	
	/**
	 * Randomly selects a neighbor and changes this critter's color to be the
	 * same as that neighbor's. If there are no neighbors, no action is taken.
	 */
	public void processActors(ArrayList<Actor> actors)
	{
		for(Actor a : actors)
			if(a instanceof Rock)
				a.removeSelfFromGrid();
		
		if (actors.size() == 0)
		{
			Color c = getColor();
			int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
			int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
			int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

			setColor(new Color(red, green, blue));
			return;
		}
		int r = (int) (Math.random() * actors.size());

		Actor other = actors.get(r);
		setColor(other.getColor());
	}
	
	/**
	 * Turns towards the new location as it moves.
	 */
	public void makeMove(Location loc)
	{
		setDirection(getLocation().getDirectionToward(loc));
		super.makeMove(loc);
	}
}
