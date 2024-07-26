
public class ValidParanthesese {

	public static void main(String[] args) {

		String s = "{[]}";
		System.out.println(isValid(s));

	}

	public static boolean isValid(String s) {

		boolean bool = false;
		if ((int) (Math.pow(-1, s.length())) < 0 || s.isEmpty()) {
			return false;
		}
		bool = true;
		for (int i = 0; i < s.length(); i += 2) {

			for (int j = i + 1; j < s.length(); j += 2) {

				if (s.charAt(i) == '{') {

					if (s.charAt(j) == '}') {

						break;
					}
				}

				if (s.charAt(i) == '[') {

					if (s.charAt(j) == ']') {
						break;
					}
				}

				if (s.charAt(i) == '(') {

					if (s.charAt(j) == ')') {
						break;
					}

				}

				if (j == s.length() - 1) {
					bool = false;
				}
			}

			if (!bool) {
				break;
			}
		}

		return bool;
	}

}
