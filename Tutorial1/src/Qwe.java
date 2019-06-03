public class Qwe {

    private final int qwe;
    
    Qwe(int qwe) {
        printQwe();
        this.qwe = qwe;
    }
    
    public void printQwe() {
        System.out.println("qwe = " + qwe);
    }

    public static void main(String[] args) {
        Qwe q = new Qwe(5);
        q.printQwe();
    }
}


