package cn.gaohank.program.javase.base.base_11_utils;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;

import static org.junit.Assert.*;

public class Utils02DateTimeTest {

    @Test
    public void getMillis() {
    }

    @Test
    public void getPatternDateNow() {
        System.out.println(Utils02DateTime.getPatternDate("yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    public void getPatternDate() {
        assertEquals("2018", Utils02DateTime.getPatternDate("2018-10-10", "yyyy"));
    }

    @Test
    public void getPatternDateTimestamp() {

    }
}