package arraylist.introduction;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<Developers> myArrayListOne = new ArrayList<>();
		Developers developerOne = new Developers("João Bertholino", Stack.Mobile, new Language[]{Language.Kotlin, Language.Java});

		myArrayListOne.add(developerOne);
		System.out.println(myArrayListOne.getFirst());
		System.out.println(developerOne.getName());
		System.out.println(developerOne.getStack());
		System.out.println(myArrayListOne.hashCode());
		System.out.println(myArrayListOne.size());
	}
}
