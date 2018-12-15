package cn.gaohank.program.spring.spring_03_annotation;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Computer implements Serializable {
    private String mainboard; // ����
    private String hdd; // Ӳ��
    private String ram; // �ڴ�
    public String getMainboard() {
        return mainboard;
    }
    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }
    public String getHdd() {
        return hdd;
    }
    public void setHdd(String hdd) {
        this.hdd = hdd;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
}