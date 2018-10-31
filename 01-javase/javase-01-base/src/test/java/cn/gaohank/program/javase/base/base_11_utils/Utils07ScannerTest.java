package cn.gaohank.program.javase.base.base_11_utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Utils07ScannerTest {
    @Test
    public void scanLine() {
        String data = "hello world";
        Scanner scanner = Utils07Scanner.getScanner(new ByteArrayInputStream(data.getBytes()));
        Utils07Scanner.scanLine(scanner);
    }

    @Test
    public void scanWord() {
        String data = "hello world";
        Scanner scanner = Utils07Scanner.getScanner(new ByteArrayInputStream(data.getBytes()));
        Utils07Scanner.scanWord(scanner);
    }

    @Test
    public void scanByte() {
        String data = "hello world";
        Scanner scanner = Utils07Scanner.getScanner(new ByteArrayInputStream(data.getBytes()));
        Utils07Scanner.scanByte(scanner);
    }
}