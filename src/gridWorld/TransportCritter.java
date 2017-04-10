package gridWorld;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;

public class TransportCritter extends Critter
{
	private boolean isRandom = false;

	private static ArrayList<Color> colors = new ArrayList<Color>();

	private static boolean initialRun = true;

	public TransportCritter() throws Exception
	{
		if (initialRun)
		{
			colors.add(Color.BLUE);
			colors.add(Color.RED);
			colors.add(Color.GREEN);
			colors.add(Color.MAGENTA);
			colors.add(Color.YELLOW);
			colors.add(Color.CYAN);
			initialRun = false;
		}

		if (colors.size() == 0)
			throw new Exception("You knob head! you can't do that! too many Transport crittrers!");

		this.setColor(colors.remove(0));
	}

	public ArrayList<Location> getMoveLocations()
	{
		isRandom = (Math.random() <= .1);

		if (isRandom)
		{
			ArrayList<Location> newLocs = new ArrayList<Location>();
			for (int i = 0; i < this.getGrid().getNumCols(); i++)
				for (int k = 0; k < this.getGrid().getNumRows(); k++)
					if (this.getGrid().get(new Location(k, i)) == null)
						newLocs.add(new Location(k, i));
			return newLocs;
		}
		return super.getMoveLocations();

	}

	public Location selectMoveLocation(ArrayList<Location> locs)
	{
		return (isRandom) ? locs.get((int) (Math.random() * locs.size())) : super.selectMoveLocation(locs);
	}

	@Override
	public void makeMove(Location l)
	{
		Location currentLocation = new Location(this.getLocation().getRow(), this.getLocation().getCol());
		super.makeMove(l);
		if (this.isRandom)
			(new Flower(this.getColor())).putSelfInGrid(this.getGrid(), currentLocation);
	}

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		try
		{
			for (int i = 0; i < 6; i++)
				world.add(new TransportCritter());

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		world.show();
	}

}
