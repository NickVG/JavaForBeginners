package reader;
import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    public String ask(String filename) {
        System.out.println(filename);
        return scanner.nextLine();
    }
}