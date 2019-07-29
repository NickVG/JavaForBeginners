
public class A {

	public static void main(String[] args) {

		String[] myStrings1 = { "ABC", "DEF" };
		String[] myStrings2 = { "GHJ", "KLM", "NOP" };
		String[][] myStrings = { myStrings1, myStrings2 };
		String[] target = abc(myStrings);
		for (String argu : args) {
			for (int i = 0; i < target.length; i++) {
				if (argu.equals(target[i])) {
					target[i] = null;
				}
			}
		}
		for (String argu : target) {
			System.out.print(argu + " ");
		}
	}

	static String[] abc(String[]... strings) {
		int counter = 0;
		for (String[] b : strings) {
			for (String c : b) {
				counter++;
			}
		}
		String[] newArray = new String[counter];
		int counter1 = 0;
		for (int j = 0; j < strings.length; j++) {

			for (int i = 0; i < strings[j].length; i++) {
				newArray[counter1++] = strings[j][i];
			}

		}
		return newArray;
	}

}