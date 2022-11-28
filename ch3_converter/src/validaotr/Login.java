package validaotr;


import com.sun.naming.internal.FactoryEnumeration;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class Login implements Serializable {

    private String user;
    private String pass;
    private String phone;
    private String email;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void doYouWantLogin(FacesContext context, UIComponent uiCompoent, Object value) {
        String val = value.toString();
        System.out.println(val);

        if(val.length()<8){
            FacesMessage.setSummary("密码太短!");
            FacesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new Vali
        }

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
