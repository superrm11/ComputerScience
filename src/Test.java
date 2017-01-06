
public class Test
{

	public static void main(String[] args)
	{
		int[][] array = (translate(new int[][]
		{
				{ 1, 2, 3, 4, 5 },
				{ 6, 7, 8, 9, 0 } }));
		
		int[] a = {5,6}, b = {6,7};
		
		

		for (int[] i : array)
		{
			for (int k : i)
				System.out.println(k);
			System.out.println("");
		}
	}

	public static int[][] translate(int[][] array)
	{
		int numOfRows = array.length;
		int numOfColumns = array[0].length;
		int[][] newNums = new int[numOfColumns][numOfRows];
		for (int i = 0; i < array.length; i++)
		{
			for (int k = 0; k < array[i].length; k++)
			{
				newNums[k][i] = array[i][k];
			}
		}
		return newNums;
	}
}
