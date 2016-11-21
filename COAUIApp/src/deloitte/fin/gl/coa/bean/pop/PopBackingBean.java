package deloitte.fin.gl.coa.bean.pop;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class PopBackingBean {
    public PopBackingBean() {
    }

    public void popFetchListner(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        System.out.println("ID: " + popupFetchEvent.getLaunchSourceClientId() +
                           "\n");
        //ADFContext.getCurrent().getPageFlowScope().put("forceActivate",
          //                                             "true");

        if (popupFetchEvent.getLaunchSourceClientId().contains("cb3")) {
            BindingContainer bindings = getBindings();
            System.out.println("Got Binding: " + bindings + "\n");
            OperationBinding operationBinding =
                bindings.getOperationBinding("CreateInsert");
            System.out.println("Got Operation Binding: " + operationBinding +
                               "\n");
            operationBinding.execute();
        }
    }

    public void popCancelListner(PopupCanceledEvent popupCanceledEvent) {
        // Add event code here...
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        operationBinding.execute();
        System.out.println("Roll Back from Pop Cancel Event");
        //ADFContext.getCurrent().getPageFlowScope().put("forceActivate",
          //                                             "false");
        /*
          FacesContext ctx = FacesContext.getCurrentInstance();
          FacesMessage fMessage= new FacesMessage(FacesMessage.SEVERITY_INFO,null,"Values Saved");
          ctx.addMessage(null, fMessage);
          
          //Create ExtendedRenderKitService to execute JavaScript after render response
          ExtendedRenderKitService erks = Service.getRenderKitService(ctx, ExtendedRenderKitService.class);
          StringBuilder builder= new StringBuilder();
          //Select the message using .auto-hide selector, wait for 3 seconds and hide it fast
          builder.append("jQuery('.coa-saveandclose').delay(3000).hide('fast');");
          erks.addScript(ctx, builder.toString());
*/
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
        //return this.bindings;
    }
}
