package SpringProgram2.main;
import SpringProgram2.beans.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext
                ("SpringProgram2/resources/applicationContext.xml");

        Student std = (Student)container.getBean("stdObj");
        std.display();
    }
}
