package objectorientation.methods.primitivetype;

//TODO: Revisar parametros de primitive type
public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

//        Executando métodos da classe por meio do objeto instanciado
        calc.sum(10, 10);
        calc.subtration(10, 2);

//        Atribuindo a uma variavel o retorno do método divide
        double resultDivide = calc.divide(10.6, 0);
        System.out.println(resultDivide);

        calc.divideVoid(10.4, 0);

        final int x = 9;
        final int y = 3;

//        Ao passar como argumento valores diferentes do padrão declarado no método, esse valor será reatribuido pelo padrão
        calc.changeNumber(x, y);
        System.out.println("Fora do changeNumber!");
        System.out.println(STR."x: \{x}");
        System.out.println(STR."y: \{y}");
    }
}
