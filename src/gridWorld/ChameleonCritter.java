package gridWorld;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class ChameleonCritter extends Critter
{
	protected static final double DARKENING_FACTOR = 0.05;

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
		setColor(other.getColor());
	}

	public void makeMove(Location loc)
	{
		setDirection(getLocation().getDirectionToward(loc));
		super.makeMove(loc);
	}

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new ChameleonCritter());
		for (int i = 0; i < 5; i++)
			world.add(new Actor());
		world.show();
	}
}
