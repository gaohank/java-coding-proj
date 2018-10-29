package cn.gaohank.program.javase.base.base_11_utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils01Time {
    public static void main(String[] args) {
        long currentTimeMillis = getCurrentTimeMillis();
        System.out.println(currentTimeMillis);

        Date curDate = new Date();
        System.out.println(curDate);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(curDate));
//        System.out.println(simpleDateFormat.parse("2009/09/09 09:09:09"));
    }

    public static long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    public String getFormatDate(Date date, String parse) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(parse);
        return simpleDateFormat.format(date);
    }
}
