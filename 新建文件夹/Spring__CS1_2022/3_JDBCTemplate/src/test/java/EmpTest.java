import com.niit.entity.Employee;
import com.niit.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author
 * @Date 2022/10/13 14:42
 * @Description
 **/
public class EmpTest {
    @Test
    public void test01(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        EmpService service = context.getBean(EmpService.class);
        Employee employee = new Employee();
        employee.setEname("某不知名青年");  employee.setEsalary(2675.65);
        service.saveEmp(employee);
    }
    @Test
    public void test02(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        EmpService service = context.getBean(EmpService.class);
        Employee employee = new Employee();
        employee.setEid(2);  employee.setEname("Pikaqiu"); employee.setEsalary(99999.65);
        service.updateEmp(employee);
    }
    @Test
    public void test03(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        EmpService service = context.getBean(EmpService.class);
        Employee employee = new Employee();
        employee.setEid(3);
        service.deleteEmp(employee);
    }
    @Test
    public void test04(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        EmpService service = context.getBean(EmpService.class);
        System.out.println(service.selectEmp(1).toString());;
    }

    @Test
    public void test05(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        EmpService service = context.getBean(EmpService.class);
        System.out.println(service.slectCount());;
    }

    @Test
    public void test06(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        EmpService service = context.getBean(EmpService.class);
        System.out.println(service.slectAll().toString());;
    }
}
