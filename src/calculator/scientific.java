package calculator;

public class scientific extends basic {

	public void modulus(int a, int b) {
		try {
			int res = a % b;
			System.out.println("Modulus: " + res);
		} catch (Exception e) {
			System.out.println("modulus is not possible with zero");
		}
	}
}
