/*------------------------------------------------------------------------------------------
:*           TECNOLOGICO NACIONAL DE MEXICO
:*          INSTITUTO TECNOLOGICO DE LA LAGUNA
:*        INGENIERIA EN SISTEMAS COMPUTACIONALES
:*        TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*        SEMESTRE: AGO-DIC/2020 HORA: 17-18 HRS
:*
:*      Aplicación visual sobre el bean JPrismaRectangular
:*
:* Archivo :             jPrismaTriangular.java
:* Autor :         Jesus Adrian Lopez Luevanos 18131253
:* Fecha :             23/Noviembre/2020
:* Compilador :        JAVA v1.8.2
:* Descripción :   Aplicación visual usando Java Swing que presenta una IU donde
:*                 el bean esta creado y pidevalores a insertar, este bean se meuve a la
:*                 aplicacion principal a donde se haran todas las operaciones y deben de obtener
:*                 todos los valores de la manera correcta, para insertar los valores se dara click derecho y
:*                 seleccionar valores del prisma, mandara a llamar a otro frame y en este se pondras
:*                 los valores deseados, una vez los valores apareceran en el bean creado anteriormente.
:*                 
:*
:* Ultima modif:
:* Fecha Modificó:
   Motivo:
:*==========================================================================================
:* 
:* 
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.beans;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import mx.tecnm.itl.prismas.PrismaRectangular;
import mx.tecnm.itl.prismas.PrismaTriangular;
import mx.tecnm.itl.prismas.jPrisma;
import mx.tecnm.itl.util.Imagenes;

/**
 *
 * @author adria
 */
public class jPrismaTriangular extends javax.swing.JPanel implements jPrisma{
//Composicion del bean
    
    private PrismaTriangular modelo;
    private DatosPrismaTriangularDialog DTD;
    private ArrayList<DatosModificadosListener> DML = new ArrayList<> ();
    
    /**
     * Creates new form jCilindro
     */
    public jPrismaTriangular() {
        initComponents();
        modelo = new PrismaTriangular ();
        
        //Creamos el dialog de los valores prism
        DTD  = new DatosPrismaTriangularDialog ( this, true );
    }
    
    public jPrismaTriangular ( double Base, double Altura, double Ancho ){
        initComponents();
        modelo = new PrismaTriangular ( Base, Altura, Ancho );
    }
    
    public void addModificadosListener ( DatosModificadosListener listener ){
        DML.add ( listener );
    }
    
    public void removeModificadosListener ( DatosModificadosListener listener ){
        DML.remove ( listener );
    }
    
    public void fireDatosModificadosEvent ( DatosModificadosEvent ev ){
        for ( DatosModificadosListener listener : DML ){
            listener.DatosModificadosPrisma( ev );
            
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMIValores = new javax.swing.JMenuItem();
        jMIAcercaDe = new javax.swing.JMenuItem();
        jLabImagenPrisma = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabBaseTriangular = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabAlturaBaseTriangular = new javax.swing.JLabel();
        jLabAlturaTriangular = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jMIValores.setText("Valores del prisma...");
        jMIValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIValoresActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMIValores);

        jMIAcercaDe.setText("Acerda de...");
        jMIAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAcercaDeActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMIAcercaDe);

        setToolTipText("Pulse click derecho para mas opciones...");
        setComponentPopupMenu(jPopupMenu1);

        jLabImagenPrisma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/Prisma_Triangular.jpg"))); // NOI18N
        jLabImagenPrisma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Base ( b ):");

        jLabBaseTriangular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabBaseTriangular.setText("0");
        jLabBaseTriangular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("AlturaBase ( a ):");

        jLabAlturaBaseTriangular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabAlturaBaseTriangular.setText("0");
        jLabAlturaBaseTriangular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabAlturaTriangular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabAlturaTriangular.setText("0");
        jLabAlturaTriangular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Altura ( h ):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabAlturaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(17, 17, 17)
                        .addComponent(jLabImagenPrisma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabAlturaBaseTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabBaseTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabImagenPrisma)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabAlturaTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabBaseTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabAlturaBaseTriangular, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jMIAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAcercaDeActionPerformed
        JOptionPane.showMessageDialog(
                this,
                "JCilindro \n " +
                "V1.0 \n\n"     +
                "Tecnologico Nacional de México, Campus Laguna \n\n"+
                "Derechos Resevados (C)2020",
                "Acerca De ",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMIAcercaDeActionPerformed

    private void jMIValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIValoresActionPerformed
        DTD.setVisible ( true );
    }//GEN-LAST:event_jMIValoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabAlturaBaseTriangular;
    private javax.swing.JLabel jLabAlturaTriangular;
    private javax.swing.JLabel jLabBaseTriangular;
    private javax.swing.JLabel jLabImagenPrisma;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMIAcercaDe;
    private javax.swing.JMenuItem jMIValores;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables

    @Override
    public double areaBase ( ) {
        return modelo.areaBase ( );
    }

    @Override
    public double areaLateral ( ) {
        return modelo.areaLateral ( );
    }

    @Override
    public double areaTotal ( ) {
        return modelo.areaTotal ( );
        
    }

    @Override
    public double Volumen ( ) {
        return modelo.Volumen ( );
    }
    
    public double getAlturaBasePrismaTriangular ( ){
        return modelo.getAlturaBase () ;
        
    }
    
    public void setAlturaBasePrismaTriangular ( double alturaBase ){
       modelo.setAlturaBase ( alturaBase );
       this.jLabAlturaBaseTriangular.setText ( "" + alturaBase );
    }
    
     public double getAlturaPrismaTriangular ( ){
        return modelo.getAlturaPrisma();
    }
    
    public void setAlturaPrismaTriangular ( double altura ){
        modelo.setAlturaPrisma (  altura );
        jLabAlturaTriangular.setText ( "" + altura );
        
    }
    
    public double getBasePrismaTriangular ( ){
        return modelo.getBase ();
    }
    
    public void setBasePrismaTriangular ( double base ){
        modelo.setBase ( base );
        jLabBaseTriangular.setText( "" + base );
        
    }
        
    public Icon getImagenIcon ( ){
        return jLabImagenPrisma.getIcon ( );
       
    }
    
    
    public void setImagenIcon ( Icon Imagen ){
        
        Imagen = Imagenes.escalarImagen ( Imagen, 107, 170 );
        jLabImagenPrisma.setIcon ( Imagen );
    }
    
}
