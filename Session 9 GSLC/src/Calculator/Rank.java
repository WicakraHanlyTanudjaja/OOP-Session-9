package Calculator;

public class Rank extends Calculate implements CalculateInterface {

	public Rank(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return (Math.pow(getA(), getB()));
	}

}
