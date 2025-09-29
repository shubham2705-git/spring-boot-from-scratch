package SpringProgram1BeanFactory.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import SpringProgram1BeanFactory.beans.Student;
import org.springframework.core.io.Resource;


public class Main {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("SpringProgram1BeanFactory/resources/applicationContext.xml");
        BeanFactory container = new XmlBeanFactory(resource);
        Student std = (Student) container.getBean("stdObj");
        std.display();
    }
}
