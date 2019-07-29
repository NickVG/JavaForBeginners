package tracker;
import java.lang.*;
import java.util.*;

/** Class Tracker
 * ��������� ������� Tracker
 * @author nikolay gorbunov
 * @version $Id$
 * @since 0.1
 */

public class Tracker {
	
	/**
     * ������ ��� �������� ������.
     */
    private final Item[] items = new Item[100];
    
    /**
     * ��������� ������ ��� ����� ������.
     */
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * ����� ������������ ID ������
     *@return ID ������
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
 
    /**
     * ����� ��� �������� ��������� ������
     *
     * @return ����� ��������� ������
     */
    public int idQuantity() {
        return position;
    }
    
    /**
     * ����� ����������� ���������� ������ � ���������
     *
     * @param item ����� ������
     * @return item
     */
    public void add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
    }
    
    /**
     * ����� ��� �������������� ������
     *
     * @param id   ID ������
     * @param item ���� ����� ������
     */
    public void replace(String id, Item item) {
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                item.setId(items[i].getId());
                items[i] = item;
                break;
            }
        }
    }
    
    /**
     * ����� ��� �������� ������
     *
     * @param id
     */
    public void delete(String id) {
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, this.position - i - 1);
                position--;
                break;
            }
        }
    }
    
    
    /**
     * ����� ��� ��������� ������ ���� ������
     * @return ������ ���� ������
     */
    public Item[] findAll() {
        return  Arrays.copyOf(this.items, position);
    }
    
    /**
     * ����� ��� ��������� ������ �� �����
     * @param key ��� ������
     * @return ������ ������ � ������� ��������� ���
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int a = 0;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getName().equals(key)) {
                result[a++] = items[i];
            }
        }
        return Arrays.copyOf(result, a);
    }
    
    /**
     * ����� ��� ��������� ������ �� id
     * @param id ID ������
     * @return result ������
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}

