package cn.gaohank.program.javase.base.base_01_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_03_Pattern {
    public static void main(String[] args) {
        boolean b = Pattern.matches("\\d+.*", "192.168.1.10");
        System.out.println(b);

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher("hello");
        System.out.println(matcher.matches());    // 全匹配

        String str = "java class:2017";
        matcher = Pattern.compile("\\d+").matcher(str);
        System.out.println(matcher.matches());

        if (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }

        String name = "（演员）胡歌";

        Pattern compile1 = Pattern.compile("\\(.*\\)|\\（.*\\）");
        Matcher matcher1 = compile1.matcher(name);
        if (matcher1.find()) {
            System.out.println(matcher1.replaceAll(""));
        }
    }
}
