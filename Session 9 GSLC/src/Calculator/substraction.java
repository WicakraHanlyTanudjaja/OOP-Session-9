package Calculator;

// Untuk menampilkan hasil pengurangan dari 2 bilangan
public class substraction extends Calculate implements CalculateInterface {

	public substraction(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	// Untuk menampilkan hasil dari a - b
	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return getA() - getB();
	}
	
}
