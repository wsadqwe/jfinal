import com.niit.component.MyConfig;
import com.niit.component.MyConfig;
import com.niit.component.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/10/6 9:11
 * @Description
 **/
public class ComponentTest {
    @Test
    public void test01(){
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("bean6.xml");
        String[] names = ctx.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UserController userController = ctx.getBean(UserController.class);
        userController.reqUser();
    }
}




