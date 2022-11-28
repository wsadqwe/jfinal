import com.sun.org.glassfish.gmbal.ManagedData;

import javax.xml.ws.RequestWrapper;
import java.util.Date;

@ManagedBean(name="bean1")
@RequestScoped
public class UserBean implements Serializable{

    private double amount;
    private Date date;
    private String info;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }

    public Date getDate() {
        if(null==date){
            date=new Date();
        }
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
