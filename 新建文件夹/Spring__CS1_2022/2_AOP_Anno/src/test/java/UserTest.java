import com.niit.config.MainConfig;
import com.niit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author
 * @Date 2022/10/13 8:49
 * @Description
 **/
public class UserTest {
    @Test
    public void tesst01(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MainConfig.class);
        UserService service = context.getBean(UserService.class);
        service.update("admin");
    }
}
