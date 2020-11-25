package io.kimmking.spring02;

import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo02 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
//       AbstractAutowireCapableBeanFactory
        context.getBean("School");
    }
}
