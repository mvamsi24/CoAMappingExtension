package deloitte.fin.gl.coa.bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class COADeleteListnerBean {
    

    public COADeleteListnerBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String cb2_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void commitData(ActionEvent actionEvent) {
        // Add event code here...
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        operationBinding.execute();
        //refreshPage();
        System.out.println("Cnfirmation Dialog Message " +
                           operationBinding + "\n");
        
        //Add the Message normally using FacesContext::addMessage method
         FacesContext ctx = FacesContext.getCurrentInstance();
         FacesMessage fMessage= new FacesMessage(FacesMessage.SEVERITY_INFO,null,"Record Deleted");
         ctx.addMessage(null, fMessage);
         
        //Create ExtendedRenderKitService to execute JavaScript after render response
        ExtendedRenderKitService erks = Service.getRenderKitService(ctx, ExtendedRenderKitService.class);
        StringBuilder builder= new StringBuilder();
        //Select the message using .auto-hide selector, wait for 3 seconds and hide it fast
         builder.append("jQuery('.coa-saveandclose').delay(1000).hide('fast');");
         erks.addScript(ctx, builder.toString());
    }

    public void rollbackData(ActionEvent actionEvent) {
        // Add event code here...
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        operationBinding.execute();
        //Add the Message normally using FacesContext::addMessage method
         FacesContext ctx = FacesContext.getCurrentInstance();
         FacesMessage fMessage= new FacesMessage(FacesMessage.SEVERITY_INFO,null,"Record Rollbacked");
         ctx.addMessage(null, fMessage);
         
        //Create ExtendedRenderKitService to execute JavaScript after render response
        ExtendedRenderKitService erks = Service.getRenderKitService(ctx, ExtendedRenderKitService.class);
        StringBuilder builder= new StringBuilder();
        //Select the message using .auto-hide selector, wait for 3 seconds and hide it fast
         builder.append("jQuery('.coa-saveandclose').delay(2000).hide('fast');");
         erks.addScript(ctx, builder.toString());
        System.out.println("Roll Back from Confirmation Dialog Event");
    }
    

}
