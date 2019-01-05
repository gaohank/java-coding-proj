package com.aspect;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 *    ���ڼ�¼��־�ķ����������ʾSpring AOP�ĸ���֪ͨ���͡�
 */

@Component
@Aspect
public class OperateLogger {
    /**
     * ǰ��֪ͨ������֪ͨ������֪ͨʹ�õķ���
     */
	//@Before("within(com.controller..*)")
	/*@After("within(com.controller..*)")
	//@AfterReturning("within(com.controller..*)")
    public void log1() {
        // ��¼��־
        System.out.println("-->��¼�û�������Ϣ");
    }*/
    
    /**
     * ����֪ͨʹ�õķ���
     */
	@Around("within(com.controller..*)")
    public Object log2(ProceedingJoinPoint p) throws Throwable {
        // Ŀ�����������
        String className = p.getTarget().getClass().getName();
        // ���õķ�����
        String method = p.getSignature().getName();
        // ��ǰϵͳʱ��
        String date = new SimpleDateFormat(
                "yyyy-MM-dd hh:mm:ss").format(new Date());
        // ƴ��־��Ϣ
        String msg = "-->�û���" + date + "��ִ����" 
                + className + "." + method + "()";
        // ��¼��־
        System.out.println(msg);        
        
        // ִ��Ŀ������ķ���
        Object obj = p.proceed();
        
        // �ڵ���Ŀ�����ҵ�񷽷���Ҳ������һЩҵ����
        System.out.println("-->����Ŀ�����ҵ�񷽷�����...");
        
        return obj;
    }
    
    /**
     * �쳣֪ͨʹ�õķ���
     */
	@AfterThrowing(pointcut="within(com.controller..*)",throwing="e")
    public void log3(Exception e) {
        StackTraceElement[] elems = e.getStackTrace();
        // ���쳣��Ϣ��¼
        System.out.println("-->" + elems[0].toString());
    }
}