package bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class Bean implements Serializable {
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public String loginJudge(){
        int len=this.user.length();
        if(len>3){
            return "success";
        }else{
            return "error";
        }
    }
}
