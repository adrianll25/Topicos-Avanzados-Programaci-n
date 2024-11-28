
package mx.tecnm.beans;

import java.awt.Frame;
import javax.swing.JOptionPane;


public class DatosPrismaTriangularDialog extends javax.swing.JDialog {

    private jPrismaTriangular parent;
    
    //--------------------------------------------------------------------------
    
    public DatosPrismaTriangularDialog( jPrismaTriangular parent, boolean modal) {
        super( new Frame (), modal);
        initComponents();
        
        //Conservamos la vista
        this.parent = parent;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jText_AlturaPrismaTriangular = new javax.swing.JTextField();
        jText_AlturaBasePrismaTriangular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBut_Aceptar = new javax.swing.JButton();
        jBut_Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jText_BasePrismaTriangular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Datos Prisma Triangular");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel2.setText("Altura Base:");

        jBut_Aceptar.setText("Aceptar");
        jBut_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_AceptarActionPerformed(evt);
            }
        });

        jBut_Cancelar.setText("Cancelar");
        jBut_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_CancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Altura (h):");

        jLabel3.setText("Base (L):");

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
                            .addComponent(jText_BasePrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_AlturaPrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_AlturaBasePrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jText_AlturaPrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jText_AlturaBasePrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_BasePrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
        //--------------------------------------------------------------------------
    }//GEN-LAST:event_jBut_CancelarActionPerformed

    private void jBut_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AceptarActionPerformed
         double  altura, alturaBase;
         float base;
        //Convertimos a número el valor del largo
        
         try {

             altura = Double.parseDouble ( this.jText_AlturaPrismaTriangular.getText () );

        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog ( this ,
                "El valor no es valido" ,
                "Error" ,
                JOptionPane.ERROR_MESSAGE
            );
            this.jText_AlturaPrismaTriangular.requestFocus ();
            return;
        }
         
         //Convertimos a número el valor del altura
         try {

            alturaBase = Double.parseDouble ( this.jText_AlturaBasePrismaTriangular.getText () );

        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog ( this ,
                "El valor no es valido" ,
                "Error" ,
                JOptionPane.ERROR_MESSAGE
            );
            this.jText_AlturaBasePrismaTriangular.requestFocus ();
            return;
        }
         
        //Convertimos a número el valor del ancho
         try {

            base = ( float ) Double.parseDouble ( this.jText_BasePrismaTriangular.getText () );

        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog ( this ,
                "El valor no es valido" ,
                "Error" ,
                JOptionPane.ERROR_MESSAGE
            );
            this.jText_BasePrismaTriangular.requestFocus ();
            return;
        } 
         
         //Creamos el eventObjet que servira para disparar en la vista el evento datoModificdos
         DatosModificadosEvent ev  = new DatosModificadosEvent (
                 
                 parent.getBasePrismaTriangular (), 
                 parent.getAlturaBasePrismaTriangular (), 
                 parent.getAlturaPrismaTriangular (), base, alturaBase, altura
         );
         
         //Esatablecer los datos y el modelo
         parent.setBasePrismaTriangular        ( base ); 
         parent.setAlturaBasePrismaTriangular  ( alturaBase );        
         parent.setAlturaPrismaTriangular      ( altura  );
         setVisible                            ( false  );
         
         //Disparamos el evento datos modificados 
         parent.fireDatosModificadosEvent ( ev );
         
         //---------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AceptarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Inicializamos los valores de los Jtext desde la vista
        this.jText_BasePrismaTriangular.setText       ( "" + parent.getBasePrismaTriangular () );
        this.jText_AlturaBasePrismaTriangular.setText ( "" + parent.getAlturaBasePrismaTriangular () );
        this.jText_AlturaPrismaTriangular.setText     ( "" + parent.getAlturaPrismaTriangular () );
        

        //----------------------------------------------------------------------      
    }//GEN-LAST:event_formWindowActivated

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut_Aceptar;
    private javax.swing.JButton jBut_Cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jText_AlturaBasePrismaTriangular;
    private javax.swing.JTextField jText_AlturaPrismaTriangular;
    private javax.swing.JTextField jText_BasePrismaTriangular;
    // End of variables declaration//GEN-END:variables
}
