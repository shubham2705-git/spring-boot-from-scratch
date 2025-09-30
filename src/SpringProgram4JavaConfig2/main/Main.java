package SpringProgram4JavaConfig2.main;
import SpringProgram4JavaConfig2.beans.Student;

import SpringProgram4JavaConfig2.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std = (Student) context.getBean("stdObj1");
        std.display();

    }
}
