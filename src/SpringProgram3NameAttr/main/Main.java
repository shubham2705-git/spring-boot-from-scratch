package SpringProgram3NameAttr.main;
import SpringProgram3NameAttr.beans.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext
                ("SpringProgram3NameAttr/resources/applicationContext.xml");

        Student std1 = (Student)container.getBean("stdObj1");
        std1.display();
        System.out.println("------------------------------------------");
        Student std2 = (Student)container.getBean("stdObj2");
        std2.display();
    }
}
