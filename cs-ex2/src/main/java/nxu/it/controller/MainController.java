package nxu.it.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Kv;
import nxu.it.Result;
import nxu.it.Student;

import java.time.LocalDateTime;
import java.util.List;


@Path(value = "/", viewPath = "/")
public class MainController extends Controller {
    public void index() {
        renderHtml("<h2>It works!</h2>");
    }

    public void hello() {
        String username = get("username", "无名氏");
        Integer age = getInt("age");
        set("username", username);
        set("age", age);
        List<Student> students = List.of(
                new Student("001", "赵大", "男", 21),
                new Student("002", "王二", "女", 19),
                new Student("003", "张三", "男", 22),
                new Student("004", "李四", "女", 20)
        );
        set("students", students);

        // renderFreeMarker("hello.ftl"); //注意 此处 字符串是要渲染的模板的路径 并非要输出的内容
        //renderTemplate("hello.ftl"); //调用jfinal的模板输出  render("hello.ftl");
        render("hello.html"); //和上面在默认情况下一样，会调用默认的模板引擎 如果不配置的话，默认就是采用jfinal的enjoy模板引擎
    }

    public void bye() {
        renderQrCode("再见", 240, 240);

    }

    public void json() {
        //  String jsonStr = "{\"code\": 200,\"message\": \"请求成功\",\"data\" : \"数据\"}";
        // Map<String, Object> jsonData = new HashMap<>()
      /*  Kv jsonData = Kv.create()
                .set("code", 200)
                .set("message", "请求成功")
                .set("data", "你好" + get("username"));
        renderJson(jsonData);
       */

        Result<String> result = new Result("你好" + get("username"));
        renderJson(result);
    }

    public void today() {
        // String jsonStr = "{\"year\": 2021,\"month\": 4, \"day\": 14, \"hour\": 9, \"minute\": 15, \"weekday\": \"Wednesday\"}";
        LocalDateTime now = LocalDateTime.now();
        Kv jsonData = Kv.create()
                .set("year", now.getYear());
        renderJson(jsonData);
    }

}
