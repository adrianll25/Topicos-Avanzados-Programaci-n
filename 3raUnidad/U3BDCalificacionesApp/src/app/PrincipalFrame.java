/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                        JFrame principal de la aplicacion
:*        
:*  Archivo     : PrincipalFrame.java
:*  Autor       : Jesus Adrian Lopez Luevanos 18131253
:*  Fecha       : 11 /12/2020
:*  Compilador  : JAVA v1.8.2
:*  Descripción : JFrame visual de una base de datos de Alumnos con las  
                  tablas de los 
                  -ALUMNOS 
                  -MATERIAS
                  -KARDEX
                  cada una de estas tablas se pueden visualizar a travez de BOTONES que se muestran 
                  en el Frame, se pueden EDITAR, ELIMINAR, FILTRAR Y AGREGAR 
                  registros de cada tabla.
                  
:*------------------------------------------------------------------------------------------
:*  Ultima modif:
:*  Fecha: 17/Diciembre/2020 
    Modificó: Jesus Adrian Lopez Luevanos           
    Motivo: Actualizacion del codigo    
:*------------------------------------------------------------------------------------------*/
package app;

import Modelo.Modelo1;
import Modelo.Modelo2;
import Modelo.Modelo3;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.tecnm.jdbc.*;

//------------------------------------------------------------------------------  
  //Declaracion de variables
public class PrincipalFrame extends javax.swing.JFrame {

    public static final  String Nuevo       ="Nuevo" ; 
    public static final  String Editar       ="Editar"; 
    
    public static final  String TIT_FRAME   = "Sistema de Calificaciones";
    public static final  String TIT_INICIO  = "TecLaguna Software"  ;
    public static final  String TIT_MODULO1 = "Alumnos"  ;
    public static final  String TIT_MODULO2 = "Materias" ;
    public static final  String TIT_MODULO3 = "Kardex"   ;
    
    public static final  String ALUMNOS_TODOS_POR_NOMBRE         = "alumnos_todos_por_nombre";
    public static final  String ALUMNOS_TODOS_SIN_ORDEN          =  "alumnos_todos_sin_orden";
    public static final  String ALUMNOS_ELIMINAR_X_MATRICULA     = "alumnos_eliminar_x_matricula";
    public static final  String ALUMNOS_ACTUALIZA_DATOS          = "alumnos_actualiza_datos";
    public static final  String ALUMNOS_INSERTA_NUEVO            = "alumnos_inserta_nuevo";
    public static final  String ALUMNOS_ACTUALIZA_PROMEDIOS      = "alumnos_actualiza_promedios";
    
    public static final  String MATERIAS_TODOS_POR_MATERIA       = "materias_todos_por_materia";
    public static final  String MATERIAS_TODOS_SIN_ORDEN         =  "materias_todos_sin_orden";
    public static final  String MATERIAS_ELIMINAR_X_IDMATERIA    = "materias_eliminar_x_idmateria";
    public static final  String MATERIAS_ACTUALIZA_DATOS         = "materias_actualiza_datos";
    public static final  String MATERIAS_INSERTA_NUEVO           = "materias_inserta_nuevo";
    
