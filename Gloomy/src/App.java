
public class App {

	public static void main(String[] args) {
		int i1=5;
		int i2=11;
		double d1=5.5;
		double d2=1.3;
		long l = 20l;
		double result=i2/d1+d2%i1-l;
		System.out.println(result);
		
		System.out.println();
		
		int a = 5;
		int b = 8;
		System.out.println(a-- - --a + ++a + a++ + a); //17
		System.out.println(++b - b++ + ++b - --b);
		
		System.out.println();

        for (int i = 100; i < 150; i++) {
            String s = Integer.toString(i);
            Integer ii1 = Integer.decode(s);
            Integer ii2 = Integer.valueOf(i);
            System.out.println(i + " " + (ii1 == ii2)); 
        }
        
        Students student1 = new Students (5, 5,8);
        System.out.println(student1.average());
        StudentTest t1= new StudentTest(student1);
        t1.displayAverege(student1);
    	new Sum(1,2);
	}
}


// Check Examples

// Compiler version JDK 11.0.2

class Students {
	int math, eco, eng;

	public Students(int math, int eco, int eng) {
		this.math = math;
		this.eco = eco;
		this.eng = eng;
	}

	public int average() {
		return math + eco + eng;
	}

}

class StudentTest {
	Students student;

	public StudentTest(Students student) {
		this.student = student;
	}

	public void displayAverege(Students student) {
		System.out.println("Average is " + student.average());
	}
}

class Sum {
//	int a, b ,c ,d , e;
	Sum(int a, int b, int c, int d, int e) {
		System.out.println("Sum is: " + (a + b + c + d + e));
	}
	
	Sum(int a, int b, int c, int d) {
		this( a, b, c, d, 0);
	}
	
	Sum(int a, int b, int c) {
		this( a, b, c, 0, 0);
	}
	
	Sum(int a, int b) {
		this( a, b, 0, 0, 0);
	}
	
	Sum(int a) {
		this( a, 0, 0, 0, 0);
	}
	
	Sum() {
		this(0, 0, 0, 0, 0);
	}
	
}