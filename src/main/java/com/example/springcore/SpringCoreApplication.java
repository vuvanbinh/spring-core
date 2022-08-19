package com.example.springcore;

import com.example.springcore.bean.HelloWorld;
import com.example.springcore.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorldBean");

        System.out.println(helloWorld.getMessage());


        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorldXML = (HelloWorld) xmlApplicationContext.getBean("helloWorldBeanXML");

        System.out.println(helloWorldXML.getMessage());

    }

}
