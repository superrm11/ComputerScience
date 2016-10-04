
public class Test {

	public static void main(String[] args) {
		int j,k;
		int count = 0;
		for(j = 0; j < 4; j++)
			for(k = 0; k < 10; k++)
				count++;
		System.out.println(count--);
		System.out.println(count);
	}
}
