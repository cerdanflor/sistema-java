/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author officedepot61417
 */
public class reportes extends javax.swing.JFrame {

    /**
     * Creates new form reportes
     */
    public reportes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fecha = new javax.swing.JComboBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        creditos = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        fecha1 = new javax.swing.JComboBox();
        abonos = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Control de Reportes:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel2.setText("Fecha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        fecha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015-11-11", "2015-11-13" }));
        fecha.setEnabled(false);
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 180, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Ventas");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        buttonGroup1.add(creditos);
        creditos.setText("Creditos");
        creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosActionPerformed(evt);
            }
        });
        jPanel1.add(creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel3.setText("Fecha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        fecha1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015-11-14", "2015-11-10", "2015-11-13" }));
        fecha1.setEnabled(false);
        jPanel1.add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 190, -1));

        buttonGroup1.add(abonos);
        abonos.setText("Abonos");
        abonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abonosActionPerformed(evt);
            }
        });
        jPanel1.add(abonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel4.setText("Id cliente");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        id.setEnabled(false);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 510, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    conexion cnn;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jRadioButton1.isSelected()){
        try {
            // TODO add your handling code here:
            cnn=new conexion();
            Map parametro=new HashMap();
            parametro.put("parameter1",fecha.getSelectedItem());
            
            String dir = "C:\\Users\\officedepot61417\\Documents\\NetBeansProjects\\muebleria1.6\\src\\reporte\\fecha.jrxml";
            
            JasperReport reporteJasper = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporteJasper, parametro, cnn.Conectarse());
            JasperViewer.viewReport(mostrarReporte);  
             
             cnn.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        if(creditos.isSelected()){
            try {
            // TODO add your handling code here:
            cnn=new conexion();
            Map parametro=new HashMap();
            parametro.put("fecha",fecha1.getSelectedItem());
            
            String dir1 = "C:\\Users\\officedepot61417\\Documents\\NetBeansProjects\\muebleria1.6\\src\\reporte\\creditos.jrxml";
            
            JasperReport reporteJasper1 = JasperCompileManager.compileReport(dir1);
            JasperPrint mostrarReporte1 = JasperFillManager.fillReport(reporteJasper1, parametro, cnn.Conectarse());
            JasperViewer visor=new JasperViewer(mostrarReporte1,false);
            visor.setTitle("prueba");
            visor.setVisible(true);
//JasperViewer.viewReport(mostrarReporte1);  
             
             cnn.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        if(abonos.isSelected()){
            try {
            cnn=new conexion();
            Map parametro=new HashMap();
            //int txt=Integer.parseInt(id.getText());
            parametro.put("parameter1",id.getText());
            
            String dir = "C:\\Users\\officedepot61417\\Documents\\NetBeansProjects\\muebleria1.6\\src\\reporte\\abonos.jrxml";
            
            JasperReport reporteJasper = JasperCompileManager.compileReport(dir);
            JasperPrint mostrarReporte3 = JasperFillManager.fillReport(reporteJasper, parametro, cnn.Conectarse());
            JasperViewer visor=new JasperViewer(mostrarReporte3,false);
            visor.setTitle("prueba");
            visor.setVisible(true);
//JasperViewer.viewReport(mostrarReporte);  
             
            cnn.CerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
//                    String dir = "C:\\Users\\officedepot61417\\Documents\\NetBeansProjects\\muebleria1.6\\src\\reporte\\prueba2.jrxml";
//                    JasperReport reporteJasper = JasperCompileManager.compileReport(dir);
//                    JasperPrint mostrarReporte = JasperFillManager.fillReport(reporteJasper, null, cnn.Conectarse());
//                    JasperViewer.viewReport(mostrarReporte);       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        fecha.setEnabled(true);
        
        fecha1.setEnabled(false);
        id.setEnabled(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosActionPerformed
        // TODO add your handling code here:
        fecha.setEnabled(false);
        
        fecha1.setEnabled(true);
        id.setEnabled(false);
    }//GEN-LAST:event_creditosActionPerformed

    private void abonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abonosActionPerformed
        // TODO add your handling code here:
        fecha.setEnabled(false);
        fecha1.setEnabled(false);
        id.setEnabled(true);
    }//GEN-LAST:event_abonosActionPerformed

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
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abonos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton creditos;
    private javax.swing.JComboBox fecha;
    private javax.swing.JComboBox fecha1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
