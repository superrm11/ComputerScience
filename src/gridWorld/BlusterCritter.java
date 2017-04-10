package gridWorld;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
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

		for (int i = currentLocation.getRow() - 2; i <= currentLocation.getRow() + 2; i++)
			for (int k = currentLocation.getCol() - 2; k <= currentLocation.getCol() + 2; k++)
			{
				Location newLoc = new Location(i, k);
				if (newLoc.compareTo(currentLocation) != 0 && this.getGrid().isValid(newLoc)
						&& this.getGrid().get(newLoc) != null && this.getGrid().get(newLoc) instanceof Actor)
					actors.add(this.getGrid().get(newLoc));
			}
		return actors;

	}

	private double DARKENING_FACTOR = .15;

	@Override
	public void processActors(ArrayList<Actor> actors)
	{
		if (actors.size() > this.C)
		{
			Color c = getColor();
			int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
			int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
			int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

			setColor(new Color(red, green, blue));

		} else if (actors.size() < this.C)
		{
			Color c = getColor();
			int red = c.getRed(), green = c.getGreen(), blue = c.getBlue();
			red = (int) (c.getRed() * (1 + DARKENING_FACTOR));
			green = (int) (c.getGreen() * (1 + DARKENING_FACTOR));
			blue = (int) (c.getBlue() * (1 + DARKENING_FACTOR));
			if (red > 255)
				red = 255;
			if (green > 255)
				green = 255;
			if (blue > 255)
				blue = 255;

			setColor(new Color(red, green, blue));
		}
	}

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new BlusterCritter(3));
		for (int i = 0; i < 10; i++)
			world.add(new Rock());
		world.show();
	}

}
