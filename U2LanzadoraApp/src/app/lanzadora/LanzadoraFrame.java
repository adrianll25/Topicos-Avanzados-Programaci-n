/*                       TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*              Aplicaion visual para llamar a distinas aplicaciones
:*        
:*  Archivo     : LanzadoraFrame.java
:*  Autor       : Magnolia Hernández Aguilera     18131248
:*  Fecha       : 28/Oct/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripción : Aplicaion visula usando Java Swing que presenta ua IU
                  donde el usuario puede seleccionar entre 3 botones que splicaciones
                   quiere usar,
                  1. MatematicaApp
                  2. ConversionesApp
                  3. PrismasApp
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 29/Octubre/20202 
    Modificó: Magnolia Hernández Aguilera             
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/
package app.lanzadora;

import mx.tecnm.itl.util.imagen;

public class LanzadoraFrame extends javax.swing.JFrame {

    public LanzadoraFrame() {
        initComponents();
        
        
        //Ajueste de tamaño del boton 1
        this.jBut_AppConverciones.setIcon(
                imagen.escalarImagen(
                        this.jBut_AppConverciones.getIcon   () , 
                        this.jBut_AppConverciones.getWidth  (),
                        this.jBut_AppConverciones.getHeight ()
                        )
        );
        
        //Ajueste de tamaño del boton 2
        this.jBut_AppMatematica.setIcon(
                imagen.escalarImagen(
                        this.jBut_AppMatematica.getIcon   () , 
                        this.jBut_AppMatematica.getWidth  (),
                        this.jBut_AppMatematica.getHeight ()
                        )
        );
        
        //Ajueste de tamaño del boton 3
        this.jBut_AppPrismas.setIcon(
                imagen.escalarImagen(
                        this.jBut_AppPrismas.getIcon   () , 
                        this.jBut_AppPrismas.getWidth  (),
                        this.jBut_AppPrismas.getHeight ()
                        )
        );
    }
    
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_Unidad1 = new javax.swing.JPanel();
        jBut_AppMatematica = new javax.swing.JButton();
        jBut_AppPrismas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBut_AppConverciones = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Descripcion_App = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_Salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lanzadora App");

        jPanel_Unidad1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel_Unidad1MouseMoved(evt);
            }
        });

        jBut_AppMatematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mate.jpg"))); // NOI18N
        jBut_AppMatematica.setText("jButton1");
        jBut_AppMatematica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_AppMatematica.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBut_AppMatematicaMouseMoved(evt);
            }
        });
        jBut_AppMatematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_AppMatematicaActionPerformed(evt);
            }
        });

        jBut_AppPrismas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/geometria.jpg"))); // NOI18N
        jBut_AppPrismas.setText("jButton1");
        jBut_AppPrismas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_AppPrismas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBut_AppPrismasMouseMoved(evt);
            }
        });
        jBut_AppPrismas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_AppPrismasActionPerformed(evt);
            }
        });

        jLabel2.setText("Aplicación Matematica");

        jBut_AppConverciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mate1.jpg"))); // NOI18N
        jBut_AppConverciones.setText("jButton1");
        jBut_AppConverciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_AppConverciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBut_AppConvercionesMouseMoved(evt);
            }
        });
        jBut_AppConverciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_AppConvercionesActionPerformed(evt);
            }
        });

        jLabel5.setText("Aplicación Conversiones");

        jLabel6.setText("Aplicación Prisma");

        javax.swing.GroupLayout jPanel_Unidad1Layout = new javax.swing.GroupLayout(jPanel_Unidad1);
        jPanel_Unidad1.setLayout(jPanel_Unidad1Layout);
        jPanel_Unidad1Layout.setHorizontalGroup(
            jPanel_Unidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Unidad1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBut_AppMatematica, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jBut_AppConverciones, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBut_AppPrismas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel_Unidad1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(118, 118, 118)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(60, 60, 60))
        );
        jPanel_Unidad1Layout.setVerticalGroup(
            jPanel_Unidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Unidad1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Unidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBut_AppMatematica, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBut_AppPrismas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBut_AppConverciones, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_Unidad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Unidad 1", jPanel_Unidad1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Unidad 2", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Unidad 3", jPanel3);

        jLabel7.setText("Aplicación Conversiones");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel7)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(482, 482, 482)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Unidad 4", jPanel4);

        jLabel1.setText("Descripción de la aplicación:");

        jTextArea_Descripcion_App.setColumns(20);
        jTextArea_Descripcion_App.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Descripcion_App);

        jMenu1.setText("Archivo");

        jMenuItem_Salir.setText("Salir");
        jMenuItem_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem_AcercaDe.setText("Acerca de...");
        jMenuItem_AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_AcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SalirActionPerformed
          dispose ();
          
        //--------------------------------------------------------------------
    }//GEN-LAST:event_jMenuItem_SalirActionPerformed

    private void jMenuItem_AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AcercaDeActionPerformed
       
    }//GEN-LAST:event_jMenuItem_AcercaDeActionPerformed

    private void jBut_AppMatematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AppMatematicaActionPerformed
        app.matematica.SplashJFrame.ejecutar();
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppMatematicaActionPerformed

    private void jBut_AppConvercionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AppConvercionesActionPerformed
        app.conversiones.SplashJFrame.ejecutar();
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppConvercionesActionPerformed

    private void jBut_AppPrismasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AppPrismasActionPerformed
        app.prismas.SplashFrame.ejecutar();
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppPrismasActionPerformed

    private void jBut_AppMatematicaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBut_AppMatematicaMouseMoved
        this.jTextArea_Descripcion_App.setText ( "La aplicacion Matematica, \n" +
             "permite al usuario obtener el resultado de las siguientes operaciones \n" +
             "-Factorización \n" +
             "-Permutacion   \n" +
             "-Combinación"   );
        
        //-----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppMatematicaMouseMoved

    private void jBut_AppConvercionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBut_AppConvercionesMouseMoved
        this.jTextArea_Descripcion_App.setText ( "La aplicación Converciones, "
                + "permite que el usuario pueda ingresar los datos en \n"
                + "distintos campos, de acuerdo al tipo de converción que quiera hacer." 
        );
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppConvercionesMouseMoved

    private void jBut_AppPrismasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBut_AppPrismasMouseMoved
        this.jTextArea_Descripcion_App.setText ( "La aplicación Prismas, " +
                " ayuda al usuario a obtener \n "
                + "los siguientes valores: \n"
                + "-área de la base \n"
                + "-área latral \n"
                + "-área total \n"
                + "-volumen \n"
                + "de un cilindor, un prisma triangular" 
                + "y un prisma triangular ");
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppPrismasMouseMoved

    private void jPanel_Unidad1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Unidad1MouseMoved
        this.jTextArea_Descripcion_App.setText ( "" );
    }//GEN-LAST:event_jPanel_Unidad1MouseMoved

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
                if ("Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LanzadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LanzadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LanzadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LanzadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LanzadoraFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut_AppConverciones;
    private javax.swing.JButton jBut_AppMatematica;
    private javax.swing.JButton jBut_AppPrismas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_AcercaDe;
    private javax.swing.JMenuItem jMenuItem_Salir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_Unidad1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea_Descripcion_App;
    // End of variables declaration//GEN-END:variables
}
