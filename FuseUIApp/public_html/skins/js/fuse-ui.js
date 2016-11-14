        function setObjectNavigatorMode_Springboard(actionEvent)
        {
          actionEvent.cancel();
          var eventSource = actionEvent.getSource();
          var object_navigator = eventSource.findComponent("object-navigator");
              object_navigator.setProperty('displayMode', 'grid');
         
        }
        
         function setObjectNavigatorMode_Iconstrip(actionEvent)
        {
          actionEvent.cancel();
          var eventSource = actionEvent.getSource();
          var object_navigator = eventSource.findComponent("object-navigator");
              object_navigator.setProperty('displayMode', 'strip');
        }
        
        function objectNavigatorPropertyChangeListener(event)
        {
            var nav = event.getSource();
                      event.cancel();
                      objectNavigatorPropertyChangeListener_Helper()
        }
            
        function objectNavigatorPropertyChangeListener_Helper()
        { 
            var nav=AdfPage.PAGE.findComponentByAbsoluteId("pt1:object-navigator");
            var announcements=AdfPage.PAGE.findComponentByAbsoluteId("pt1:announcements-container");
            var navigation=AdfPage.PAGE.findComponentByAbsoluteId("pt1:navigation-container");
            var logo=AdfPage.PAGE.findComponentByAbsoluteId('pt1:logo');
            var strip_mode=nav.getDisplayMode();

            if(strip_mode=="strip")
            {
                announcements.setStyleClass("announcements-strip-mode-size");
                navigation.setStyleClass("springboard-strip-mode-size");
                logo.setStyleClass("logo-strip-mode-size");
            }
            else    
            {   announcements.setStyleClass("announcements-grid-mode-size");
                navigation.setStyleClass("springboard-grid-mode-size");
                logo.setStyleClass("logo-grid-mode-size");
                
            }
        }        
        
        
        
        function handleObjectNavigatorSelection(actionEvent)
        {
          //actionEvent.cancel();
          var eventSource = actionEvent.getSource();
          var actionName = eventSource.getProperty("actionName");
          
          console.log(actionEvent);
          console.log(eventSource);
          console.log(actionName);
          
          return actionName;
          
        
        }
        
//Custom Functions

/**
 * Client listener which will kick off the animation to fade the dialog and register
 * a callback to correctly reset the popup once the animation is complete
 * @param event
 */
function animateFadingPopup(event) {
  var fadePopup = event.getSource();
  var fadeCandidate = false;
  //Ensure that the popup is initially Opaque
  //This handles the situation where the user has dismissed
  //the popup whilst it was in the process of fading
  var fadeContainer = findFadeContainer(fadePopup);
  if (fadeContainer != null) {
    fadeCandidate = true;
    fadeContainer.setStyleClass("popupFadeReset");
  }
  //Only continue if we can actually fade this popup
  if (fadeCandidate) {
    //See if a delay has been specified
    var waitTimeSeconds = event.getSource().getProperty('preFadeDelay');
    //Default to 5 seconds if not supplied
    if (waitTimeSeconds == undefined) {
      waitTimeSeconds = 5;
    }
    // Now call the fade after the specified time
    var fadeFunction = function () {
      initiatePopupFade(fadePopup);
    };
    var fadeDelayTimer = setTimeout(fadeFunction, (waitTimeSeconds * 500));
  }
}


/**
 * The thing we actually fade will be the only child
 * of the popup assuming that this is a dialog or window
 * @param popup
 * @return the component, or null if this is not valid for fading
 */
function findFadeContainer(popup) {
  var children = popup.getDescendantComponents();
  var fadeContainer = children[0];
  if (fadeContainer != undefined) {
    var compType = fadeContainer.getComponentType();
    if (compType == "oracle.adf.RichPanelWindow" 
     || compType == "oracle.adf.RichDialog") {
      return fadeContainer;
    }
  }
  return null;
}


/**
 * Function which will kick off the animation to fade the dialog and register
 * a callback to correctly reset the popup once the animation is complete
 * @param popup the popup we are animating
 */
function initiatePopupFade(popup) {
  //Only continue if the popup has not already been dismissed 
  if (popup.isPopupVisible()) {
    //The skin styles that define the animation 
    var fadeoutAnimationStyle = "popupFadeAnimate";
    var fadeAnimationResetStyle = "popupFadeReset";

    var fadeContainer = findFadeContainer(popup);
    if (fadeContainer != null) {
      var fadeContainerReal = AdfAgent.AGENT.getElementById(fadeContainer.getClientId());
      //Define the callback this will correctly reset the popup once it's disappeared
      var fadeCallbackFunction = function (event) {
        closeFadedPopup(popup, fadeContainer, fadeAnimationResetStyle);
        event.target.removeEventListener("webkitTransitionEnd", fadeCallbackFunction);
      };
      //Initiate the fade
      fadeContainer.setStyleClass(fadeoutAnimationStyle);
      //Register the callback to execute once fade is done
      fadeContainerReal.addEventListener("webkitTransitionEnd", fadeCallbackFunction, false);
    }
  }
}

/**
 * Callback function to correctly cancel and reset the style in the popup
 * @param popup id of the popup so we can close it properly
 * @param contatiner the window / dialog within the popup to actually style
 * @param resetStyle the syle that sets the opacity back to solid
 */
function closeFadedPopup(popup, container, resetStyle) {
  container.setStyleClass(resetStyle);
  popup.cancel();
} 