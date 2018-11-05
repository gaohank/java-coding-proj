package cn.gaohank.program.javase.base.base_07_io;


import org.apache.commons.io.IOUtils;

import java.util.Scanner;

public class Io10IoUtils {
    public static String getContent(String resourceName) throws Exception {
        return IOUtils.toString(Io10IoUtils.class.getClassLoader().getResourceAsStream(resourceName), "utf8");
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(getContent("test.json"));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
