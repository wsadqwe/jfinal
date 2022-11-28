package bean;


import com.sun.faces.action.RequestMapping;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestMapping
public class ValueBean {
    private HtmlInputText id,t1,t2,t3;

    public void autoFill(ValueChangeEvent valueChangeEvent){
        String idval =valueChangeEvent.getNewValue().toString();
        StringBuilder str1=new StringBuilder();

        updateDataById(idval,str1);
        t1.setValue(str1);
    }

    public void updateDataById(String id,StringBuilder s1){
        if(id.equals("001")){
            s1.append("");
        }else if(id.equals("002")){
            s1.append(" ");
        }else if(id.equals("003")) {
            s1.append("android");
        }
    }

    public HtmlInputText getId() {
        return id;
    }

    public void setId(HtmlInputText id) {
        this.id = id;
    }

    public HtmlInputText getT1() {
        return t1;
    }

    public void setT1(HtmlInputText t1) {
        this.t1 = t1;
    }

    public HtmlInputText getT2() {
        return t2;
    }

    public void setT2(HtmlInputText t2) {
        this.t2 = t2;
    }

    public HtmlInputText getT3() {
        return t3;
    }

    public void setT3(HtmlInputText t3) {
        this.t3 = t3;
    }
}
