import com.anno.pojo.User;
import com.anno.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/10/10 20:33
 * @Description
 **/
public class Test {
    @org.junit.Test
    public void  test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean(UserService.class);
        userService.save("薛定谔的老六");
    }
}
