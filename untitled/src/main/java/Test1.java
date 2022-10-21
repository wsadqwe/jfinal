import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void Test001(){
        ApplicationContext context=new ClassPathXmlApplicationContext("");
    }
}
