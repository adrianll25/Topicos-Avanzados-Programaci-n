/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                JDialogForm  Moduloq3 ue se dispara un un JPanel
:*        
:*  Archivo     : Modulo3EditarDialog.java
:*  Autor       : Jesus Adrian Lopez Luevanos   18131253
:*  Fecha       : 14/12/2020 
:*  Compilador  : JAVA v1.8.2
:*  Descripción : JdialogFrom que captura los datos de una materia  para agregar 
                  un nuevo registro a la tabla KARDEX  ingresando los datos corresponientes
                  en el Dialogo que se muestra para actualizar un registro 
                  que ya existe en la tabla 
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 
    Modificó:        
    Motivo:  
:*------------------------------------------------------------------------------------------*/

package app;

import Modelo.Modelo1;
import Modelo.Modelo2;
import Modelo.Modelo3;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mx.tecnm.itl.util.Imagenes;
import mx.tecnm.jdbc.EjecutorSQL;

/**
 *
 * @author adria
 */
//--------------------------------------------------------------------------
    //Declaracion de variables
public class Modulo3EditarDialog extends javax.swing.JDialog {
 
    private PrincipalFrame frmPrincipal;
    private Modelo3        modelo;
    private String         accion;
    private Vector<String> vecTipoColumnas;
    private String         sql;
    
//--------------------------------------------------------------------------
    //Constructor   
    public Modulo3EditarDialog( java.awt.Frame parent, Modelo3 modelo ) {
        super(parent, true );
        initComponents();
        
        frmPrincipal    = ( PrincipalFrame ) parent;
        this.modelo     = modelo;
        vecTipoColumnas = frmPrincipal.getVecTiposColumnas ();
        
        accion = ( modelo == null )? PrincipalFrame.Nuevo : PrincipalFrame.Editar;
        setTitle ( accion );
        
        jLabLogo.setIcon( Imagenes.escalarImagen ( jLabLogo.getIcon() , 149, 146 ) );
        
        
        llenarCombo1DesdeTabla ();
        llenarCombo2DesdeTabla ();
        inicializarFormulario  ();
    }

//--------------------------------------------------------------------------
    //Metodo que sirve para inicializar el formulario    
    private void inicializarFormulario (){
        if (accion.equals( PrincipalFrame.Nuevo ) ){
            
        } else if ( accion.equals ( PrincipalFrame.Editar ) ){
            jComboPeriodo.setSelectedItem ( modelo.getPeriodo () );
            jFormatCalificacion.setText   ( modelo.getCalificacion () + "" );
        }
        jComboAlumno.requestFocus();
    }
    
//--------------------------------------------------------------------------
    //Metodo que sirve para llenar los jCombo Alumno del Jframe 
    private void llenarCombo1DesdeTabla(){

        ResultSet rs;
        Modelo1   modelo1;
        
        //Llenado del jCombo Alumnos
        
        sql = frmPrincipal.getPropConsultasSQL ()
                .getProperty( PrincipalFrame.ALUMNOS_TODOS_POR_NOMBRE );
        
        try{
            rs = EjecutorSQL.sqlQuery( sql );
            jComboAlumno.addItem ( new Modelo1 ( "", "--Seleccione--", "", 0, 0.0f ) );
            while (rs.next() ){
                String matricula = rs.getString ( "matricula" );
                String nombre    = rs.getString ( "nombre"    );
                String apellidos = rs.getString ( "apellidos" );
                
                modelo1 = new Modelo1 ( matricula, nombre, apellidos, 0, 0.0f );
                jComboAlumno.addItem ( modelo1 );
                
                if ( modelo != null && matricula.equals( modelo.getMatricula() ) ){
                    int index = jComboAlumno.getModel().getSize();
                    jComboAlumno.setSelectedIndex( index -1 );
                }
                
            }
            rs.close();
        } catch ( SQLException ex ) {
            dialogoMensaje ( ex.toString() );
      }
        
    }
    
 //--------------------------------------------------------------------------
   //Metodo que sirve para llenar los jCombo Materia del Jframe 

    
    private void llenarCombo2DesdeTabla(){
    
        ResultSet rs;
        Modelo2   modelo2;
        
        //Llenado del jCombo Materias
        
        sql = frmPrincipal.getPropConsultasSQL ()
                .getProperty( PrincipalFrame.MATERIAS_TODOS_POR_MATERIA );
        
        try{
            rs = EjecutorSQL.sqlQuery( sql );
            jComboMateria.addItem ( new Modelo2 ( "", "--Seleccione--", 0 ) );
            while (rs.next() ){
                String idmateria = rs.getString ( "idmateria" );
                String materia   = rs.getString ( "materua"   );
                
                
                modelo2 = new Modelo2 ( idmateria, materia, 0 );
                jComboMateria.addItem ( modelo2 );
                
                  if ( modelo != null && idmateria.equals( modelo.getIdmateria() ) ){
                    int index = jComboMateria.getModel().getSize();
                    jComboMateria.setSelectedIndex( index -1 );
                }
                
            }
            rs.close();
        } catch ( SQLException ex ) {
            dialogoMensaje ( ex.toString() );
      }
    }
    
//Metodo que sirve para llenar los jCombo Alumno del Jframe 
    
