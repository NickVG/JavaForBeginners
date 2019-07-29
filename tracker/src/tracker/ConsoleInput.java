package tracker;
import java.util.Scanner;

/** Class ConsoleInput
 * ��������� ������� ConsoleInput
 * @author nikolay gorbunov
 * @version $Id$
 * @since 0.1
 */

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}