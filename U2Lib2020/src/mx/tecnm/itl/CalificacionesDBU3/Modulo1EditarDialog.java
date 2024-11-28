/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                JDialogForm Modulo1 que se dispara un un JPanel
:*        
:*  Archivo     : Modulo1EditarDialog.java
:*  Autor       : Jesus Adrian Lopez Luevanos 18131253
:*  Fecha       : 13/12/2020
:*  Compilador  : JAVA v1.8.2
:*  Descripción : JdialogFrom que captura los datos de un Alumno utilizado para agregar 
                  un nuevo registro a la tabla ALUMNO ingresando sus datos corresponientes
                  en el Dialogo que se muestra para actualizar un registro 
                  que ya existe en la tabla. 
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha:  
    Modificó:             
    Motivo:   
:*------------------------------------------------------------------------------------------*/

package mx.tecnm.itl.CalificacionesDBU3;

import mx.tecnm.itl.Modelo.Modelo1;
import static mx.tecnm.itl.CalificacionesDBU3.PrincipalFrame.ALUMNOS_ACTUALIZA_DATOS;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mx.tecnm.itl.util.Imagenes;
import mx.tecnm.jdbc.EjecutorSQL;

//Variables -----------------------------------------------------------------
    
public class Modulo1EditarDialog extends javax.swing.JDialog {
    private PrincipalFrame frmPrincipal;
    private Modelo1        modelo;
    private String         accion;
    private Vector<String> vecTipoColumnas;
    private String         sql;
    
//Constructor-----------------------------------------------------------------
             
    public Modulo1EditarDialog(java.awt.Frame parent, Modelo1 modelo) {
        super( parent, true );
        initComponents();
        
        frmPrincipal    = ( PrincipalFrame ) parent;
        this.modelo     = modelo;
        vecTipoColumnas = frmPrincipal.getVecTiposColumnas ();
        
        accion = ( modelo == null )? PrincipalFrame.Nuevo : PrincipalFrame.Editar;
        setTitle ( accion );
        
        jLabLogo.setIcon( Imagenes.escalarImagen ( jLabLogo.getIcon() , 128, 135 ) );
        
        inicializarFormulario ();
    }

//--------------------------------------------------------------------------
    //Metodo que inicia el formulariio    
    private void inicializarFormulario (){
        if ( accion.equals( PrincipalFrame.Nuevo ) ){
            jTextMatricula.requestFocus();
        } else if ( accion.equals   ( PrincipalFrame.Editar ) ) {
            jTextMatricula.setText  ( modelo.getMatricula  () );
            jTextNombre.setText     ( modelo.getNombre     () );
            jTextApellidos.setText  ( modelo.getApellidos  () );
            jSpinEdad.setValue      ( modelo.getEdad       () );
            jFormatPromedio.setText ( modelo.getPromedio() + "");
            
            jTextNombre.requestFocus  ();
            jTextMatricula.setEditable( false );
            
            
            
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextMatricula = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextApellidos = new javax.swing.JTextField();
        jSpinEdad = new javax.swing.JSpinner();
        jFormatPromedio = new javax.swing.JFormattedTextField();
        jLabLogo = new javax.swing.JLabel();
        jButGuardar = new javax.swing.JButton();
        jButCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Matricula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Edad");

        jLabel5.setText("Promedio");

        jFormatPromedio.setText("0.0");

        jLabLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/Alumno_app.png"))); // NOI18N
        jLabLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextApellidos))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextMatricula)
                                            .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jSpinEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(37, 37, 37)
                        .addComponent(jLabLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jFormatPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jButGuardar)))
                        .addGap(102, 102, 102)
                        .addComponent(jButCancelar)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jSpinEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormatPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButGuardar)
                    .addComponent(jButCancelar))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//--------------------------------------------------------------------------
    
    private void jButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCancelarActionPerformed
        dispose ();
    }//GEN-LAST:event_jButCancelarActionPerformed
