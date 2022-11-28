package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class bean implements Serializable {
    private String v;

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}
