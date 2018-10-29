package cn.gaohank.program.javase.base.base_11_utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Utils02DateTime {
    // 将Date格式化成unix时间戳
    public static long getMillis(String date, String pattern) {
        return DateTime.parse(date, DateTimeFormat.forPattern(pattern)).getMillis();
    }

    // 将当前时间格式化成pattern的形式输出
    public static String getPatternDate(String pattern) {
        return DateTime.now().toString(DateTimeFormat.forPattern(pattern));
    }

    // 将date格式化成pattern的形式输出
    public static String getPatternDate(String date, String pattern) {
        return DateTime.parse(date).toString(DateTimeFormat.forPattern(pattern));
    }

    public static String getPatternDate(long timestamp, String pattern) {
        return new DateTime(timestamp).toString(DateTimeFormat.forPattern(pattern));
    }
}
