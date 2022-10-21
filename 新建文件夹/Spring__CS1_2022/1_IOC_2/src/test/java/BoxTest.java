import com.niit.container.Office;
import com.niit.scope.Box;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/10/3 19:24
 * @Description
 **/
public class BoxTest {
    @Test
    public void test01(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean2.xml");
        Box box = context.getBean(Box.class);
        System.out.println(box.hashCode());

        Box box2 = context.getBean(Box.class);
        System.out.println(box2.hashCode());

        Box box3 = context.getBean(Box.class);
        System.out.println(box3.hashCode());
    }
}
