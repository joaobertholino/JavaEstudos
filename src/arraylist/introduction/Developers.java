package arraylist.introduction;

import java.util.Arrays;

public class Developers {
	private final String name;
	private final Stack stack;
	private final Language[] language;

	public Developers(String name, Stack stack, Language[] language) {
		this.name = name;
		this.stack = stack;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public Stack getStack() {
		return stack;
	}

	public Language[] getLanguage() {
		return language;
	}

	@Override
	public String toString() {
		return STR."Developers{name='\{name}\{'\''}, stack=\{stack}, language=\{Arrays.toString(language)}\{'}'}";
	}
}
