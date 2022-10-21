import com.niit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService=context.getBean(UserService.class);
        userService.save("这个老六真晦气");
    }
}
