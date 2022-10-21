package nxu.it.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Kv;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

/*
第一个参数用来指定，当前Controller能处理哪些url
第二个参数用来指定，当前controller使用的模板存放在哪个目录下
默认情况下第二个参数可以不指定，即使用第一个参数的值
/代表根目录  /src/main/webapp
*/

@Path(value = "/", viewPath = "/")
public class MainController extends Controller {
    public void index() {
        renderHtml("<h2>It works!</h2>");
    }
    public void hello() {
//         String username=getPara("username","无名氏");
//        renderHtml("<h2>你好,"+username+"</h2>");
        renderQrCode("你好马慧",240,240);
    }

    public void register(){
        List<String> hometown=List.of("北京","天津","宁夏","陕西","甘肃","青海");
        /*将hometown传递过去*/
        set("hometown",hometown);

        List<String> hobbies = List.of("学习","跑步","游泳");
        set("hobbies",hobbies);

        renderFreeMarker("register.ftl");

    }

    public void bye() {

      /*  String username=getPara("username");
        renderHtml("<h2>再见,"+username+"</h2>");*/
        renderQrCode("再见马慧",240,240);
    }

    public void today(){
//       String jsonStr="{\"year\": 2022, \"mouth\": 10, \"day\": 8, \"hour\": 9,\"minute\": 50, \"weekday\": \"Saturday\"}";
        LocalDateTime now = LocalDateTime.now();
        Kv jsonDate = Kv.create()
                .set("year",now.getYear())
                .set("mouth",now.getMonthValue())
                .set("day",now.getDayOfMonth())
                .set("hour",now.getHour())
                .set("minute",now.getMinute())
                .set("weekday",now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINA));
//        renderJson(jsonStr);
        renderJson(jsonDate);
    }

    public void doRegister(){
        renderHtml("<h2>It doRegister!</h2>");

    }

    public void loginCheck(){
        renderHtml("<h2>It login!</h2>");
    }

    public void login(){
        renderFreeMarker("login.ftl");

    }
}
