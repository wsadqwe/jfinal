import com.niit.container.Office;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/10/3 19:24
 * @Description
 **/
public class OfficeTest {
    @Test
    public void test01(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean1.xml");
        Office office = (Office) context.getBean("office");
        System.out.println(office.toString());
    }
}
