package deloitte.fin.gl.coa.bean;

import javax.faces.component.UISelectItems;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.view.rich.component.rich.RichPanelWindow;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.binding.OperationBinding;

import oracle.jbo.uicli.binding.JUCtrlListBinding;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class COAMappingRule {
    private RichTable t1;
    private RichPanelGroupLayout pgl2;
    private RichRegion r1;
    private RichPanelWindow pw1;
    private RichPopup p1;
    private RichCommandButton cb3;
    private RichCommandButton cb1;
    private RichPanelGroupLayout pgl3;
    private UISelectItems si2;
    private RichSelectOneChoice soc2;
    private UISelectItems si1;
    private RichSelectOneChoice soc1;
    private RichInputText sequenceITID;
    private RichInputText descriptionITID;
    private RichInputText ruleInputID;
    private UIXGroup g2;
    private RichPanelFormLayout pfl1;
    private RichPanelGroupLayout pgl1;
    private UIXGroup g1;
    private RichOutputText ot2;
    private RichPanelGroupLayout panelGroupLayout1;
    private RichCommandButton cb2;

    public COAMappingRule() {
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setR1(RichRegion r1) {
        this.r1 = r1;
    }

    public RichRegion getR1() {
        return r1;
    }

    public void setPw1(RichPanelWindow pw1) {
        this.pw1 = pw1;
    }

    public RichPanelWindow getPw1() {
        return pw1;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setCb3(RichCommandButton cb3) {
        this.cb3 = cb3;
    }

    public RichCommandButton getCb3() {
        return cb3;
    }


    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    public RichCommandButton getCb1() {
        return cb1;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSequenceITID(RichInputText it3) {
        this.sequenceITID = it3;
    }

    public RichInputText getSequenceITID() {
        return sequenceITID;
    }

    public void setDescriptionITID(RichInputText it2) {
        this.descriptionITID = it2;
    }

    public RichInputText getDescriptionITID() {
        return descriptionITID;
    }

    public void setRuleInputID(RichInputText it1) {
        this.ruleInputID = it1;
    }

    public RichInputText getRuleInputID() {
        return ruleInputID;
    }

    public void setG2(UIXGroup g2) {
        this.g2 = g2;
    }

    public UIXGroup getG2() {
        return g2;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setOt2(RichOutputText ot2) {
        this.ot2 = ot2;
    }

    public RichOutputText getOt2() {
        return ot2;
    }

    public void setPanelGroupLayout1(RichPanelGroupLayout panelGroupLayout1) {
        this.panelGroupLayout1 = panelGroupLayout1;
    }

    public RichPanelGroupLayout getPanelGroupLayout1() {
        return panelGroupLayout1;
    }

     

    public String cb1_action() {
        // Add event code here...
        return null;
    }

    public String cb3_action() {
        // Add event code here...
        return null;
    }
 

    public void setCb2(RichCommandButton cb2) {
        this.cb2 = cb2;
    }

    public RichCommandButton getCb2() {
        return cb2;
    }

    public String cb2_action() {
       System.out.println("User Clicked on Search Button");
       String seqStr = (String)sequenceITID.getValue(); 
       String ruleNameStr = (String)ruleInputID.getValue();
       String descStr = (String)descriptionITID.getValue();
       String sourceSystemStr= null , targetSystemStr= null ; 
        BindingContext bc = BindingContext.getCurrent();
        DCBindingContainer binding =   (DCBindingContainer) bc.getCurrentBindingsEntry();
        
        JUCtrlListBinding sourSystemListBinding =  (JUCtrlListBinding) binding.get("COASourceSystemLOVVO1");
        Object[] sourceSystemObj = sourSystemListBinding.getSelectedValues();
        System.out.println("Seleted Source System ");
        sourceSystemStr = (String)sourceSystemObj[0];
             System.out.println(" Source System Value -->" + sourceSystemStr);
        
        JUCtrlListBinding targetSystemListBinding =  (JUCtrlListBinding) binding.get("COATargetSystemLOVVO1");
        Object[] targetSystemObj = targetSystemListBinding.getSelectedValues();
        System.out.println("Target Source System ");
        targetSystemStr = (String)targetSystemObj[0];
             System.out.println(" Target System Value -->" + targetSystemStr);   
             
             
       
        System.out.println("Sequence Name -->"+seqStr);
        System.out.println("ruleNameStr -->"+ruleNameStr);
        System.out.println("descStr Name -->"+descStr);
        System.out.println("Source System-->"+ sourceSystemStr);
        System.out.println("Target System -->" + targetSystemStr);
        
        
        BindingContext bCtx = BindingContext.getCurrent();
        DCBindingContainer DcCon = (DCBindingContainer)bCtx.getCurrentBindingsEntry();
        //Get OperationBinding of method
        OperationBinding ob= DcCon.getOperationBinding("executeCOAMappingRuleVO");
     //public void executeCOAMappingRuleVO(String ruleStr, String descStr, String seqStr, String sourceStr, String destStr)   
        ob.getParamsMap().put("ruleStr", ruleNameStr);
        ob.getParamsMap().put("descStr", descStr);
        ob.getParamsMap().put("seqStr", seqStr);
        ob.getParamsMap().put("sourceStr", sourceSystemStr);
        ob.getParamsMap().put("targetSystemStr", targetSystemStr);
        ob.execute();
        return null;
    }
}
