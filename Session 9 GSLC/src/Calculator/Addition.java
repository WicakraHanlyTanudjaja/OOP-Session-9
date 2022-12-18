package Calculator;

// Untuk menampilkan hasil penjumlahan
public class Addition extends Calculate {

	public Addition(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	// Untuk mereturn hasil penjumlahan
	public double calculate() {
		// TODO Auto-generated method stub
		return getA() + getB();
	}

}
