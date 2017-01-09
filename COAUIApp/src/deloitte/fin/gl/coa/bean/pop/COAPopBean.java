package deloitte.fin.gl.coa.bean.pop;

import oracle.adf.model.BindingContext;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class COAPopBean {
    public COAPopBean() {
    }

    public void editPopFetch(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        System.out.println("ID: "+popupFetchEvent.getLaunchSourceClientId()+"\n");
               ADFContext.getCurrent().getPageFlowScope().put("forceActivate", "true");
               
               if (popupFetchEvent.getLaunchSourceClientId().contains("cb4")) {
                   BindingContainer bindings = getBindings();
                   System.out.println("Got Binding: "+bindings+"\n");
                   OperationBinding operationBinding =
                       bindings.getOperationBinding("CreateInsert");
                   System.out.println("Got Operation Binding: "+operationBinding+"\n");
                   operationBinding.execute();
               }
    }

    public void editPopCancel(PopupCanceledEvent popupCanceledEvent) {
        // Add event code here...
        BindingContainer bindings = getBindings();
           OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
           operationBinding.execute();
             ADFContext.getCurrent().getPageFlowScope().put("forceActivate", "false");
    }
    
    public BindingContainer getBindings() {
           /*
           if (this.bindings == null) {
                      FacesContext fc = FacesContext.getCurrentInstance();
                      this.bindings =
                              (BindingContainer)fc.getApplication().evaluateExpressionGet(fc, "#{bindings}",
                                  BindingContainer.class);
                  }
    */
           return BindingContext.getCurrent().getCurrentBindingsEntry();
           //return this.bindings;
       }
}
