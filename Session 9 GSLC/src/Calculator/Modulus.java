package Calculator;

// Untuk menampilkan sisa bagi dari 2 bilangan
public class Modulus extends Calculate implements CalculateInterface {

	public Modulus(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	// Untuk menjalankan metode dari interface sebelumnya
	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return getA() % getB();
	}

}
