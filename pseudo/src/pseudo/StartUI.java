package pseudo;

public class StartUI {

    /**
     * Класс StartUI точка входа в программу
     * Запуск программы.
     * @param args нет описания
     */
    public static void main(String[] args) {
        Shape square = new Square();
        Shape triangle = new Triangle();
        new Paint().draw(square);
        new Paint().draw(triangle);
    }
}