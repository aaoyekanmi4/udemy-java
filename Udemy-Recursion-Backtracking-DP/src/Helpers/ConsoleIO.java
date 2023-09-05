package Helpers;

import java.util.Scanner;

public class ConsoleIO {

    private final Scanner console = new Scanner(System.in);

    public void println(Object value) {
        System.out.println(value);
    }

    public void print(Object value) {
        System.out.print(value);
    }

    public void printf(String format, Object... values) {
        System.out.printf(format, values);
    }

    public String readString(String prompt) {
        print(prompt);
        return console.nextLine();
    }

    public String readRequiredString(String prompt) {
        String input;
        do {
            input = readString(prompt);
            if (input.isBlank() || input.isEmpty()) {
                System.out.println("[Error]");
                System.out.println("Value is required");
            }
        } while (input == null || input.isBlank());
        return input;
    }

    public boolean readBoolean(String prompt) {
        String result = readString(prompt);
        return result.equalsIgnoreCase("y");
    }

    public int readInt(String prompt) {
        while (true) {
            String value = readString(prompt);
            try {
                int result = Integer.parseInt(value);
                return result;
            } catch (NumberFormatException ex) {
                printf("'%s' is not a valid number.%n", value);
            }
        }
    }

    public int readInt(String prompt, int min, int max) {
        while (true) {
            int value = readInt(prompt);
            if (value >= min && value <= max) {
                return value;
            }
            printf("Value must be between %s and %s.%n", min, max);
        }
    }
}
