package AnnotationDemo1.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Priya")
    private String name;
    @Value("333")
    private int rollno;

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Name:" +name);
        System.out.println("Rollno:"+rollno);
    }
}
