
package mx.tecnm.beans;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import mx.tecnm.itl.util.Imagenes;
/**
 *
 * @author adria
 */
public class JAcercaDe extends javax.swing.JPanel {

    /**
     * Creates new form JAcercaDe
     */
    public JAcercaDe() {
        initComponents();
        
        //Ajustar el tamaño del logo 1
        this.jLabel_Logo1.setIcon(
                Imagenes.escalarImagen(
                        this.jLabel_Logo1.getIcon   (), 
                        135,
                        135 ) );
        
        //Ajustar el tamaño del logo 2
        this.jLabel_Logo2.setIcon(
                Imagenes.escalarImagen(
                        this.jLabel_Logo2.getIcon   (), 
                        135,
                        135 ) );
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
        Jmi_AcercaDeBean = new javax.swing.JMenuItem();
        jLabel_Autor4 = new javax.swing.JLabel();
        jLabel_Logo2 = new javax.swing.JLabel();
        jLabel_Institucion = new javax.swing.JLabel();
        jLabel_Carrera = new javax.swing.JLabel();
        jLabel_Materia = new javax.swing.JLabel();
        jLabel_Aplicacion = new javax.swing.JLabel();
        jLabel_LeyendaDesarrollador = new javax.swing.JLabel();
        jLabel_Autor1 = new javax.swing.JLabel();
        jLabel_LeyendaAlPie = new javax.swing.JLabel();
        jLabel_Autor2 = new javax.swing.JLabel();
        jLabel_Universidad = new javax.swing.JLabel();
        jLabel_Autor3 = new javax.swing.JLabel();
        jLabel_Logo1 = new javax.swing.JLabel();

        Jmi_AcercaDeBean.setText("jMenuItem1");
        Jmi_AcercaDeBean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jmi_AcercaDeBeanActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Jmi_AcercaDeBean);

        jLabel_Autor4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Autor4.setText("[Autor 4]");

        jLabel_Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/Tec.jpg"))); // NOI18N
        jLabel_Logo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_Institucion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Institucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Institucion.setText("INSTITUTO TECNOLOGICO DE LA LAGUNA");

        jLabel_Carrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Carrera.setText("INGENIERIA EN SISTEMAS COMPUTACIONALES");

        jLabel_Materia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Materia.setText("TÓPICOS AVANZADOS DE PROGRAMACIÓN");

        jLabel_Aplicacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Aplicacion.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_Aplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Aplicacion.setText("[Nombre App y Versión]");

        jLabel_LeyendaDesarrollador.setText("Desarrollado por:");

        jLabel_Autor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Autor1.setText("[Autor 1]");

        jLabel_LeyendaAlPie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_LeyendaAlPie.setText("(C) Derechos reservados 2020, prohibida la reproducción parcial o total de este programa");

        jLabel_Autor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Autor2.setText("[Autor 2]");

        jLabel_Universidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Universidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Universidad.setText("TECNOLOGICO NACIONAL DE MÉXICO");
        jLabel_Universidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel_Autor3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Autor3.setText("[Autor 3]");

