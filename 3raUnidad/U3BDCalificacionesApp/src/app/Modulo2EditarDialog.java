/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                JDialogForm  Modulo2 que se dispara un un JPanel
:*        
:*  Archivo     : Modulo2EditarDialog.java
:*  Autor       : Jesus Adrian Lopez Luevanos   18131253
:*  Fecha       : 14/12/2020 
:*  Compilador  : JAVA v1.8.2
:*  Descripción : JdialogFrom que captura los datos de una materia  para agregar 
                  un nuevo registro a la tabla MATERIA  ingresando los datos corresponientes
                  en el Dialogo que se muestra o para actualizar un registro 
                  que ya existe en la tabla 
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 
    Modificó:        
    Motivo:  
:*------------------------------------------------------------------------------------------*/

package app;


import Modelo.Modelo2;
import static app.PrincipalFrame.MATERIAS_ACTUALIZA_DATOS;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mx.tecnm.itl.util.Imagenes;
import mx.tecnm.jdbc.EjecutorSQL;

//--------------------------------------------------------------------------
    //Variables
public class Modulo2EditarDialog extends javax.swing.JDialog {
    private PrincipalFrame frmPrincipal;
    private Modelo2        modelo;
    private String         accion;
    private Vector<String> vecTipoColumnas;
    private String         sql;

//--------------------------------------------------------------------------
    //Constructor    
    public Modulo2EditarDialog(java.awt.Frame parent, Modelo2 modelo) {
        super( parent, true );
        initComponents();
        
        frmPrincipal    = ( PrincipalFrame ) parent;
        this.modelo     = modelo;
        vecTipoColumnas = frmPrincipal.getVecTiposColumnas ();
        
        accion = ( modelo == null )? PrincipalFrame.Nuevo : PrincipalFrame.Editar;
        setTitle ( accion );
        
        jLabLogo.setIcon( Imagenes.escalarImagen ( jLabLogo.getIcon() , 109, 104 ) );
        inicializarFormulario ();
   
    }
//--------------------------------------------------------------------------
    //Metodo para inicializar el formulario
    private void inicializarFormulario (){
        if ( accion.equals( PrincipalFrame.Nuevo ) ){
            jTextIdMateria.requestFocus();
        } else if ( accion.equals   ( PrincipalFrame.Editar ) ) {
            jTextIdMateria.setText  ( modelo.getIdmateria  () );
            jTextMateria.setText    ( modelo.getMateria    () );
            jSpinCreditos.setValue  ( modelo.getCreditos   () );
            
            jTextMateria.requestFocus ();
            jTextIdMateria.setEditable( false );
       
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextMateria = new javax.swing.JTextField();
        jTextIdMateria = new javax.swing.JTextField();
        jLabLogo = new javax.swing.JLabel();
        jButGuardar = new javax.swing.JButton();
        jButCancelar = new javax.swing.JButton();
        jSpinCreditos = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID Materia");

        jLabel2.setText("Materia");

        jLabel3.setText("Creditos ");

        jLabLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Materia_app.png"))); // NOI18N
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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButCancelar)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButGuardar)
                    .addComponent(jButCancelar))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//--------------------------------------------------------------------------
    //boton salir
    private void jButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButCancelarActionPerformed
//--------------------------------------------------------------------------
    //boton guardar
    private void jButGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGuardarActionPerformed
       Object [][] args = null;
       String mensaje = "";
                
        if ( validarDatos () == false )
            return;
        
        //Se determina la sentencia sql a ejecutar y forma la matriz de argumentos
        if        ( accion.equals( PrincipalFrame.Nuevo ) ){
            
            mensaje = " El registro ah sido agregado.";  
            
            sql = frmPrincipal.getPropConsultasSQL().getProperty (
                               PrincipalFrame.MATERIAS_INSERTA_NUEVO );
            
            args = new Object [][]{
                { vecTipoColumnas.elementAt ( 0 ), modelo.getIdmateria ()},
                { vecTipoColumnas.elementAt ( 1 ), modelo.getMateria   ()},
                { vecTipoColumnas.elementAt ( 2 ), modelo.getCreditos  ()}

               
            };
            
        } else if ( accion.equals ( PrincipalFrame.Editar ) ){
            
            mensaje = " El registro ah sido modificado.";  
            
             sql = frmPrincipal.getPropConsultasSQL().getProperty (
                               PrincipalFrame.MATERIAS_ACTUALIZA_DATOS );
            
            args = new Object [][]{
                
                { vecTipoColumnas.elementAt ( 1 ), modelo.getMateria   ()},
                { vecTipoColumnas.elementAt ( 2 ), modelo.getCreditos  ()},
                { vecTipoColumnas.elementAt ( 0 ), modelo.getIdmateria ()}
                    
            };
                          
        }
        
        try {
             int regs = EjecutorSQL.sqlEjecutar( sql, args );
             if ( regs == 1 ){
                 frmPrincipal.getjButModulo2().doClick();
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
    //Metodo que sirve para validar que los campos no esten en blanco o vacios
    public boolean validarDatos (){
        String idmateria = jTextIdMateria.getText();
        if ( idmateria.trim().equals ( "" ) ){
            dialogoMensaje ( "No se perimite un valor en blanco" );
            jTextIdMateria.requestFocus();
            return false;
        }
        
        String materia = jTextMateria.getText();
        if ( materia.trim().equals ( "" ) ) {
            dialogoMensaje ( "No se permite un valor en blanco" );
            jTextMateria.requestFocus();
            return false;
        } 
        
        int creditos = 0;
        try{
            creditos  = Integer.parseInt ( jSpinCreditos.getValue().toString() );
        } catch ( NumberFormatException ex ){
            dialogoMensaje ( "Debe capturar un valor numerico valido" );
            jSpinCreditos.requestFocus();
            return false;
        }
        
        modelo = new Modelo2 ( idmateria, materia, creditos );
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
            java.util.logging.Logger.getLogger(Modulo2EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo2EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo2EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo2EditarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modulo2EditarDialog dialog = new Modulo2EditarDialog(new javax.swing.JFrame(), null);
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
    private javax.swing.JLabel jLabLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jSpinCreditos;
    private javax.swing.JTextField jTextIdMateria;
    private javax.swing.JTextField jTextMateria;
    // End of variables declaration//GEN-END:variables
}
