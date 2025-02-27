
class Notes {

	// constants - variables that can't be changed

	// written in all capital letters, use underscores between words
	final static int MAXIMUM_VALUE = 15;

	public static void main(String[] args) {

		// compareTo - comparing non-primitive data types

		String word = "Help";
		String word2 = "hello";

		System.out.println(word.compareTo(word2));
		// negative - before alphabetically (ASCII value is before)
		// zero - same
		// positive - after alphabetically (ASCII value is after)

		// switch - way too many ifs

		int num = 4;
		switch (num) {
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
			case 4:
				System.out.println("case 4");
				break;
			case 5:
				System.out.println("case 5");
				break;
			default: //else statement
				System.out.println("default");
		}

	}
}
