
package mx.tecnm.beans;

import java.awt.Frame;
import javax.swing.JOptionPane;


public class DatosPrismaRectangularDialog extends javax.swing.JDialog {

    private jPrismaRectangular parent;
    
    //--------------------------------------------------------------------------
    
    public DatosPrismaRectangularDialog( jPrismaRectangular parent, boolean modal) {
        super( new Frame (), modal);
        initComponents();
        
        //Conservamos la vista
        this.parent = parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBut_Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jText_LargoPrismaRectangular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jText_AlturaPrismaRectangular = new javax.swing.JTextField();
        jText_AnchoPrismaRectangular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBut_Aceptar = new javax.swing.JButton();

        setTitle("Datos Prisma Rectangular");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jBut_Cancelar.setText("Cancelar");
        jBut_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_CancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Altura (h):");

        jLabel3.setText("Largo:");

        jLabel2.setText("Ancho:");

        jBut_Aceptar.setText("Aceptar");
        jBut_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_LargoPrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_AlturaPrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_AnchoPrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBut_Aceptar)
                        .addGap(92, 92, 92)
                        .addComponent(jBut_Cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_AlturaPrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jText_AnchoPrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_LargoPrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBut_Cancelar)
                    .addComponent(jBut_Aceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBut_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_CancelarActionPerformed
        //Cerrar el cuardo de datos
        this.setVisible ( false );  
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_CancelarActionPerformed

    private void jBut_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AceptarActionPerformed
        
        double altura, ancho, largo;

        //Convertimos a número el valor del largo
        
         try {

             altura = Double.parseDouble ( this.jText_AlturaPrismaRectangular.getText () );

        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog ( this ,
                "El valor no es valido" ,
                "Error" ,
                JOptionPane.ERROR_MESSAGE
            );
            this.jText_AlturaPrismaRectangular.requestFocus ();
            return;
        }
         
         //Convertimos a número el valor del altura
         try {

            ancho = Double.parseDouble ( this.jText_AnchoPrismaRectangular.getText () );

        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog ( this ,
                "El valor no es valido" ,
                "Error" ,
                JOptionPane.ERROR_MESSAGE
            );
            this.jText_AnchoPrismaRectangular.requestFocus ();
            return;
        }
         
        //Convertimos a número el valor del ancho
         try {

            largo = Double.parseDouble ( this.jText_LargoPrismaRectangular.getText () );

        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog ( this ,
                "El valor no es valido" ,
                "Error" ,
                JOptionPane.ERROR_MESSAGE
            );
            this.jText_LargoPrismaRectangular.requestFocus ();
            return;
        } 
         //Creamos el eventObjet que servira para disparar en la vista el evento datoModificdos
         DatosModificadosEvent ev  = new DatosModificadosEvent (
                 parent.getAnchoPrismaRectangular(), 
                 parent.getLargoPrismaRectangular(), 
                 parent.getAlturaPrismaRectangular(), ancho, largo, altura
         );
         
         //Esatablecer los datos y el modelo
         parent.setAnchoPrismaRectangular   ( ancho );
         parent.setLargoPrismaRectangular   ( largo  );
         parent.setAlturaPrismaRectangular  ( altura  );
         setVisible                         ( false  );

         //Disparamos el evento datos modificados 
         parent.fireDatosModificadosEvent ( ev );
         
         //---------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AceptarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Inicializamos los valores de los Jtext desde la vista
        this.jText_AlturaPrismaRectangular.setText ( "" + parent.getAlturaPrismaRectangular ( ) );
        this.jText_AnchoPrismaRectangular.setText  ( "" + parent.getAnchoPrismaRectangular  ( ) );
        this.jText_LargoPrismaRectangular.setText  ( "" + parent.getLargoPrismaRectangular  ( ) );
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_formWindowActivated

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut_Aceptar;
    private javax.swing.JButton jBut_Cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jText_AlturaPrismaRectangular;
    private javax.swing.JTextField jText_AnchoPrismaRectangular;
    private javax.swing.JTextField jText_LargoPrismaRectangular;
    // End of variables declaration//GEN-END:variables
}
