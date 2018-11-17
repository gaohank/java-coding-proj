package cn.gaohank.program.javase.base.base_07_io;

public class Io12Resource {
    public static void main(String[] args) {
        System.out.println(Io12Resource.class.getResource(""));
        System.out.println(Io12Resource.class.getResource("/"));
        System.out.println(Io12Resource.class.getClassLoader().getResource(""));
        System.out.println(Io12Resource.class.getClassLoader().getResource("/"));
    }
}
