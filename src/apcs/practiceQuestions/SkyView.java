package apcs.practiceQuestions;

public class SkyView

{

	/** A rectangular array that holds the data representing a rectangular area of the sky. */

	private double[][] view;

	/** Constructs a SkyView object from a 1-dimensional array of scan data.
	
	* @param numRows the number of rows represented in the view
	
	* Precondition: numRows > 0 
	
	* @param numCols the number of columns represented in the view
	
	* Precondition: numCols > 0 
	
	* @param scanned the scan data received from the telescope, stored in telescope order
	
	* Precondition: scanned.length == numRows * numCols 
	
	* Postcondition: view has been created as a rectangular 2-dimensional array
	
	* with numRows rows and numCols columns and the values in 
	
	* scanned have been copied to view and are ordered as
	
	* in the original rectangular area of sky.
	
	*/

	public SkyView(int numRows, int numCols, double[] scanned)

	{
		this.view = new double[numRows][numCols];
		int temp = 0;
		for (int i = 0; i < numRows; i++)
		{
			if(i % 2 == 0)
				for (int k = 0; k < numCols; k++)
					this.view[i][k] = scanned[temp++];
			if (i % 2 == 1)
				for (int k = numCols - 1; k >= 0; k--)
					this.view[i][k] = scanned[temp++];
		}
	}

	public static void main(String[] args)
	{
		SkyView sky = new SkyView(3, 4, new double[]
		{ 1, .9, .8, .7, .6, .5, .4, .3, .2, .1, .9, .8 });
		for (double[] a : sky.view)
		{
			for (double b : a)
				System.out.print(b + " ");
			System.out.println("");
		}
		System.out.println("average: " + sky.getAverage(0, 2, 1, 3));
	}

	/** Returns the average of the values in a rectangular section of view.
	
	* @param startRow the first row index of the section
	
	* @param endRow the last row index of the section
	
	* @param startCol the first column index of the section
	
	* @param endCol the last column index of the section
	
	* Precondition: 0 <= startRow <= endRow < view.length 
	
	* Precondition: 0 <= startCol <= endCol < view[0].length 
	
	* @return the average of the values in the specified section of view 
	
	*/

	public double getAverage(int startRow, int endRow,

			int startCol, int endCol)

	{
		double average = 0;
		int num = 0;
		for(int i = startRow; i <= endRow; i++)
		{
			for (int k = startCol; k <= endCol; k++)
			{
				average += this.view[i][k];
				num++;
			}
		}
		return (average / (double) num);
	}

	// There may be instance variables, constructors, and methods that are not
	// shown.

}
