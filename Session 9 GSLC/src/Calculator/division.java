package Calculator;

public class division extends Calculate implements CalculateInterface {

	public division(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return ((double)getA() / getB());
	}

}
