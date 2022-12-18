package Calculator;

// Memberikan constructor yang mengambil 2 nilai int
public abstract class Calculate {
	private double a, b;

	public Calculate(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}
