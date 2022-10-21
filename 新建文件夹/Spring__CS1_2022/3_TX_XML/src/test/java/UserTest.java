import com.niit.config.TxConfit;
import com.niit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

/**
 * @Author
 * @Date 2022/10/14 19:50
 * @Description
 **/
public class UserTest {

    @Test
    public void test001(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        UserService service = context.getBean(UserService.class);
        service.accountMoney();
    }

    @Test
    public void test002(){
        System.out.println(new Random().nextInt(48)+1);
    }

    @Test
    public void test003(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TxConfit.class);
        UserService service = context.getBean(UserService.class);
        service.accountMoney();
    }
}
