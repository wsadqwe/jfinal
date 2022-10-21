import com.niit.entity.Employee;
import com.niit.service.EmpService;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void ts1(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        EmpService service=context.getBean(EmpService.class);
        Employee employee=new Employee();
        employee.setEname("m");
        employee.setEsalary(666666.66);
        service.saveEmp(employee);
    }

    @Test
    public void ts2(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        EmpService service=context.getBean(EmpService.class);
        Employee employee=new Employee();
        employee.setEid(2);
        employee.setEname("n");
        employee.setEsalary(555555.55);
        service.saveEmp(employee);
    }
    @Test
    public void ts3(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        EmpService service=context.getBean(EmpService.class);
        Employee employee=new Employee();
        employee.setEid(2);
        service.saveEmp(employee);
    }
    @Test
    public void ts4(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        EmpService service=context.getBean(EmpService.class);
        System.out.println(service.selectEmp(1).toString());
    }
    @Test
    public void ts5(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        EmpService service=context.getBean(EmpService.class);
        System.out.println(service.count());
    }
    @Test
    public void ts6(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        EmpService service=context.getBean(EmpService.class);
        System.out.println(service.All());
    }
}
