package Calculator;

// Untuk menampilkan hasil pembagian antar 2 bilangan
public class division extends Calculate implements CalculateInterface {

	public division(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	// Untuk menampilkan hasil a bagi b
	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return ((double)getA() / getB());
	}

}
