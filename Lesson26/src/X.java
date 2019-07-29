
public class X {

	
	public static void main(String[] args) {
		System.out.println(Z.s);
		System.out.println(Z.s);
		new Z();
		new Z();
		System.out.println(Z.s);

	}

}

class Z{
	static String s = "";
	{
		s+="A";
	}
	static
	{
		s += "B";
	}
	{
		s+="C";
	}
}