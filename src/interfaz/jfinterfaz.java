/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Hilo;
import com.sun.awt.AWTUtilities;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Nahomi
 */
public class jfinterfaz extends javax.swing.JFrame {

    boolean click = false;
    private ArrayList<JProgressBar> procesos;
    private ArrayList<Integer> noProcesos;
    private Hilo hiloProcesos;
    private int q;

    /**
     * Creates new form jfinterfaz
     */
    public jfinterfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        sNumeros(txtquantum);
        procesos = new ArrayList<>();
        noProcesos = new ArrayList<>();
        hiloProcesos = new Hilo();
        panelProgress.setLayout(new GridLayout(10, 1));
        hiloProcesos.setPanelProcesos(panelProgress);
        hiloProcesos.setProgressbar(procesos);
        hiloProcesos.setTablita(rsTblProcesos, rSLabelHora1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnminimizar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rsprogres = new rojerusan.RSPanelsSlider();
        pprogresvacio = new javax.swing.JPanel();
        pprogres = new javax.swing.JPanel();
        panelProgress = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rsprincipal = new rojerusan.RSPanelsSlider();
        pprincipalvacio = new javax.swing.JPanel();
        pprincipal = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtquantum = new javax.swing.JTextField();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        btningresar = new rojerusan.RSMaterialButtonRectangle();
        btninterrupción = new rojerusan.RSMaterialButtonRectangle();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rscalendarizacion = new rojerusan.RSPanelsSlider();
        pcalenvacio = new javax.swing.JPanel();
        pcalendarizacion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        rspprocesos = new rojerusan.RSPanelsSlider();
        pprocesovacio = new javax.swing.JPanel();
        pprocesos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rsTblProcesos = new rojerusan.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/icons8_Down_Button_35px.png"))); // NOI18N
        btnminimizar.setToolTipText("MINIMIZAR");
        btnminimizar.setBorder(null);
        btnminimizar.setBorderPainted(false);
        btnminimizar.setContentAreaFilled(false);
        btnminimizar.setName("btnminimizar"); // NOI18N
        btnminimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/icons8_Down_Button_45px.png"))); // NOI18N
        btnminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizarMouseClicked(evt);
            }
        });
        getContentPane().add(btnminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 506, -1, -1));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/icons8_Cancel_35px.png"))); // NOI18N
        btncerrar.setToolTipText("CERRAR");
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setName("btncerrar"); // NOI18N
        btncerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/icons8_Cancel_45px.png"))); // NOI18N
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
        });
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 505, -1, -1));

        rSLabelFecha1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelFecha1.setFont(new java.awt.Font("AR CENA", 0, 24)); // NOI18N
        getContentPane().add(rSLabelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 360, -1, -1));

        rSLabelHora1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelHora1.setFont(new java.awt.Font("AR CENA", 0, 36)); // NOI18N
        getContentPane().add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 400, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/centro (1).png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 400));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 400));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 280, 300));

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(554, 413));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.CardLayout());

        rsprogres.setName("rsprogres"); // NOI18N
        rsprogres.setOpaque(false);
        rsprogres.setPreferredSize(new java.awt.Dimension(554, 413));

        pprogresvacio.setName("pprogresvacio"); // NOI18N
        pprogresvacio.setOpaque(false);
        pprogresvacio.setPreferredSize(new java.awt.Dimension(554, 413));

        javax.swing.GroupLayout pprogresvacioLayout = new javax.swing.GroupLayout(pprogresvacio);
        pprogresvacio.setLayout(pprogresvacioLayout);
        pprogresvacioLayout.setHorizontalGroup(
            pprogresvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        pprogresvacioLayout.setVerticalGroup(
            pprogresvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        rsprogres.add(pprogresvacio, "card3");

        pprogres.setName("pprogres"); // NOI18N
        pprogres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelProgress.setAutoscrolls(true);
        panelProgress.setOpaque(false);
        panelProgress.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pprogres.add(panelProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 530, 270));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo5.jpg"))); // NOI18N
        pprogres.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 420));

        rsprogres.add(pprogres, "card2");

        jPanel1.add(rsprogres, "card2");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.CardLayout());

        rsprincipal.setName("rsprincipal"); // NOI18N
        rsprincipal.setOpaque(false);
        rsprincipal.setPreferredSize(new java.awt.Dimension(554, 413));

        pprincipalvacio.setName("pprincipalvacio"); // NOI18N
        pprincipalvacio.setOpaque(false);

        javax.swing.GroupLayout pprincipalvacioLayout = new javax.swing.GroupLayout(pprincipalvacio);
        pprincipalvacio.setLayout(pprincipalvacioLayout);
        pprincipalvacioLayout.setHorizontalGroup(
            pprincipalvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        pprincipalvacioLayout.setVerticalGroup(
            pprincipalvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        rsprincipal.add(pprincipalvacio, "card2");

        pprincipal.setMinimumSize(new java.awt.Dimension(554, 413));
        pprincipal.setName("pprincipal"); // NOI18N
        pprincipal.setPreferredSize(new java.awt.Dimension(554, 413));
        pprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("AR CENA", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantum:");
        pprincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 230, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("ms");
        pprincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 168, 40, 30));

        txtquantum.setFont(new java.awt.Font("AR CENA", 0, 24)); // NOI18N
        txtquantum.setForeground(new java.awt.Color(255, 102, 0));
        txtquantum.setText("Ingrese Quantum");
        txtquantum.setBorder(null);
        txtquantum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtquantumMouseClicked(evt);
            }
        });
        pprincipal.add(txtquantum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 200, 50));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(255, 255, 255));
        rSMaterialButtonRectangle2.setText("rSMaterialButtonRectangle2");
        pprincipal.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        btningresar.setBackground(new java.awt.Color(255, 255, 255));
        btningresar.setForeground(new java.awt.Color(255, 102, 0));
        btningresar.setText("iNGRESAR");
        btningresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btningresarMouseClicked(evt);
            }
        });
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        pprincipal.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 160, -1));

        btninterrupción.setBackground(new java.awt.Color(255, 255, 255));
        btninterrupción.setForeground(new java.awt.Color(255, 102, 0));
        btninterrupción.setText("INTERRUPCION");
        btninterrupción.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninterrupciónMouseClicked(evt);
            }
        });
        btninterrupción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninterrupciónActionPerformed(evt);
            }
        });
        pprincipal.add(btninterrupción, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo5.jpg"))); // NOI18N
        pprincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 420));

        rsprincipal.add(pprincipal, "card3");

        jPanel3.add(rsprincipal, "card2");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.CardLayout());

        rscalendarizacion.setName("rscalendarizacion"); // NOI18N
        rscalendarizacion.setOpaque(false);

        pcalenvacio.setName("pcalenvacio"); // NOI18N
        pcalenvacio.setOpaque(false);

        javax.swing.GroupLayout pcalenvacioLayout = new javax.swing.GroupLayout(pcalenvacio);
        pcalenvacio.setLayout(pcalenvacioLayout);
        pcalenvacioLayout.setHorizontalGroup(
            pcalenvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        pcalenvacioLayout.setVerticalGroup(
            pcalenvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        rscalendarizacion.add(pcalenvacio, "card2");

        pcalendarizacion.setName("pcalendarizacion"); // NOI18N
        pcalendarizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        pcalendarizacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 420));

        rscalendarizacion.add(pcalendarizacion, "card3");

        jPanel4.add(rscalendarizacion, "card2");

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 102, 51));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.CardLayout());

        rspprocesos.setName("rspprocesos"); // NOI18N
        rspprocesos.setOpaque(false);
        rspprocesos.setPreferredSize(new java.awt.Dimension(554, 413));

        pprocesovacio.setOpaque(false);

        javax.swing.GroupLayout pprocesovacioLayout = new javax.swing.GroupLayout(pprocesovacio);
        pprocesovacio.setLayout(pprocesovacioLayout);
        pprocesovacioLayout.setHorizontalGroup(
            pprocesovacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        pprocesovacioLayout.setVerticalGroup(
            pprocesovacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        rspprocesos.add(pprocesovacio, "card2");

        pprocesos.setName("pprocesos"); // NOI18N
        pprocesos.setPreferredSize(new java.awt.Dimension(554, 413));
        pprocesos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rsTblProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Hora inicio", "Hora fin"
            }
        ));
        rsTblProcesos.setColorBackgoundHead(new java.awt.Color(255, 102, 0));
        rsTblProcesos.setColorFilasBackgound2(new java.awt.Color(255, 204, 102));
        rsTblProcesos.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rsTblProcesos.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        rsTblProcesos.setColorSelBackgound(new java.awt.Color(255, 204, 102));
        rsTblProcesos.setEnabled(false);
        jScrollPane1.setViewportView(rsTblProcesos);

        pprocesos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 390, 290));

        jLabel3.setFont(new java.awt.Font("AR CENA", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pocesos:");
        pprocesos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        pprocesos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 420));

        rspprocesos.add(pprocesos, "card3");

        jPanel5.add(rspprocesos, "card2");

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        /*rsprincipal.setPanelSlider((int)1.2,pprincipal, RSPanelsSlider.DIRECT.LEFT);
        click = false;*/
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        /*if(click == false)
        {
                   rsprincipal.setPanelSlider( pprincipalvacio, RSPanelsSlider.DIRECT.RIGHT);
         }
        else    rsprincipal.setPanelSlider( pprincipal, RSPanelsSlider.DIRECT.LEFT); */
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (click == false) {
            rsprincipal.setPanelSlider((int) 1.2, pprincipal, RSPanelsSlider.DIRECT.UP);
            rsprogres.setPanelSlider((int) 1.2, pprogres, RSPanelsSlider.DIRECT.DOWN);
            click = true;
        } else {
            rsprincipal.setPanelSlider((int) 1.2, pprincipalvacio, RSPanelsSlider.DIRECT.UP);
            rsprogres.setPanelSlider((int) 1.2, pprogresvacio, RSPanelsSlider.DIRECT.DOWN);
            click = false;
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btnminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizarMouseClicked

    private void txtquantumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtquantumMouseClicked
        txtquantum.setText("");
    }//GEN-LAST:event_txtquantumMouseClicked

    private void btningresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresarMouseClicked
        if (txtquantum.getText().length() == 0 || txtquantum.getText().equals("Ingrese Quantum")) {
            JOptionPane.showMessageDialog(null, "Ingrese un quantum correcto");
        } else {
            rspprocesos.setPanelSlider((int) 1.2, pprocesos, RSPanelsSlider.DIRECT.RIGHT);
            rscalendarizacion.setPanelSlider((int) 1.2, pcalendarizacion, RSPanelsSlider.DIRECT.LEFT);
            q = Integer.parseInt(txtquantum.getText());
            rsTblProcesos.setModel(colocar_textos_tabla(rSLabelHora1.getHora()));
        }
    }//GEN-LAST:event_btningresarMouseClicked

    //Método para validar el ingreso de solo número en el txtquantum
    private void sNumeros(JTextField txt) {
        txt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }

    //Método para colocar la hora de inicio del proceso X a la tabla
    private DefaultTableModel colocar_textos_tabla(String hora) {
        DefaultTableModel modelo = (DefaultTableModel) rsTblProcesos.getModel();
        String registros[] = new String[3];
        //Acá como proceso X porque vos ya manejas el contador de procesos, entonces ya solo lo concatenás en el registros[0]
        registros[0] = "Proceso " + (modelo.getRowCount() + 1);
        registros[1] = hora;
        modelo.addRow(registros);
        int numero = (int) (Math.random() * 250) + 1;
        noProcesos.add(modelo.getRowCount());
        procesos.add(new JProgressBar(0, numero));
        procesos.get(procesos.size() - 1).setStringPainted(true);
        procesos.get(procesos.size() - 1).setString("Proceso " + modelo.getRowCount() + " 0/" + procesos.get(procesos.size() - 1).getMaximum());
        hiloProcesos.setProgressbar(procesos);
        hiloProcesos.setNoProceso(noProcesos);
        panelProgress.add(this.procesos.get(procesos.size() - 1));
        hiloProcesos.setPanelProcesos(panelProgress);
        if (hiloProcesos.getState() == Thread.State.NEW) {
            hiloProcesos.setQuantum(q);
            hiloProcesos.start();
        } else if (hiloProcesos.getState() == Thread.State.TERMINATED && !procesos.isEmpty()) {
            hiloProcesos = new Hilo();
            hiloProcesos.setQuantum(q);
            hiloProcesos.setPanelProcesos(panelProgress);
            hiloProcesos.setTablita(rsTblProcesos, rSLabelHora1);
            hiloProcesos.setProgressbar(procesos);
            hiloProcesos.setNoProceso(noProcesos);
            hiloProcesos.start();
        }
        return modelo;
    }
    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed

    }//GEN-LAST:event_btningresarActionPerformed

    private void btninterrupciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninterrupciónMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btninterrupciónMouseClicked

    private void btninterrupciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninterrupciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btninterrupciónActionPerformed

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
            java.util.logging.Logger.getLogger(jfinterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfinterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfinterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfinterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfinterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private rojerusan.RSMaterialButtonRectangle btningresar;
    private rojerusan.RSMaterialButtonRectangle btninterrupción;
    private javax.swing.JButton btnminimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelProgress;
    private javax.swing.JPanel pcalendarizacion;
    private javax.swing.JPanel pcalenvacio;
    private javax.swing.JPanel pprincipal;
    private javax.swing.JPanel pprincipalvacio;
    private javax.swing.JPanel pprocesos;
    private javax.swing.JPanel pprocesovacio;
    private javax.swing.JPanel pprogres;
    private javax.swing.JPanel pprogresvacio;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSTableMetro rsTblProcesos;
    private rojerusan.RSPanelsSlider rscalendarizacion;
    private rojerusan.RSPanelsSlider rspprocesos;
    private rojerusan.RSPanelsSlider rsprincipal;
    private rojerusan.RSPanelsSlider rsprogres;
    private javax.swing.JTextField txtquantum;
    // End of variables declaration//GEN-END:variables
}
