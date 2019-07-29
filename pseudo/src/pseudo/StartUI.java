package pseudo;

public class StartUI {

    /**
     * ����� StartUI ����� ����� � ���������
     * ������ ���������.
     * @param args ��� ��������
     */
    public static void main(String[] args) {
        Shape square = new Square();
        Shape triangle = new Triangle();
        new Paint().draw(square);
        new Paint().draw(triangle);
    }
}