    public static final  String KARDEX_TODOS_POR_MATRICULA       = "kardex_todos_por_matricula";   
    public static final  String KARDEX_TODOS_SIN_ORDEN           = "kardex_todos_sin_orden";
    public static final  String KARDEX_ELIMINAR_X_IDCALIFICACION = "kardex_eliminar_x_idcalif";
    public static final  String KARDEX_ACTUALIZA_DATOS           = "kardex_actualiza_datos";
    public static final  String KARDEX_INSERTA_NUEVO             = "kardex_inserta_nuevo";
    public static final  String KARDEX_OBT_MAX_ID                = "kardex_obt_max_id";
    
    
    private String            moduloActual;
    private Vector<String>    vecNombresColumnas;
    private Vector<String>    vecNombresColumnasDB;
     private Vector<String>   vecTiposColumnas;
    private DefaultTableModel DTM;
    private Properties        propConsultasSQL;
    private int               totalRegsitros;
    
//------------------------------------------------------------------------------  
   //Constructor  
    public PrincipalFrame() {
        
        initComponents();
        this.setTitle( TIT_FRAME );
        jLabMensajes.setText ( "" );
        jToolBarHerramientas.setVisible ( false );
        jPanelTabla.setVisible ( false );
        jPanelLogoPrincipal.setVisible( true );
        jLabLeyendaPrincipal.setText ( TIT_INICIO );
        jLabModulo1.setText ( TIT_MODULO1 );
        jLabModulo2.setText ( TIT_MODULO2 );
        jLabModulo3.setText ( TIT_MODULO3 );
        
        prepararSentenciasSQL           ();
//Se crea un nuevo JFrame de la ventana para poder conectar con el servidor
        new ConexionBDFrame ( this ).setVisible ( true );
        
    }
//------------------------------------------------------------------------------  
    //Sentencias que funcionan para elaborar consultas requeridas
    private void prepararSentenciasSQL () {
        
        propConsultasSQL = new Properties ();
        
        propConsultasSQL.put( ALUMNOS_TODOS_SIN_ORDEN, 
                  "select * from alumnos");
        
        propConsultasSQL.put( ALUMNOS_TODOS_POR_NOMBRE, 
                  "select * from alumnos order by nombre");
        
        propConsultasSQL.put( ALUMNOS_ELIMINAR_X_MATRICULA, 
                  "delete from alumnos where matricula = ? " );
        
        propConsultasSQL.put( ALUMNOS_ACTUALIZA_DATOS, 
                  "update alumnos set nombre = ?, apellidos = ?, edad = ?,  " +
                  "promedio = ? where matricula = ? " );
        
        propConsultasSQL.put( ALUMNOS_INSERTA_NUEVO, 
                  "insert into alumnos values ( ?, ?, ?, ?, ? )" );
        
        propConsultasSQL.put( ALUMNOS_ACTUALIZA_PROMEDIOS, 
                  "update alumnos A set promedio = ( " +
                  "select avg (calificacion) from kardex K " +
                  "where K.matricula  = A.MATRICULA )" );
        
        
        propConsultasSQL.put( MATERIAS_TODOS_SIN_ORDEN, 
                  "select * from materia");
        
        propConsultasSQL.put( MATERIAS_TODOS_POR_MATERIA, 
                  "select * from materia order by materua");
        
        propConsultasSQL.put( MATERIAS_ELIMINAR_X_IDMATERIA, 
                  " delete from materia where idmateria = ? ");
        
        propConsultasSQL.put( MATERIAS_ACTUALIZA_DATOS, 
                  "update materia set materua = ?, creditos = ? where idmateria = ? " );
        
        propConsultasSQL.put( MATERIAS_INSERTA_NUEVO, 
                  "insert into materia values ( ?, ?, ? )" );
        
        
        propConsultasSQL.put( KARDEX_TODOS_SIN_ORDEN, 
                  "select K.IDCALIF, K.MATRICULA, A.NOMBRE, A.APELLIDOS, K.PERIODO, M.IDMATERIA, M.MATERUA, K.CALIFICACION " +
                  "from  Kardex K join Alumnos A on K.Matricula = A.Matricula " +
                  "join Materia M on K.ID_MATERIA = M.IDMATERIA " 
                  );
        
        propConsultasSQL.put( KARDEX_TODOS_POR_MATRICULA, 
                  "select K.IDCALIF, K.MATRICULA, A.NOMBRE, A.APELLIDOS, K.PERIODO, M.IDMATERIA, M.MATERUA, K.CALIFICACION " +
                  "from   Kardex K, Alumnos A, Materia M " +
                  "where  K.MATRICULA = A.MATRICULA and K.ID_MATERIA = M.IDMATERIA " +
                  "order by K.MATRICULA"
                  );
        
        propConsultasSQL.put( KARDEX_ELIMINAR_X_IDCALIFICACION, 
                  "delete from kardex where idcalif = ?");
        
        propConsultasSQL.put( KARDEX_ACTUALIZA_DATOS,
                "update kardex set matricula = ?, id_materia = ?, periodo = ?, " +
                "calificacion = ? where idcalif = ? "        
                );
                
        propConsultasSQL.put( KARDEX_INSERTA_NUEVO,
                "insert into kardex values ( ?, ?, ?, ?, ? )"
                ); 
                
        propConsultasSQL.put( KARDEX_OBT_MAX_ID,
                "select max ( idcalif ) as maxid from kardex"
                );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jToolBarHerramientas = new javax.swing.JToolBar();
        jButNuevo = new javax.swing.JButton();
        jButEditar = new javax.swing.JButton();
        jButEliminar = new javax.swing.JButton();
        jButInicio = new javax.swing.JButton();
        jButFiltrar = new javax.swing.JButton();
        jPanelEstatus = new javax.swing.JPanel();
        jToolEstatusConexion = new javax.swing.JToolBar();
        jLabel4 = new javax.swing.JLabel();
        jLabEstatus = new javax.swing.JLabel();
        jToolMensaje = new javax.swing.JToolBar();
        jLabMensajes = new javax.swing.JLabel();
        jScrollModulo = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButModulo1 = new javax.swing.JButton();
        jLabModulo1 = new javax.swing.JLabel();
        jButModulo3 = new javax.swing.JButton();
        jLabModulo2 = new javax.swing.JLabel();
        jButModulo2 = new javax.swing.JButton();
        jLabModulo3 = new javax.swing.JLabel();
        jPanelLeyenda = new javax.swing.JPanel();
        jLabLeyendaPrincipal = new javax.swing.JLabel();
        jPanelLogoPrincipal = new javax.swing.JPanel();
        jLabLogo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePrincipal = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmniSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuRecalcular = new javax.swing.JMenuItem();
        jMenuReportes = new javax.swing.JMenu();
        jMniReportesModulo1 = new javax.swing.JMenuItem();
        jMniReportesModulo2 = new javax.swing.JMenuItem();
        jMniReportesModulo3 = new javax.swing.JMenuItem();
        jmniAcercaDe = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jToolBarHerramientas.setRollover(true);

        jButNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/new-file.png"))); // NOI18N
        jButNuevo.setText("Nuevo");
        jButNuevo.setFocusable(false);
        jButNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButNuevoActionPerformed(evt);
            }
        });
        jToolBarHerramientas.add(jButNuevo);

        jButEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Editar.png"))); // NOI18N
        jButEditar.setText("Editar");
        jButEditar.setFocusable(false);
        jButEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEditarActionPerformed(evt);
            }
        });
        jToolBarHerramientas.add(jButEditar);

        jButEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar.png"))); // NOI18N
        jButEliminar.setText("Eliminar");
        jButEliminar.setFocusable(false);
        jButEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEliminarActionPerformed(evt);
            }
        });
        jToolBarHerramientas.add(jButEliminar);

        jButInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Casa.png"))); // NOI18N
        jButInicio.setText("Inicio");
        jButInicio.setFocusable(false);
        jButInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButInicioActionPerformed(evt);
            }
        });
        jToolBarHerramientas.add(jButInicio);

        jButFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar_app.png"))); // NOI18N
        jButFiltrar.setText("Filtrar");
        jButFiltrar.setFocusable(false);
        jButFiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButFiltrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButFiltrarActionPerformed(evt);
            }
        });
        jToolBarHerramientas.add(jButFiltrar);

        jToolEstatusConexion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolEstatusConexion.setFloatable(false);
        jToolEstatusConexion.setRollover(true);

        jLabel4.setText("Estatus de la conexion: ");
        jToolEstatusConexion.add(jLabel4);

        jLabEstatus.setText("<Estatus>");
        jToolEstatusConexion.add(jLabEstatus);

        jToolMensaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolMensaje.setFloatable(false);
        jToolMensaje.setRollover(true);

        jLabMensajes.setText("<Mensajes>");
        jToolMensaje.add(jLabMensajes);

        javax.swing.GroupLayout jPanelEstatusLayout = new javax.swing.GroupLayout(jPanelEstatus);
        jPanelEstatus.setLayout(jPanelEstatusLayout);
        jPanelEstatusLayout.setHorizontalGroup(
            jPanelEstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolEstatusConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelEstatusLayout.setVerticalGroup(
            jPanelEstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolEstatusConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButModulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Alumno_app.png"))); // NOI18N
        jButModulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButModulo1ActionPerformed(evt);
            }
        });

        jLabModulo1.setText("Modulo 1");

        jButModulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Kardex_app.png"))); // NOI18N
        jButModulo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButModulo3ActionPerformed(evt);
            }
        });

        jLabModulo2.setText("Modulo 2");

        jButModulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Materia_app.png"))); // NOI18N
        jButModulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButModulo2ActionPerformed(evt);
            }
        });

        jLabModulo3.setText("Modulo 3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButModulo1)
                        .addComponent(jButModulo3)
                        .addComponent(jButModulo2)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabModulo3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabModulo1)
                            .addComponent(jLabModulo2))))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButModulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabModulo1)
                .addGap(18, 18, 18)
                .addComponent(jButModulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabModulo2)
                .addGap(16, 16, 16)
                .addComponent(jButModulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabModulo3)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        jScrollModulo.setViewportView(jPanel2);

        jPanelLeyenda.setBackground(new java.awt.Color(51, 51, 255));
        jPanelLeyenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabLeyendaPrincipal.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabLeyendaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jLabLeyendaPrincipal.setText("MODULO");

        javax.swing.GroupLayout jPanelLeyendaLayout = new javax.swing.GroupLayout(jPanelLeyenda);
        jPanelLeyenda.setLayout(jPanelLeyendaLayout);
        jPanelLeyendaLayout.setHorizontalGroup(
            jPanelLeyendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeyendaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabLeyendaPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLeyendaLayout.setVerticalGroup(
            jPanelLeyendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLeyendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabLeyendaPrincipal)
                .addContainerGap())
        );

        jLabLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/teacher_education_school_lecture_student_icon_141984.png"))); // NOI18N
        jLabLogo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanelLogoPrincipalLayout = new javax.swing.GroupLayout(jPanelLogoPrincipal);
        jPanelLogoPrincipal.setLayout(jPanelLogoPrincipalLayout);
        jPanelLogoPrincipalLayout.setHorizontalGroup(
            jPanelLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelLogoPrincipalLayout.createSequentialGroup()
                .addComponent(jLabLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7))
        );
        jPanelLogoPrincipalLayout.setVerticalGroup(
            jPanelLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelLogoPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(67, 67, 67))
            .addComponent(jLabLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        jPanelTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTablePrincipal);

        javax.swing.GroupLayout jPanelTablaLayout = new javax.swing.GroupLayout(jPanelTabla);
        jPanelTabla.setLayout(jPanelTablaLayout);
        jPanelTablaLayout.setHorizontalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTablaLayout.setVerticalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jmniSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmniSalir.setText("Salir");
        jmniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmniSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Herramientas");

        jMenuRecalcular.setText("Recalcular Promedio");
        jMenuRecalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRecalcularActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuRecalcular);

        jMenuReportes.setText("Reportes");

        jMniReportesModulo1.setText("Modulo1");
        jMenuReportes.add(jMniReportesModulo1);

        jMniReportesModulo2.setText("Modulo2");
        jMniReportesModulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniReportesModulo2ActionPerformed(evt);
            }
        });
        jMenuReportes.add(jMniReportesModulo2);

        jMniReportesModulo3.setText("Modulo3");
        jMenuReportes.add(jMniReportesModulo3);

        jMenu2.add(jMenuReportes);

        jMenuBar1.add(jMenu2);

        jmniAcercaDe.setText("Ayuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("AcercaDe");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmniAcercaDe.add(jMenuItem1);

        jMenuBar1.add(jmniAcercaDe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelLeyenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanelTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelLogoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))))
            .addComponent(jToolBarHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelLeyenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelLogoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollModulo, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//-----------------------------------------------------------------------------
    //Boton Nuevo que nos permite agregar un nuevo alumno, materia o kardex
    private void jButNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButNuevoActionPerformed
        if  ( moduloActual.equals ( TIT_MODULO1 ) ){
            Modulo1EditarDialog dialog = new Modulo1EditarDialog ( this, null );
            dialog.setVisible ( true );
            
        } else if ( moduloActual.equals ( TIT_MODULO2 ) ){
            Modulo2EditarDialog dialog = new Modulo2EditarDialog ( this, null );
            dialog.setVisible ( true );
        } else if ( moduloActual.equals ( TIT_MODULO3 ) ){
            Modulo3EditarDialog dialog = new Modulo3EditarDialog ( this, null );
            dialog.setVisible ( true );
        }
    }//GEN-LAST:event_jButNuevoActionPerformed
