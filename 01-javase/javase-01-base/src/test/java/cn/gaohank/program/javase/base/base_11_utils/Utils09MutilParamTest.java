package cn.gaohank.program.javase.base.base_11_utils;

import org.junit.Test;

import javax.rmi.CORBA.Util;

import static org.junit.Assert.*;

public class Utils09MutilParamTest {

    @Test
    public void getSum() {
        assertEquals(10, Utils09MutilParam.getSum(1, 2, 3, 4));
    }
}