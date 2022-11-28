package bean;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class PhaseHandler implements PhaseListener {
    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        if(phaseEvent.getPhaseId().toString().equals(PhaseId.PROCESS_VALIDATIONS))
            System.out.println("值更改事件发生");
        System.out.println("after "+phaseEvent.getPhaseId()+"ID:"+phaseEvent.getPhaseId().toString()+" 以发生");

    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        if(phaseEvent.getPhaseId().toString().equals(PhaseId.PROCESS_VALIDATIONS))
            System.out.println("操作事件发生");
        System.out.println("before "+phaseEvent.getPhaseId()+" 未发生");
    }

    /**
     * Jsf的生命周期有6个阶段，
     * @return
     */

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
