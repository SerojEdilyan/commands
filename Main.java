public class Main {
    public static void main (String[] args) {
        System.out.println("Hello Got!");
        println(5);
    }

    public static <E> void println (E e) {
        System.out.println(e);
    }

    private static void print () {
        for(int i = 0; i < 5; i++)
            System.out.println(i);
    }
}
