package Calculator;

public class substraction extends Calculate implements CalculateInterface {

	public substraction(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return getA() - getB();
	}
	
}
