package Calculator;

// Untuk menampilkan hasil perkalian
public class Multiplication extends Calculate implements CalculateInterface{

	public Multiplication(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	// Untuk menampilkan hasil perkalian antar 2 bilangan
	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return ((double)getA() * getB());
	}

}