//-----------------------------------------------------------------------------
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if ( ConexionDB.getInstancia().conectado() ){
            jLabEstatus.setText ( "Conectado ");
            jLabEstatus.setForeground( Color.blue );
        }else{
            jLabEstatus.setText( "Desconectado" );
            jLabEstatus.setForeground( Color.red );
        }
    }//GEN-LAST:event_formWindowActivated

//------------------------------------------------------------------------------
    //Implementacion del boton alumnos
    private void jButModulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButModulo1ActionPerformed
       
        prepararVistaModulo ( TIT_MODULO1);
        String sql = propConsultasSQL.getProperty ( ALUMNOS_TODOS_POR_NOMBRE );
        desplegarRegistros ( sql, null );
    }//GEN-LAST:event_jButModulo1ActionPerformed

//------------------------------------------------------------------------------
        //Implementacion del boton materias
    private void jButModulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButModulo2ActionPerformed

        prepararVistaModulo ( TIT_MODULO2 );
        String sql = propConsultasSQL.getProperty ( MATERIAS_TODOS_POR_MATERIA );
        desplegarRegistros ( sql, null );
    }//GEN-LAST:event_jButModulo2ActionPerformed

//------------------------------------------------------------------------------
        //Implementacion del boton kardex
    private void jButModulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButModulo3ActionPerformed
        prepararVistaModulo ( TIT_MODULO3 );
        String sql = propConsultasSQL.getProperty ( KARDEX_TODOS_POR_MATRICULA );
        desplegarRegistros ( sql, null );
    }//GEN-LAST:event_jButModulo3ActionPerformed

    