//--------------------------------------------------------------------------
    
    private void jButGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGuardarActionPerformed
        Object [][] args = null;
        String mensaje = "";
                
        if ( validarDatos () == false )
            return;
        
        //Se determina la sentencia sql a ejecutar y forma la matriz de argumentos
        if        ( accion.equals( PrincipalFrame.Nuevo ) ){
            
            mensaje = " El registro ah sido agregado.";  
            
            sql = frmPrincipal.getPropConsultasSQL().getProperty (
                               PrincipalFrame.ALUMNOS_INSERTA_NUEVO );
            
            args = new Object [][]{
                { vecTipoColumnas.elementAt ( 0 ), modelo.getMatricula () },
                { vecTipoColumnas.elementAt ( 1 ), modelo.getNombre    () },
                { vecTipoColumnas.elementAt ( 2 ), modelo.getApellidos () },
                { vecTipoColumnas.elementAt ( 3 ), modelo.getEdad      () },
                { vecTipoColumnas.elementAt ( 4 ), modelo.getPromedio  () }
               
            };
            
        } else if ( accion.equals ( PrincipalFrame.Editar ) ){
            
            mensaje = " El registro ah sido modificado.";  
            
             sql = frmPrincipal.getPropConsultasSQL().getProperty (
                               PrincipalFrame.ALUMNOS_ACTUALIZA_DATOS );
            
            args = new Object [][]{
                { vecTipoColumnas.elementAt ( 1 ), modelo.getNombre    () },
                { vecTipoColumnas.elementAt ( 2 ), modelo.getApellidos () },
                { vecTipoColumnas.elementAt ( 3 ), modelo.getEdad      () },
                { vecTipoColumnas.elementAt ( 4 ), modelo.getPromedio  () },
                { vecTipoColumnas.elementAt ( 0 ), modelo.getMatricula () }
                    
            };
                          
        }
        
        try {
             int regs = EjecutorSQL.sqlEjecutar( sql, args );
             if ( regs == 1 ){
                 frmPrincipal.getjButModulo1().doClick();
                 JOptionPane.showMessageDialog (
                             this,
                             mensaje,
                             accion,
                             JOptionPane.INFORMATION_MESSAGE );
               }
            } catch (SQLException ex) {
                dialogoMensaje ( ex.toString() );
            }
        
        dispose();
    }//GEN-LAST:event_jButGuardarActionPerformed
//--------------------------------------------------------------------------
    //Metodo validar que funciona para validar que los campos no esten vacios o en blanco
    private boolean validarDatos (){
        String matricula = jTextMatricula.getText();
        if ( matricula.trim().equals ( "" ) ){
            dialogoMensaje ( "No se perimite un valor en blanco" );
            jTextMatricula.requestFocus();
            return false;
        }
        
        String nombre = jTextNombre.getText();
        if ( nombre.trim().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jTextNombre.requestFocus();
            return false;
        }
        
        String apellidos = jTextApellidos.getText();
        if ( apellidos.trim().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jTextApellidos.requestFocus();
            return false;
        }
        
        int edad = 0;
        try{
            edad  = Integer.parseInt ( jSpinEdad.getValue().toString() );
        } catch ( NumberFormatException ex ){
            dialogoMensaje ( "Debe capturar un valor numerico valido" );
            jSpinEdad.requestFocus();
            return false;
        }
        
        float promedio;
        try{
            promedio  = Float.parseFloat ( jFormatPromedio.getText() );
        } catch ( NumberFormatException ex ){
            dialogoMensaje ( "Debe capturar un valor numerico valido" );
            jFormatPromedio.requestFocus();
            return false;
        }
        
        modelo = new Modelo1 ( matricula, nombre, apellidos, edad, promedio);
        return true;
                
    }
//--------------------------------------------------------------------------
        
    private void dialogoMensaje ( String mensaje ){
        JOptionPane.showMessageDialog( this, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE );
    }
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
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo1EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modulo1EditarDialog dialog = new Modulo1EditarDialog(new javax.swing.JFrame(), null);
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
    private javax.swing.JFormattedTextField jFormatPromedio;
    private javax.swing.JLabel jLabLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinEdad;
    private javax.swing.JTextField jTextApellidos;
    private javax.swing.JTextField jTextMatricula;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
