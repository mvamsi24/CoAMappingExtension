package deloitte.fin.gl.coa.bean;

import javax.faces.application.FacesMessage;

import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectManyChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class COACreateMappingRule {

    private UISelectItems si2;
    private RichSelectManyChoice smc2;
    private UISelectItems si1;
    private RichSelectManyChoice smc1;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichPanelFormLayout pfl1;
    private RichPanelFormLayout pfl2;
    
    private UIXGroup g1;
    private RichCommandButton cb2;
    private RichCommandButton cb1;
    private UIXGroup g2;
    private RichOutputText ot1;

    public String cb1_action() {
    
    System.out.println("User Clicked on Button");    
        String ruleNameStr =it4.getValue().toString();
        String descStr = it5.getValue().toString();
        String seqStr = it6.getValue().toString(); 
        
        //SourceSystemLovVO1
        
        System.out.println("Rule Name -->"+ ruleNameStr);
        System.out.println("Desc Name -->"+ descStr);
        System.out.println("Seq Name -->"+ seqStr);        
        
        return null;
    }

    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
    }

    public void setSmc2(RichSelectManyChoice smc2) {
        this.smc2 = smc2;
    }

    public RichSelectManyChoice getSmc2() {
        return smc2;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setSmc1(RichSelectManyChoice smc1) {
        this.smc1 = smc1;
    }

    public RichSelectManyChoice getSmc1() {
        return smc1;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setCb2(RichCommandButton cb2) {
        this.cb2 = cb2;
    }

    public RichCommandButton getCb2() {
        return cb2;
    }

    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    public RichCommandButton getCb1() {
        return cb1;
    }

    public void setG2(UIXGroup g2) {
        this.g2 = g2;
    }

    public UIXGroup getG2() {
        return g2;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public String cb1_action2() {
       
        System.out.println("User Clicked on Button ");
        String ruleNameStr =it4.getValue().toString();
        String descStr = it5.getValue().toString();
        String seqStr = it6.getValue().toString(); 
        
        //SourceSystemLovVO1
        
        System.out.println("Rule Name -->"+ ruleNameStr);
        System.out.println("Desc Name -->"+ descStr);
        System.out.println("Seq Name -->"+ seqStr);        
        
        return null;
    }
}
