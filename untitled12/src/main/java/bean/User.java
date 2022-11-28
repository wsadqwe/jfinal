package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class User implements Serializable {
    private int id;
    private String name;
    //目标页面显示信息
    private String info;

    /**
     * 目标页面执行检查
     * @return
     */
    public String checkId(){
        if(this.id>=1&&this.id<=3){
            return "show";
        }else{
            return "none";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {

        this.info="User Id:"+this.id+"|"+"Name:"+this.name;
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