    private void dialogoMensaje ( String mensaje ){
        JOptionPane.showMessageDialog( this, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE );
    }

//Metodo que sirve para llenar los jCombo Alumno del Jframe 
    //Metodo que funciona para validar qu elos campos no esten blanco
    private boolean validarDatos(){
        Modelo1 modelo1  = ( Modelo1 ) jComboAlumno.getSelectedItem();
        String matricula = modelo1.getMatricula();
        String nombre    = modelo1.getNombre();
        if ( nombre.trim().equals ("--Seleccione--" ) ){
            dialogoMensaje ( "Debe seleccionar un elemento en la lista ");
            jComboAlumno.requestFocus();
            return false;
        }
        
        Modelo2 modelo2  = ( Modelo2 ) jComboMateria.getSelectedItem();
        String idmateria = modelo2.getIdmateria();
        String materia   = modelo2.getMateria  ();
        if ( materia.trim().equals( "--Seleccione--" ) ){
            dialogoMensaje ( "Debe seleccionar un elemento en la lista ");
            jComboMateria.requestFocus();
            return false;
        }
        
        int calificacion = 0;
        try{
            calificacion = Integer.parseInt( jFormatCalificacion.getText() );
          
        } catch ( NumberFormatException ex ) {
            dialogoMensaje  ( " Debe capturar un valor numerico valido ");
            jComboMateria.requestFocus();
            return false;
            
        }
        
        String periodo = jComboPeriodo.getSelectedItem().toString();
        
        int idCalif = 0;
        
        if ( accion.equals( PrincipalFrame.Nuevo ) ){
            ResultSet rs;
            
            sql = frmPrincipal.getPropConsultasSQL()
                              .getProperty( PrincipalFrame.KARDEX_OBT_MAX_ID );
            
            try {
                rs = EjecutorSQL.sqlQuery( sql );
                if ( rs.next() ){
                    idCalif = rs.getInt( "maxid" );
                    idCalif ++;
                }
            } catch (SQLException ex) {
                dialogoMensaje ( ex.toString() );
            }
            
        } else if ( accion.equals ( PrincipalFrame.Editar ) ){
            idCalif = modelo.getIdcalif();
        }
        
        modelo = new Modelo3 ( idCalif, matricula, idmateria, periodo, calificacion );
        return true;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboMateria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboPeriodo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButGuardar = new javax.swing.JButton();
        jButCancelar = new javax.swing.JButton();
        jLabLogo = new javax.swing.JLabel();
        jFormatCalificacion = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Materia");

        jLabel2.setText("Alumno ");

        jLabel3.setText("Periodo");

        jComboPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018A", "2018B", "2019A", "2019B", "2020A", "2020B" }));

        jLabel4.setText("Calificacion");

        jButGuardar.setText("Guardar");
        jButGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGuardarActionPerformed(evt);
            }
        });

        jButCancelar.setText("Cancelar");
        jButCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCancelarActionPerformed(evt);
            }
        });

        jLabLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Kardex_app.png"))); // NOI18N
        jLabLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jFormatCalificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormatCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25)
                        .addComponent(jComboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(27, 27, 27)
                            .addComponent(jComboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButGuardar)
                .addGap(116, 116, 116)
                .addComponent(jButCancelar)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jFormatCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButCancelar)
                    .addComponent(jButGuardar))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//------------------------------------------------------------------------------    
    private void jButGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGuardarActionPerformed
      Object [][] args = null;
      String mensaje = " ";
      
      if ( validarDatos () == false )
          return;
      
      if        ( accion.equals( PrincipalFrame.Nuevo ) ){
            
            mensaje = " El registro ah sido agregado. ";  
            
            sql = frmPrincipal.getPropConsultasSQL().getProperty (
                               PrincipalFrame.KARDEX_INSERTA_NUEVO );
            
            args = new Object [][] {
                { vecTipoColumnas.elementAt ( 0 ), modelo.getIdcalif      () },
                { vecTipoColumnas.elementAt ( 1 ), modelo.getMatricula    () },
                { vecTipoColumnas.elementAt ( 4 ), modelo.getIdmateria    () },
                { vecTipoColumnas.elementAt ( 6 ), modelo.getPeriodo      () },
                { vecTipoColumnas.elementAt ( 7 ), modelo.getCalificacion () }
               
            };
            
        } else if ( accion.equals ( PrincipalFrame.Editar ) ){
            
            mensaje = " El registro ah sido modificado.";  
            
             sql = frmPrincipal.getPropConsultasSQL().getProperty (
                               PrincipalFrame.KARDEX_ACTUALIZA_DATOS );
            
            args = new Object [][] {

                { vecTipoColumnas.elementAt ( 1 ), modelo.getMatricula    () },
                { vecTipoColumnas.elementAt ( 4 ), modelo.getIdmateria    () },
                { vecTipoColumnas.elementAt ( 6 ), modelo.getPeriodo      () },
                { vecTipoColumnas.elementAt ( 7 ), modelo.getCalificacion () },
                { vecTipoColumnas.elementAt ( 0 ), modelo.getIdcalif      () }
                
            };
                          
        }
        
        try {
             int regs = EjecutorSQL.sqlEjecutar( sql, args );
             if ( regs == 1 ){
                 frmPrincipal.getjButModulo3().doClick();
                 JOptionPane.showMessageDialog (
                             this,
                             mensaje,
                             accion,
                             JOptionPane.INFORMATION_MESSAGE );
               }
            } catch ( SQLException ex ) {
                dialogoMensaje ( ex.toString() );
          }
        
        dispose();
    }//GEN-LAST:event_jButGuardarActionPerformed

//------------------------------------------------------------------------------  
    //boton cancelar
    private void jButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_jButCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo3EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modulo3EditarDialog dialog = new Modulo3EditarDialog(new javax.swing.JFrame(), null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButCancelar;
    private javax.swing.JButton jButGuardar;
    private javax.swing.JComboBox<Modelo1> jComboAlumno;
    private javax.swing.JComboBox<Modelo2> jComboMateria;
    private javax.swing.JComboBox<String> jComboPeriodo;
    private javax.swing.JFormattedTextField jFormatCalificacion;
    private javax.swing.JLabel jLabLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
