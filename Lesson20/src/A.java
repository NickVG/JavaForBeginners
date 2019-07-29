import java.util.*;

public class A {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		
		Cat na = new Cat();
		Students student1 = new Students();
		
		list.add(na);
		list.add(1, student1);
		
		ArrayList<String> list1 = ArrayList<>();

	}

}

class Cat{}
class Students{}