package SpringProgram4JavaConfig2.resources;

import SpringProgram4JavaConfig2.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean(name="stdObj1")
    public Student createBeanObj(){
        Student std = new Student();
        std.setName("Deepesh222");
        std.setRollno(333);
        return std;
    }
}
