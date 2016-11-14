package deloitte.fin.gl.coa.bean;

import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;


import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.util.ResetUtils;

import oracle.binding.BindingContainer;

import oracle.jbo.ViewObject;

public class COAListnersBean {
    public COAListnersBean() {
    }

    public void onChangeSystem(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        valueChangeEvent.getComponent().processUpdates(FacesContext.getCurrentInstance());
        System.out.println("OldValue: "+ valueChangeEvent.getOldValue());
        System.out.println("NewValue: "+ valueChangeEvent.getNewValue());
        UIViewRoot viewRoot =  FacesContext.getCurrentInstance().getViewRoot();
        UIComponent component1 = viewRoot.findComponent("ruleNameId");
        
    }

    public void clearForm(ActionEvent actionEvent) {
        // Add event code here...
        BindingContext bindingctx=BindingContext.getCurrent();  
        BindingContainer binding = bindingctx.getCurrentBindingsEntry();  
        DCBindingContainer bindingsImpl = (DCBindingContainer) binding;  
        DCIteratorBinding dciter = bindingsImpl.findIteratorBinding("COAFindFieldLOVVO1Iterator");  
        ViewObject vo=dciter.getViewObject();
        String name = vo.getName();
        System.out.println("VO Name: "+name);
        vo.executeQuery();
        /*
        UIComponent uiComp = actionEvent.getComponent().getParent().getParent().findComponent("pgl3");
        System.out.println("Get UI Compene "+uiComp.findComponent("it1"));
        if (uiComp == null)
           {
               // if not we use the button which we bound to this bean

               System.out.println("Component Null");

           }
           else
           {
               System.out.println("Component not Null");
               UIComponent uiComp2 =  uiComp.findComponent("it1");
                uiComp2.setRendered(false);
           }
        ResetUtils.reset(uiComp.findComponent("it1"));
*/
       
    }
}
