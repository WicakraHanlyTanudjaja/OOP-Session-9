package Calculator;

// Untuk menampilkan hasil pangkat pada bilangan a dan bilangan b
public class Rank extends Calculate implements CalculateInterface {

	public Rank(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	// Untuk menunjukkan hasil dari a pangkat b
	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return (Math.pow(getA(), getB()));
	}

}
