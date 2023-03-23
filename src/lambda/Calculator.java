package lambda;

public class Calculator {

	interface FuncInterface {
		int operation(int a, int b);
	}

	public static void main(String[] args) {
		FuncInterface add = (int x, int y) -> x + y;
		FuncInterface minus = (int x, int y) -> x - y;
		FuncInterface multiply = (int x, int y) -> x * y;
		FuncInterface divide = (int x, int y) -> x / y;

		Calculator calc = new Calculator();
		System.out.println(add.operation(5, 7));
		System.out.println(minus.operation(7, 5));
		System.out.println(multiply.operation(5, 7));
		System.out.println(divide.operation(10, 2));

	}
}
