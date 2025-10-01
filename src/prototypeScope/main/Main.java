package prototypeScope.main;
import prototypeScope.beans.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext
                ("prototypeScope/resources/applicationContext.xml");

        Student std1 = (Student)container.getBean("stdObj1");
        System.out.println(std1);
        Student std2 = (Student)container.getBean("stdObj1");
        System.out.println(std2);
        Student std3 = (Student)container.getBean("stdObj1");
        System.out.println(std3);
    }
}
