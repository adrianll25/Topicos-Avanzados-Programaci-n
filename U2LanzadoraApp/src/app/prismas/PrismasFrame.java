/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                Aplicaion visual para calular diferentes dimensiones
:*        
:*  Archivo     : PrismasFrame.java
:*  Autor       : Magnolia Hernández Aguilera     18131248
:*  Fecha       : 15/10/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripción : Aplicaion visula usando Java Swing que presenta un IU
                  donde el usuario puede ingresar diferentes medidas para:
                       -Cilindro
                       -PrismaTriangular
                       -PrismaRectangular
                  y obtener de cada uno el:
                        -área de la base del prisma
                        -área lateral del prisma
                        -área total del prisma
                        -volumen del prisma
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 20/Octubre/20202 
    Modificó: Magnolia Hernández Aguilera             
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/

package app.prismas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import mx.tecnm.itl.extras.AcercaDeDialog;
import mx.tecnm.itl.prismas.Cilindro;
import mx.tecnm.itl.prismas.PrismaRectangular;
import mx.tecnm.itl.prismas.PrismaTriangular;


public class PrismasFrame extends javax.swing.JFrame {

    
    public PrismasFrame() {
        initComponents();          
}
    
   //---------------------------------------------------------------------------
    
    public static void ejecutar ()
        {
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
            java.util.logging.Logger.getLogger(PrismasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrismasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrismasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrismasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrismasFrame().setVisible(true);
            }
        });
        
        }
    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jText_AlturaCilindro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jText_RadioCilindro = new javax.swing.JTextField();
        jBut_Calcular_Cilindro = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLab_Volumen_Cilindro = new javax.swing.JLabel();
        jLab_AreaBase_Cilindro = new javax.swing.JLabel();
        jLab_AreaLateral_Cilindro = new javax.swing.JLabel();
        jLab_AreaTotal_Cilindro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jText_Base_PrismaTriangular = new javax.swing.JTextField();
        jText_Altura_PrismaTriangular = new javax.swing.JTextField();
        jText_AnchoBase_PrismaTriangular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLab_Volumen_PrismaTriangular = new javax.swing.JLabel();
        jLab_AreaBase_PrismaTriangular = new javax.swing.JLabel();
        jLab_AreaLateral_PrismaTriangular = new javax.swing.JLabel();
        jLab_AreaTotal_PrismaTriangular = new javax.swing.JLabel();
        jBut_Calcular_PrismaTriangular = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jText_Altura_PrismaRectangular = new javax.swing.JTextField();
        jText_Ancho_PrismaRectangular = new javax.swing.JTextField();
        jText_Largo_PrismaRectangular = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLab_Volumen_PrismaRectangular = new javax.swing.JLabel();
        jLab_AreaBase_PrismaRectangular = new javax.swing.JLabel();
        jLab_AreaLateral_PrismaRectangular = new javax.swing.JLabel();
        jLab_AreaTotal_PrismaRectangular = new javax.swing.JLabel();
        jBut_Calcular_PrismaRectangular = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_ArchivoSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_Limpiar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PrismasApp");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cilindro.jpg"))); // NOI18N

        jLabel1.setText("h =");

        jLabel3.setText("Altura");

        jLabel4.setText("Radio");

        jLabel5.setText("r =");

        jBut_Calcular_Cilindro.setText("Calcular");
        jBut_Calcular_Cilindro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_Calcular_Cilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_Calcular_CilindroActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jLabel12.setText("Área base");

        jLabel13.setText("Área lateral");

        jLabel14.setText("Área total");

        jLabel15.setText("Volumen");

        jLab_Volumen_Cilindro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_Volumen_Cilindro.setForeground(new java.awt.Color(255, 0, 0));
        jLab_Volumen_Cilindro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_Volumen_Cilindro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLab_AreaBase_Cilindro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_AreaBase_Cilindro.setForeground(new java.awt.Color(255, 0, 0));
        jLab_AreaBase_Cilindro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_AreaBase_Cilindro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLab_AreaLateral_Cilindro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_AreaLateral_Cilindro.setForeground(new java.awt.Color(255, 0, 0));
        jLab_AreaLateral_Cilindro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_AreaLateral_Cilindro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLab_AreaTotal_Cilindro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_AreaTotal_Cilindro.setForeground(new java.awt.Color(255, 0, 0));
        jLab_AreaTotal_Cilindro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_AreaTotal_Cilindro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(50, 50, 50)
                        .addComponent(jLab_Volumen_Cilindro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(34, 34, 34)
                        .addComponent(jLab_AreaLateral_Cilindro, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(42, 42, 42)
                        .addComponent(jLab_AreaTotal_Cilindro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(jLab_AreaBase_Cilindro, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLab_AreaLateral_Cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLab_AreaTotal_Cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLab_Volumen_Cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLab_AreaBase_Cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(202, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_AlturaCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jText_RadioCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addComponent(jBut_Calcular_Cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jText_AlturaCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jBut_Calcular_Cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_RadioCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cilindro", jPanel1);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Triangular.jpg"))); // NOI18N

        jLabel8.setText("h =");

        jLabel9.setText("Altura");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jLabel16.setText("Área base");

        jLabel17.setText("Área lateral");

        jLabel18.setText("Área total");

        jLabel19.setText("Volumen");

        jLab_Volumen_PrismaTriangular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_Volumen_PrismaTriangular.setForeground(new java.awt.Color(255, 0, 0));
        jLab_Volumen_PrismaTriangular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_Volumen_PrismaTriangular.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLab_AreaBase_PrismaTriangular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_AreaBase_PrismaTriangular.setForeground(new java.awt.Color(255, 0, 0));
        jLab_AreaBase_PrismaTriangular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_AreaBase_PrismaTriangular.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLab_AreaLateral_PrismaTriangular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_AreaLateral_PrismaTriangular.setForeground(new java.awt.Color(255, 0, 0));
        jLab_AreaLateral_PrismaTriangular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_AreaLateral_PrismaTriangular.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLab_AreaTotal_PrismaTriangular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_AreaTotal_PrismaTriangular.setForeground(new java.awt.Color(255, 0, 0));
        jLab_AreaTotal_PrismaTriangular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_AreaTotal_PrismaTriangular.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(50, 50, 50)
                        .addComponent(jLab_Volumen_PrismaTriangular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel16)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(34, 34, 34)
                        .addComponent(jLab_AreaLateral_PrismaTriangular, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(42, 42, 42)
                        .addComponent(jLab_AreaTotal_PrismaTriangular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(jLab_AreaBase_PrismaTriangular, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel16)
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLab_AreaLateral_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel19))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLab_AreaTotal_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLab_Volumen_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLab_AreaBase_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(202, Short.MAX_VALUE)))
        );

        jBut_Calcular_PrismaTriangular.setText("Calcular");
        jBut_Calcular_PrismaTriangular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_Calcular_PrismaTriangular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_Calcular_PrismaTriangularActionPerformed(evt);
            }
        });

        jLabel28.setText("b =");

        jLabel29.setText("Base");

        jLabel30.setText("Altura base");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_Base_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jText_Altura_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                        .addComponent(jBut_Calcular_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addComponent(jText_AnchoBase_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_Altura_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jBut_Calcular_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_AnchoBase_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_Base_PrismaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Prisma Triangular", jPanel2);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangular.jpg"))); // NOI18N

        jLabel10.setText("Altura");

        jLabel11.setText("h =");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jLabel20.setText("Área base");

        jLabel21.setText("Área lateral");

        jLabel22.setText("Área total");

        jLabel23.setText("Volumen");

        jLab_Volumen_PrismaRectangular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_Volumen_PrismaRectangular.setForeground(new java.awt.Color(255, 0, 0));
        jLab_Volumen_PrismaRectangular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_Volumen_PrismaRectangular.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLab_AreaBase_PrismaRectangular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_AreaBase_PrismaRectangular.setForeground(new java.awt.Color(255, 0, 0));
        jLab_AreaBase_PrismaRectangular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_AreaBase_PrismaRectangular.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLab_AreaLateral_PrismaRectangular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_AreaLateral_PrismaRectangular.setForeground(new java.awt.Color(255, 0, 0));
        jLab_AreaLateral_PrismaRectangular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_AreaLateral_PrismaRectangular.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLab_AreaTotal_PrismaRectangular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLab_AreaTotal_PrismaRectangular.setForeground(new java.awt.Color(255, 0, 0));
        jLab_AreaTotal_PrismaRectangular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLab_AreaTotal_PrismaRectangular.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(50, 50, 50)
                        .addComponent(jLab_Volumen_PrismaRectangular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel20)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(34, 34, 34)
                        .addComponent(jLab_AreaLateral_PrismaRectangular, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(42, 42, 42)
                        .addComponent(jLab_AreaTotal_PrismaRectangular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(jLab_AreaBase_PrismaRectangular, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel20)
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLab_AreaLateral_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel23))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLab_AreaTotal_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLab_Volumen_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLab_AreaBase_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(202, Short.MAX_VALUE)))
        );

        jBut_Calcular_PrismaRectangular.setText("Calcular");
        jBut_Calcular_PrismaRectangular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_Calcular_PrismaRectangular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_Calcular_PrismaRectangularActionPerformed(evt);
            }
        });

        jLabel24.setText("L =");

        jLabel25.setText("Largo");

        jLabel26.setText("w =");

        jLabel27.setText("Ancho");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jText_Ancho_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_Altura_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel27)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jBut_Calcular_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jText_Largo_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jBut_Calcular_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_Largo_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(27, 27, 27))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_Altura_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_Ancho_PrismaRectangular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(67, 67, 67))
        );

        jTabbedPane1.addTab("Prisma Rectangular", jPanel3);

        jMenu1.setText("Archivo");

        jMenuItem_ArchivoSalir.setText("Salir");
        jMenuItem_ArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ArchivoSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_ArchivoSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");

        jMenuItem_Limpiar.setText("Limpiar");
        jMenuItem_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_LimpiarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_Limpiar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem_AcercaDe.setText("Acerca de...");
        jMenuItem_AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_AcercaDe);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_ArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ArchivoSalirActionPerformed
     
        dispose ();
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jMenuItem_ArchivoSalirActionPerformed

    private void jMenuItem_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_LimpiarActionPerformed
        
        this.jLab_AreaBase_Cilindro.setText    ( "" ) ;
        this.jLab_AreaLateral_Cilindro.setText  ( "" );
        this.jLab_AreaTotal_Cilindro.setText    ( "" );
        this.jLab_Volumen_Cilindro.setText      ( "" );
        this.jText_AlturaCilindro.setText       ( "" );
        this.jText_RadioCilindro.setText        ( "" );
        this.jText_AlturaCilindro.requestFocus();
        //----------------------------------------------------------------------
        
    }//GEN-LAST:event_jMenuItem_LimpiarActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
      
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jBut_Calcular_CilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_Calcular_CilindroActionPerformed
        DecimalFormat df = new DecimalFormat ( "#.####" );
        
        double radio  = 0;
        double altura = 0;
        
         try {

            radio = Double.parseDouble  ( this.jText_RadioCilindro.getText () );
            altura = Double.parseDouble ( this.jText_AlturaCilindro.getText () );

        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog ( this ,
                "El valor no es valido" ,
                "Error" ,
                JOptionPane.ERROR_MESSAGE
            );
            this.jText_RadioCilindro.requestFocus ();
            this.jText_AlturaCilindro.requestFocus ();
            return;
        }
         
         Cilindro cili = new Cilindro ( radio, altura );
         this.jLab_AreaBase_Cilindro.setText     (  (cili.areaBase ()  + "" ) );
         this.jLab_AreaLateral_Cilindro.setText  (  (cili.areaLateral()+ "" ) );
         this.jLab_AreaTotal_Cilindro.setText    (  (cili.areaTotal()  + "" ) );
         this.jLab_Volumen_Cilindro.setText      (  (cili.volumen()    + "" ) );
         
         
         //---------------------------------------------------------------------
    }//GEN-LAST:event_jBut_Calcular_CilindroActionPerformed

    private void jBut_Calcular_PrismaTriangularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_Calcular_PrismaTriangularActionPerformed
        
        double base         = 0;
        double alturaBase   = 0;
        double alturaPrisma = 0;
        
         try {

            base = Double.parseDouble         ( this.jText_Base_PrismaTriangular.getText () );
            alturaBase = Double.parseDouble   ( this.jText_AnchoBase_PrismaTriangular.getText () );
            alturaPrisma = Double.parseDouble ( this.jText_Altura_PrismaTriangular.getText () );
            
        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog ( this ,
                "El valor no es valido" ,
                "Error" ,
                JOptionPane.ERROR_MESSAGE
            );
            this.jText_Base_PrismaTriangular.requestFocus ();
            this.jText_AnchoBase_PrismaTriangular.requestFocus ();
            this.jText_Altura_PrismaTriangular.requestFocus();
            return;
        }
         
         PrismaTriangular PirsTrang = new PrismaTriangular ( base, alturaBase, alturaPrisma );
         this.jLab_AreaBase_PrismaTriangular.setText     (  (PirsTrang.areaBase ()  + "" ) );
         this.jLab_AreaLateral_PrismaTriangular.setText  (  (PirsTrang.areaLateral()+ "" ) );
         this.jLab_AreaTotal_PrismaTriangular.setText    (  (PirsTrang.areaTotal()  + "" ) );
         this.jLab_Volumen_PrismaTriangular.setText      (  (PirsTrang.volumen()    + "" ) );
         
         
         //---------------------------------------------------------------------
        
    }//GEN-LAST:event_jBut_Calcular_PrismaTriangularActionPerformed

    private void jBut_Calcular_PrismaRectangularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_Calcular_PrismaRectangularActionPerformed
        
        double alturaPrisma         = 0;
        double ancho   = 0;
        double largo = 0;
        
         try {

            alturaPrisma = Double.parseDouble ( this.jText_Altura_PrismaRectangular.getText () );
            ancho = Double.parseDouble        ( this.jText_Ancho_PrismaRectangular.getText () );
            largo = Double.parseDouble        ( this.jText_Largo_PrismaRectangular.getText () );
            
        } catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog ( this ,
                "El valor no es valido" ,
                "Error" ,
                JOptionPane.ERROR_MESSAGE
            );
            this.jText_Altura_PrismaRectangular.requestFocus ();
            this.jText_Ancho_PrismaRectangular.requestFocus ();
            this.jText_Largo_PrismaRectangular.requestFocus();
            return;
        }
         
         PrismaRectangular PirsRec = new PrismaRectangular ( largo, ancho, alturaPrisma );
         this.jLab_AreaBase_PrismaRectangular.setText     (  (PirsRec.areaBase ()  + "" ) );
         this.jLab_AreaLateral_PrismaRectangular.setText  (  (PirsRec.areaLateral()+ "" ) );
         this.jLab_AreaTotal_PrismaRectangular.setText    (  (PirsRec.areaTotal()  + "" ) );
         this.jLab_Volumen_PrismaRectangular.setText      (  (PirsRec.volumen()    + "" ) );
         
         
         //---------------------------------------------------------------------
        
    }//GEN-LAST:event_jBut_Calcular_PrismaRectangularActionPerformed

    private void jMenuItem_AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AcercaDeActionPerformed
        
          AcercaDeDialog dialog = new AcercaDeDialog ( this, true );
        dialog.setVisible ( true );
    }//GEN-LAST:event_jMenuItem_AcercaDeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ejecutar ();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut_Calcular_Cilindro;
    private javax.swing.JButton jBut_Calcular_PrismaRectangular;
    private javax.swing.JButton jBut_Calcular_PrismaTriangular;
    private javax.swing.JLabel jLab_AreaBase_Cilindro;
    private javax.swing.JLabel jLab_AreaBase_PrismaRectangular;
    private javax.swing.JLabel jLab_AreaBase_PrismaTriangular;
    private javax.swing.JLabel jLab_AreaLateral_Cilindro;
    private javax.swing.JLabel jLab_AreaLateral_PrismaRectangular;
    private javax.swing.JLabel jLab_AreaLateral_PrismaTriangular;
    private javax.swing.JLabel jLab_AreaTotal_Cilindro;
    private javax.swing.JLabel jLab_AreaTotal_PrismaRectangular;
    private javax.swing.JLabel jLab_AreaTotal_PrismaTriangular;
    private javax.swing.JLabel jLab_Volumen_Cilindro;
    private javax.swing.JLabel jLab_Volumen_PrismaRectangular;
    private javax.swing.JLabel jLab_Volumen_PrismaTriangular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_AcercaDe;
    private javax.swing.JMenuItem jMenuItem_ArchivoSalir;
    private javax.swing.JMenuItem jMenuItem_Limpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jText_AlturaCilindro;
    private javax.swing.JTextField jText_Altura_PrismaRectangular;
    private javax.swing.JTextField jText_Altura_PrismaTriangular;
    private javax.swing.JTextField jText_AnchoBase_PrismaTriangular;
    private javax.swing.JTextField jText_Ancho_PrismaRectangular;
    private javax.swing.JTextField jText_Base_PrismaTriangular;
    private javax.swing.JTextField jText_Largo_PrismaRectangular;
    private javax.swing.JTextField jText_RadioCilindro;
    // End of variables declaration//GEN-END:variables
}
