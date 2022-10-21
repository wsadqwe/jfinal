import com.niit.autoinject.Room;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/10/6 8:34
 * @Description
 **/
public class RoomTest {
    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean5.xml");
        Room room = ctx.getBean(Room.class);
        System.out.println(room.toString());
    }

    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean5.xml");
        Room room = ctx.getBean(Room.class);
        System.out.println(room.toString());
    }
}