//------------------------------------------------------------------------------
    //Boton inicio que nos trae de vuelta al inicio del programa
    private void jButInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButInicioActionPerformed
       
        jToolBarHerramientas.setVisible ( false  );
        jPanelLogoPrincipal.setVisible  ( true   );
        jPanelTabla.setVisible          ( false  );
                
        jLabLeyendaPrincipal.setText  ( TIT_INICIO );
        moduloActual = "";
    }//GEN-LAST:event_jButInicioActionPerformed

//------------------------------------------------------------------------------
    //Boton que nos ayuda a filtrar informacion requerida por el usuario 
    private void jButFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButFiltrarActionPerformed
        FiltrarDialog filtrardialog = new FiltrarDialog ( this, true );
        filtrardialog.setVisible( true );
    }//GEN-LAST:event_jButFiltrarActionPerformed
 //--------------------------------------------------------------------------
    //Boton que cierra el programa y a su vez desconecta el servidor
    private void jmniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniSalirActionPerformed
        
        ConexionDB.getInstancia().desconectar();
        dispose();
    }//GEN-LAST:event_jmniSalirActionPerformed

//------------------------------------------------------------------------------
    //Metodo que nos elimina registros
    private void jButEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEliminarActionPerformed
        
        int pos = jTablePrincipal.getSelectedRow();
        if ( pos == -1){
            JOptionPane.showMessageDialog(
            this, "No se ah seleccionado un registro", "Eliminar", JOptionPane.ERROR_MESSAGE );
            return; 
        }
       int confirma = JOptionPane.showConfirmDialog(
                this,
                "¿Desea eliminar el registro selecionado?",
                "Eliminar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE );
        
        if ( confirma == JOptionPane.NO_OPTION )
            return; 
        
        String valorLlavePrim = jTablePrincipal.getValueAt( pos, 0 ).toString();
        String tipoLlavePrim  = vecTiposColumnas.elementAt (0);
        String sql            = "";
        JButton jbtModulo    = null;
        
        if        ( moduloActual == TIT_MODULO1 ){
            sql = propConsultasSQL.getProperty ( ALUMNOS_ELIMINAR_X_MATRICULA     );
            jbtModulo = jButModulo1;
        } else if ( moduloActual == TIT_MODULO2 ){
            sql = propConsultasSQL.getProperty ( MATERIAS_ELIMINAR_X_IDMATERIA    );
            jbtModulo = jButModulo2;
        } else if ( moduloActual == TIT_MODULO3 ){
            sql = propConsultasSQL.getProperty ( KARDEX_ELIMINAR_X_IDCALIFICACION );
            jbtModulo = jButModulo3;
        }
        
        Object [][] args  = { { tipoLlavePrim, valorLlavePrim } };
        
        try{
            int regs = EjecutorSQL.sqlEjecutar( sql, args );
            if ( regs == 1){
            jbtModulo.doClick();
                JOptionPane.showMessageDialog(
                     this, 
                     "El registro ah sido eliminado", 
                     "Eliminar",
                     JOptionPane.INFORMATION_MESSAGE );
            }
        } catch ( SQLIntegrityConstraintViolationException ex ){
            JOptionPane.showMessageDialog(
                   this, "No se puede eliminar el registro \n"
                         + "actual por que tiene registros asociados \n"
                         + "en otras tablas", 
                           "Error", JOptionPane.ERROR_MESSAGE ); 
        } 
        catch ( SQLException ex){
            JOptionPane.showMessageDialog(
                   this, ex, "Error", JOptionPane.ERROR_MESSAGE ); 
        }
        
        jbtModulo.doClick();
        
    }//GEN-LAST:event_jButEliminarActionPerformed

