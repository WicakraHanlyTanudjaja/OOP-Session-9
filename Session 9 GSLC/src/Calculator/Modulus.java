package Calculator;

public class Modulus extends Calculate implements CalculateInterface {

	public Modulus(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return getA() % getB();
	}

}
