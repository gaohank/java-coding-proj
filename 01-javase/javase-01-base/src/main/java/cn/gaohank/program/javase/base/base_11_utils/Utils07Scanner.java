package cn.gaohank.program.javase.base.base_11_utils;

import java.io.InputStream;
import java.util.Scanner;

public class Utils07Scanner {
    public static Scanner getScanner(InputStream inputStream) {
        return new Scanner(inputStream);
    }

    public static void scanLine(Scanner scanner) {
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    public static void scanWord(Scanner scanner) {
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }

    public static void scanByte(Scanner scanner) {
        while (scanner.hasNextByte()) {
            System.out.println(scanner.nextByte());
        }
    }
}