//------------------------------------------------------------------------------
    //boton que nos permite editar la informacion de un alumno, materia o kardex
    private void jButEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEditarActionPerformed
        int pos = jTablePrincipal.getSelectedRow();
        if ( pos == -1){
            JOptionPane.showMessageDialog(
            this, "No se ah seleccionado un registro", "Eliminar", JOptionPane.ERROR_MESSAGE );
            return; 
        }
        
        if        ( moduloActual.equals ( TIT_MODULO1 ) ){
            String matricula = jTablePrincipal.getValueAt( pos, 0 ).toString();
            String nombre    = jTablePrincipal.getValueAt( pos, 1 ).toString();
            String apellidos = jTablePrincipal.getValueAt( pos, 2 ).toString();
            int    edad      = Integer.parseInt ( jTablePrincipal.getValueAt( pos, 3 ) .toString() );
            float  promedio  = Float.parseFloat ( jTablePrincipal.getValueAt( pos, 4 ) .toString() );
            
            Modelo1 modelo1 = new Modelo1 ( matricula, nombre, apellidos, edad, promedio );
            Modulo1EditarDialog dialog = new Modulo1EditarDialog ( this, modelo1 );
            dialog.setVisible ( true );
            
        } else if ( moduloActual.equals ( TIT_MODULO2 ) ){
            String idmateria  = jTablePrincipal.getValueAt( pos, 0 ).toString();
            String materia    = jTablePrincipal.getValueAt( pos, 1 ).toString();
            int    creditos   = Integer.parseInt ( jTablePrincipal.getValueAt( pos, 2 ) .toString() );
            
            Modelo2 modelo2 = new Modelo2 ( idmateria, materia, creditos );
            Modulo2EditarDialog dialog = new Modulo2EditarDialog ( this, modelo2 );
            dialog.setVisible ( true );
            
        } else if ( moduloActual.equals ( TIT_MODULO3 ) ) {
            int idcalif       = Integer.parseInt (
                                jTablePrincipal.getValueAt( pos, 0 ).toString () );
            String matricula  = jTablePrincipal.getValueAt( pos, 1 ).toString ();
            String idmateria  = jTablePrincipal.getValueAt( pos, 4 ).toString ();
            String periodo    = jTablePrincipal.getValueAt( pos, 6 ).toString ();
            String calific    = jTablePrincipal.getValueAt( pos, 7 ).toString ();
            
            int    calificacion  = Integer.parseInt( calific );
            
            Modelo3 modelo3 = new Modelo3 ( idcalif, matricula, idmateria, 
                                              periodo, calificacion );
            Modulo3EditarDialog dialog = new Modulo3EditarDialog ( this, modelo3 );
            dialog.setVisible ( true );
        }
    }//GEN-LAST:event_jButEditarActionPerformed

    private void jMniReportesModulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniReportesModulo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMniReportesModulo2ActionPerformed
