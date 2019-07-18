package reader;

public class RevertString {
	String inputString;

	RevertString(String s) {
		inputString = s;
	}

	public String revertString() {
//		StringBuilder sbOld = new StringBuilder(inputString);
//		StringBuilder sbNew = sbOld.reverse();

		
		return new String((new StringBuilder(inputString)).reverse());
	}
}
