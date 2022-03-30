package study.value;

/**
 * @author ruochenxie
 */
public class Part4Initial {
    public static void main(String[] args) {
        String s = "fred";
        String t = s;
        t = t.toUpperCase();

        System.out.println(s);
        System.out.println(t);

    }
}
