package introduction.loops;

public class App {
    public static void main(String[] args) {
        whileLoop();
        doWhileLoop();
        forLoop();
        breakLoop();
        continueLoop();
    }

    public static void whileLoop() {
        int count = 0;

        while (count < 10) {
            if (count % 2 == 0) {
                System.out.println(STR."Numeros pares de 0 a 9: \{count}");
            }
            count++;
        }
        System.out.println("Saiu do loop while!");
    }

    //    Mesmo que a condição seja false, sempre sera executado pelo menos uma vez
    public static void doWhileLoop() {
        int count = 0;

        do {
            if (count % 2 == 0) {
                System.out.println(STR."Numeros pares de 0 a 9: \{count}");
            }
            count++;
        }
        while (count < 10);
        System.out.println("Saiu do loop doWhile!");
    }

    public static void forLoop() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(STR."Numeros pares de 0 a 9: \{i}");
            }
        }
        System.out.println("Saiu do loop for!");
    }

    //    Para a execução do loop quando atingi uma determinada condição
    public static void breakLoop() {
        int value = 50;
        for (int i = 0; i <= value; i++) {
            if (i > 25) break;
            System.out.println(STR."Valor até 25: \{i}");
        }

//        Imprimindo o valor de parcelas de um carro
        int totalValue = 56000;
        for (int installments = 1; installments <= totalValue; installments++) {
            int installmentsValue = totalValue / installments;
            if (installmentsValue < 2300) break;
            System.out.println(STR."Quantidade de parcelas: \{installments} => Valor da parcela: \{installmentsValue}");
        }
    }

    public static void continueLoop() {
        int value = 50;
        for (int i = 0; i <= value; i++) {
            if (i > 25) break;
            System.out.println(STR."Valor até 25: \{i}");
        }

//        Imprimindo o valor de parcelas de um carro
        int totalValue = 56000;
        for (int installments = totalValue; installments >= 1; installments--) {
            int installmentsValue = totalValue / installments;
            if (installmentsValue <= 2000) continue;
            System.out.println(STR."Quantidade de parcelas: \{installments} => Valor da parcela: \{(int) installmentsValue}");
        }
    }
}
