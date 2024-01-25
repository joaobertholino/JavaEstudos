package introduction.arraysintro;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        arrayPartOne();
        arrayPartTwo();
        arrayPartThree();
        arrayPartFour();
    }
    /*
    Valores padrôes ao se declarar arrays:
    byte, short, int, long, float, double => 0
    char => ' '
    boolean => false
    String => null
     */

    public static void arrayPartOne() {
//        Declarando um array de inteiros de tamanho fixo
        int[] age = new int[3];
        System.out.println(Arrays.toString(age));

//        Atribuindo valores ao array por meio do index
        age[0] = 21;
        System.out.println(age[0]);

        age[1] = (int) 19f;
        System.out.println(age[1]);

        age[2] = (int) 17L;
        System.out.println(age[2]);
    }

//    Imprimindo os valores padrões de cada tipo
    public static void arrayPartTwo() {
        int[] intArray = new int[3];
        System.out.println(Arrays.toString(intArray));

        char[] charArray = new char[3];
        System.out.println(Arrays.toString(charArray));

        boolean[] booleanArray = new boolean[3];
        System.out.println(Arrays.toString(booleanArray));

        String[] stringArray = new String[3];
        System.out.println(Arrays.toString(stringArray));
    }

    public static void arrayPartThree() {
        String[] stringArray = new String[3];
        stringArray[0] = "João";
        stringArray[1] = "Nicolas";
        stringArray[2] = "Ellen";

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(STR."Imprimindo nomes com for: \{stringArray[i]}.");
        }
    }

    public static void arrayPartFour(){
//        Declarando um array com valores padrões de tamanho fixa
        int [] arrayMethodOne = new int[3];
        System.out.println(Arrays.toString(arrayMethodOne));

//        Declarando um array passando seus valores
        int[] arrayMethodTwo = {1, 2, 3};
        System.out.println(Arrays.toString(arrayMethodTwo));

//        Declarando um array da mesma forma que a anterior porem com uma sintaxe diferente
        int[] arrayMethodThree = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arrayMethodThree));

        for (int num : arrayMethodThree){
            System.out.println(STR."Imprimindo array com forEach: \{num}.");
        }
    }
}
