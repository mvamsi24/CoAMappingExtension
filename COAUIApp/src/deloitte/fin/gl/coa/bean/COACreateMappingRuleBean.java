package deloitte.fin.gl.coa.bean;

import com.oracle.fuse.util.ADFPopupUtils;

import javax.faces.application.FacesMessage;
import javax.faces.component.UISelectItems;

import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectManyChoice;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.adf.view.rich.component.rich.output.RichSpacer;
import oracle.adf.view.rich.event.LaunchPopupEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
 

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUCtrlListBinding;

import org.apache.myfaces.trinidad.component.UIXGroup;
import org.apache.myfaces.trinidad.event.AttributeChangeEvent;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
 
import org.apache.myfaces.trinidad.util.Service;

public class COACreateMappingRuleBean {
    private UISelectItems si2;
    private RichSelectManyChoice smc2;
    private UISelectItems si1;
    private RichSelectManyChoice smc1;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichPanelFormLayout pfl1;
    private RichPanelFormLayout pfl2;
    private RichPanelFormLayout pfl3;
    private UIXGroup g1;
    private RichCommandButton cb1;
    private UIXGroup g2;
    private RichOutputText ot1;
    private RichSelectOneChoice soc1;
    private UISelectItems si4;
    private RichSelectOneChoice soc2;
    private UISelectItems si5;
    private RichCommandButton cb2;
    private RichPanelBox pb3;
    private RichPanelBox pb1;
    private RichSpacer s2;


