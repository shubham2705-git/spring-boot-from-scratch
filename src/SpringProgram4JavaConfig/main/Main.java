package SpringProgram4JavaConfig.main;
import SpringProgram4JavaConfig.beans.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        Student std = (Student) context.getBean("stdObj");
        std.display();

    }
}
