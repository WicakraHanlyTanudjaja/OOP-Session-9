package Calculator;

// Untuk menampilkan hasil akar dari suatu bilangan
public class Root extends Calculate implements CalculateInterface {

	public Root(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	// Untuk menampilkan hasil akar pangkat dua dari bilangan a
	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return (Math.sqrt(getA()));
	}

}
