/*                       TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*              Aplicaion visual para llamar a distinas aplicaciones de la U1
:*        
:*  Archivo     : GlobosFrame.java
:*  Autor       : Jesus Adrian Lopez luevanos 18131253    
:*  Fecha       : 21/01/2021
:*  Compilador  : JAVA v1.8.2
:*  Descripción : Aplicaion visual usando Java Swing que presenta un IU
                  donde el usuario puede seleccionar entre 3 botones de aplicaciones
                  que requiera usar
                  1. MatematicaApp,  2. ConversionesApp, 3. PrismasApp
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 
    Modificó:             
    Motivo:     
:*------------------------------------------------------------------------------------------*/
package app.Lanzadora;

import mx.tecnm.itl.util.Imagenes;
import mx.tecnm.itl.extras.AcercaDeDialog;
import app.Conversiones.ConversionesFrame;

public class LanzadorFrame extends javax.swing.JFrame {

    public LanzadorFrame() {
        initComponents();
        
        
        //Ajueste de tamaño del boton 1
        this.jBut_AppConverciones.setIcon(
                Imagenes.escalarImagen(
                        this.jBut_AppConverciones.getIcon   () , 
                        this.jBut_AppConverciones.getWidth  (),
                        this.jBut_AppConverciones.getHeight ()
                        )
        );
        
        //Ajueste de tamaño del boton 2
        this.jBut_AppMatematica.setIcon(
                Imagenes.escalarImagen(
                        this.jBut_AppMatematica.getIcon   () , 
                        this.jBut_AppMatematica.getWidth  (),
                        this.jBut_AppMatematica.getHeight ()
                        )
        );
        
        //Ajueste de tamaño del boton 3
        this.jBut_AppPrismas.setIcon(
                Imagenes.escalarImagen(
                        this.jBut_AppPrismas.getIcon   () , 
                        this.jBut_AppPrismas.getWidth  (),
                        this.jBut_AppPrismas.getHeight ()
                        )
        );
        
        //Ajueste de tamaño del boton 3
        this.jBut_AppPrismasBean.setIcon(
                Imagenes.escalarImagen(
                        this.jBut_AppPrismasBean.getIcon   () , 
                        this.jBut_AppPrismasBean.getWidth  (),
                        this.jBut_AppPrismasBean.getHeight ()
                        )
        );
        
        //Ajueste de tamaño del boton 4
        this.jBut_BaseDeDatosApp.setIcon(
                Imagenes.escalarImagen(
                        this.jBut_BaseDeDatosApp.getIcon   () , 
                        this.jBut_BaseDeDatosApp.getWidth  (),
                        this.jBut_BaseDeDatosApp.getHeight ()
                        )
        );
        
         //Ajueste de tamaño del boton 5
        this.jBut_HilosApp.setIcon(
                Imagenes.escalarImagen(
                        this.jBut_HilosApp.getIcon   () , 
                        this.jBut_HilosApp.getWidth  (),
                        this.jBut_HilosApp.getHeight ()
                        )
        );
        
        //Ajueste de tamaño del boton 6
        this.jBut_PelotasApp.setIcon(
                Imagenes.escalarImagen(
                        this.jBut_PelotasApp.getIcon   () , 
                        this.jBut_PelotasApp.getWidth  (),
                        this.jBut_PelotasApp.getHeight ()
                        )
        );
        
        this.jButGlobosApp.setIcon(
                Imagenes.escalarImagen(
                        this.jButGlobosApp.getIcon   () , 
                        this.jButGlobosApp.getWidth  (),
                        this.jButGlobosApp.getHeight ()
                        )
        );
        
        
    }
    
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCilindro1 = new mx.tecnm.beans.jCilindro();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_Unidad1 = new javax.swing.JPanel();
        jBut_AppMatematica = new javax.swing.JButton();
        jBut_AppPrismas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBut_AppConverciones = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBut_AppPrismasBean = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBut_BaseDeDatosApp = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jBut_PelotasApp = new javax.swing.JButton();
        jButGlobosApp = new javax.swing.JButton();
        jBut_HilosApp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcionApp = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lanzadora App");

