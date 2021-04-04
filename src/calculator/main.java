package calculator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		scientific sc1 = new scientific();
		sc1.addition(a, b);
		sc1.substration(a, b);
		sc1.division(a, b);
		sc1.multiplication(a, b);
		sc1.modulus(a, b);
		sc1.EqualorNot(a, b);	
	}

}
