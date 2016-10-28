package examples.java.package1;

public class Addition {
	private double x, y;

	public Addition(double a, double b) {
		x = a;
		y = b;
	}

	public void sum() {
		System.out.println("sum=" + (x + y));
	}
}
