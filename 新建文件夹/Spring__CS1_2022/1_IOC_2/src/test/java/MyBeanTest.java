import com.niit.container.Office;
import com.niit.factorybean.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/10/3 19:24
 * @Description
 **/
public class MyBeanTest {
    @Test
    public void test01() {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean(Course.class);
        System.out.println(course.getcName());
    }
}
