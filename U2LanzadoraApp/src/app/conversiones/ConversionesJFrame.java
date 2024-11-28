/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                Aplicaion visual para calular operaciones matematicas
:*        
:*  Archivo     : ConversionesJFrame.java
:*  Autor       : Magnolia Hernández Aguilera     18131248
:*  Fecha       : 05/10/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripción : Aplicaion visula usando Java Swing que presenta un IU
                  donde el usuario puede seleccionar el tipo de conversion
                  matematica a calcular, capturando los datos y obteniendo 
                  el resultado de dicha conversiones.
                   de: • De oC a oF
                       • De oF a oC
                       • De yardas a metros
                       • De metros a yardas
                       • De libras a kilos
                       • De kilos a libras
                       • De decimal a binario
                       • De binario a decimal
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 06/Octubre/20202 
    Modificó: Magnolia Hernández Aguilera             
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/

package app.conversiones;
import mx.tecnm.itl.calculos.Conversiones;
import javax.swing.JOptionPane;

public class ConversionesJFrame extends javax.swing.JFrame {

     //--------------------------------------------------------------------------
    
    public ConversionesJFrame() {
        initComponents();
    }
 
    public static void ejecutar () {
    /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConversionesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversionesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversionesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversionesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversionesJFrame().setVisible(true);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComBox_Conver = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jText_Datos = new javax.swing.JTextField();
        jText_D = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jText_Resultado = new javax.swing.JTextField();
        jBut_Calcular = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONVERSIONES APP");

        jComBox_Conver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De °C a °F", "De °F a °C", "De yardas a metros", "De metros a yardas", "De libras a kilos", "De kilos a libras", "De decimal a binario", "De binario a decimal", " " }));
        jComBox_Conver.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComBox_ConverItemStateChanged(evt);
            }
        });

        jLabel1.setText("CONVERSIONES:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText_D)
                    .addComponent(jText_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jText_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jText_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CONVERSIONES"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jText_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jText_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBut_Calcular.setText("CALCULAR");
        jBut_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_CalcularActionPerformed(evt);
            }
        });

        jButton1.setText("?");
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jBut_Calcular)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jComBox_Conver, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComBox_Conver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jBut_Calcular)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     //-------------------------------------------------------------------------
    
    private void jBut_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_CalcularActionPerformed
         double n;
         long   d = 0;
        String conversion = this.jComBox_Conver.getSelectedItem().toString();

         try {

            n = Double.parseDouble ( this.jText_Datos.getText () );

        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog ( this ,
                "El valor no es valido" ,
                "Error" ,
                JOptionPane.ERROR_MESSAGE
            );
            this.jText_Datos.requestFocus ();
            return;
        }
         
        try {
            if ( conversion.equals ( "De decimal a binario" ) )

            d = Integer.parseInt( this.jText_D.getText() );

        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog ( this ,
                "El valor de n debe ser un número entero" ,
                "Error" ,
                JOptionPane.ERROR_MESSAGE
            );
            this.jText_D.requestFocus ();
            return;
        }
        
          if ( conversion.equals         ( "De °C a °F" ) )           {
            this.jText_Resultado.setText ( Conversiones.celsius_fahrenheit ( n ) + "" );
            
        }  else if  ( conversion.equals  ( "De °F a °C" ) )           {
            this.jText_Resultado.setText ( Conversiones.fahrenheit_celsius ( n ) + "" );
            
        }   else if ( conversion.equals  ( "De yardas a metros") )    {
            this.jText_Resultado.setText ( Conversiones.yardas_metros      ( n ) + "" );
            
        }  else if  ( conversion.equals  ( "De metros a yardas" )  )  {
            this.jText_Resultado.setText ( Conversiones.metros_yardas      ( n ) + "" );
            
        }  else if  ( conversion.equals  ( "De libras a kilos" ) )    {
            this.jText_Resultado.setText ( Conversiones.libras_kilos       ( n ) + "" );
            
        }  else if  ( conversion.equals  ( "De kilos a libras"  ) )   {
            this.jText_Resultado.setText ( Conversiones.kilos_libras       ( n ) + "" );
            
        }  else if  ( conversion.equals  ( "De decimal a binario" ) ) {
            this.jText_Resultado.setText ( Conversiones.Decimal_Binario( d ) + "" );
            
        }  else if  ( conversion.equals  ( "De binario a decimal" ) ) {
           this.jText_Resultado.setText ( Conversiones.Binario_Decimal( "" ) + "" );
        } 
    }//GEN-LAST:event_jBut_CalcularActionPerformed

    private void jComBox_ConverItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComBox_ConverItemStateChanged
        if ( this.jComBox_Conver.getSelectedItem ().toString ().equals( "De decimal a binario" ) ) {
            this.jText_Datos.setVisible ( false );
            this.jText_D.setVisible     ( true );
        }
    }//GEN-LAST:event_jComBox_ConverItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JOptionPane.showMessageDialog (
            this,
            "TECNOLOGICO NACIONAL DE MÉXICO \n" +
            "Instituto Tecnologico de La Laguna \n" +
            "ISC \t Topicos Avanzados de Programacion \n\n" +
            "ConersionesApp v1.0 \n\n" +
            "Desarrollado por: \n" +
            "Magnolia Hernández Aguilera \n\n" +
            "(C) Derechos reservados 2020",
            "Acerca de",
            JOptionPane.INFORMATION_MESSAGE
            
        );
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ejecutar ();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut_Calcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComBox_Conver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jText_D;
    private javax.swing.JTextField jText_Datos;
    private javax.swing.JTextField jText_Resultado;
    // End of variables declaration//GEN-END:variables
}
