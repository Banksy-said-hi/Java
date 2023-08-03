import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Double answer = 0d;
        String operation = null;

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String line = scanner.nextLine();

                if (isNumeric(line)) {
                    Double number = Double.parseDouble(line);

                    if (operation != null) {
                        String indicator = null;

                        switch (operation) {
                            case "+":
                                answer += number;
                                indicator = "summation";
                                break;
                            case "-":
                                answer -= number;
                                indicator = "subtraction";
                                break;
                            case "*":
                                answer *= number;
                                indicator = "multiplication";
                                break;
                            case "/":
                                answer /= number;
                                indicator = "division";
                                break;
                        }
                        System.out.println(indicator + " result is " + answer);
                    } else {
                        answer = number;
                    }

                } else {
                    switch (line) {
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                            operation = line;
                            break;
                    }
                }

                // System.out.println(line);
                if ("Q".equals(line)) {
                    // Exit the loop
                    break;
                } else if ("C".equals(line)) {
                    answer = 0d;
                }
            }
        }
    }

    public static boolean isNumeric(String line) {
        try {
            Double.parseDouble(line);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }
}
