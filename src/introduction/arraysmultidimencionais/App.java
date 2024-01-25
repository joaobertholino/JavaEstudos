package introduction.arraysmultidimencionais;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        arraysMult();
    }

    public static void arraysMult() {
        int[][] days = new int[2][2];
        days[0][0] = 12;
        System.out.println(days[0][0]);

        days[0][1] = 24;
        System.out.println(days[0][1]);

        days[1][0] = 48;
        System.out.println(days[1][0]);

        days[1][1] = 96;
        System.out.println(days[1][1]);

    }
}