//------------------------------------------------------------------------------
    //Boton que nos recalcula el promedio si tuvo una modificacion en kardex
    private void jMenuRecalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRecalcularActionPerformed
        String sql = propConsultasSQL.getProperty( ALUMNOS_ACTUALIZA_PROMEDIOS );
        
        try {
            
            int regs = EjecutorSQL.sqlEjecutar( sql );
            this.getjButModulo1().doClick();
                        JOptionPane.showMessageDialog(
                                  this,
                                  "Proceso terminado", 
                                  "Promedios" + regs + " registros fueron actualizadoss",
                                  JOptionPane.INFORMATION_MESSAGE );
                        
        } catch ( SQLException ex ) {
            JOptionPane.showMessageDialog(
                                  this,
                                  ex, 
                                  "ERROR",
                                  JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jMenuRecalcularActionPerformed

 //-----------------------------------------------------------------------------
    //Abre el AcercaDeDialog que tiene informacion del autor y del programa
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        AcercaDeDialog acercaDE = new AcercaDeDialog ( this, true );
        acercaDE.setVisible( true );
                                   
    }//GEN-LAST:event_jMenuItem1ActionPerformed
//------------------------------------------------------------------------------
     //Metodo para preparar y mostrar el modulo principal cuando se 
    //requiere volver al jFrame principal
    private void prepararVistaModulo ( String modulo ){
        moduloActual = modulo;
        jToolBarHerramientas.setVisible ( true  );
        
        jPanelLogoPrincipal.setVisible  ( false );
        jPanelTabla.setVisible          ( true  );
                
        jLabLeyendaPrincipal.setText  ( modulo );
        determinarNombresColumnas     ( modulo );
         
        DTM = new DefaultTableModel ( vecNombresColumnas, 0 );
        jTablePrincipal.setModel ( DTM );
    }

//------------------------------------------------------------------------------
    //Metodo que determina el nombre de las columnas de las tablas cuando se
    //selecciona un modulo
    private void determinarNombresColumnas ( String modulo ){
        vecNombresColumnas   = new Vector<String> ();
        vecNombresColumnasDB = new Vector<String> ();
        vecTiposColumnas     = new Vector<String> ();
        
        if ( modulo.equals ( TIT_MODULO1 ) ){
            vecNombresColumnas.add ( "Matricula" );
            vecNombresColumnas.add ( "Nombre"    );
            vecNombresColumnas.add ( "Apellidos" );
            vecNombresColumnas.add ( "Edad"      );
            vecNombresColumnas.add ( "Promedio"  );
            
            vecNombresColumnasDB.add ( "matricula" );
            vecNombresColumnasDB.add ( "nombre"    );
            vecNombresColumnasDB.add ( "apellidos" );
            vecNombresColumnasDB.add ( "edad"      );
            vecNombresColumnasDB.add ( "promedio"  );
            
            vecTiposColumnas.add (EjecutorSQL.STRING);
            vecTiposColumnas.add (EjecutorSQL.STRING);
            vecTiposColumnas.add (EjecutorSQL.STRING);
            vecTiposColumnas.add (EjecutorSQL.INT);
            vecTiposColumnas.add (EjecutorSQL.FLOAT);
            
        } else if ( modulo.equals  ( TIT_MODULO2 ) ){
            vecNombresColumnas.add ( "ID_Materia" );
            vecNombresColumnas.add ( "Materia"    );
            vecNombresColumnas.add ( "Creditos"   );
            
            vecNombresColumnasDB.add ( "idmateria" );
            vecNombresColumnasDB.add ( "materua"    );
            vecNombresColumnasDB.add ( "creditos" );
                       
            vecTiposColumnas.add (EjecutorSQL.STRING);
            vecTiposColumnas.add (EjecutorSQL.STRING);
            vecTiposColumnas.add (EjecutorSQL.INT);
            
            
        } else if ( modulo.equals  ( TIT_MODULO3 ) ){
            vecNombresColumnas.add ( "ID Calif"         );
            vecNombresColumnas.add ( "Matricula"        );
            vecNombresColumnas.add ( "Nombre"           );
            vecNombresColumnas.add ( "Apellidos"        );
            vecNombresColumnas.add ( "idmaterias"       );
            vecNombresColumnas.add ( "Materias"         );
            vecNombresColumnas.add ( "Periodo"          );
            vecNombresColumnas.add ( "Calificaciones"   );
            
            vecNombresColumnasDB.add ( "K.idcalif"        );
            vecNombresColumnasDB.add ( "K.matricula"      );
            vecNombresColumnasDB.add ( "A.nombre"         );
            vecNombresColumnasDB.add ( "A.apellidos"      );
            vecNombresColumnasDB.add ( "M.idmateria"      );
            vecNombresColumnasDB.add ( "M.materua"        );
            vecNombresColumnasDB.add ( "K.periodo"        );
            vecNombresColumnasDB.add ( "K.calificacion"   );
            
            vecTiposColumnas.add (EjecutorSQL.INT   );
            vecTiposColumnas.add (EjecutorSQL.STRING);
            vecTiposColumnas.add (EjecutorSQL.STRING);
            vecTiposColumnas.add (EjecutorSQL.STRING);
            vecTiposColumnas.add (EjecutorSQL.STRING);
            vecTiposColumnas.add (EjecutorSQL.STRING);
            vecTiposColumnas.add (EjecutorSQL.STRING);
            vecTiposColumnas.add (EjecutorSQL.INT   );
        }
        
    }

//------------------------------------------------------------------------------
    //Metodo que despliega los registros que hay en las tablas
    public void desplegarRegistros ( String sql, Object [][] args ) {
        ResultSet rs;
        try{
            rs = EjecutorSQL.sqlQuery ( sql, args );
            
            DTM = new DefaultTableModel ( vecNombresColumnas, 0 );
            while ( rs.next () ) {
            Object [] fila = crearFila ( rs );
            DTM.addRow ( fila );
            }
            rs.close();
            jTablePrincipal.setModel ( DTM );
            totalRegsitros = DTM.getRowCount ();
            jLabMensajes.setText ( totalRegsitros + " registros " );
                    
        }catch ( SQLException ex ) {
            JOptionPane.showMessageDialog( 
                    this, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    private Object [] crearFila ( ResultSet rs ) throws SQLException {
        if ( moduloActual.equals ( TIT_MODULO1 ) ) {
                String matricula = rs.getString ( "Matricula" );
                String nombre    = rs.getString ( "nombre"    );
                String apellidos = rs.getString ( "apellidos" );
                int    edad      = rs.getInt    ( "edad"      );
                float  promedio  = rs.getFloat  ( "promedio"  );
                
                Object [] fila = { matricula, nombre, apellidos, edad, promedio };
                return fila;
                
        } else if ( moduloActual.equals ( TIT_MODULO2 ) ) {
                String idmateria = rs.getString ( "idmateria" );
                String materia   = rs.getString ( "materua"   );
                int    creditos  = rs.getInt    ( "creditos"  );
                
                Object [] fila = { idmateria, materia, creditos};
                return fila;
                
        }else if ( moduloActual.equals ( TIT_MODULO3 ) ) {
                int    idcalif   = rs.getInt        ( "idcalif"      );
                String matricula = rs.getString     ( "matricula"    );
                String nombre    = rs.getString     ( "nombre"       );
                String apellidos = rs.getString     ( "apellidos"    );
                String idmateria = rs.getString     ( "idmateria"    );
                String materia   = rs.getString     ( "materua"      );
                String periodo   = rs.getString     ( "periodo"      );
                int calificacion  = rs.getInt       ( "calificacion" );
                
                Object [] fila = { idcalif, matricula, nombre, apellidos,
                                   idmateria, materia, periodo, calificacion };
                return fila;
        }else
                return null;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible( false );
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButEditar;
    private javax.swing.JButton jButEliminar;
    private javax.swing.JButton jButFiltrar;
    private javax.swing.JButton jButInicio;
    private javax.swing.JButton jButModulo1;
    private javax.swing.JButton jButModulo2;
    private javax.swing.JButton jButModulo3;
    private javax.swing.JButton jButNuevo;
    private javax.swing.JLabel jLabEstatus;
    private javax.swing.JLabel jLabLeyendaPrincipal;
    private javax.swing.JLabel jLabLogo;
    private javax.swing.JLabel jLabMensajes;
    private javax.swing.JLabel jLabModulo1;
    private javax.swing.JLabel jLabModulo2;
    private javax.swing.JLabel jLabModulo3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuRecalcular;
    private javax.swing.JMenu jMenuReportes;
    private javax.swing.JMenuItem jMniReportesModulo1;
    private javax.swing.JMenuItem jMniReportesModulo2;
    private javax.swing.JMenuItem jMniReportesModulo3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelEstatus;
    private javax.swing.JPanel jPanelLeyenda;
    private javax.swing.JPanel jPanelLogoPrincipal;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JScrollPane jScrollModulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePrincipal;
    private javax.swing.JToolBar jToolBarHerramientas;
    private javax.swing.JToolBar jToolEstatusConexion;
    private javax.swing.JToolBar jToolMensaje;
    private javax.swing.JMenu jmniAcercaDe;
    private javax.swing.JMenuItem jmniSalir;
    // End of variables declaration//GEN-END:variables

//------------------------------------------------------------------------------
    //get and Set 
public String getModuloActual() {
        return moduloActual;
    }

    public void setModuloActual(String moduloActual) {
        this.moduloActual = moduloActual;
    }

    public Vector<String> getVecNombresColumnas() {
        return vecNombresColumnas;
    }

    public void setVecNombresColumnas(Vector<String> vecNombresColumnas) {
        this.vecNombresColumnas = vecNombresColumnas;
    }

    public Vector<String> getVecNombresColumnasDB() {
        return vecNombresColumnasDB;
    }

    public void setVecNombresColumnasDB(Vector<String> vecNombresColumnasDB) {
        this.vecNombresColumnasDB = vecNombresColumnasDB;
    }

    public Vector<String> getVecTiposColumnas() {
        return vecTiposColumnas;
    }

    public void setVecTiposColumnas(Vector<String> vecTiposColumnas) {
        this.vecTiposColumnas = vecTiposColumnas;
    }

    public Properties getPropConsultasSQL() {
        return propConsultasSQL;
    }

    public void setPropConsultasSQL(Properties propConsultasSQL) {
        this.propConsultasSQL = propConsultasSQL;
    }

    public JButton getjButModulo1() {
        return jButModulo1;
    }

    public JButton getjButModulo2() {
        return jButModulo2;
    }

    public JButton getjButModulo3() {
        return jButModulo3;
    }
    
    

}
