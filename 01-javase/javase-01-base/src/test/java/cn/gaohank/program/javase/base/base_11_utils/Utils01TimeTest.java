package cn.gaohank.program.javase.base.base_11_utils;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class Utils01TimeTest {

    @Test
    public void getFormatDate() {
        Utils01Time utils01Time = new Utils01Time();
        System.out.println(utils01Time.getFormatDate(new Date(), "yyyyMMdd"));
    }
}