        jPanel_Unidad1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel_Unidad1MouseMoved(evt);
            }
        });

        jBut_AppMatematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Matematica_Icon.jpg"))); // NOI18N
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

        jBut_AppPrismas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Prisma_Icon.jpg"))); // NOI18N
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

        jBut_AppConverciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Conversiones_Icon.jpg"))); // NOI18N
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

        jBut_AppPrismasBean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Prisma_Icon.jpg"))); // NOI18N
        jBut_AppPrismasBean.setText("jButton1");
        jBut_AppPrismasBean.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_AppPrismasBean.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBut_AppPrismasBeanMouseMoved(evt);
            }
        });
        jBut_AppPrismasBean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_AppPrismasBeanActionPerformed(evt);
            }
        });

        jLabel10.setText("PrismasBean");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(307, 307, 307))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(237, 237, 237)
                    .addComponent(jBut_AppPrismasBean, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(238, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jBut_AppPrismasBean, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Unidad 2", jPanel2);

        jBut_BaseDeDatosApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BDApp.jpg"))); // NOI18N
        jBut_BaseDeDatosApp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBut_BaseDeDatosAppMouseMoved(evt);
            }
        });
        jBut_BaseDeDatosApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_BaseDeDatosAppActionPerformed(evt);
            }
        });

        jLabel9.setText("Calificaciones App");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jBut_BaseDeDatosApp, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(289, 289, 289))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBut_BaseDeDatosApp, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Unidad 3", jPanel3);

        jLabel7.setText("Aplicación Conversiones");

        jBut_PelotasApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/PelotasApp.jpg"))); // NOI18N
        jBut_PelotasApp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBut_PelotasAppMouseMoved(evt);
            }
        });
        jBut_PelotasApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_PelotasAppActionPerformed(evt);
            }
        });

        jButGlobosApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GlobosApp.jpg"))); // NOI18N
        jButGlobosApp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButGlobosAppMouseMoved(evt);
            }
        });
        jButGlobosApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGlobosAppActionPerformed(evt);
            }
        });

        jBut_HilosApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CarrerasApp.jpg"))); // NOI18N
        jBut_HilosApp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBut_HilosAppMouseMoved(evt);
            }
        });
        jBut_HilosApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_HilosAppActionPerformed(evt);
            }
        });

        jLabel3.setText("HilosApp (Carreritas)");

        jLabel4.setText("PelotasRebotandoApp");

        jLabel8.setText("GlobosInflandoseApp");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jBut_HilosApp, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jBut_PelotasApp, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButGlobosApp, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel4)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel8)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBut_PelotasApp, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButGlobosApp, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBut_HilosApp, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(180, 180, 180)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Unidad 4", jPanel4);

        jLabel1.setText("Descripción de la aplicación:");

        jTextAreaDescripcionApp.setColumns(20);
        jTextAreaDescripcionApp.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcionApp);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder("LanzadorApp"));

        jMenu1.setText("Ayuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("AcerdaDe");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBut_AppMatematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AppMatematicaActionPerformed
        app.Matematica.SplashMatematicas.ejecutar();
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppMatematicaActionPerformed

    private void jBut_AppConvercionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AppConvercionesActionPerformed
        app.Conversiones.Splash.ejecutar();
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppConvercionesActionPerformed

    private void jBut_AppPrismasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AppPrismasActionPerformed
        app.Prismas.SplashPrismas.ejecutar();
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppPrismasActionPerformed

    private void jBut_AppMatematicaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBut_AppMatematicaMouseMoved
        this.jTextAreaDescripcionApp.setText ( "La aplicacion MatematicaApp, \n" +
             "permite al usuario obtener el resultado de las siguientes operaciones: \n" +
             "1-Factorización \n" +
             "2-Permutacion   \n" +
             "3-Combinación"   );
        
        //-----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppMatematicaMouseMoved

    private void jBut_AppConvercionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBut_AppConvercionesMouseMoved
        this.jTextAreaDescripcionApp.setText ( "La aplicación ConvercionesApp, "
                + "permite que el usuario pueda ingresar los datos en \n"
                + "distintos campos, de acuerdo al tipo de conversión que requiera hacer." 
        );
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppConvercionesMouseMoved

    private void jBut_AppPrismasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBut_AppPrismasMouseMoved
        this.jTextAreaDescripcionApp.setText ( "La aplicación PrismasApp, " +
                " permite al usuario obtener \n "
                + "los siguientes valores: \n"
                + "1-área de la base \n"
                + "2-área latral \n"
                + "3-área total \n"
                + "4-volumen \n"
                + "de un cilindor, un prisma triangular" 
                + "y un prisma triangular ");
        
        //----------------------------------------------------------------------
    }//GEN-LAST:event_jBut_AppPrismasMouseMoved

    private void jPanel_Unidad1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Unidad1MouseMoved
        this.jTextAreaDescripcionApp.setText ( "" );
    }//GEN-LAST:event_jPanel_Unidad1MouseMoved

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AcercaDe acercaDe = new AcercaDe ( this, true);
        acercaDe.setVisible ( true );
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBut_AppPrismasBeanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBut_AppPrismasBeanMouseMoved
         this.jTextAreaDescripcionApp.setText ( "La aplicación PrismasAppBean, " +
                " permite al usuario obtener \n "
                + "los siguientes valores: \n"
                + "1-área de la base \n"
                + "2-área latral \n"
                + "3-área total \n"
                + "4-volumen \n"
                + "de un cilindor, un prisma triangular" 
                + "y un prisma triangular ");
    }//GEN-LAST:event_jBut_AppPrismasBeanMouseMoved

    private void jBut_AppPrismasBeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AppPrismasBeanActionPerformed
        app.PrismasBeans.SplashFrameBeans.ejecutar();
    }//GEN-LAST:event_jBut_AppPrismasBeanActionPerformed

    private void jBut_HilosAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_HilosAppActionPerformed
        app.Carreritas.SplashMiHiloApp.ejecutar();
    }//GEN-LAST:event_jBut_HilosAppActionPerformed

    private void jBut_PelotasAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_PelotasAppActionPerformed
        app.Pelotas.SplashPelotasRebotando.ejecutar();
    }//GEN-LAST:event_jBut_PelotasAppActionPerformed

    private void jBut_BaseDeDatosAppMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBut_BaseDeDatosAppMouseMoved
        
        this.jTextAreaDescripcionApp.setText ( "La aplicación CalificacionesApp, " +
                " permite al usuario manejar un gestor de Base de datos \n "
                + "utilizandolo funciones basicas como \n"
                + "- añadir, \n"
                + "- filtrar, \n"
                + "- eliminar datos \n"
                + "todo esto con la información de una escuela." );
                
    }//GEN-LAST:event_jBut_BaseDeDatosAppMouseMoved

    private void jBut_HilosAppMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBut_HilosAppMouseMoved
          
        this.jTextAreaDescripcionApp.setText ( "La aplicación Hilos App, " +
                " permite al usuario interactuar con hilos ( Thread ) \n "
                + "de manera visual y con la representacion grafica \n"
                + "en una barra de progreso que simula una carrera \n"
                + "al final se muestra cual hilo llego primero \n "
                + "con una leyenda que dice GANADOR" );
    }//GEN-LAST:event_jBut_HilosAppMouseMoved

    private void jBut_PelotasAppMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBut_PelotasAppMouseMoved
       
        this.jTextAreaDescripcionApp.setText ( "La aplicación PelotasRebotandoApp, " +
                " permite al usuario interactuar con hilos ( Thread ) \n "
                + "de manera visual y con la representacion grafica \n"
                + "de Pelotas rebotando y despalzandose por un panel"
                 );
    }//GEN-LAST:event_jBut_PelotasAppMouseMoved

    private void jButGlobosAppMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButGlobosAppMouseMoved
        
           this.jTextAreaDescripcionApp.setText ( "La aplicación GlobosApp, " +
                " permite al usuario interactuar con hilos ( Thread ) \n "
                + "de manera visual y con la representacion grafica \n"
                + "de Globos de distintos colores \n"
                + "inflandose y desinflandose dentro de un panel"
                 );
    }//GEN-LAST:event_jButGlobosAppMouseMoved

    private void jBut_BaseDeDatosAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_BaseDeDatosAppActionPerformed
       
        app.CalificacionesDBApp.SplashCalificacionesDBApp.ejecutar();
    }//GEN-LAST:event_jBut_BaseDeDatosAppActionPerformed

    private void jButGlobosAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGlobosAppActionPerformed
        app.Globos.SplashGlobos.ejecutar();
    }//GEN-LAST:event_jButGlobosAppActionPerformed

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
            java.util.logging.Logger.getLogger(LanzadorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LanzadorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LanzadorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LanzadorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LanzadorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButGlobosApp;
    private javax.swing.JButton jBut_AppConverciones;
    private javax.swing.JButton jBut_AppMatematica;
    private javax.swing.JButton jBut_AppPrismas;
    private javax.swing.JButton jBut_AppPrismasBean;
    private javax.swing.JButton jBut_BaseDeDatosApp;
    private javax.swing.JButton jBut_HilosApp;
    private javax.swing.JButton jBut_PelotasApp;
    private mx.tecnm.beans.jCilindro jCilindro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_Unidad1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaDescripcionApp;
    // End of variables declaration//GEN-END:variables
}
