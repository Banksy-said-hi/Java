package Basic;

public class HelloWorld1 {
    public static void main(String[] args) {
        int i = 2;

        while (true) {
            System.out.println(i);
            i += 2;
            if (i > 8) {
                break;
            }
        }
    }
}
