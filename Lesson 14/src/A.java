
public class A {

	public static void main(String[] args) {
		String s1 = "Привет, о мой прекрасный друг! Пойдём же в мир прекрасный и далёкий!";
		String s2 = s1.toUpperCase();
		
		char c1, c2;
		
		for(int i = 0; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			c2 = s2.charAt(i);
			if(c1 != ' ' && c1 != ',' && c1 != '.' && c1 != '!' && c1 == c2) {
				System.out.println();
				System.out.print(c1);
				continue;
			}
				System.out.print(c1);
		}
		
		
		String s3 = "ABC";
		String s4 = "abc";
		System.out.println("\n" + s3.equalsIgnoreCase(s4));
		
		String s5 = "hi";
		String s6 = "   hi";
		String s7 = s6.trim();
		
		System.out.println(s7 == s5);
		hour();
		
		String emails = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
		for(int i = 0; i < emails.length(); i++) {
			if(emails.charAt(i) == '@') {
				while(emails.charAt(++i) != '.') {
					System.out.print(emails.charAt(i));
				}
			}
			if(emails.charAt(i) == ';') {
				System.out.println();
			}
		}
	}

	static void hour() {
		
	}
}


