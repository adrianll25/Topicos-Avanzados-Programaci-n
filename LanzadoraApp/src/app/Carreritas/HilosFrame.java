/* -----------------------------------------------------------------------------
                       INSTITUTO TECNOLOGICO DE LA LAGUNA
                     INGENIERIA EN SISTEMAS COMPUTACIONALES
                       TOPICOS AVANZADOS DE PROGRAMACION "B"

                   SEMESTRE: ENE-JUN/2020   HORA: 10-11 HRS

                          JFrame HilosFrame 


  Archivo     : HilosFrame.java
  Autor       : jesus Adrian Lopez Luevanos 18131253
  Fecha       : 12/10/2021
  Compilador  : Java j2SE V1.8.0
  Descripción : Frame donde se utiliza la clase MiHilo para crear varios hilos, 
                en el frame podemos observar cual de los hilos llega primero 
                atravez de un progress bar, el primero que llega a 100 gana y se
                muestra la leyenda Ganador.

--------------------------------------------------------------------------------
Ultima Modificacion: 
Fecha: 15/01/2021
Modifico: Jesus Adrian Lopez Luevanos
Motivo: Añadir Prologo
*/
package app.Carreritas;


import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class HilosFrame extends javax.swing.JFrame {

//------------------------------------------------------------------------------
    //Se inicia la variable HayGanador
    private boolean HayGanador; 
 
//------------------------------------------------------------------------------
    //Se hace invisble la leyenda Ganador
    public HilosFrame() {
        initComponents();
        jLabGanador1.setVisible ( false );
        jLabGanador2.setVisible ( false );
        jLabGanador3.setVisible ( false );
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextHilo1 = new javax.swing.JTextField();
        jTextHilo2 = new javax.swing.JTextField();
        jTextHilo3 = new javax.swing.JTextField();
        jpbHilo1 = new javax.swing.JProgressBar();
        jpbHilo2 = new javax.swing.JProgressBar();
        jpbHilo3 = new javax.swing.JProgressBar();
        jLabGanador1 = new javax.swing.JLabel();
        jLabGanador2 = new javax.swing.JLabel();
        jLabGanador3 = new javax.swing.JLabel();
        jButIniciar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("1:");

        jLabel2.setText("2:");

        jLabel3.setText("3:");

        jTextHilo1.setText("Tio Rios");
        jTextHilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHilo1ActionPerformed(evt);
            }
        });

        jTextHilo2.setText("Tio Ulloita");

        jTextHilo3.setText("Tio Oswi");

        jpbHilo1.setStringPainted(true);

        jpbHilo2.setStringPainted(true);

        jpbHilo3.setStringPainted(true);

        jLabGanador1.setText("Ganador");

        jLabGanador2.setText("Ganador");

        jLabGanador3.setText("Ganador");

        jButIniciar.setText("Iniciar");
        jButIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButIniciarActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpbHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabGanador2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpbHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabGanador1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpbHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabGanador3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jButIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpbHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabGanador1)
                    .addComponent(jTextHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpbHilo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabGanador2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpbHilo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabGanador3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButIniciar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//------------------------------------------------------------------------------
    //Boton Iniciar
    private void jButIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButIniciarActionPerformed
        
        jLabGanador1.setVisible ( false );
        jLabGanador2.setVisible ( false );
        jLabGanador3.setVisible ( false );
        
        HayGanador   = false;
        MiHilo hilo1 = new MiHilo ( "Tio Rios",       this );
        MiHilo hilo2 = new MiHilo ( "Tio Ulloita",    this );
        MiHilo hilo3 = new MiHilo ( "Tio Oswi",       this );
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        
    }//GEN-LAST:event_jButIniciarActionPerformed

    private void jTextHilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHilo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHilo1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose ();
    }//GEN-LAST:event_jButton1ActionPerformed

//------------------------------------------------------------------------------
    synchronized public void setProgreso( String nombre, int progreso ){
        
        if( nombre.equals ( jTextHilo1.getText () ) ){
           mostrarProgreso ( progreso, jpbHilo1, jLabGanador1 );
        } else if( nombre.equals ( jTextHilo2.getText () ) ){
           mostrarProgreso ( progreso, jpbHilo2, jLabGanador2 );
        } else if( nombre.equals ( jTextHilo3.getText () ) ){
           mostrarProgreso ( progreso, jpbHilo3, jLabGanador3 );
        } 
    }
 
//------------------------------------------------------------------------------
    
    private void mostrarProgreso (int progreso, JProgressBar jpbProgreso, 
                                  JLabel jLabGanador ){
        jpbProgreso.setValue( progreso );
        if ( progreso == 100 && ! HayGanador ){
                HayGanador = true;
                jLabGanador.setVisible ( true );
        
      }
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
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HilosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HilosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButIniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabGanador1;
    private javax.swing.JLabel jLabGanador2;
    private javax.swing.JLabel jLabGanador3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextHilo1;
    private javax.swing.JTextField jTextHilo2;
    private javax.swing.JTextField jTextHilo3;
    private javax.swing.JProgressBar jpbHilo1;
    private javax.swing.JProgressBar jpbHilo2;
    private javax.swing.JProgressBar jpbHilo3;
    // End of variables declaration//GEN-END:variables
}
