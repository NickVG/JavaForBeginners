
/*public class A {

	public static void main(String[] args) {

		String[] myStrings1 = { "ABC", "DEF" };
		String[] myStrings2 = { "GHJ", "KLM", "NOP" };
		String[][] myStrings = { myStrings1, myStrings2 };

		/*
		 * for (int i = 0; i < abc(myStrings).length; i++) { System.out.print(" " +
		 * abc(myStrings)[i]); }

		/*
		 * for (String asd : args) { for (int i = 0; i < abc(myStrings).length; i++) {
		 * if (abc(myStrings)[i].equals(asd)) { abc(myStrings)[i] = null; } } }
		 
		for (String argu : args) {
			for (String arr : abc(myStrings)) {
				if (argu.equals(arr)) {
					arr = null;
					System.out.println(arr);
				}
			}
		}
		for (String argu : abc(myStrings)) {
			System.out.print(argu + " ");
		}

//			for (String arr : abc(myStrings)) {
//			for (String arr : abc(myStrings)) {
//				if (arr != null) {
//					System.out.print(arr + " ");
//				}
	}
//			if (sldkf.equals(args)) {
//				sldkf = null;
//			}
//			if(sldkf!=null) {
//				System.out.println(sldkf);
//				
//			}
//		}

	// }

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

}*/