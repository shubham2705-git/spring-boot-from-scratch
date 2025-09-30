package MultipleConfigFiles2.resources;

import MultipleConfigFiles2.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfigFile {
    @Bean
    public Employee empObj(){
        Employee emp = new Employee();
        emp.setempname("Employee");
        emp.setempid(102);
        return emp;
    }
}
