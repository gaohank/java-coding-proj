package cn.gaohank.program.javase.base.base_07_io;


import org.apache.commons.io.IOUtils;

public class Io10IoUtils {
    public static String getContent(String resourceName) throws Exception {
        return IOUtils.toString(Io10IoUtils.class.getClassLoader().getResourceAsStream(resourceName), "utf8");
    }
}
