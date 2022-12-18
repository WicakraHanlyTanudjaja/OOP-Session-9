package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

// This code is called 'mini calculator'
// the purpose for this code is for easily get the result for any applications from 2 numbers

public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<Calculate> numbers = new ArrayList<>();
	int counter = 0;
	public Main() {
		// TODO Auto-generated constructor stub
		
		int option = 0, o = 0;
		double save = 0;
		do{
			printMenu();
			option = scan.nextInt();
			scan.nextLine();
			
			double a = 0, b = 0;
			if(option >= 8) return;
			
			if(o == 0 && option != 6) {
				System.out.print("Input A: ");
				a = scan.nextDouble();
				scan.nextLine();
				System.out.print("Input B: ");
				b = scan.nextDouble();
				scan.nextLine();
			}else if(o == 1 && option != 6) {
				System.out.print("Number Saved: " + save);
				scan.nextLine();
				a = save;
				System.out.print("Input B: ");
				b = scan.nextDouble();
				scan.nextLine();
			}else if(option == 6) {
				System.out.print("Input A: ");
				a = scan.nextInt();
				scan.nextLine();
			}
			
			
			
			if(option == 1) {
				numbers.add(new Addition(a, b));
				save = ((Addition)numbers.get(counter)).calculate();
				System.out.println("The answer for " + a + " + " + b + " = " + save);
				counter++;
			}else if(option == 2) {
				numbers.add(new substraction(a, b));
				save = ((substraction)numbers.get(counter)).calculate();
				System.out.println("The answer for " + a + " - " + b + " = " + save);
				counter++;
			}else if(option == 3) {
				numbers.add(new Multiplication(a, b));
				save = ((Multiplication)numbers.get(counter)).calculate();
				System.out.println("The answer for " + a + " * " + b + " = " + save);
				counter++;
			}else if(option == 4) {
				numbers.add(new division(a, b));
				save = ((division)numbers.get(counter)).calculate();
				System.out.println("The answer for " + a + " / " + b + " = " + save);
				counter++;
			}else if(option == 5) {
				numbers.add(new Rank(a, b));
				save = ((Rank)numbers.get(counter)).calculate();
				System.out.println("The answer for " + a + " ^ " + b + " = " + save);
				counter++;
			}else if(option == 6) {
				numbers.add(new Root(a, 2));
				save = ((Root)numbers.get(counter)).calculate();
				System.out.println("The answer square root of " + (int)a + " is " + save);
				counter++;
			}else if(option == 7) {
				numbers.add(new Modulus(a, b));
				save = ((Modulus)numbers.get(counter)).calculate();
				System.out.println("The answer for " + a + " mod " + b + " = " + save);
				counter++;
			}
			
			do {
				System.out.print("Would you like to use the last number? [Yes = 1 | No = 0]: ");
				o = scan.nextInt();
				scan.nextLine();
			}while(o != 1 && o != 0);
			
		}while(option != 8);
	}

	private void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("Mini Calculator");
		System.out.println("1. Addittion");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Rank");
		System.out.println("6. Root");
		System.out.println("7. Modulus");
		System.out.println("8. Exit");
		System.out.print(">> ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
