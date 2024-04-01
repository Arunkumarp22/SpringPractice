package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
      Car obj=context.getBean("car", Car.class);
        //Tyre t=(Tyre) context.getBean("tyre");
        obj.drive();
    }
}