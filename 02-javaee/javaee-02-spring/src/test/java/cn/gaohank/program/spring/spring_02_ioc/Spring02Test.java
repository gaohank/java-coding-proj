package cn.gaohank.program.spring.spring_02_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring02Test {
    /**
     * 测试IOC
     */
    @Test
    public void test0() {
    	//将配置文件导入到上下文中
        String cfg = "applicationContext-spring-02.xml";
        ApplicationContext ctx =
            new ClassPathXmlApplicationContext(cfg);
        //通过spring创建实例
        MessageBean bean = ctx.getBean("msg", MessageBean.class);
        bean.execute();
    }

    /**
     * 注入参数值
     */
    @Test
    public void test1() {
        String cfg = "applicationContext-spring-02.xml";
        ApplicationContext ctx =
            new ClassPathXmlApplicationContext(cfg);
        MessageBean bean = ctx.getBean("msg", MessageBean.class);
        bean.execute();
    }

    /**
     * 采用引用的方式注入集合
     */
    @Test
    public void test2() {
        String cfg = "applicationContext-spring-02.xml";
        ApplicationContext ctx =
            new ClassPathXmlApplicationContext(cfg);
        MessageBean bean = ctx.getBean("msg2", MessageBean.class);
        MessageBean bean2 = ctx.getBean("msg2", MessageBean.class);
        bean.execute();
        // 使用的是同一个score对象
        System.out.println(bean.getScore() == bean2.getScore());
    }

    /**
     * 注入表达式
     */
    @Test
    public void test3() {
        String cfg = "applicationContext-spring-02.xml";
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(cfg);
        DemoBean bean = ctx.getBean("demo", DemoBean.class);
        bean.execute();
    }
}