
public class MyException {

	public static void main(String[] args) {

		try {
			int a = 15;
			int b = 0;

			int c;
			c = a / b;

			System.out.println("Output is" + c);

		} catch (Exception e) {
			System.out.println("You got to stop" + e);
		}

	}

}
