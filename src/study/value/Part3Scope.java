package study.value;

/**
 * @author ruochenxie
 */
public class Part3Scope {
    String x;
    public static void main(String[] args) {
        Part3Scope new123 = new Part3Scope();
        new123.showx();
    }
    public void showx() {
        System.out.println(x);
    }
}
