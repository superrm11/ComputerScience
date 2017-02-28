/**
 * 
 */
package gridWorld;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

public class PsychoticBug extends Bug
{
	public PsychoticBug(int size)
	{
		super();
		this.sideLength = size;

	}

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		PsychoticBug bug = new PsychoticBug(3);
		world.add(bug);
		for (int i = 0; i < 3; i++)
			world.add(new Rock());
		world.show();

	}
	
	public void act()
    {
        if (steps < sideLength && canMove())
        {
            for(int i = 0; i < (int)(Math.random() *  3); i++)
            {
            	turn();
            	turn();
            }
            move();
            steps++; 
        }
        else
        {
            turn();
            turn();
            steps = 0;
        }
        if(this.getDirection() == 0)
			this.setColor(Color.BLUE);
		else if(this.getDirection() == 90)
			this.setColor(Color.YELLOW);
		else if(this.getDirection() == 180)
			this.setColor(Color.RED);
		else if(this.getDirection() == 270)
			this.setColor(Color.ORANGE);
    }
	
	private int steps = 0;
	
	private int sideLength;

}
