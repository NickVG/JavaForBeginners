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
		
	
		System.out.println("ишем, пишем, не стесняемся: ");
		
		String line = input.nextLine();
		if(line.equals("дурашка")) {
			System.out.print("сам ты дурашка :-P");
		}
		else {
			System.out.println("лучше бы \"дурашка\" написал!!!");
		}
		
	}

}
