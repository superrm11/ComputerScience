package apcs.practiceQuestions;

public class GrayImage
{
	public static final int BLACK = 0;
	public static final int WHITE = 255;

	private int[][] pixelValues;

	public int countWhitePixels()
	{
		int count = 0;
		for (int[] i : pixelValues)
		{
			for (int k : i)
			{
				if (k == GrayImage.WHITE)
					count++;
			}
		}
		return count;
	}

	public void processImage()
	{
		for (int i = 0; i < pixelValues.length - 2; i++)
		{
			for (int k = 0; i < pixelValues[i].length - 2; k++)
			{
				pixelValues[i][k] -= pixelValues[i + 2][k + 2];
				if (pixelValues[i][k] < GrayImage.BLACK)
					pixelValues[i][k] = GrayImage.BLACK;
			}
		}
	}
}
