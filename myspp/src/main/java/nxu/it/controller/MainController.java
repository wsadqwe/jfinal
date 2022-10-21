package nxu.it.controller;

import com.jfinal.core.Controller;

public class MainController extends Controller {

    public void hello(){
        renderHtml("<h1>hello</h1>");
    }


    public void bye() {
        renderHtml("<h1>再见<.h1>");
    }
}
