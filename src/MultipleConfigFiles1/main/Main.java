package MultipleConfigFiles1.main;
import MultipleConfigFiles1.beans.Student;
import MultipleConfigFiles1.beans.Employee;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext
                ("MultipleConfigFiles1/resources/applicationContext.xml","MultipleConfigFiles1/resources/empAppContext.xml");

        Student std = (Student)container.getBean("stdObj");
        std.stdDisplay();
        System.out.println("==============================");
        Employee emp = (Employee)container.getBean("empObj");
        emp.empDisplay();
    }
}
