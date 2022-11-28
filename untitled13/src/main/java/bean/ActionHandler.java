package bean;


import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class ActionHandler implements ActionListener {


    @Override
    public void processAction(ActionEvent actionEvent) throws AbortProcessingException {
        System.out.println("ActionEvent:"+actionEvent.getComponent().getClientId().toString()+"发生");


    }
}
