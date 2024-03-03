package introduction.arraysmultidimencionais;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		arraysMult();
	}

	public static void arraysMult() {
//    Criando uma matrix de 2|2
		int[][] days = new int[2][2];
		days[0][0] = 12;
		days[0][1] = 24;
		days[1][0] = 48;
		days[1][1] = 96;
		System.out.println(Arrays.deepToString(days));

//    Iterando sobre cada valor da matrix utilizando for i
		for (int i = 0; i < days.length; i++) {
			for (int j = 0; j < days[i].length; j++) {
				System.out.println(STR."Imprimindo utlizando for i e j: \{days[i][j]}");
			}
		}

//    Iterando sobre cada valor da matrix utilizando forEach
		for (int[] arrBase : days) {
			for (int num : arrBase) {
				System.out.println(STR."Imprimindo utilizando forEach: \{num}");
			}
		}
	}
}
