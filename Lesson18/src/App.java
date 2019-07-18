
public class App {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = sortirovka(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		String[][] avc = { { "1", "1", "2" }, { "asd", "csd" } , {"asdasd", "retsd", "sdfsdf"}};
		showArray(avc);
	}

	static int[] sortirovka(int[] inpurArray) {
		int[] resultArray = new int[inpurArray.length];
		for (int i = 0; i < inpurArray.length; i++) {
			for (int j = i; j < inpurArray.length; j++) {
				if (inpurArray[i] >= inpurArray[j]) {
					resultArray[i] = inpurArray[j];
				}
			}
		}
		return resultArray;
	}

	static void showArray(String[][] str1) {
		System.out.print("{");
		for (int i = 0; i < str1.length; i++) {
			System.out.print("{");
			for (int j = 0; j < str1[i].length; j++) {
				System.out.print(str1[i][j]);
				if (j < str1[i].length - 1) {
					System.out.print(",");
				}
			}
			System.out.print("}");
			if (i < str1.length - 1) {
				System.out.print(",");
			}

		}
		System.out.print("}");
	}

}
