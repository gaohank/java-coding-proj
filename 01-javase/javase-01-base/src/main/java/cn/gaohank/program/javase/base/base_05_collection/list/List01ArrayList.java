package cn.gaohank.program.javase.base.base_05_collection.list;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * 适合遍历（80%都用这个）add(),get(index),size()，
 * 元素可重复，可以有null。
 */
public class List01ArrayList {
    /*
     * List接口继承自Collection接口，并实现了：
     * 1.sort    排序
     * 2.get
     * 3.set     将对应的位置的值替换，add是插入
     * 4.indexOf 取元素索引
     * 5.subList 取子列表
     */

    public static <T> int getIndex(@NotNull List<T> list, T value) {
        return list.indexOf(value);
    }

    public static <T> List<T> getSublist(List<T> list, int start, int end) {
        return list.subList(start, end);
    }

    public static List<String> getSort(List<String> list) {
        list.sort(Comparator.comparingInt(l -> l.charAt(0)));
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.sort((x, y) -> y - x);
        System.out.println(list.toString());
    }
}
