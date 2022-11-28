package bean;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class ValueChangeHandler implements ValueChangeListener {
    @Override
    public void processValueChange(ValueChangeEvent valueChangeEvent) throws AbortProcessingException {
        System.out.println("VakueChangeEvent:oldValue="+valueChangeEvent.getOldValue());
        System.out.println("VakueChangeEvent:newValue="+valueChangeEvent.getNewValue());

    }
}
