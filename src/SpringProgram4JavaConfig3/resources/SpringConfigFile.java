package SpringProgram4JavaConfig3.resources;

import SpringProgram4JavaConfig3.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean(name="stdObj1")
    public Student createBeanObj1(){
        Student std = new Student();
        std.setName("Ankit");
        std.setRollno(111);
        return std;
    }
    @Bean(name="stdObj2")
    public Student createBeanObj2(){
        Student std = new Student();
        std.setName("Brajesh");
        std.setRollno(222);
        return std;
    }
}
