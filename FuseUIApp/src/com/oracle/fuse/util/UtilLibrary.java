package com.oracle.fuse.util;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.model.QueryDescriptor;
import oracle.adf.view.rich.model.QueryModel;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class UtilLibrary {
    /*public UtilLibrary() {
        super();
    }*/

    public void cancelButton(ActionEvent actionEvent) {
        ADFPopupUtils.hideParentPopup(actionEvent.getComponent());

       BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Rollback");
        operationBinding.execute();
        System.out.println("Util Library: " + operationBinding + "\n");

    }

    public void saveAndClose(ActionEvent actionEvent) {


        //

        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Commit");
        operationBinding.execute();
        //refreshPage();
        System.out.println("Util Library save and close Binding: " +
                           operationBinding + "\n");
        if (!operationBinding.getErrors().isEmpty()){
            
            System.out.println("Errors in Commit");
            }
        
        //Add the Message normally using FacesContext::addMessage method
         FacesContext ctx = FacesContext.getCurrentInstance();
         FacesMessage fMessage= new FacesMessage(FacesMessage.SEVERITY_INFO,null,"Values Saved");
         ctx.addMessage(null, fMessage);
         
        //Create ExtendedRenderKitService to execute JavaScript after render response
        ExtendedRenderKitService erks = Service.getRenderKitService(ctx, ExtendedRenderKitService.class);
        StringBuilder builder= new StringBuilder();
        //Select the message using .auto-hide selector, wait for 3 seconds and hide it fast
         builder.append("jQuery('.coa-saveandclose').delay(2000).hide('fast');");
         erks.addScript(ctx, builder.toString());
        ADFPopupUtils.hideParentPopup(actionEvent.getComponent());
        
    }


    /* Delet */
    boolean reander = true;
    boolean rennder2 = true;

    public String clickButton() {
        setReander(false);
        return null;
    }

    public void setReander(boolean reander) {
        this.reander = reander;
    }

    public boolean isReander() {
        return reander;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void closePopup(ActionEvent actionEvent) {
        // Add event code here...
        ADFPopupUtils.hideParentPopup(actionEvent.getComponent());
    }


}
