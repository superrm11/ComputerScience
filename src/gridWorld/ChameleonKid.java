package gridWorld;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;

public class ChameleonKid extends ChameleonCritter
{

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

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new ChameleonKid());
		world.add(new Rock(Color.blue));
		world.add(new Rock(Color.red));
		world.add(new Rock(Color.green));
		world.show();
	}

}
