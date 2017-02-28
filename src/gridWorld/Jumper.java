package gridWorld;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Jumper extends Bug
{

	public Jumper()
	{
		super();
	}

	public Jumper(Color bugColor)
	{
		super(bugColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act()
	{
		// The location we are planning to jump to
		Location jumpLoc = this.getLocation().getAdjacentLocation(this.getDirection())
				.getAdjacentLocation(this.getDirection());

		// If the adjacent location is not in the grid, turn and return the
		// method.
		if (!this.getGrid().isValid(this.getLocation().getAdjacentLocation(this.getDirection())))
		{
			this.turn();
			return;
		}
		// If the actor in the location we would jump to is not empty, move
		// once and return.
		else if (this.getGrid().isValid(jumpLoc) && this.getGrid().get(jumpLoc) != null)
		{
			this.move();
			return;
		}
	}

	/**
	 * Overrides the move method, as it will not place a flower down after jumping.
	 */
	@Override
	public void move()
	{

	}

	public void jump()
	{
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location next = this.getLocation().getAdjacentLocation(this.getDirection())
				.getAdjacentLocation(this.getDirection());
		if (gr.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();
	}

}
