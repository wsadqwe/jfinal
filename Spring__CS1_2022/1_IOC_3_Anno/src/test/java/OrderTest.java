import com.niit.config.MainConfig;
import com.niit.controiller.OrderController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author
 * @Date 2022/10/6 15:18
 * @Description
 **/
public class OrderTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(MainConfig.class);

        OrderController controller = ctx.getBean(OrderController.class);

        controller.buyOrder("HuaWei 9000",10);
    }
}
