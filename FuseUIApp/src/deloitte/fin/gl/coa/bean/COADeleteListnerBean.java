package deloitte.fin.gl.coa.bean;

<<<<<<< HEAD
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
=======
>>>>>>> 06178e9f1a27d12969d3403ee2051f22b5de1649
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

<<<<<<< HEAD
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

=======
>>>>>>> 06178e9f1a27d12969d3403ee2051f22b5de1649
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
<<<<<<< HEAD
        
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
=======
>>>>>>> 06178e9f1a27d12969d3403ee2051f22b5de1649
    }

    public void rollbackData(ActionEvent actionEvent) {
        // Add event code here...
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        operationBinding.execute();
<<<<<<< HEAD
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
=======
>>>>>>> 06178e9f1a27d12969d3403ee2051f22b5de1649
        System.out.println("Roll Back from Confirmation Dialog Event");
    }
    

}
