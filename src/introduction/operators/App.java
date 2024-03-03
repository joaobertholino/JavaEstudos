package introduction.operators;

public class App {
	public static void main(String[] args) {
		arithmeticOperators();
		operatorsRelationships();
		operatorAND();
		operatorOR();
		operatorNOT();
		operatorAssignment();
		operatorAssignmentAndSum();
		operatorAssignmentAndSubtration();
		operatorAssignmentAndMultiplication();
		operatorAssignmentAndDivide();
		operatorAssignmentAndModule();
	}

	/**
	 * Operadores aritmeticos => Efetuam operações aritmeticas simples
	 */
	public static void arithmeticOperators() {
		int numberOne = 10;
		int numberTwo = 20;

//    Adição
		int sum = numberOne + numberTwo;
		System.out.println(sum);

//    Subtração
		int subtraction = numberOne - numberTwo;
		System.out.println(subtraction);

//    Multiplicação
		int multiplication = numberOne * numberTwo;
		System.out.println(multiplication);

//    Divisão
		int divide = numberTwo / numberOne;
		System.out.println(divide);

//    Incremento
		numberOne++;
		int increment = numberOne;
		System.out.println(increment);

//    Decremento
		numberTwo--;
		int decrement = numberTwo;
		System.out.println(decrement);
	}

	/**
	 * Operadores relacionais => Efetuam verificação relacionais entre valores
	 */
	public static void operatorsRelationships() {
//    Resto de divisão
		int module = 20 % 2;
		System.out.println(module);

//    Maior
		boolean biggerThen = 20 > 10;
		System.out.println(biggerThen);

//    Menor
		boolean lessThan = 20 < 10;
		System.out.println(lessThan);

//    Maior ou igual
		boolean biggerEqual = 20 >= 10;
		System.out.println(biggerEqual);

//    Menor igual
		boolean smallerEqual = 20 <= 10;
		System.out.println(smallerEqual);

//    Igualdade
		boolean equality = 20 == 10;
		System.out.println(equality);

//    Diferente
		boolean different = 20 != 10;
		System.out.println(different);
	}

	/**
	 * Operadores logicos => Efetuam verificações condicionais entre valores
	 */
	public static void operatorAND() {
//    AND => &&
		int age = 21;
		float sale = 3500f;

		boolean isLegal = age > 30 && sale >= 4712;
		System.out.println(isLegal);
	}

	public static void operatorOR() {
//    OR => ||
		int age = 21;
		float sale = 3500f;

		boolean isLegal = age > 30 || sale >= 4712;
		System.out.println(isLegal);
	}

	public static void operatorNOT() {
//    NOT => !
		int age = 21;
		float sale = 3500f;

		boolean conditional = age > 30 || sale >= 4712;
		System.out.println(conditional);

		boolean inverted = !conditional;
		System.out.println(inverted);
	}

	/**
	 * Operadores de atribuição => Efetuam uma operação entre os valores da esquerda e da direita, atribuindo o resultado
	 * ao valor da esquerda
	 */
	public static void operatorAssignment() {
		String assignmentOperator = "Operador de atrbuição simples!";
		System.out.println(assignmentOperator);
	}

	public static void operatorAssignmentAndSum() {
		int numberOne = 10;
		numberOne += 10;

		System.out.println(numberOne);
	}

	public static void operatorAssignmentAndSubtration() {
		int numberOne = 10;
		numberOne -= 5;

		System.out.println(numberOne);
	}

	public static void operatorAssignmentAndMultiplication() {
		int numberOne = 10;
		numberOne *= 2;

		System.out.println(numberOne);
	}

	public static void operatorAssignmentAndDivide() {
		int numberOne = 10;
		numberOne /= 3;

		System.out.println(numberOne);
	}

	public static void operatorAssignmentAndModule() {
		int numberOne = 10;
		numberOne %= 2;

		System.out.println(numberOne);
	}
}