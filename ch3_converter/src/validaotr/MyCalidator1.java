package validaotr;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.swing.*;
import javax.xml.validation.Validator;

@FacesValidator(value="validaotr1")
public class MyCalidator1 implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o)throws ValidatorException{
        System.out.println(o.toString());
        if(o.toString().equals("qqq")){
            System.out.println("----");
        }
    }
}
