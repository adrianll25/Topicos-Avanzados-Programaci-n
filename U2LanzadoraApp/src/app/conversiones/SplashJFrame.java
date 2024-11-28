/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                                JFrame Visual Splash
:*        
:*  Archivo     : SplashJFrame.java
:*  Autor       : Magnolia Hernández Aguilera     18131248
:*  Fecha       : 05/10/2020
:*  Compilador  : JAVA J2SE v1.8.2
:*  Descripción : Aplicaion visula usando Java Swing que presenta un IU
                  donde se respresenta la carga al momento de abrir un programa.
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 06/Octubre/20202 
    Modificó: Magnolia Hernández Aguilera             
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/

package app.conversiones;

import com.sun.awt.AWTUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import mx.tecnm.itl.util.imagen;

public class SplashJFrame extends javax.swing.JFrame implements ActionListener {
    
    Timer timer;
    
    //--------------------------------------------------------------------------
    
    public SplashJFrame() {
        initComponents();
        
        AWTUtilities.setWindowOpaque ( this, false );
        
        this.jLab_Logo.setIcon(
                imagen.escalarImagen(
                        this.jLab_Logo.getIcon   () , 
                        this.jLab_Logo.getWidth  (),
                        this.jLab_Logo.getHeight ()
                        )
        );
                
        timer = new Timer ( 250, this);
        timer.start ();
    }

    //--------------------------------------------------------------------------
    
    public static void ejecutar () {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashJFrame().setVisible(true);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLab_Logo = new javax.swing.JLabel();
        jProgBar_Avance = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLab_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mate1.jpg"))); // NOI18N

        jProgBar_Avance.setForeground(new java.awt.Color(0, 0, 0));
        jProgBar_Avance.setStringPainted(true);

        jPanel1.setBackground(new java.awt.Color(245, 202, 224));

        jLabel2.setText("ConvercionesApp  v1.0  ");

        jLabel3.setText("(C) Derechos reservados");

        jLabel4.setText("Por: Magnolia Hernandez   #18131248");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLab_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgBar_Avance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLab_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jProgBar_Avance, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ejecutar ();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLab_Logo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgBar_Avance;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed( ActionEvent e ) {
        
        if ( this.jProgBar_Avance.getValue() < 100 ) {
            this.jProgBar_Avance.setValue ( this.jProgBar_Avance.getValue () + 5 );
        } else {
            timer.stop();
                new ConversionesJFrame ().setVisible( true );
                dispose ();
        }
    }

    
}
