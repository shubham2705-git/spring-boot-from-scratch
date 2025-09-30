package MultipleConfigFiles2.resources;

import MultipleConfigFiles2.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StdConfigFile {
        @Bean
        public Student stdObj(){
            Student std = new Student();
            std.setName("Student");
            std.setRollno(101);
            return std;
        }
}
