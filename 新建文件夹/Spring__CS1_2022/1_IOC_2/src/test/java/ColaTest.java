import com.niit.factorybean.Course;
import com.niit.lifecycle.Cola;
import org.junit.Test;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/10/3 19:24
 * @Description
 **/
public class ColaTest {
    @Test
    public void test01() throws Exception {
//        DisposableBean s;
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean4.xml");
        Cola cola = context.getBean(Cola.class);
        System.out.println(cola.getBrand());
        cola.destroy();
//        ((ClassPathXmlApplicationContext) context).close();
        Cola cola2 = context.getBean(Cola.class);
        System.out.println(cola2.getBrand());

    }
}
