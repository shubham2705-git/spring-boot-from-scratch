package singletonScope.main;
import singletonScope.beans.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext
                ("singletonScope/resources/applicationContext.xml");

        Student std1 = (Student)container.getBean("stdObj1");
        System.out.println(std1);
        Student std2 = (Student)container.getBean("stdObj1");
        System.out.println(std2);
    }
}
