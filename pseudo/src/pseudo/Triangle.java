package pseudo;

/**
 * Class Square
 * @author nikolay gorbunov
 * ��������� ��������� ������������
 */
public class Triangle implements Shape {

    /**
     *  ����� ���������� �� ��������� �����������
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("+").append(System.lineSeparator());
        pic.append("+++").append(System.lineSeparator());
        pic.append("+++++").append(System.lineSeparator());
        pic.append("+++++++").append(System.lineSeparator());
        return pic.toString();
    }
}