package AnnotationDemo2.main;

import AnnotationDemo2.beans.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Student.class);
        context.refresh();
        Student std = (Student)context.getBean("stdObj");
        std.display();
    }
}
