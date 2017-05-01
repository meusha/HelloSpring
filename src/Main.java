import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by User on 5/1/2017.
 */
public class Main {
    public  static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("web/WEB-INF/dispatcher-servlet.xml");

        HelloClass helloClass= (HelloClass) context.getBean("helloWorld");
        helloClass.getMessage();


    }
}
