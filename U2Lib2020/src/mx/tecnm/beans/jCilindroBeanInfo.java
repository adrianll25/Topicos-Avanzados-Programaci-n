/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.tecnm.beans;

import java.beans.*;

/**
 *
 * @author adria
 */
public class jCilindroBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( mx.tecnm.beans.jCilindro.class , null ); // NOI18N
        beanDescriptor.setPreferred ( true );
        beanDescriptor.setDisplayName ( "Bean Operacion Cilindro" );
        beanDescriptor.setShortDescription ( "Bean con operaciones Cilindro" );//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_altura = 4;
    private static final int PROPERTY_ancestorListeners = 5;
    private static final int PROPERTY_autoscrolls = 6;
    private static final int PROPERTY_background = 7;
    private static final int PROPERTY_backgroundSet = 8;
    private static final int PROPERTY_baselineResizeBehavior = 9;
    private static final int PROPERTY_border = 10;
    private static final int PROPERTY_bounds = 11;
    private static final int PROPERTY_colorModel = 12;
    private static final int PROPERTY_component = 13;
    private static final int PROPERTY_componentCount = 14;
    private static final int PROPERTY_componentListeners = 15;
    private static final int PROPERTY_componentOrientation = 16;
    private static final int PROPERTY_componentPopupMenu = 17;
    private static final int PROPERTY_components = 18;
    private static final int PROPERTY_containerListeners = 19;
    private static final int PROPERTY_cursor = 20;
    private static final int PROPERTY_cursorSet = 21;
    private static final int PROPERTY_debugGraphicsOptions = 22;
    private static final int PROPERTY_displayable = 23;
    private static final int PROPERTY_doubleBuffered = 24;
    private static final int PROPERTY_dropTarget = 25;
    private static final int PROPERTY_enabled = 26;
    private static final int PROPERTY_focusable = 27;
    private static final int PROPERTY_focusCycleRoot = 28;
    private static final int PROPERTY_focusCycleRootAncestor = 29;
    private static final int PROPERTY_focusListeners = 30;
    private static final int PROPERTY_focusOwner = 31;
    private static final int PROPERTY_focusTraversable = 32;
    private static final int PROPERTY_focusTraversalKeys = 33;
    private static final int PROPERTY_focusTraversalKeysEnabled = 34;
    private static final int PROPERTY_focusTraversalPolicy = 35;
    private static final int PROPERTY_focusTraversalPolicyProvider = 36;
    private static final int PROPERTY_focusTraversalPolicySet = 37;
    private static final int PROPERTY_font = 38;
    private static final int PROPERTY_fontSet = 39;
    private static final int PROPERTY_foreground = 40;
    private static final int PROPERTY_foregroundSet = 41;
    private static final int PROPERTY_graphics = 42;
    private static final int PROPERTY_graphicsConfiguration = 43;
    private static final int PROPERTY_height = 44;
    private static final int PROPERTY_hierarchyBoundsListeners = 45;
    private static final int PROPERTY_hierarchyListeners = 46;
    private static final int PROPERTY_ignoreRepaint = 47;
    private static final int PROPERTY_imagenIcon = 48;
    private static final int PROPERTY_inheritsPopupMenu = 49;
    private static final int PROPERTY_inputContext = 50;
    private static final int PROPERTY_inputMap = 51;
    private static final int PROPERTY_inputMethodListeners = 52;
    private static final int PROPERTY_inputMethodRequests = 53;
    private static final int PROPERTY_inputVerifier = 54;
    private static final int PROPERTY_insets = 55;
    private static final int PROPERTY_keyListeners = 56;
    private static final int PROPERTY_layout = 57;
    private static final int PROPERTY_lightweight = 58;
    private static final int PROPERTY_locale = 59;
    private static final int PROPERTY_location = 60;
    private static final int PROPERTY_locationOnScreen = 61;
    private static final int PROPERTY_managingFocus = 62;
    private static final int PROPERTY_maximumSize = 63;
    private static final int PROPERTY_maximumSizeSet = 64;
    private static final int PROPERTY_minimumSize = 65;
    private static final int PROPERTY_minimumSizeSet = 66;
    private static final int PROPERTY_mouseListeners = 67;
    private static final int PROPERTY_mouseMotionListeners = 68;
    private static final int PROPERTY_mousePosition = 69;
    private static final int PROPERTY_mouseWheelListeners = 70;
    private static final int PROPERTY_name = 71;
    private static final int PROPERTY_nextFocusableComponent = 72;
    private static final int PROPERTY_opaque = 73;
    private static final int PROPERTY_optimizedDrawingEnabled = 74;
    private static final int PROPERTY_paintingForPrint = 75;
    private static final int PROPERTY_paintingTile = 76;
    private static final int PROPERTY_parent = 77;
    private static final int PROPERTY_peer = 78;
    private static final int PROPERTY_preferredSize = 79;
    private static final int PROPERTY_preferredSizeSet = 80;
    private static final int PROPERTY_propertyChangeListeners = 81;
    private static final int PROPERTY_radio = 82;
    private static final int PROPERTY_registeredKeyStrokes = 83;
    private static final int PROPERTY_requestFocusEnabled = 84;
    private static final int PROPERTY_rootPane = 85;
    private static final int PROPERTY_showing = 86;
    private static final int PROPERTY_size = 87;
    private static final int PROPERTY_toolkit = 88;
    private static final int PROPERTY_toolTipText = 89;
    private static final int PROPERTY_topLevelAncestor = 90;
    private static final int PROPERTY_transferHandler = 91;
    private static final int PROPERTY_treeLock = 92;
    private static final int PROPERTY_UI = 93;
    private static final int PROPERTY_UIClassID = 94;
    private static final int PROPERTY_valid = 95;
    private static final int PROPERTY_validateRoot = 96;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 97;
    private static final int PROPERTY_vetoableChangeListeners = 98;
    private static final int PROPERTY_visible = 99;
    private static final int PROPERTY_visibleRect = 100;
    private static final int PROPERTY_width = 101;
    private static final int PROPERTY_x = 102;
    private static final int PROPERTY_y = 103;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[104];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", mx.tecnm.beans.jCilindro.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", mx.tecnm.beans.jCilindro.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", mx.tecnm.beans.jCilindro.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", mx.tecnm.beans.jCilindro.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_altura] = new PropertyDescriptor ( "altura", mx.tecnm.beans.jCilindro.class, "getAltura", "setAltura" ); // NOI18N
            properties[PROPERTY_altura].setPreferred ( true );
            properties[PROPERTY_altura].setDisplayName ( "Altura" );
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", mx.tecnm.beans.jCilindro.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", mx.tecnm.beans.jCilindro.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", mx.tecnm.beans.jCilindro.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", mx.tecnm.beans.jCilindro.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", mx.tecnm.beans.jCilindro.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", mx.tecnm.beans.jCilindro.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", mx.tecnm.beans.jCilindro.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", mx.tecnm.beans.jCilindro.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", mx.tecnm.beans.jCilindro.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", mx.tecnm.beans.jCilindro.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", mx.tecnm.beans.jCilindro.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", mx.tecnm.beans.jCilindro.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", mx.tecnm.beans.jCilindro.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", mx.tecnm.beans.jCilindro.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", mx.tecnm.beans.jCilindro.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", mx.tecnm.beans.jCilindro.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", mx.tecnm.beans.jCilindro.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", mx.tecnm.beans.jCilindro.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", mx.tecnm.beans.jCilindro.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", mx.tecnm.beans.jCilindro.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", mx.tecnm.beans.jCilindro.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", mx.tecnm.beans.jCilindro.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", mx.tecnm.beans.jCilindro.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", mx.tecnm.beans.jCilindro.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", mx.tecnm.beans.jCilindro.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", mx.tecnm.beans.jCilindro.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", mx.tecnm.beans.jCilindro.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", mx.tecnm.beans.jCilindro.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", mx.tecnm.beans.jCilindro.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", mx.tecnm.beans.jCilindro.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", mx.tecnm.beans.jCilindro.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", mx.tecnm.beans.jCilindro.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", mx.tecnm.beans.jCilindro.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", mx.tecnm.beans.jCilindro.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", mx.tecnm.beans.jCilindro.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", mx.tecnm.beans.jCilindro.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", mx.tecnm.beans.jCilindro.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", mx.tecnm.beans.jCilindro.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", mx.tecnm.beans.jCilindro.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", mx.tecnm.beans.jCilindro.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", mx.tecnm.beans.jCilindro.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", mx.tecnm.beans.jCilindro.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", mx.tecnm.beans.jCilindro.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_imagenIcon] = new PropertyDescriptor ( "imagenIcon", mx.tecnm.beans.jCilindro.class, "getImagenIcon", "setImagenIcon" ); // NOI18N
            properties[PROPERTY_imagenIcon].setPreferred ( true );
            properties[PROPERTY_imagenIcon].setDisplayName ( "Imagen Icon" );
            properties[PROPERTY_imagenIcon].setShortDescription ( "Imagen del prisma" );
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", mx.tecnm.beans.jCilindro.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", mx.tecnm.beans.jCilindro.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", mx.tecnm.beans.jCilindro.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", mx.tecnm.beans.jCilindro.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", mx.tecnm.beans.jCilindro.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", mx.tecnm.beans.jCilindro.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", mx.tecnm.beans.jCilindro.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", mx.tecnm.beans.jCilindro.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", mx.tecnm.beans.jCilindro.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", mx.tecnm.beans.jCilindro.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", mx.tecnm.beans.jCilindro.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", mx.tecnm.beans.jCilindro.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", mx.tecnm.beans.jCilindro.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", mx.tecnm.beans.jCilindro.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", mx.tecnm.beans.jCilindro.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", mx.tecnm.beans.jCilindro.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", mx.tecnm.beans.jCilindro.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", mx.tecnm.beans.jCilindro.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", mx.tecnm.beans.jCilindro.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", mx.tecnm.beans.jCilindro.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", mx.tecnm.beans.jCilindro.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", mx.tecnm.beans.jCilindro.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", mx.tecnm.beans.jCilindro.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", mx.tecnm.beans.jCilindro.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", mx.tecnm.beans.jCilindro.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", mx.tecnm.beans.jCilindro.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", mx.tecnm.beans.jCilindro.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", mx.tecnm.beans.jCilindro.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", mx.tecnm.beans.jCilindro.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", mx.tecnm.beans.jCilindro.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", mx.tecnm.beans.jCilindro.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", mx.tecnm.beans.jCilindro.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", mx.tecnm.beans.jCilindro.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_radio] = new PropertyDescriptor ( "radio", mx.tecnm.beans.jCilindro.class, "getRadio", "setRadio" ); // NOI18N
            properties[PROPERTY_radio].setPreferred ( true );
            properties[PROPERTY_radio].setDisplayName ( "Radio" );
            properties[PROPERTY_radio].setShortDescription ( "Radio del cilindro" );
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", mx.tecnm.beans.jCilindro.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", mx.tecnm.beans.jCilindro.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", mx.tecnm.beans.jCilindro.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", mx.tecnm.beans.jCilindro.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", mx.tecnm.beans.jCilindro.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", mx.tecnm.beans.jCilindro.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", mx.tecnm.beans.jCilindro.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", mx.tecnm.beans.jCilindro.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", mx.tecnm.beans.jCilindro.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", mx.tecnm.beans.jCilindro.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", mx.tecnm.beans.jCilindro.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", mx.tecnm.beans.jCilindro.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", mx.tecnm.beans.jCilindro.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", mx.tecnm.beans.jCilindro.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", mx.tecnm.beans.jCilindro.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", mx.tecnm.beans.jCilindro.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", mx.tecnm.beans.jCilindro.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", mx.tecnm.beans.jCilindro.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", mx.tecnm.beans.jCilindro.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", mx.tecnm.beans.jCilindro.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", mx.tecnm.beans.jCilindro.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_ancestorListener = 0;
    private static final int EVENT_componentListener = 1;
    private static final int EVENT_containerListener = 2;
    private static final int EVENT_focusListener = 3;
    private static final int EVENT_hierarchyBoundsListener = 4;
    private static final int EVENT_hierarchyListener = 5;
    private static final int EVENT_inputMethodListener = 6;
    private static final int EVENT_keyListener = 7;
    private static final int EVENT_mouseListener = 8;
    private static final int EVENT_mouseMotionListener = 9;
    private static final int EVENT_mouseWheelListener = 10;
    private static final int EVENT_propertyChangeListener = 11;
    private static final int EVENT_vetoableChangeListener = 12;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[13];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( mx.tecnm.beans.jCilindro.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addModificadosListener7 = 7;
    private static final int METHOD_addNotify8 = 8;
    private static final int METHOD_addPropertyChangeListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_areaBase11 = 11;
    private static final int METHOD_areaLateral12 = 12;
    private static final int METHOD_areaTotal13 = 13;
    private static final int METHOD_areFocusTraversalKeysSet14 = 14;
    private static final int METHOD_bounds15 = 15;
    private static final int METHOD_checkImage16 = 16;
    private static final int METHOD_checkImage17 = 17;
    private static final int METHOD_computeVisibleRect18 = 18;
    private static final int METHOD_contains19 = 19;
    private static final int METHOD_contains20 = 20;
    private static final int METHOD_countComponents21 = 21;
    private static final int METHOD_createImage22 = 22;
    private static final int METHOD_createImage23 = 23;
    private static final int METHOD_createToolTip24 = 24;
    private static final int METHOD_createVolatileImage25 = 25;
    private static final int METHOD_createVolatileImage26 = 26;
    private static final int METHOD_deliverEvent27 = 27;
    private static final int METHOD_disable28 = 28;
    private static final int METHOD_dispatchEvent29 = 29;
    private static final int METHOD_doLayout30 = 30;
    private static final int METHOD_enable31 = 31;
    private static final int METHOD_enable32 = 32;
    private static final int METHOD_enableInputMethods33 = 33;
    private static final int METHOD_findComponentAt34 = 34;
    private static final int METHOD_findComponentAt35 = 35;
    private static final int METHOD_fireDatosModificadosEvent36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_firePropertyChange43 = 43;
    private static final int METHOD_firePropertyChange44 = 44;
    private static final int METHOD_getActionForKeyStroke45 = 45;
    private static final int METHOD_getBaseline46 = 46;
    private static final int METHOD_getBounds47 = 47;
    private static final int METHOD_getClientProperty48 = 48;
    private static final int METHOD_getComponentAt49 = 49;
    private static final int METHOD_getComponentAt50 = 50;
    private static final int METHOD_getComponentZOrder51 = 51;
    private static final int METHOD_getConditionForKeyStroke52 = 52;
    private static final int METHOD_getDefaultLocale53 = 53;
    private static final int METHOD_getFocusTraversalKeys54 = 54;
    private static final int METHOD_getFontMetrics55 = 55;
    private static final int METHOD_getInsets56 = 56;
    private static final int METHOD_getListeners57 = 57;
    private static final int METHOD_getLocation58 = 58;
    private static final int METHOD_getMousePosition59 = 59;
    private static final int METHOD_getPopupLocation60 = 60;
    private static final int METHOD_getPropertyChangeListeners61 = 61;
    private static final int METHOD_getSize62 = 62;
    private static final int METHOD_getToolTipLocation63 = 63;
    private static final int METHOD_getToolTipText64 = 64;
    private static final int METHOD_gotFocus65 = 65;
    private static final int METHOD_grabFocus66 = 66;
    private static final int METHOD_handleEvent67 = 67;
    private static final int METHOD_hasFocus68 = 68;
    private static final int METHOD_hide69 = 69;
    private static final int METHOD_imageUpdate70 = 70;
    private static final int METHOD_insets71 = 71;
    private static final int METHOD_inside72 = 72;
    private static final int METHOD_invalidate73 = 73;
    private static final int METHOD_isAncestorOf74 = 74;
    private static final int METHOD_isFocusCycleRoot75 = 75;
    private static final int METHOD_isLightweightComponent76 = 76;
    private static final int METHOD_keyDown77 = 77;
    private static final int METHOD_keyUp78 = 78;
    private static final int METHOD_layout79 = 79;
    private static final int METHOD_list80 = 80;
    private static final int METHOD_list81 = 81;
    private static final int METHOD_list82 = 82;
    private static final int METHOD_list83 = 83;
    private static final int METHOD_list84 = 84;
    private static final int METHOD_locate85 = 85;
    private static final int METHOD_location86 = 86;
    private static final int METHOD_lostFocus87 = 87;
    private static final int METHOD_minimumSize88 = 88;
    private static final int METHOD_mouseDown89 = 89;
    private static final int METHOD_mouseDrag90 = 90;
    private static final int METHOD_mouseEnter91 = 91;
    private static final int METHOD_mouseExit92 = 92;
    private static final int METHOD_mouseMove93 = 93;
    private static final int METHOD_mouseUp94 = 94;
    private static final int METHOD_move95 = 95;
    private static final int METHOD_nextFocus96 = 96;
    private static final int METHOD_paint97 = 97;
    private static final int METHOD_paintAll98 = 98;
    private static final int METHOD_paintComponents99 = 99;
    private static final int METHOD_paintImmediately100 = 100;
    private static final int METHOD_paintImmediately101 = 101;
    private static final int METHOD_postEvent102 = 102;
    private static final int METHOD_preferredSize103 = 103;
    private static final int METHOD_prepareImage104 = 104;
    private static final int METHOD_prepareImage105 = 105;
    private static final int METHOD_print106 = 106;
    private static final int METHOD_printAll107 = 107;
    private static final int METHOD_printComponents108 = 108;
    private static final int METHOD_putClientProperty109 = 109;
    private static final int METHOD_registerKeyboardAction110 = 110;
    private static final int METHOD_registerKeyboardAction111 = 111;
    private static final int METHOD_remove112 = 112;
    private static final int METHOD_remove113 = 113;
    private static final int METHOD_remove114 = 114;
    private static final int METHOD_removeAll115 = 115;
    private static final int METHOD_removeModificadosListener116 = 116;
    private static final int METHOD_removeNotify117 = 117;
    private static final int METHOD_removePropertyChangeListener118 = 118;
    private static final int METHOD_repaint119 = 119;
    private static final int METHOD_repaint120 = 120;
    private static final int METHOD_repaint121 = 121;
    private static final int METHOD_repaint122 = 122;
    private static final int METHOD_repaint123 = 123;
    private static final int METHOD_requestDefaultFocus124 = 124;
    private static final int METHOD_requestFocus125 = 125;
    private static final int METHOD_requestFocus126 = 126;
    private static final int METHOD_requestFocusInWindow127 = 127;
    private static final int METHOD_resetKeyboardActions128 = 128;
    private static final int METHOD_reshape129 = 129;
    private static final int METHOD_resize130 = 130;
    private static final int METHOD_resize131 = 131;
    private static final int METHOD_revalidate132 = 132;
    private static final int METHOD_scrollRectToVisible133 = 133;
    private static final int METHOD_setBounds134 = 134;
    private static final int METHOD_setComponentZOrder135 = 135;
    private static final int METHOD_setDefaultLocale136 = 136;
    private static final int METHOD_show137 = 137;
    private static final int METHOD_show138 = 138;
    private static final int METHOD_size139 = 139;
    private static final int METHOD_toString140 = 140;
    private static final int METHOD_transferFocus141 = 141;
    private static final int METHOD_transferFocusBackward142 = 142;
    private static final int METHOD_transferFocusDownCycle143 = 143;
    private static final int METHOD_transferFocusUpCycle144 = 144;
    private static final int METHOD_unregisterKeyboardAction145 = 145;
    private static final int METHOD_update146 = 146;
    private static final int METHOD_updateUI147 = 147;
    private static final int METHOD_validate148 = 148;
    private static final int METHOD_Volumen149 = 149;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[150];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addModificadosListener7] = new MethodDescriptor(mx.tecnm.beans.jCilindro.class.getMethod("addModificadosListener", new Class[] {mx.tecnm.beans.DatosModificadosListener.class})); // NOI18N
            methods[METHOD_addModificadosListener7].setPreferred ( true );
            methods[METHOD_addModificadosListener7].setDisplayName ( "" );
            methods[METHOD_addNotify8] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify8].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener9] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener9].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation10] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation10].setDisplayName ( "" );
            methods[METHOD_areaBase11] = new MethodDescriptor(mx.tecnm.beans.jCilindro.class.getMethod("areaBase", new Class[] {})); // NOI18N
            methods[METHOD_areaBase11].setDisplayName ( "" );
            methods[METHOD_areaLateral12] = new MethodDescriptor(mx.tecnm.beans.jCilindro.class.getMethod("areaLateral", new Class[] {})); // NOI18N
            methods[METHOD_areaLateral12].setDisplayName ( "" );
            methods[METHOD_areaTotal13] = new MethodDescriptor(mx.tecnm.beans.jCilindro.class.getMethod("areaTotal", new Class[] {})); // NOI18N
            methods[METHOD_areaTotal13].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet14] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet14].setDisplayName ( "" );
            methods[METHOD_bounds15] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds15].setDisplayName ( "" );
            methods[METHOD_checkImage16] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage16].setDisplayName ( "" );
            methods[METHOD_checkImage17] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage17].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect18] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect18].setDisplayName ( "" );
            methods[METHOD_contains19] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains19].setDisplayName ( "" );
            methods[METHOD_contains20] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains20].setDisplayName ( "" );
            methods[METHOD_countComponents21] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents21].setDisplayName ( "" );
            methods[METHOD_createImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage22].setDisplayName ( "" );
            methods[METHOD_createImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage23].setDisplayName ( "" );
            methods[METHOD_createToolTip24] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip24].setDisplayName ( "" );
            methods[METHOD_createVolatileImage25] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage25].setDisplayName ( "" );
            methods[METHOD_createVolatileImage26] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage26].setDisplayName ( "" );
            methods[METHOD_deliverEvent27] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent27].setDisplayName ( "" );
            methods[METHOD_disable28] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable28].setDisplayName ( "" );
            methods[METHOD_dispatchEvent29] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent29].setDisplayName ( "" );
            methods[METHOD_doLayout30] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enable32] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable32].setDisplayName ( "" );
            methods[METHOD_enableInputMethods33] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_findComponentAt35] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt35].setDisplayName ( "" );
            methods[METHOD_fireDatosModificadosEvent36] = new MethodDescriptor(mx.tecnm.beans.jCilindro.class.getMethod("fireDatosModificadosEvent", new Class[] {mx.tecnm.beans.DatosModificadosEvent.class})); // NOI18N
            methods[METHOD_fireDatosModificadosEvent36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_firePropertyChange43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange43].setDisplayName ( "" );
            methods[METHOD_firePropertyChange44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange44].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke45].setDisplayName ( "" );
            methods[METHOD_getBaseline46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline46].setDisplayName ( "" );
            methods[METHOD_getBounds47] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds47].setDisplayName ( "" );
            methods[METHOD_getClientProperty48] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty48].setDisplayName ( "" );
            methods[METHOD_getComponentAt49] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt49].setDisplayName ( "" );
            methods[METHOD_getComponentAt50] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt50].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder51] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder51].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke52] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke52].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale53].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys54] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys54].setDisplayName ( "" );
            methods[METHOD_getFontMetrics55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics55].setDisplayName ( "" );
            methods[METHOD_getInsets56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets56].setDisplayName ( "" );
            methods[METHOD_getListeners57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners57].setDisplayName ( "" );
            methods[METHOD_getLocation58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation58].setDisplayName ( "" );
            methods[METHOD_getMousePosition59] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition59].setDisplayName ( "" );
            methods[METHOD_getPopupLocation60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation60].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners61] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners61].setDisplayName ( "" );
            methods[METHOD_getSize62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize62].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation63].setDisplayName ( "" );
            methods[METHOD_getToolTipText64] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText64].setDisplayName ( "" );
            methods[METHOD_gotFocus65] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus65].setDisplayName ( "" );
            methods[METHOD_grabFocus66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus66].setDisplayName ( "" );
            methods[METHOD_handleEvent67] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent67].setDisplayName ( "" );
            methods[METHOD_hasFocus68] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus68].setDisplayName ( "" );
            methods[METHOD_hide69] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide69].setDisplayName ( "" );
            methods[METHOD_imageUpdate70] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate70].setDisplayName ( "" );
            methods[METHOD_insets71] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets71].setDisplayName ( "" );
            methods[METHOD_inside72] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside72].setDisplayName ( "" );
            methods[METHOD_invalidate73] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate73].setDisplayName ( "" );
            methods[METHOD_isAncestorOf74] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf74].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot75] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot75].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent76] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent76].setDisplayName ( "" );
            methods[METHOD_keyDown77] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown77].setDisplayName ( "" );
            methods[METHOD_keyUp78] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp78].setDisplayName ( "" );
            methods[METHOD_layout79] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout79].setDisplayName ( "" );
            methods[METHOD_list80] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list80].setDisplayName ( "" );
            methods[METHOD_list81] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list81].setDisplayName ( "" );
            methods[METHOD_list82] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list82].setDisplayName ( "" );
            methods[METHOD_list83] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list83].setDisplayName ( "" );
            methods[METHOD_list84] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list84].setDisplayName ( "" );
            methods[METHOD_locate85] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate85].setDisplayName ( "" );
            methods[METHOD_location86] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location86].setDisplayName ( "" );
            methods[METHOD_lostFocus87] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus87].setDisplayName ( "" );
            methods[METHOD_minimumSize88] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize88].setDisplayName ( "" );
            methods[METHOD_mouseDown89] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown89].setDisplayName ( "" );
            methods[METHOD_mouseDrag90] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag90].setDisplayName ( "" );
            methods[METHOD_mouseEnter91] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter91].setDisplayName ( "" );
            methods[METHOD_mouseExit92] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit92].setDisplayName ( "" );
            methods[METHOD_mouseMove93] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove93].setDisplayName ( "" );
            methods[METHOD_mouseUp94] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp94].setDisplayName ( "" );
            methods[METHOD_move95] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move95].setDisplayName ( "" );
            methods[METHOD_nextFocus96] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus96].setDisplayName ( "" );
            methods[METHOD_paint97] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint97].setDisplayName ( "" );
            methods[METHOD_paintAll98] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll98].setDisplayName ( "" );
            methods[METHOD_paintComponents99] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents99].setDisplayName ( "" );
            methods[METHOD_paintImmediately100] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately100].setDisplayName ( "" );
            methods[METHOD_paintImmediately101] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately101].setDisplayName ( "" );
            methods[METHOD_postEvent102] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent102].setDisplayName ( "" );
            methods[METHOD_preferredSize103] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize103].setDisplayName ( "" );
            methods[METHOD_prepareImage104] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage104].setDisplayName ( "" );
            methods[METHOD_prepareImage105] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage105].setDisplayName ( "" );
            methods[METHOD_print106] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print106].setDisplayName ( "" );
            methods[METHOD_printAll107] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll107].setDisplayName ( "" );
            methods[METHOD_printComponents108] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents108].setDisplayName ( "" );
            methods[METHOD_putClientProperty109] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty109].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction110] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction110].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction111] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction111].setDisplayName ( "" );
            methods[METHOD_remove112] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove112].setDisplayName ( "" );
            methods[METHOD_remove113] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove113].setDisplayName ( "" );
            methods[METHOD_remove114] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove114].setDisplayName ( "" );
            methods[METHOD_removeAll115] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll115].setDisplayName ( "" );
            methods[METHOD_removeModificadosListener116] = new MethodDescriptor(mx.tecnm.beans.jCilindro.class.getMethod("removeModificadosListener", new Class[] {mx.tecnm.beans.DatosModificadosListener.class})); // NOI18N
            methods[METHOD_removeModificadosListener116].setDisplayName ( "" );
            methods[METHOD_removeNotify117] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify117].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener118] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener118].setDisplayName ( "" );
            methods[METHOD_repaint119] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint119].setDisplayName ( "" );
            methods[METHOD_repaint120] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint120].setDisplayName ( "" );
            methods[METHOD_repaint121] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint121].setDisplayName ( "" );
            methods[METHOD_repaint122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint122].setDisplayName ( "" );
            methods[METHOD_repaint123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint123].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus124] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus124].setDisplayName ( "" );
            methods[METHOD_requestFocus125] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus125].setDisplayName ( "" );
            methods[METHOD_requestFocus126] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus126].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow127] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow127].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions128] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions128].setDisplayName ( "" );
            methods[METHOD_reshape129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape129].setDisplayName ( "" );
            methods[METHOD_resize130] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize130].setDisplayName ( "" );
            methods[METHOD_resize131] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize131].setDisplayName ( "" );
            methods[METHOD_revalidate132] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate132].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible133].setDisplayName ( "" );
            methods[METHOD_setBounds134] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds134].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder135] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder135].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale136].setDisplayName ( "" );
            methods[METHOD_show137] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show137].setDisplayName ( "" );
            methods[METHOD_show138] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show138].setDisplayName ( "" );
            methods[METHOD_size139] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size139].setDisplayName ( "" );
            methods[METHOD_toString140] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString140].setDisplayName ( "" );
            methods[METHOD_transferFocus141] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus141].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward142] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward142].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle143] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle143].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle144] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle144].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction145] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction145].setDisplayName ( "" );
            methods[METHOD_update146] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update146].setDisplayName ( "" );
            methods[METHOD_updateUI147] = new MethodDescriptor(javax.swing.JPanel.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI147].setDisplayName ( "" );
            methods[METHOD_validate148] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate148].setDisplayName ( "" );
            methods[METHOD_Volumen149] = new MethodDescriptor(mx.tecnm.beans.jCilindro.class.getMethod("Volumen", new Class[] {})); // NOI18N
            methods[METHOD_Volumen149].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/Graficos/Cilindro_Bean.png";//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
