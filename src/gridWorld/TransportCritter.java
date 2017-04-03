package gridWorld;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;

public class TransportCritter extends Critter
{
	private static ArrayList<Color> colors = new ArrayList<Color>();

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		TransportCritter tc = new TransportCritter();
		world.show();
	}

}
