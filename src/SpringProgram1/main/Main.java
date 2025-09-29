package SpringProgram1.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext
                ("SpringProgram1/resources/applicationContext.xml");

        System.out.println("Spring loaded successfully!");
    }
}
