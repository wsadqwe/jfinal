import org.example.com.niit.config.MainConfig;
import org.example.com.niit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {

    @Test
    public void test(){
        ApplicationContext context=
                new AnnotationConfigApplicationContext(MainConfig.class);
        UserService service=context.getBean(UserService.class);
        service.update("admin");
    }
}
