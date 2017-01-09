package deloitte.fin.gl.coa.bean.pop;

import oracle.adf.model.BindingContext;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class SystemPopBean {
    public SystemPopBean() {
    }

    public void systemFetchListener(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        System.out.println("ID: " + popupFetchEvent.getLaunchSourceClientId() +
                           "\n");
       ADFContext.getCurrent().getPageFlowScope().put("forceActivate","true");

        if (popupFetchEvent.getLaunchSourceClientId().contains("cb1")) {
            BindingContainer bindings = getBindings();
            System.out.println("Got Binding: " + bindings + "\n");
            OperationBinding operationBinding =
                bindings.getOperationBinding("CreateInsert");
            System.out.println("Got Operation Binding: " + operationBinding +
                               "\n");
            operationBinding.execute();
        }
    }

    public void systemCancelListener(PopupCanceledEvent popupCanceledEvent) {
        // Add event code here...
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        operationBinding.execute();
        System.out.println("Roll Back from Pop Cancel Event");
        ADFContext.getCurrent().getPageFlowScope().put("forceActivate",
                                                            "false");
    }
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
        //return this.bindings;
    }
}
