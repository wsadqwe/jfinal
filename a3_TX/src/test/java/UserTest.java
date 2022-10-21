import com.niit.service.UService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class UserTest {

    @Test
    public void test1(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        UService.UserService UserService=context.getBean(UService.UserService.class);
        UserService.accountMoney();
    }@Test
    public void test2() {
    System.out.println(new Random().nextInt(48)+1);
    }

    @Test
    public void test3(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        UService.UserService service=context.getBean(UService.UserService.class);
        service.accountMoney();
    }
}
