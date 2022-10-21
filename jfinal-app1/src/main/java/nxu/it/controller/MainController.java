package nxu.it.controller;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;

import java.time.LocalDateTime;
import java.util.*;

@Path(value = "/",viewPath = "/")
public class MainController extends Controller {
    public void index(){
       renderHtml("<h2>It works!</h2>");
    }
    public void hello(){
        renderQrCode("唱，跳，rap",200,200,'M');
    }
    public void bye(){
        renderQrCode("哎呦，你干嘛",200,200,'M');
    }
    public void today(){
        Map<String ,Object> today = new LinkedHashMap<>();
        LocalDateTime now = LocalDateTime.now();
        today.put("year",now.getYear());
        today.put("month",now.getMonthValue());
        today.put("day",now.getDayOfMonth());
        today.put("hour",now.getHour());
        today.put("minute",now.getMinute());
        today.put("weekday",now.getDayOfWeek());
        renderJson(today);
    }
    public  void register(){
        List<String> hometownList=List.of("北京", "天津", "上海", "重庆", "宁夏",
                "陕西","甘肃","青海","内蒙","四川","河南","河北");
        set("hometownList",hometownList);
        List<String> hobbies= Arrays.asList("唱", "跳", null, "篮球");
        set("hobbies",hobbies);
        renderFreeMarker("register.ftl");
    }
    public void doRegister(){
        String username=get("username");
        String password=get("password");
        Integer gender=getInt("gender");
        String hometown=get("hometown");
        Integer hobby=getInt("hobby");
        set("username",username);
        set("password",password);
        set("gender",gender);
        set("hometown",hometown);
        set("hobby",hobby);
        renderTemplate("register-result.html");
        //   renderHtml("注册成功");
    }
    public  void login(){
        renderFreeMarker("login.ftl");
    }
    public void loginCheck(){
        String username=get("username");
        String password=get("password");
        set("username",username);
        set("password",password);
        renderTemplate("login-result.html");
    }
}