        jLabel_Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/Tec mex.jpg"))); // NOI18N
        jLabel_Logo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_LeyendaAlPie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Universidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Autor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Institucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Autor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Carrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Autor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Materia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Autor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel_Aplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel_LeyendaDesarrollador)
                .addContainerGap(370, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Universidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Institucion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Carrera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Materia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Aplicacion)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_LeyendaDesarrollador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Autor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Autor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Autor3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Autor4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel_LeyendaAlPie)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Jmi_AcercaDeBeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jmi_AcercaDeBeanActionPerformed
        JOptionPane.showMessageDialog (
                this,
                "AcercaDe \n" +
                "v1.0 \n\n" + 
                "TecNM Campues La Laguna 2020",
                "Acerca De",
                 JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_Jmi_AcercaDeBeanActionPerformed

      //--------------------------------------------------------------------------
    public String getUniversidad () {
        return this.jLabel_Universidad.getText ();
    }

    //--------------------------------------------------------------------------
    
    public void setUniversidad ( String Universidad ) {
        this.jLabel_Universidad.setText ( Universidad );
    }
    
    //--------------------------------------------------------------------------
    
     public String getInstitucion () {
        return this.jLabel_Institucion.getText ();
    }

     //--------------------------------------------------------------------------
     
    public void setInstitucion ( String Institucion ) {
        this.jLabel_Institucion.setText ( Institucion );
    }
    
    //--------------------------------------------------------------------------
    
     public String getCarrera () {
        return this.jLabel_Carrera.getText ();
    }

     //--------------------------------------------------------------------------
    
    public void setCarrera ( String Carrera ) {
        this.jLabel_Carrera.setText ( Carrera );
    }
    
    //--------------------------------------------------------------------------
    
     public String getMateria () {
        return this.jLabel_Materia.getText ();
    }

     //--------------------------------------------------------------------------
     
    public void SetMateria ( String Materia ) {
        this.jLabel_Materia.setText ( Materia );
    }
    
    //--------------------------------------------------------------------------
    
     public String getNombreApp () {
        return this.jLabel_Aplicacion.getText ();
    }

     //--------------------------------------------------------------------------
     
    public void setNombreApp ( String Nombre_Aplicacion ) {
        this.jLabel_Aplicacion.setText ( Nombre_Aplicacion );
    }
    
    //--------------------------------------------------------------------------
    
     public String getLeyendaDesarrolladoPor () {
        return this.jLabel_LeyendaDesarrollador.getText ();
    }

     //--------------------------------------------------------------------------
     
    public void setLeyendaDesarrolladoPor ( String Leyenda_Desarrollado_Por ) {
        this.jLabel_Materia.setText ( Leyenda_Desarrollado_Por );
    }
    //--------------------------------------------------------------------------
    
     public String getAutor1 () {
        return this.jLabel_Autor1.getText ();
    }

     //--------------------------------------------------------------------------
     
    public void setAutor1 ( String Autor ) {
        this.jLabel_Autor1.setText ( Autor );
    }
    //--------------------------------------------------------------------------
    
     public String getAutor2 () {
        return this.jLabel_Autor2.getText ();
    }

     //--------------------------------------------------------------------------
     
    public void setAutor2 ( String Autor ) {
        this.jLabel_Autor2.setText ( Autor );
    }
    
    //--------------------------------------------------------------------------
    
     public String getAutor3 () {
        return this.jLabel_Autor3.getText ();
    }

     //--------------------------------------------------------------------------
     
    public void setAutor3 ( String Autor ) {
        this.jLabel_Autor3.setText ( Autor );
    }
    //--------------------------------------------------------------------------
    
    public String getAutor4 () {
        return this.jLabel_Autor4.getText ();
    }

     //--------------------------------------------------------------------------
     
    public void setAutor4 ( String Autor ) {
        this.jLabel_Autor4.setText ( Autor );
    }
    //--------------------------------------------------------------------------
    
     public String getLeyendaAlPie () {
        return this.jLabel_LeyendaAlPie.getText ();
    }

     //--------------------------------------------------------------------------
     
    public void setLeyendaAlPie ( String Leyenda_Al_Pie ) {
        this.jLabel_LeyendaAlPie.setText ( Leyenda_Al_Pie );
    }
    
    //--------------------------------------------------------------------------
    
     public Icon getLogo1 () {
        return this.jLabel_Logo1.getIcon ();
    }

     //--------------------------------------------------------------------------
     
    public void setLogo1 ( Icon Icono1 ) {
        this.jLabel_Logo1.setIcon ( Imagenes.escalarImagen ( Icono1, 135, 135) );
    }
    
    //--------------------------------------------------------------------------
    
     public Icon getLogo2  () {
        return this.jLabel_Logo2.getIcon ();
    }

     //--------------------------------------------------------------------------
     
    public void setLogo2 ( Icon Icono2 ) {
        this.jLabel_Logo2.setIcon ( Imagenes.escalarImagen ( Icono2, 135, 135) );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Jmi_AcercaDeBean;
    private javax.swing.JLabel jLabel_Aplicacion;
    private javax.swing.JLabel jLabel_Autor1;
    private javax.swing.JLabel jLabel_Autor2;
    private javax.swing.JLabel jLabel_Autor3;
    private javax.swing.JLabel jLabel_Autor4;
    private javax.swing.JLabel jLabel_Carrera;
    private javax.swing.JLabel jLabel_Institucion;
    private javax.swing.JLabel jLabel_LeyendaAlPie;
    private javax.swing.JLabel jLabel_LeyendaDesarrollador;
    private javax.swing.JLabel jLabel_Logo1;
    private javax.swing.JLabel jLabel_Logo2;
    private javax.swing.JLabel jLabel_Materia;
    private javax.swing.JLabel jLabel_Universidad;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}