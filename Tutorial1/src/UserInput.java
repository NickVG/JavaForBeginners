import java.util.Scanner;
/**
 * 
 */

/**
 * @author nv.gorbunov
 *
 */
public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner input
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("����, �����, �� ����������: ");
		
		String line = input.nextLine();
		if(line.equals("�������")) {
			System.out.print("��� �� ������� :-P");
		}
		else {
			System.out.println("����� �� \"�������\" �������!!!");
		}
		
	}

}
