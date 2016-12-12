package deloitte.fin.gl.coa.bean;

import com.oracle.ptsdemo.utils.JSFUtils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;


import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;


public class COASelectSystemBean {
    private RichSelectOneChoice selectChoiceSystem;
    private String selectChoiceSystemString;

    public COASelectSystemBean() {
    }

    public BindingContainer getBindings(){
           return BindingContext.getCurrent().getCurrentBindingsEntry();
       }
    
    public void systemFilterAction(String name ) {
            //Get OperationBinding of method
            System.out.println("Start calling");
        OperationBinding ob;
        ob = getBindings().getOperationBinding("selectSystemValues");
        //Passing parameter to method -Get parameter map and use paramater name as key
            ob.getParamsMap().put("systemName", name);
            //Execute this method
            ob.execute();
            //Check for errors
            System.out.println("End in calling");
            if(ob.getErrors().isEmpty()){
                // Successfully Executed
                System.out.println("Submitted Successfully");
            }
        }
    
    public void filterSystem(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        System.out.println("Start Value");
        UIComponent component = valueChangeEvent.getComponent();
        component.processUpdates(FacesContext.getCurrentInstance());
        
        String systmeName = (String)JSFUtils.resolveExpression("#{backingBeanScope.COASelectSystemBean.selectChoiceSystemString}");
        
        System.out.println("Value is "+systmeName);
        systemFilterAction(systmeName);
    }

    public void setSelectChoiceSystem(RichSelectOneChoice selectChoiceSystem) {
        this.selectChoiceSystem = selectChoiceSystem;
    }

    public RichSelectOneChoice getSelectChoiceSystem() {
        return selectChoiceSystem;
    }

    public void setSelectChoiceSystemString(String selectChoiceSystemString) {
        this.selectChoiceSystemString = selectChoiceSystemString;
    }

    public String getSelectChoiceSystemString() {
        return selectChoiceSystemString;
    }
}
