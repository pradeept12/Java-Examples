

public class Addition {
	
	
	public static void main(String[] args) {
		Calculate objCalculate=new Calculate(2, 3);
		objCalculate.sum();
	}
	
	
}

class Calculate{
	
	private double x, y;
	
	public Calculate(double a, double b) {
		x = a;
		y = b;
	}
	
	public void sum() {
		System.out.println("sum=" + (x + y));
	}
	
}
