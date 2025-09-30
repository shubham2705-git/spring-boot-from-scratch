package MultipleConfigFiles2.main;
import MultipleConfigFiles2.beans.Student;
import MultipleConfigFiles2.beans.Employee;


import MultipleConfigFiles2.resources.EmpConfigFile;
import MultipleConfigFiles2.resources.StdConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(StdConfigFile.class, EmpConfigFile.class);

        Student std = (Student)container.getBean("stdObj");
        std.stdDisplay();
        System.out.println("==============================");
        Employee emp = (Employee)container.getBean("empObj");
        emp.empDisplay();
    }
}
