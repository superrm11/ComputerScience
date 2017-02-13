package gridWorld;
import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
	
	@Override
	public void act()
	{
		if(!finishedZ)
		{
			this.setDirection(90);
			for(int i = 0; i < 4; i++)
				if(this.canMove())
					this.move();
				else
					{
					this.finishedZ = true;
					return;
					}
			this.setDirection(225);
			for(int i = 0; i < 4; i++)
				if(this.canMove())
					this.move();
				else
					{
					this.finishedZ = true;
					return;
					}
			this.setDirection(90);
			for(int i = 0; i < 4; i++)
				if(this.canMove())
					this.move();
				else
					{
					this.finishedZ = true;
					return;
					}
			this.finishedZ = true;
			return;
		}
	}
	
	private boolean finishedZ = false;

}
