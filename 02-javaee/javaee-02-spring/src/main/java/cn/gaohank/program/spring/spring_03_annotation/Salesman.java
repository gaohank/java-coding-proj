package cn.gaohank.program.spring.spring_03_annotation;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;

@Component
public class Salesman implements Serializable {
    @Resource
    private Computer computer;
    public Computer getComputer() {
        return computer;
    }
}