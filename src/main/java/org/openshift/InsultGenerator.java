package org.openshift;

import java.util.Random;

public class InsultGenerator {
	public String generateInsult() {
		String words[][] = {{"madafacka", "mamon", "empollon"}, {"fistro", "pecador", "cuatrojos"}, {"juanjo", "juanjo", "juanjo"}};
		String vowels = "AEIOU";
		String article = "un";
		String firstAdjective = words[0][new Random().nextInt(words[0].length)];
		String secondAdjective = words[1][new Random().nextInt(words[1].length)];
		String noun = words[2][new Random().nextInt(words[2].length)];
		if (vowels.indexOf(firstAdjective.charAt(0)) == -1) {
			article = "una";
		}
		return String.format("Eres %s %s %s %s!", article, firstAdjective, secondAdjective, noun);
	}

}
