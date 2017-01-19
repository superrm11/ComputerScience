package apcs.practiceQuestions;

import java.util.ArrayList;
import java.util.List;

public class ClimbingClub
{
	/** The list of climbs completed by members of the club.
	* Guaranteed not to be null. Contains only non-null references.
	*/
	private List<ClimbInfo> climbList;

	/** Creates a new ClimbingClub object. */
	public ClimbingClub()
	{
		climbList = new ArrayList<ClimbInfo>();
	}

	/** Adds a new climb with name peakName and time climbTime to the list of climbs.
	* @param peakName the name of the mountain peak climbed
	* @param climbTime the number of minutes taken to complete the climb
	*/
	public void addClimb(String peakName, int climbTime)
	{
		if (climbList.size() > 0)
			for (int i = 0; i < climbList.size(); i++)
			{
				if (peakName.compareTo(climbList.get(i).getName()) <= 0)
				{
					climbList.add(i, new ClimbInfo(peakName, climbTime));
					break;
				} else if (i == climbList.size() - 1)
				{
					climbList.add(new ClimbInfo(peakName, climbTime));
					break;
				}
			}
		else
			climbList.add(new ClimbInfo(peakName, climbTime));
	}

	/** @return the number of distinct names in the list of climbs */
	// public int distinctPeakNames()
	{
		/* implementation shown in part (c) */ }

	// There may be instance variables, constructors, and methods that are not
	// shown.

	public String toString()
	{
		String str = new String();
		for (int i = 0; i < this.climbList.size(); i++)
		{
			str = str + this.climbList.get(i).getName() + ", " + this.climbList.get(i).getTime() + "\n";
		}
		return str;
	}
}