    public COACreateMappingRuleBean() {
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

    public String cb1_action() {
        System.out.println("User clicked on save button ");
        String sourceSystemStr = null;
        String targetSystemStr = null;
        
        String ruleNameStr =it6.getValue().toString();
        String descStr = it4.getValue().toString();
        String seqStr = it5.getValue().toString(); 
        
        //SourceSystemLovVO1
        
        System.out.println("Rule Name -->"+ ruleNameStr);
        System.out.println("Desc Name -->"+ descStr);
        System.out.println("Seq Name -->"+ seqStr);        
        
        
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
             
             
          
        //Segment Info  
          JUCtrlListBinding splHandlBinding =  (JUCtrlListBinding) binding.get("COATargetSegmentLOVVO1");
          Object[] tergetSegObj  =  splHandlBinding.getSelectedValues();
          Number [] targetSegmentNoArray = new Number[tergetSegObj.length] ;
          System.out.println("Target  System List ");
          for (int i=0 ; i <tergetSegObj.length;i++)
          {
               targetSegmentNoArray[i] = (Number)tergetSegObj[i];
               System.out.println(" Target Value -->" + tergetSegObj[i]);
          }
          
          
          
          JUCtrlListBinding splHandlBinding1 =  (JUCtrlListBinding) binding.get("COASourceSegmentLOVVO1");
          Object [] sourceSegmentObj = (Object[])splHandlBinding1.getSelectedValues();
          Number [] sourceSegmentNoArray = new Number[sourceSegmentObj.length] ;
          System.out.println("Source System List ");
          for (int i=0 ; i <sourceSegmentObj.length;i++)
          {
              sourceSegmentNoArray[i] = (Number)sourceSegmentObj[i];
             System.out.println(" Source Value -->" + sourceSegmentObj[i]);
          }
          //Segment Info
             
             
          BindingContext bCtx = BindingContext.getCurrent();
          DCBindingContainer DcCon = (DCBindingContainer)bCtx.getCurrentBindingsEntry();
          //Get OperationBinding of method
          System.out.println("Invoking AM Method .....");
          OperationBinding ob= DcCon.getOperationBinding("callCOACreatingMappingRuleProc");
          
          ob.getParamsMap().put("sourceSystemStr", sourceSystemStr);
          ob.getParamsMap().put("targetSystemStr", targetSystemStr);
          ob.getParamsMap().put("ruleNameStr", ruleNameStr);
          ob.getParamsMap().put("descStr", descStr);
          ob.getParamsMap().put("seqStr", seqStr);
          ob.getParamsMap().put("sourceSegArray", sourceSegmentNoArray);
          ob.getParamsMap().put("targetSeqArray", targetSegmentNoArray);
          
        //Passing parameter to method -Get parameter map and use paramater name as key
        //Execute this method
        ob.execute();
        
        
      /*  String messageText= "Data Saved Successfully"; ;
               FacesMessage fm = new FacesMessage(messageText);

               fm.setSeverity(FacesMessage.SEVERITY_INFO);
               FacesContext context = FacesContext.getCurrentInstance();
               context.addMessage(null, fm);
          */   
      
        calljqHelper("$.growl.notice({ message: \"Record Saved\" });");
        
        ADFPopupUtils.hideParentPopup(cb1);      
      
        return null;
    }

    public void calljqHelper(String script) {
        FacesContext context = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks = Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
        erks.addScript(context, script);
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    } 
    
    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }


    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }


    public void setCb2(RichCommandButton cb2) {
        this.cb2 = cb2;
    }

    public RichCommandButton getCb2() {
        return cb2;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }


    public void setPb3(RichPanelBox pb3) {
        this.pb3 = pb3;
    }

    public RichPanelBox getPb3() {
        return pb3;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public String cb2_action() {
        ADFPopupUtils.hideParentPopup(cb2);
        return null;
    }
    
    public void onLovLaunch(LaunchPopupEvent launchPopupEvent) {
     BindingContext bctx = BindingContext.getCurrent();
     BindingContainer bindings = bctx.getCurrentBindingsEntry();
    
    }
 
    public void targetSystemValueChangeEvent(ValueChangeEvent valueChangeEvent)
    {
        String targetSystemStr = (String)soc2.getValue(); 
        System.out.println("User Change Target Lov Value -->"+ soc2.getValue());
        
        BindingContext bCtx = BindingContext.getCurrent();
        DCBindingContainer DcCon = (DCBindingContainer)bCtx.getCurrentBindingsEntry();
        System.out.println("Calling Target ");
                                   
   //     DcCon.getOperationBinding("ExecuteWithParams1").execute();
        
        BindingContext bindingctx=BindingContext.getCurrent();  
        BindingContainer binding = bindingctx.getCurrentBindingsEntry();  
        DCBindingContainer bindingsImpl = (DCBindingContainer) binding;  
        
        DCIteratorBinding dciter = bindingsImpl.findIteratorBinding("COATargetSegmentLOVVO1Iterator");  
        ViewObject vo=dciter.getViewObject();
        vo.setNamedWhereClauseParam("pTargetSystemName", targetSystemStr);
        vo.executeQuery();
        
        
        
    }
    
    
    public void sourceSystemValueChangeEvent(ValueChangeEvent valueChangeEvent)
    {
        String sourceSystemStr = (String)soc1.getValue(); 
        System.out.println("User Change Source Lov Value -->"+ soc1.getValue());
        
                if(soc1.getValue()!=null)
                {
//                          if(valueChangeEvent.getNewValue()!=valueChangeEvent.getOldValue())   
//                          {
//                              this.smc1.setValue(null);
//                              
//                        }
                    
//                    System.out.println("Setting Source Segments to NULL");
//                    smc1.setValue(null);
                  
                  // String sourceNameEL =(String)ADFUtil.evaluateEL(" #{bindings.COASourceSystemLOVVO1.inputValue}"); 
                    BindingContext bCtx = BindingContext.getCurrent();
                    DCBindingContainer DcCon = (DCBindingContainer)bCtx.getCurrentBindingsEntry();
                    System.out.println("Calling Execution");
                                               
                   // DcCon.getOperationBinding("ExecuteWithParams").execute();
               
               
                    BindingContext bindingctx=BindingContext.getCurrent();  
                    BindingContainer binding = bindingctx.getCurrentBindingsEntry();  
                    DCBindingContainer bindingsImpl = (DCBindingContainer) binding;  
                    
                    DCIteratorBinding dciter = bindingsImpl.findIteratorBinding("COASourceSegmentLOVVO1Iterator");  
                    ViewObject vo=dciter.getViewObject();
                    vo.setNamedWhereClauseParam("pSourceSystem", sourceSystemStr);
                    vo.executeQuery();
                    
 
                    
                    
                    /*
                    //Get OperationBinding of method
                    System.out.println("Invoking AM Method ....setSourceSegmentLov.");
                    OperationBinding ob= DcCon.getOperationBinding("setSourceSegmentLov");                   
                    ob.getParamsMap().put("sourceSystemStr", sourceSystemStr);
                    //Passing parameter to method -Get parameter map and use paramater name as key
                    //Execute this method
                    ob.execute();
                    */
                }
      }


}
