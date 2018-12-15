package cn.gaohank.program.springmvc.annotation;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ��������Ҫʵ��Controller�ӿ�
 */
public class HihiController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) {
        System.out.println("Hihi, Controller.");
        return new ModelAndView("jsp/hello");
    }
}