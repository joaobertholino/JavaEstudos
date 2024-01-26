package objectorientation.methods.primitivetype;

public class Calculator {

    //    Declarando método void(sem retorno) passando como parametro x e y do tipo inteiro
    public void sum(int x, int y) {
        final int result = x + y;
        System.out.println(result);
    }

    public void subtration(int x, int y) {
        final int result = x - y;
        System.out.println(result);
    }

    //    Declarando método double(retorna um double)
    public double divide(double x, double y) {
        if (y == 0) return 0;
        return x / y;
    }

    public void divideVoid(double x, double y) {
        if (y == 0) {
            System.out.println("Não existe divisão por zero!");
//            return em métodos void age como um break, impedindo a execução do resto do codigo caso caia no bloco if
            return;
        }
        System.out.println(x / y);
    }

    public void changeNumber(int x, int y) {
//        Definindo valores padões para os parametros do método
        x = 99;
        y = 33;

        System.out.println("Dentro do changeNumber!");
        System.out.println(STR."x: \{x}");
        System.out.println(STR."y: \{y}");
    }
}