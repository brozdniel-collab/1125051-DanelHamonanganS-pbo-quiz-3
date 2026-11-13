package quiz3.code.util;

import java.util.Scanner;

public class CLIUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String readString(String prompt) {
        System.out.print(prompt);
        String input = SCANNER.nextLine().trim();
        return input;
    }

    public static int readInt() {
        int input = SCANNER.nextInt();
        return input;
    }

    public static double readDouble(String prompt) {
        String input = readString(prompt);
        return Double.parseDouble(input);
    }
}