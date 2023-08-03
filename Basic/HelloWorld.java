package Basic;

import java.util.List;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sina", "Mona", "Mola", "Erfan");

        for (String name : names) {
            System.out.println(name);
        }
    }
}