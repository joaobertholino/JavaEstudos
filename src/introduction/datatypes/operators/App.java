package introduction.datatypes.operators;

public class App {
    public static void main(String[] args) {
        arithmeticOperators();
        operatorsRelationships();
    }

    public static void arithmeticOperators(){
        int numberOne = 10;
        int numberTwo = 20;

//        Adição
        int sum = numberOne + numberTwo;
        System.out.println(sum);

//        Subtração
        int subtraction = numberOne - numberTwo;
        System.out.println(subtraction);

//        Multiplicação
        int multiplication = numberOne * numberTwo;
        System.out.println(multiplication);

//        Divisão
        int divide = numberTwo / numberOne;
        System.out.println(divide);

//        Incremento
        numberOne++;
        int increment = numberOne;
        System.out.println(increment);

//        Decremento
        numberTwo--;
        int decrement = numberTwo;
        System.out.println(decrement);
    }

    public static void operatorsRelationships(){
//        Resto de divisão
        int module = 20 % 2;
        System.out.println(module);

//        Maior
        boolean biggerThen = 20 > 10;
        System.out.println(biggerThen);

//        Menor
        boolean lessThan = 20 < 10;
        System.out.println(lessThan);

//        Maior ou igual
        boolean biggerEqual = 20 >= 10;
        System.out.println(biggerEqual);

//        Menor igual
        boolean smallerEqual = 20 <= 10;
        System.out.println(smallerEqual);

//        Igualdade
        boolean equality = 20 == 10;
        System.out.println(equality);

//        Diferente
        boolean different = 20 != 10;
        System.out.println(different);
    }
}

// https://youtu.be/cT6sw-Pw4l0?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
