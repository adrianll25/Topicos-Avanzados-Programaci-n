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
public class JAcercaDeBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( mx.tecnm.beans.JAcercaDe.class , null ); // NOI18N
        beanDescriptor.setDisplayName ( "AcercaDe" );
        beanDescriptor.setShortDescription ( "Componente Con informacion Acerca De" );//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_ancestorListeners = 4;
    private static final int PROPERTY_autor1 = 5;
    private static final int PROPERTY_autor2 = 6;
    private static final int PROPERTY_autor3 = 7;
    private static final int PROPERTY_autor4 = 8;
    private static final int PROPERTY_autoscrolls = 9;
    private static final int PROPERTY_background = 10;
    private static final int PROPERTY_backgroundSet = 11;
    private static final int PROPERTY_baselineResizeBehavior = 12;
    private static final int PROPERTY_border = 13;
    private static final int PROPERTY_bounds = 14;
    private static final int PROPERTY_carrera = 15;
    private static final int PROPERTY_colorModel = 16;
    private static final int PROPERTY_component = 17;
    private static final int PROPERTY_componentCount = 18;
    private static final int PROPERTY_componentListeners = 19;
    private static final int PROPERTY_componentOrientation = 20;
    private static final int PROPERTY_componentPopupMenu = 21;
    private static final int PROPERTY_components = 22;
    private static final int PROPERTY_containerListeners = 23;
    private static final int PROPERTY_cursor = 24;
    private static final int PROPERTY_cursorSet = 25;
    private static final int PROPERTY_debugGraphicsOptions = 26;
    private static final int PROPERTY_displayable = 27;
    private static final int PROPERTY_doubleBuffered = 28;
    private static final int PROPERTY_dropTarget = 29;
    private static final int PROPERTY_enabled = 30;
    private static final int PROPERTY_focusable = 31;
    private static final int PROPERTY_focusCycleRoot = 32;
    private static final int PROPERTY_focusCycleRootAncestor = 33;
    private static final int PROPERTY_focusListeners = 34;
    private static final int PROPERTY_focusOwner = 35;
    private static final int PROPERTY_focusTraversable = 36;
    private static final int PROPERTY_focusTraversalKeys = 37;
    private static final int PROPERTY_focusTraversalKeysEnabled = 38;
    private static final int PROPERTY_focusTraversalPolicy = 39;
    private static final int PROPERTY_focusTraversalPolicyProvider = 40;
    private static final int PROPERTY_focusTraversalPolicySet = 41;
    private static final int PROPERTY_font = 42;
    private static final int PROPERTY_fontSet = 43;
    private static final int PROPERTY_foreground = 44;
    private static final int PROPERTY_foregroundSet = 45;
    private static final int PROPERTY_graphics = 46;
    private static final int PROPERTY_graphicsConfiguration = 47;
    private static final int PROPERTY_height = 48;
    private static final int PROPERTY_hierarchyBoundsListeners = 49;
    private static final int PROPERTY_hierarchyListeners = 50;
    private static final int PROPERTY_ignoreRepaint = 51;
    private static final int PROPERTY_inheritsPopupMenu = 52;
    private static final int PROPERTY_inputContext = 53;
    private static final int PROPERTY_inputMap = 54;
    private static final int PROPERTY_inputMethodListeners = 55;
    private static final int PROPERTY_inputMethodRequests = 56;
    private static final int PROPERTY_inputVerifier = 57;
    private static final int PROPERTY_insets = 58;
    private static final int PROPERTY_institucion = 59;
    private static final int PROPERTY_keyListeners = 60;
    private static final int PROPERTY_layout = 61;
    private static final int PROPERTY_leyendaAlPie = 62;
    private static final int PROPERTY_leyendaDesarrolladoPor = 63;
    private static final int PROPERTY_lightweight = 64;
    private static final int PROPERTY_locale = 65;
    private static final int PROPERTY_location = 66;
    private static final int PROPERTY_locationOnScreen = 67;
    private static final int PROPERTY_logo1 = 68;
    private static final int PROPERTY_logo2 = 69;
    private static final int PROPERTY_managingFocus = 70;
    private static final int PROPERTY_materia = 71;
    private static final int PROPERTY_maximumSize = 72;
    private static final int PROPERTY_maximumSizeSet = 73;
    private static final int PROPERTY_minimumSize = 74;
    private static final int PROPERTY_minimumSizeSet = 75;
    private static final int PROPERTY_mouseListeners = 76;
    private static final int PROPERTY_mouseMotionListeners = 77;
    private static final int PROPERTY_mousePosition = 78;
    private static final int PROPERTY_mouseWheelListeners = 79;
    private static final int PROPERTY_name = 80;
    private static final int PROPERTY_nextFocusableComponent = 81;
    private static final int PROPERTY_nombreApp = 82;
    private static final int PROPERTY_opaque = 83;
    private static final int PROPERTY_optimizedDrawingEnabled = 84;
    private static final int PROPERTY_paintingForPrint = 85;
    private static final int PROPERTY_paintingTile = 86;
    private static final int PROPERTY_parent = 87;
    private static final int PROPERTY_peer = 88;
    private static final int PROPERTY_preferredSize = 89;
    private static final int PROPERTY_preferredSizeSet = 90;
    private static final int PROPERTY_propertyChangeListeners = 91;
    private static final int PROPERTY_registeredKeyStrokes = 92;
    private static final int PROPERTY_requestFocusEnabled = 93;
    private static final int PROPERTY_rootPane = 94;
    private static final int PROPERTY_showing = 95;
    private static final int PROPERTY_size = 96;
    private static final int PROPERTY_toolkit = 97;
    private static final int PROPERTY_toolTipText = 98;
    private static final int PROPERTY_topLevelAncestor = 99;
    private static final int PROPERTY_transferHandler = 100;
    private static final int PROPERTY_treeLock = 101;
    private static final int PROPERTY_UI = 102;
    private static final int PROPERTY_UIClassID = 103;
    private static final int PROPERTY_universidad = 104;
    private static final int PROPERTY_valid = 105;
    private static final int PROPERTY_validateRoot = 106;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 107;
    private static final int PROPERTY_vetoableChangeListeners = 108;
    private static final int PROPERTY_visible = 109;
    private static final int PROPERTY_visibleRect = 110;
    private static final int PROPERTY_width = 111;
    private static final int PROPERTY_x = 112;
    private static final int PROPERTY_y = 113;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[114];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", mx.tecnm.beans.JAcercaDe.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", mx.tecnm.beans.JAcercaDe.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", mx.tecnm.beans.JAcercaDe.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", mx.tecnm.beans.JAcercaDe.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", mx.tecnm.beans.JAcercaDe.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autor1] = new PropertyDescriptor ( "autor1", mx.tecnm.beans.JAcercaDe.class, "getAutor1", "setAutor1" ); // NOI18N
            properties[PROPERTY_autor1].setPreferred ( true );
            properties[PROPERTY_autor1].setDisplayName ( "Autor 1" );
            properties[PROPERTY_autor1].setShortDescription ( "Nombre del autor 1" );
            properties[PROPERTY_autor2] = new PropertyDescriptor ( "autor2", mx.tecnm.beans.JAcercaDe.class, "getAutor2", "setAutor2" ); // NOI18N
            properties[PROPERTY_autor2].setPreferred ( true );
            properties[PROPERTY_autor2].setDisplayName ( "Autor 2" );
            properties[PROPERTY_autor3] = new PropertyDescriptor ( "autor3", mx.tecnm.beans.JAcercaDe.class, "getAutor3", "setAutor3" ); // NOI18N
            properties[PROPERTY_autor3].setPreferred ( true );
            properties[PROPERTY_autor3].setDisplayName ( "Autor 3" );
            properties[PROPERTY_autor4] = new PropertyDescriptor ( "autor4", mx.tecnm.beans.JAcercaDe.class, "getAutor4", "setAutor4" ); // NOI18N
            properties[PROPERTY_autor4].setPreferred ( true );
            properties[PROPERTY_autor4].setDisplayName ( "Autor 4" );
            properties[PROPERTY_autor4].setShortDescription ( "Nombre del autor 4" );
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", mx.tecnm.beans.JAcercaDe.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", mx.tecnm.beans.JAcercaDe.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", mx.tecnm.beans.JAcercaDe.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", mx.tecnm.beans.JAcercaDe.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", mx.tecnm.beans.JAcercaDe.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", mx.tecnm.beans.JAcercaDe.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_carrera] = new PropertyDescriptor ( "carrera", mx.tecnm.beans.JAcercaDe.class, "getCarrera", "setCarrera" ); // NOI18N
            properties[PROPERTY_carrera].setPreferred ( true );
            properties[PROPERTY_carrera].setDisplayName ( "Carrera" );
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", mx.tecnm.beans.JAcercaDe.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", mx.tecnm.beans.JAcercaDe.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", mx.tecnm.beans.JAcercaDe.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", mx.tecnm.beans.JAcercaDe.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", mx.tecnm.beans.JAcercaDe.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", mx.tecnm.beans.JAcercaDe.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", mx.tecnm.beans.JAcercaDe.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", mx.tecnm.beans.JAcercaDe.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", mx.tecnm.beans.JAcercaDe.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", mx.tecnm.beans.JAcercaDe.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", mx.tecnm.beans.JAcercaDe.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", mx.tecnm.beans.JAcercaDe.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", mx.tecnm.beans.JAcercaDe.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", mx.tecnm.beans.JAcercaDe.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", mx.tecnm.beans.JAcercaDe.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", mx.tecnm.beans.JAcercaDe.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", mx.tecnm.beans.JAcercaDe.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", mx.tecnm.beans.JAcercaDe.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", mx.tecnm.beans.JAcercaDe.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", mx.tecnm.beans.JAcercaDe.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", mx.tecnm.beans.JAcercaDe.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", mx.tecnm.beans.JAcercaDe.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", mx.tecnm.beans.JAcercaDe.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", mx.tecnm.beans.JAcercaDe.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", mx.tecnm.beans.JAcercaDe.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", mx.tecnm.beans.JAcercaDe.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", mx.tecnm.beans.JAcercaDe.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", mx.tecnm.beans.JAcercaDe.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", mx.tecnm.beans.JAcercaDe.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", mx.tecnm.beans.JAcercaDe.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", mx.tecnm.beans.JAcercaDe.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", mx.tecnm.beans.JAcercaDe.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", mx.tecnm.beans.JAcercaDe.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", mx.tecnm.beans.JAcercaDe.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", mx.tecnm.beans.JAcercaDe.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", mx.tecnm.beans.JAcercaDe.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", mx.tecnm.beans.JAcercaDe.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", mx.tecnm.beans.JAcercaDe.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", mx.tecnm.beans.JAcercaDe.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", mx.tecnm.beans.JAcercaDe.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", mx.tecnm.beans.JAcercaDe.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", mx.tecnm.beans.JAcercaDe.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", mx.tecnm.beans.JAcercaDe.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_institucion] = new PropertyDescriptor ( "institucion", mx.tecnm.beans.JAcercaDe.class, "getInstitucion", "setInstitucion" ); // NOI18N
            properties[PROPERTY_institucion].setPreferred ( true );
            properties[PROPERTY_institucion].setDisplayName ( "Institucion" );
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", mx.tecnm.beans.JAcercaDe.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", mx.tecnm.beans.JAcercaDe.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_leyendaAlPie] = new PropertyDescriptor ( "leyendaAlPie", mx.tecnm.beans.JAcercaDe.class, "getLeyendaAlPie", "setLeyendaAlPie" ); // NOI18N
            properties[PROPERTY_leyendaAlPie].setPreferred ( true );
            properties[PROPERTY_leyendaAlPie].setDisplayName ( "Leyenda pie" );
            properties[PROPERTY_leyendaDesarrolladoPor] = new PropertyDescriptor ( "leyendaDesarrolladoPor", mx.tecnm.beans.JAcercaDe.class, "getLeyendaDesarrolladoPor", "setLeyendaDesarrolladoPor" ); // NOI18N
            properties[PROPERTY_leyendaDesarrolladoPor].setPreferred ( true );
            properties[PROPERTY_leyendaDesarrolladoPor].setDisplayName ( "Leyenda Desarrollador" );
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", mx.tecnm.beans.JAcercaDe.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", mx.tecnm.beans.JAcercaDe.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", mx.tecnm.beans.JAcercaDe.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", mx.tecnm.beans.JAcercaDe.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_logo1] = new PropertyDescriptor ( "logo1", mx.tecnm.beans.JAcercaDe.class, "getLogo1", "setLogo1" ); // NOI18N
            properties[PROPERTY_logo1].setPreferred ( true );
            properties[PROPERTY_logo1].setDisplayName ( "Logo 1" );
            properties[PROPERTY_logo2] = new PropertyDescriptor ( "logo2", mx.tecnm.beans.JAcercaDe.class, "getLogo2", "setLogo2" ); // NOI18N
            properties[PROPERTY_logo2].setPreferred ( true );
            properties[PROPERTY_logo2].setDisplayName ( "Logo 2" );
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", mx.tecnm.beans.JAcercaDe.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_materia] = new PropertyDescriptor ( "materia", mx.tecnm.beans.JAcercaDe.class, "getMateria", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", mx.tecnm.beans.JAcercaDe.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", mx.tecnm.beans.JAcercaDe.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", mx.tecnm.beans.JAcercaDe.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", mx.tecnm.beans.JAcercaDe.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", mx.tecnm.beans.JAcercaDe.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", mx.tecnm.beans.JAcercaDe.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", mx.tecnm.beans.JAcercaDe.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", mx.tecnm.beans.JAcercaDe.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", mx.tecnm.beans.JAcercaDe.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", mx.tecnm.beans.JAcercaDe.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_nombreApp] = new PropertyDescriptor ( "nombreApp", mx.tecnm.beans.JAcercaDe.class, "getNombreApp", "setNombreApp" ); // NOI18N
            properties[PROPERTY_nombreApp].setPreferred ( true );
            properties[PROPERTY_nombreApp].setDisplayName ( "Nombre App" );
            properties[PROPERTY_nombreApp].setShortDescription ( "Nombre de la aplicacion" );
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", mx.tecnm.beans.JAcercaDe.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", mx.tecnm.beans.JAcercaDe.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", mx.tecnm.beans.JAcercaDe.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", mx.tecnm.beans.JAcercaDe.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", mx.tecnm.beans.JAcercaDe.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", mx.tecnm.beans.JAcercaDe.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", mx.tecnm.beans.JAcercaDe.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", mx.tecnm.beans.JAcercaDe.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", mx.tecnm.beans.JAcercaDe.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", mx.tecnm.beans.JAcercaDe.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", mx.tecnm.beans.JAcercaDe.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", mx.tecnm.beans.JAcercaDe.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", mx.tecnm.beans.JAcercaDe.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", mx.tecnm.beans.JAcercaDe.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", mx.tecnm.beans.JAcercaDe.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", mx.tecnm.beans.JAcercaDe.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", mx.tecnm.beans.JAcercaDe.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", mx.tecnm.beans.JAcercaDe.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", mx.tecnm.beans.JAcercaDe.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", mx.tecnm.beans.JAcercaDe.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", mx.tecnm.beans.JAcercaDe.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_universidad] = new PropertyDescriptor ( "universidad", mx.tecnm.beans.JAcercaDe.class, "getUniversidad", "setUniversidad" ); // NOI18N
            properties[PROPERTY_universidad].setPreferred ( true );
            properties[PROPERTY_universidad].setDisplayName ( "Universidad" );
            properties[PROPERTY_universidad].setShortDescription ( "Informacion de la universidad" );
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", mx.tecnm.beans.JAcercaDe.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", mx.tecnm.beans.JAcercaDe.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", mx.tecnm.beans.JAcercaDe.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", mx.tecnm.beans.JAcercaDe.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", mx.tecnm.beans.JAcercaDe.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", mx.tecnm.beans.JAcercaDe.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", mx.tecnm.beans.JAcercaDe.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", mx.tecnm.beans.JAcercaDe.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", mx.tecnm.beans.JAcercaDe.class, "getY", null ); // NOI18N
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
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( mx.tecnm.beans.JAcercaDe.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
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
    private static final int METHOD_addNotify7 = 7;
    private static final int METHOD_addPropertyChangeListener8 = 8;
    private static final int METHOD_applyComponentOrientation9 = 9;
    private static final int METHOD_areFocusTraversalKeysSet10 = 10;
    private static final int METHOD_bounds11 = 11;
    private static final int METHOD_checkImage12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_computeVisibleRect14 = 14;
    private static final int METHOD_contains15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_countComponents17 = 17;
    private static final int METHOD_createImage18 = 18;
    private static final int METHOD_createImage19 = 19;
    private static final int METHOD_createToolTip20 = 20;
    private static final int METHOD_createVolatileImage21 = 21;
    private static final int METHOD_createVolatileImage22 = 22;
    private static final int METHOD_deliverEvent23 = 23;
    private static final int METHOD_disable24 = 24;
    private static final int METHOD_dispatchEvent25 = 25;
    private static final int METHOD_doLayout26 = 26;
    private static final int METHOD_enable27 = 27;
    private static final int METHOD_enable28 = 28;
    private static final int METHOD_enableInputMethods29 = 29;
    private static final int METHOD_findComponentAt30 = 30;
    private static final int METHOD_findComponentAt31 = 31;
    private static final int METHOD_firePropertyChange32 = 32;
    private static final int METHOD_firePropertyChange33 = 33;
    private static final int METHOD_firePropertyChange34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_getActionForKeyStroke40 = 40;
    private static final int METHOD_getBaseline41 = 41;
    private static final int METHOD_getBounds42 = 42;
    private static final int METHOD_getClientProperty43 = 43;
    private static final int METHOD_getComponentAt44 = 44;
    private static final int METHOD_getComponentAt45 = 45;
    private static final int METHOD_getComponentZOrder46 = 46;
    private static final int METHOD_getConditionForKeyStroke47 = 47;
    private static final int METHOD_getDefaultLocale48 = 48;
    private static final int METHOD_getFocusTraversalKeys49 = 49;
    private static final int METHOD_getFontMetrics50 = 50;
    private static final int METHOD_getInsets51 = 51;
    private static final int METHOD_getListeners52 = 52;
    private static final int METHOD_getLocation53 = 53;
    private static final int METHOD_getMousePosition54 = 54;
    private static final int METHOD_getPopupLocation55 = 55;
    private static final int METHOD_getPropertyChangeListeners56 = 56;
    private static final int METHOD_getSize57 = 57;
    private static final int METHOD_getToolTipLocation58 = 58;
    private static final int METHOD_getToolTipText59 = 59;
    private static final int METHOD_gotFocus60 = 60;
    private static final int METHOD_grabFocus61 = 61;
    private static final int METHOD_handleEvent62 = 62;
    private static final int METHOD_hasFocus63 = 63;
    private static final int METHOD_hide64 = 64;
    private static final int METHOD_imageUpdate65 = 65;
    private static final int METHOD_insets66 = 66;
    private static final int METHOD_inside67 = 67;
    private static final int METHOD_invalidate68 = 68;
    private static final int METHOD_isAncestorOf69 = 69;
    private static final int METHOD_isFocusCycleRoot70 = 70;
    private static final int METHOD_isLightweightComponent71 = 71;
    private static final int METHOD_keyDown72 = 72;
    private static final int METHOD_keyUp73 = 73;
    private static final int METHOD_layout74 = 74;
    private static final int METHOD_list75 = 75;
    private static final int METHOD_list76 = 76;
    private static final int METHOD_list77 = 77;
    private static final int METHOD_list78 = 78;
    private static final int METHOD_list79 = 79;
    private static final int METHOD_locate80 = 80;
    private static final int METHOD_location81 = 81;
    private static final int METHOD_lostFocus82 = 82;
    private static final int METHOD_minimumSize83 = 83;
    private static final int METHOD_mouseDown84 = 84;
    private static final int METHOD_mouseDrag85 = 85;
    private static final int METHOD_mouseEnter86 = 86;
    private static final int METHOD_mouseExit87 = 87;
    private static final int METHOD_mouseMove88 = 88;
    private static final int METHOD_mouseUp89 = 89;
    private static final int METHOD_move90 = 90;
    private static final int METHOD_nextFocus91 = 91;
    private static final int METHOD_paint92 = 92;
    private static final int METHOD_paintAll93 = 93;
    private static final int METHOD_paintComponents94 = 94;
    private static final int METHOD_paintImmediately95 = 95;
    private static final int METHOD_paintImmediately96 = 96;
    private static final int METHOD_postEvent97 = 97;
    private static final int METHOD_preferredSize98 = 98;
    private static final int METHOD_prepareImage99 = 99;
    private static final int METHOD_prepareImage100 = 100;
    private static final int METHOD_print101 = 101;
    private static final int METHOD_printAll102 = 102;
    private static final int METHOD_printComponents103 = 103;
    private static final int METHOD_putClientProperty104 = 104;
    private static final int METHOD_registerKeyboardAction105 = 105;
    private static final int METHOD_registerKeyboardAction106 = 106;
    private static final int METHOD_remove107 = 107;
    private static final int METHOD_remove108 = 108;
    private static final int METHOD_remove109 = 109;
    private static final int METHOD_removeAll110 = 110;
    private static final int METHOD_removeNotify111 = 111;
    private static final int METHOD_removePropertyChangeListener112 = 112;
    private static final int METHOD_repaint113 = 113;
    private static final int METHOD_repaint114 = 114;
    private static final int METHOD_repaint115 = 115;
    private static final int METHOD_repaint116 = 116;
    private static final int METHOD_repaint117 = 117;
    private static final int METHOD_requestDefaultFocus118 = 118;
    private static final int METHOD_requestFocus119 = 119;
    private static final int METHOD_requestFocus120 = 120;
    private static final int METHOD_requestFocusInWindow121 = 121;
    private static final int METHOD_resetKeyboardActions122 = 122;
    private static final int METHOD_reshape123 = 123;
    private static final int METHOD_resize124 = 124;
    private static final int METHOD_resize125 = 125;
    private static final int METHOD_revalidate126 = 126;
    private static final int METHOD_scrollRectToVisible127 = 127;
    private static final int METHOD_setBounds128 = 128;
    private static final int METHOD_setComponentZOrder129 = 129;
    private static final int METHOD_setDefaultLocale130 = 130;
    private static final int METHOD_SetMateria131 = 131;
    private static final int METHOD_show132 = 132;
    private static final int METHOD_show133 = 133;
    private static final int METHOD_size134 = 134;
    private static final int METHOD_toString135 = 135;
    private static final int METHOD_transferFocus136 = 136;
    private static final int METHOD_transferFocusBackward137 = 137;
    private static final int METHOD_transferFocusDownCycle138 = 138;
    private static final int METHOD_transferFocusUpCycle139 = 139;
    private static final int METHOD_unregisterKeyboardAction140 = 140;
    private static final int METHOD_update141 = 141;
    private static final int METHOD_updateUI142 = 142;
    private static final int METHOD_validate143 = 143;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[144];
    
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
            methods[METHOD_addNotify7] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify7].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener8] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener8].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation9] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation9].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet10] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet10].setDisplayName ( "" );
            methods[METHOD_bounds11] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds11].setDisplayName ( "" );
            methods[METHOD_checkImage12] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage12].setDisplayName ( "" );
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect14] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect14].setDisplayName ( "" );
            methods[METHOD_contains15] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_countComponents17] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents17].setDisplayName ( "" );
            methods[METHOD_createImage18] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage18].setDisplayName ( "" );
            methods[METHOD_createImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage19].setDisplayName ( "" );
            methods[METHOD_createToolTip20] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip20].setDisplayName ( "" );
            methods[METHOD_createVolatileImage21] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage21].setDisplayName ( "" );
            methods[METHOD_createVolatileImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage22].setDisplayName ( "" );
            methods[METHOD_deliverEvent23] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent23].setDisplayName ( "" );
            methods[METHOD_disable24] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable24].setDisplayName ( "" );
            methods[METHOD_dispatchEvent25] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent25].setDisplayName ( "" );
            methods[METHOD_doLayout26] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout26].setDisplayName ( "" );
            methods[METHOD_enable27] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable27].setDisplayName ( "" );
            methods[METHOD_enable28] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable28].setDisplayName ( "" );
            methods[METHOD_enableInputMethods29] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods29].setDisplayName ( "" );
            methods[METHOD_findComponentAt30] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt30].setDisplayName ( "" );
            methods[METHOD_findComponentAt31] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt31].setDisplayName ( "" );
            methods[METHOD_firePropertyChange32] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange32].setDisplayName ( "" );
            methods[METHOD_firePropertyChange33] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange33].setDisplayName ( "" );
            methods[METHOD_firePropertyChange34] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke40].setDisplayName ( "" );
            methods[METHOD_getBaseline41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline41].setDisplayName ( "" );
            methods[METHOD_getBounds42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds42].setDisplayName ( "" );
            methods[METHOD_getClientProperty43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty43].setDisplayName ( "" );
            methods[METHOD_getComponentAt44] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt44].setDisplayName ( "" );
            methods[METHOD_getComponentAt45] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt45].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder46] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder46].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke47] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke47].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale48] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale48].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys49] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys49].setDisplayName ( "" );
            methods[METHOD_getFontMetrics50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics50].setDisplayName ( "" );
            methods[METHOD_getInsets51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets51].setDisplayName ( "" );
            methods[METHOD_getListeners52] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners52].setDisplayName ( "" );
            methods[METHOD_getLocation53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation53].setDisplayName ( "" );
            methods[METHOD_getMousePosition54] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition54].setDisplayName ( "" );
            methods[METHOD_getPopupLocation55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation55].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners56] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners56].setDisplayName ( "" );
            methods[METHOD_getSize57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize57].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation58].setDisplayName ( "" );
            methods[METHOD_getToolTipText59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText59].setDisplayName ( "" );
            methods[METHOD_gotFocus60] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus60].setDisplayName ( "" );
            methods[METHOD_grabFocus61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus61].setDisplayName ( "" );
            methods[METHOD_handleEvent62] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent62].setDisplayName ( "" );
            methods[METHOD_hasFocus63] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus63].setDisplayName ( "" );
            methods[METHOD_hide64] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide64].setDisplayName ( "" );
            methods[METHOD_imageUpdate65] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate65].setDisplayName ( "" );
            methods[METHOD_insets66] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets66].setDisplayName ( "" );
            methods[METHOD_inside67] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside67].setDisplayName ( "" );
            methods[METHOD_invalidate68] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate68].setDisplayName ( "" );
            methods[METHOD_isAncestorOf69] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf69].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot70] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot70].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent71] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent71].setDisplayName ( "" );
            methods[METHOD_keyDown72] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown72].setDisplayName ( "" );
            methods[METHOD_keyUp73] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp73].setDisplayName ( "" );
            methods[METHOD_layout74] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout74].setDisplayName ( "" );
            methods[METHOD_list75] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list75].setDisplayName ( "" );
            methods[METHOD_list76] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list76].setDisplayName ( "" );
            methods[METHOD_list77] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list77].setDisplayName ( "" );
            methods[METHOD_list78] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list78].setDisplayName ( "" );
            methods[METHOD_list79] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list79].setDisplayName ( "" );
            methods[METHOD_locate80] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate80].setDisplayName ( "" );
            methods[METHOD_location81] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location81].setDisplayName ( "" );
            methods[METHOD_lostFocus82] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus82].setDisplayName ( "" );
            methods[METHOD_minimumSize83] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize83].setDisplayName ( "" );
            methods[METHOD_mouseDown84] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown84].setDisplayName ( "" );
            methods[METHOD_mouseDrag85] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag85].setDisplayName ( "" );
            methods[METHOD_mouseEnter86] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter86].setDisplayName ( "" );
            methods[METHOD_mouseExit87] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit87].setDisplayName ( "" );
            methods[METHOD_mouseMove88] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove88].setDisplayName ( "" );
            methods[METHOD_mouseUp89] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp89].setDisplayName ( "" );
            methods[METHOD_move90] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move90].setDisplayName ( "" );
            methods[METHOD_nextFocus91] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus91].setDisplayName ( "" );
            methods[METHOD_paint92] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint92].setDisplayName ( "" );
            methods[METHOD_paintAll93] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll93].setDisplayName ( "" );
            methods[METHOD_paintComponents94] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents94].setDisplayName ( "" );
            methods[METHOD_paintImmediately95] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately95].setDisplayName ( "" );
            methods[METHOD_paintImmediately96] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately96].setDisplayName ( "" );
            methods[METHOD_postEvent97] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent97].setDisplayName ( "" );
            methods[METHOD_preferredSize98] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize98].setDisplayName ( "" );
            methods[METHOD_prepareImage99] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage99].setDisplayName ( "" );
            methods[METHOD_prepareImage100] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage100].setDisplayName ( "" );
            methods[METHOD_print101] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print101].setDisplayName ( "" );
            methods[METHOD_printAll102] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll102].setDisplayName ( "" );
            methods[METHOD_printComponents103] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents103].setDisplayName ( "" );
            methods[METHOD_putClientProperty104] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty104].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction105] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction105].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction106] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction106].setDisplayName ( "" );
            methods[METHOD_remove107] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove107].setDisplayName ( "" );
            methods[METHOD_remove108] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove108].setDisplayName ( "" );
            methods[METHOD_remove109] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove109].setDisplayName ( "" );
            methods[METHOD_removeAll110] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll110].setDisplayName ( "" );
            methods[METHOD_removeNotify111] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify111].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener112] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener112].setDisplayName ( "" );
            methods[METHOD_repaint113] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint113].setDisplayName ( "" );
            methods[METHOD_repaint114] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint114].setDisplayName ( "" );
            methods[METHOD_repaint115] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint115].setDisplayName ( "" );
            methods[METHOD_repaint116] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint116].setDisplayName ( "" );
            methods[METHOD_repaint117] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint117].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus118] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus118].setDisplayName ( "" );
            methods[METHOD_requestFocus119] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus119].setDisplayName ( "" );
            methods[METHOD_requestFocus120] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus120].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow121] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow121].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions122].setDisplayName ( "" );
            methods[METHOD_reshape123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape123].setDisplayName ( "" );
            methods[METHOD_resize124] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize124].setDisplayName ( "" );
            methods[METHOD_resize125] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize125].setDisplayName ( "" );
            methods[METHOD_revalidate126] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate126].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible127] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible127].setDisplayName ( "" );
            methods[METHOD_setBounds128] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds128].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder129] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder129].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale130].setDisplayName ( "" );
            methods[METHOD_SetMateria131] = new MethodDescriptor(mx.tecnm.beans.JAcercaDe.class.getMethod("SetMateria", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_SetMateria131].setDisplayName ( "" );
            methods[METHOD_show132] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show132].setDisplayName ( "" );
            methods[METHOD_show133] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show133].setDisplayName ( "" );
            methods[METHOD_size134] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size134].setDisplayName ( "" );
            methods[METHOD_toString135] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString135].setDisplayName ( "" );
            methods[METHOD_transferFocus136] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus136].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward137] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward137].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle138] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle138].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle139] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle139].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction140] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction140].setDisplayName ( "" );
            methods[METHOD_update141] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update141].setDisplayName ( "" );
            methods[METHOD_updateUI142] = new MethodDescriptor(javax.swing.JPanel.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI142].setDisplayName ( "" );
            methods[METHOD_validate143] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate143].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/Graficos/AccerDe.png";//GEN-BEGIN:Icons
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
