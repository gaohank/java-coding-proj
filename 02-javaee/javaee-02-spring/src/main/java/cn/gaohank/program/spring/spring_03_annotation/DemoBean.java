package cn.gaohank.program.spring.spring_03_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class DemoBean implements Serializable {
    private String name;
    private String lang;
    private String score;
    // @Value("${PAGE_SIZE}")
    @Value("#{const.PAGE_SIZE}")
    private int pageSize;
    public void execute() {
        System.out.println("name:" + name);
        System.out.println("lang:" + lang);
        System.out.println("score:" + score);
        System.out.println("pageSize:" + pageSize);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLang() {
        return lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}