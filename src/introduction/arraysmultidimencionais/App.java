package introduction.arraysmultidimencionais;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        arraysMult();
    }
// TODO: Revisar arrays multidimencionais
    public static void arraysMult() {
//        Criando uma matrix de 2|2
        int[][] days = new int[2][2];
        days[0][0] = 12;
        days[0][1] = 24;
        days[1][0] = 48;
        days[1][1] = 96;

//        Iterando sobre cada valor da matrix utilizando for i
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(STR."Imprimindo utlizando for i: \{days[i][j]}");
            }
        }

//        Iterando sobre cada valor da matrix utilizando forEach
        for (int[] arrBase : days) {
            for (int num : arrBase) {
                System.out.println(STR."Imprimindo utilizando forEach: \{num}");
            }
        }
        System.out.println(Arrays.toString(days[0]));
    }
}

// https://www.youtube.com/watch?v=EalQ6X_RtJk&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=37&pp=iAQB