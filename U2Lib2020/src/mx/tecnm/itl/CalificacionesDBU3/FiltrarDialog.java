/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*              JDialogForm Filtrar dialog que se dispara un un JPanel
:*        
:*  Archivo     : FiltrarDialog.java
:*  Autor       : jesus Adrian Lopez Luevanos  18131253
:*  Fecha       : 16/12/2020
:*  Compilador  : JAVA v1.8.2
:*  Descripción : JdialogFrom que muestra operadores logicos y de cadena
                  para filtrar los registros y tener solo los que el usuario 
                  solicite.
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 
    Modificó:             
    Motivo:   
:*------------------------------------------------------------------------------------------*/

package mx.tecnm.itl.CalificacionesDBU3;

import java.util.Vector;
import javax.swing.JOptionPane;
import mx.tecnm.jdbc.EjecutorSQL;


public class FiltrarDialog extends javax.swing.JDialog {

private PrincipalFrame frmPrincipal;
private Vector<String> vecColumnas;
private Vector<String> vecColumnasDB;
private Vector<String> vecTipos;
private boolean        Inicializando = true;

//Constructor----------------------------------------------------------
    public FiltrarDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        frmPrincipal   = ( PrincipalFrame ) parent;
        vecColumnas    = frmPrincipal.getVecNombresColumnas();
        vecColumnasDB  = frmPrincipal.getVecNombresColumnasDB();
        vecTipos       = frmPrincipal.getVecTiposColumnas();
        
        jCboColumna.removeAllItems();
        
        for ( int i = 0; i < vecColumnas.size(); i++){
            
            jCboColumna.addItem( vecColumnas.elementAt ( i ) );
        }
        
        cargarComparadores ( 0 );
        jCboColumna.setSelectedIndex ( 0 );
        jCboColumna.requestFocus();
        Inicializando = false;
    }
    
 //--------------------------------------------------------------------------
        private void cargarComparadores ( int pos ){
        jCboComparador.removeAllItems();
        if ( vecTipos.elementAt ( pos ).equals ( EjecutorSQL.STRING ) ){
            
            jCboComparador.addItem( "Sea igual a"   );
            jCboComparador.addItem( "Empiece con"   );
            jCboComparador.addItem( "Termine con"   );
            jCboComparador.addItem( "Contenga"      );
            jCboComparador.addItem( "Sea diferente" );
                        
        }else if ( vecTipos.elementAt ( pos ).equals ( EjecutorSQL.INT ) ||
                   vecTipos.elementAt ( pos ).equals ( EjecutorSQL.FLOAT ) ) {
            jCboComparador.addItem( "="   );
            jCboComparador.addItem( "<>"  );
            jCboComparador.addItem( ">"  );
            jCboComparador.addItem( "<"  );
            jCboComparador.addItem( "<="  );
            jCboComparador.addItem( ">="  );
                       
        }
        jCboComparador.setSelectedIndex ( 0 );
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
        jLabel4 = new javax.swing.JLabel();
        jCboColumna = new javax.swing.JComboBox<>();
        jCboComparador = new javax.swing.JComboBox<>();
        jTextValor = new javax.swing.JTextField();
        jButAceptar = new javax.swing.JButton();
        jButCancelar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FILTRAR");

        jLabel2.setText("Columna: ");

        jLabel3.setText("Comparador: ");

        jLabel4.setText("Valor:");

        jCboColumna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCboColumna.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCboColumnaItemStateChanged(evt);
            }
        });

        jCboComparador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValorActionPerformed(evt);
            }
        });

        jButAceptar.setText("Aceptar");
        jButAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAceptarActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel3)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCboColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jCboComparador, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButAceptar)
                .addGap(119, 119, 119)
                .addComponent(jButCancelar)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCboColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboComparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButAceptar)
                    .addComponent(jButCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//--------------------------------------------------------------------------
    
    private void jButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCancelarActionPerformed
        dispose ();
        
    }//GEN-LAST:event_jButCancelarActionPerformed
//--------------------------------------------------------------------------
    
    private void jButAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAceptarActionPerformed
          if ( jTextValor.getText().trim().equals( "" )){
            JOptionPane.showMessageDialog( this, "Proporcione el valor", 
                                                 "Filtrar", JOptionPane.ERROR_MESSAGE);
            
            jTextValor.requestFocus();
            return;
        }
          
          String sql = "";
          String orderBy = "";
          
          if ( frmPrincipal.getModuloActual().equals ( PrincipalFrame.TIT_MODULO1 ) ){
          sql = frmPrincipal.getPropConsultasSQL().getProperty(
                             PrincipalFrame.ALUMNOS_TODOS_SIN_ORDEN );
                      orderBy = " order by nombre ";
          }else if ( frmPrincipal.getModuloActual().equals ( PrincipalFrame.TIT_MODULO2 ) ){
                      sql = frmPrincipal.getPropConsultasSQL().getProperty(
                             PrincipalFrame.MATERIAS_TODOS_SIN_ORDEN );
                     orderBy = " order by materua ";
          }else if ( frmPrincipal.getModuloActual().equals ( PrincipalFrame.TIT_MODULO3 ) ) {
                      sql = frmPrincipal.getPropConsultasSQL().getProperty(
                             PrincipalFrame.KARDEX_TODOS_SIN_ORDEN );
                      orderBy = " order by matricula ";
          }

          sql += " where " + vecColumnasDB.elementAt( jCboColumna.getSelectedIndex() );
          
          String tipo   = vecTipos.elementAt( jCboColumna.getSelectedIndex() );
          String valor  = jTextValor.getText();
          
          if ( jCboComparador.getSelectedItem().toString().equals ( "Sea igual a" ) ) {
          sql += " = ? ";
      
         }else if ( jCboComparador.getSelectedItem().toString().equals ( "Empiece con"   ) ) {
          sql   += " Like ? ";
          valor += "%";
          
         }else if ( jCboComparador.getSelectedItem().toString().equals ( "Termine con"   ) ) {
          sql   += " Like ? ";
          valor  = "%" + valor;
          
         }else if ( jCboComparador.getSelectedItem().toString().equals ( "Contenga"      ) ) {
          sql   += " Like ? ";
          valor  = "%" + valor + "%";
          
         }else if ( jCboComparador.getSelectedItem().toString().equals ( "Sea diferente" ) ) {
          sql   += " <> ? ";
          
         }else 
             sql += jCboComparador.getSelectedItem().toString() + " ? ";
      
          sql += orderBy;
          
          Object [][] args = { {tipo, valor } };
          frmPrincipal.desplegarRegistros ( sql, args );
          dispose();
    }//GEN-LAST:event_jButAceptarActionPerformed
//--------------------------------------------------------------------------
    
    private void jCboColumnaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCboColumnaItemStateChanged
        if ( ! Inicializando ){
        cargarComparadores ( jCboColumna.getSelectedIndex() );
        }
    }//GEN-LAST:event_jCboColumnaItemStateChanged
//--------------------------------------------------------------------------
    
    private void jTextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorActionPerformed
        
        
    }//GEN-LAST:event_jTextValorActionPerformed

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
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltrarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FiltrarDialog dialog = new FiltrarDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButAceptar;
    private javax.swing.JButton jButCancelar;
    private javax.swing.JComboBox<String> jCboColumna;
    private javax.swing.JComboBox<String> jCboComparador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables
}
