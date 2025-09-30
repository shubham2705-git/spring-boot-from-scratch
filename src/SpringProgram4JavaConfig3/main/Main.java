package SpringProgram4JavaConfig3.main;
import SpringProgram4JavaConfig3.beans.Student;

import SpringProgram4JavaConfig3.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std1 = (Student) context.getBean("stdObj1");
        std1.display();
        System.out.println("======================================");
        Student std2 = (Student) context.getBean("stdObj2");
        std2.display();

    }
}
