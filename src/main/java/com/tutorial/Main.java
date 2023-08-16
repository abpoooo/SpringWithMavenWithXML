package com.tutorial;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Car obj = (Car) context.getBean("car",Car.class);
        obj.drive();

//
//        Tyre t = (Tyre) context.getBean("tyre",Tyre.class);
//        System.out.println(t);

    }
}