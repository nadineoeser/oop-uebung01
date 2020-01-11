package ueb01;

public class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!
		if (s.length() == 1) {
			return true;
		}
		else{
			CharStack stack = new CharStackImpl();
			char[] cs = s.toLowerCase().replaceAll(" ", "").toCharArray();
			// die erste Hälfte auf den Stack legen
			int i = 0;
			for (; i < cs.length / 2; i++) {
				stack.push(cs[i]);
			}

			// ungerade Länge: ignoriere Buchstaben in der Mitte
			if (cs.length % 2 == 1) {
				i++;
			}

			for (; i < cs.length; i++) {
				if (stack.pop() != cs[i])
					return false;
			}


		}
		return true;
	}
}
