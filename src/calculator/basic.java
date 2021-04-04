package calculator;

public class basic implements Icalculator  {

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		int res = a+b;
		System.out.println("addition: "+res);	
	}

	@Override
	public void substration(int a, int b) {
		// TODO Auto-generated method stub
		int res = a-b;
		System.out.println("substraction: "+res);	
	}

	@Override
	public void division(int a, int b) {
		// TODO Auto-generated method stub
		try {
			int res = a/b;
			System.out.println("division: "+res);
			}
			catch(Exception e)
			{
			System.out.println("division is not posible by zero");
			}	
	}

	@Override
	public void multiplication(int a, int b) {
		// TODO Auto-generated method stub
		
		int res = a*b;
		System.out.println("multiplication: "+res);
		}
		
}