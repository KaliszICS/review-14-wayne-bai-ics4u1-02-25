public class PracticeProblem {
	public static void main(String args[]) {

	}

	public static int calculate(int arg1, int arg2, char operator) {

		switch (operator) {

			case '+':
				return arg1 + arg2;
			// break;
			case '-':
				return arg1 - arg2;
			// break;
			case '*':
				return arg1 * arg2;
			// break;
			case '/':
				return arg1 / arg2;
			// break;
			case '%':
				return arg1 % arg2;
			// break;
			case '^':
				return (int) Math.pow(arg1, arg2);
			// break;
			default:
				return arg1;
			// break;
		}
	}

	public static boolean totalWordsChecker(String sentence) {
		final int MAXIMUM = 10;
		int wordCount = 1;
		for (int i = 0; i < sentence.length(); i++) {
			switch (sentence.charAt(i)) {
				case ' ':
					wordCount += 1;
					break;
				case ',':
					wordCount += 1;
					break;
				case '[':
					wordCount += 1;
					break;
				case '(':
					wordCount += 1;
					break;
				case '-':
					wordCount += 1;
					break;
				case '/':
					wordCount += 1;
					break;
				case ';':
					wordCount += 1;
					break;
				case ':':
					wordCount += 1;
					break;
				case '{':
					wordCount += 1;
					break;
				case '<':
					wordCount += 1;
					break;

				default:
					continue;
			}
		}
		return wordCount <= MAXIMUM;
	}

}

/*
 * [![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-
 * 2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https:
 * //classroom.github.com/open-in-codespaces?assignment_repo_id=18440975)
 * # Instructions
 * 
 * ## Questions
 * 1. Create a function called _calculate_ which takes in 2 integers and a
 * character as parameters. Return the result of the two integers being operated
 * on by the given operator. Use a switch. The following operators need to be
 * accepted:
 * - \+ addtion
 * - \- subtraction
 * - \* multiplication
 * - / floor division
 * - % remainder
 * - ^ exponent
 * 
 * 2. Create a function called _totalWordsChecker_ that takes in a string as a
 * parameter and returns true if the if the string has less than or as many
 * words than the maximum, false otherwise. Use a constant called MAXIMUM that
 * has a value of 10 for your function.
 * 
 * 3. Create a function called _minStrings_ which takes in 3 Strings as
 * parameters. Output the String that comes in the earliest alphabetically
 * (casing does not matter)
 */