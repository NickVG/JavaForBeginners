package tracker;
import java.util.Arrays;

public class StartUI {
    /**
     * ��������� ���� ��� ���������� ����� ������.
     */
    private static final String ADD = "0";
    /**
     * ��������� ��� ������ ���� ������.
     */
    private static final String SHOW = "1";
    /**
     * ��������� ��� �������������� ������.
     */
    private static final String EDIT = "2";
    /**
     * ��������� ��� �������� ������
     */
    private static final String DELETE = "3";
    /**
     * ��������� ��� ������ ������ �� ID.
     */
    private static final String FINDBYID = "4";
    /**
     *  ��������� ��� ������ ������ �� �����.
     */
    private static final String FINDBYNAME = "5";
    /**
     * ��������� ��� ������ �� �����.
     */
    private static final String EXIT = "6";

    /**
     * ��������� ������ �� ������������.
     */
    private final Input input;

    /**
     * ��������� ������.
     */
    private final Tracker tracker;

    /**
     * ���������� ���������������� ����.
     * @param input ���� ������.
     * @param tracker ��������� ������.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * ������� ���� ���������.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("������� ����� ���� : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showAllItems();
            } else if (EDIT.equals(answer)) {
                this.modifyItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDBYID.equals(answer)) {
                this.findById();
            } else if (FINDBYNAME.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * ����� ��������� ���������� ����� ������ � ���������.
     */
    private void createItem() {
        System.out.println("------------ ���������� ����� ������ --------------");
        String name = this.input.ask("������� ��� ������ :");
        String desc = this.input.ask("������� �������� ������ :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ ����� ������ � getId : " + item.getId() + "-----------");
    }

    /**
     * ����� ����������� ����� ���� ������ ����������� � ���������.
     */
    private void showAllItems() {
        System.out.println("------------ ���c�� ���� ��������� ������:  --------------");
        System.out.println(Arrays.toString(tracker.findAll()));
    }

    /**
     * ����� ����������� �������������� ������.
     */
    private void modifyItem() {
        System.out.println("------------ �������������� --------------");
        String taskId = this.input.ask("������� id ������ ������ ��������� �������� : ");
        String taskName = this.input.ask("������� ��� ������ : ");
        String taskDescription = this.input.ask("������� �������� ������ : ");
        Item newItem = new Item(taskName, taskDescription);
        tracker.replace(taskId, newItem);
        System.out.println("------------ ����� ��� ������: " + newItem.getName() + "-----------");
        System.out.println("------------ ����� �������� ������: " + newItem.getDescription() + "-----------");
        System.out.println("------------ ID ������: " + newItem.getId() + "-----------");
    }

    /**
     * ����� ����������� ����� ������ �� ID.
     */
    private void findById() {
        System.out.println("------------ ����� ������ �� ID--------------");
        String taskId = this.input.ask("������� id ������ ������ ��������� ����� : ");
        System.out.println("------------ ID ��������� ������: " + tracker.findById(taskId).getId() + "-----------");
    }

    /**
     * ����� ����������� ����� ������ �� �����.
     */
    private void findByName() {
        System.out.println("------------ ����� ������ �� �����--------------");
        String taskName = this.input.ask("������� ��� ������ ������ ��������� ����� : ");
        System.out.println("------------ ���c�� ������ � ����������� ������: " + (Arrays.toString(tracker.findByName(taskName))) + "-----------");
    }

    /**
     * ����� ����������� �������� ������.
     */
    private void deleteItem() {
        System.out.println("------------ �������� ������ --------------");
        String taskId = this.input.ask("������� id ������ ������ ��������� ������� : ");
        tracker.delete(taskId);
        System.out.println("------------ ������ �������, ����� ���������� ��������� ������: " + tracker.idQuantity() + "-----------");
    }

    private void showMenu() {
        System.out.println("����.");
        System.out.println("��� ���������� ����� ������ ������� " + ADD);
        System.out.println("��� ������ ������ ���� ������ ������� " + SHOW);
        System.out.println("��� �������������� ������ ������� " + EDIT);
        System.out.println("��� �������� ������ " + DELETE);
        System.out.println("��� ������ ������ �� ID �������" + FINDBYID);
        System.out.println("��� ������ ������ �� ����� ������� " + FINDBYNAME);
        System.out.println("��� ������ �� ��������� ������� " + EXIT);
        // �������� ��������� ������ ����.
    }

    /**
     * ����� StartUI ����� ����� � ���������
     * ������ ���������.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}
