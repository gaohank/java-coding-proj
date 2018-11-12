package cn.gaohank.program.javase.base.base_12_annotation;

import java.util.Set;

@Matcher("equals")
public class EqualMatcher {
    public boolean Match(String l, String r) {
        return l.equals(r);
    }

    public static void main(String[] args) {
//        Set<Class<EqualMatcher>> classSet = ClassScanner.findAnnotatedClasses(basePackage, Matcher.class, IMatcher.class);
    }
}
