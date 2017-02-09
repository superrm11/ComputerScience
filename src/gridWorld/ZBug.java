package gridWorld;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;

public class ZBug extends Bug
{

	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new ZBug());
		world.show();
	}
	
	@Override
	public void act()
	{
		if(!finishedZ)
		{
			this.setDirection(90);
			for(int i = 0; i < 3; i++)
				if(this.canMove())
					this.move();
				else
					{
					this.finishedZ = true;
					return;
					}
			this.setDirection(225);
			for(int i = 0; i < 3; i++)
				if(this.canMove())
					this.move();
				else
					{
					this.finishedZ = true;
					return;
					}
			this.setDirection(90);
			for(int i = 0; i < 3; i++)
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
