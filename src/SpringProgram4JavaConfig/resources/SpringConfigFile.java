package SpringProgram4JavaConfig.resources;

import SpringProgram4JavaConfig.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Student stdObj(){
        Student std = new Student();
        std.setName("Deepesh");
        std.setRollno(222);
        return std;
    }
}
