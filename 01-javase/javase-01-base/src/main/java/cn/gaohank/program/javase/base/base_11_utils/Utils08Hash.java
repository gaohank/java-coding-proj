package cn.gaohank.program.javase.base.base_11_utils;

public class Utils08Hash {
    public static<T> int getHashCode(T t) {
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }
}
