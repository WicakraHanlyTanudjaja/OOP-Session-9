package Calculator;

public class Root extends Calculate implements CalculateInterface {

	public Root(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return (Math.sqrt(getA()));
	}

}
