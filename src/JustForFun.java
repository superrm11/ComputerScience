
public class JustForFun {

	public static void main(String[] args) throws InterruptedException {
		char a;
		while(true){
			a = (char) (Math.random() * 255);
			System.out.print(a);
			Thread.sleep(1);
		}

	}

}
