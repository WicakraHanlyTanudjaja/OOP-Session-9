package Calculator;

public class Multiplication extends Calculate implements CalculateInterface{

	public Multiplication(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return ((double)getA() * getB());
	}

}
