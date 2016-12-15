/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author java
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    private Statement sentenciaSQL;
    private ResultSet rs;
    conexion cnn;
    datosc aux;
    public Clientes() {
        initComponents();
        MostrarTabla();
        fecha();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        paterno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        materno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        articulos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        articulo = new javax.swing.JTextField();
        saldo = new javax.swing.JTextField();
        abono = new javax.swing.JTextField();
        Realizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        sugerido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        venta = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("clientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 210, -1));

        jLabel2.setText("Apellido Paterno:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));
        jPanel1.add(paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 210, -1));

        jLabel3.setText("Apellido Materno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));
        jPanel1.add(materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 210, -1));

        jLabel4.setText("No Cliente:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        jPanel1.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 210, -1));

        jLabel5.setText("Direccion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, -1));

        jLabel6.setText("Telefono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 210, -1));

        articulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        articulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                articulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(articulos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 640, 100));

        jLabel7.setText("Articulos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("descripcion:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setText("Saldo:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel8.setText("Abono:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel2.add(articulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 140, -1));
        jPanel2.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 140, -1));
        jPanel2.add(abono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 140, -1));

        Realizar.setText("Aceptar");
        Realizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarActionPerformed(evt);
            }
        });
        jPanel2.add(Realizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel11.setText("Precio:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));
        jPanel2.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 140, -1));

        jLabel12.setText("abono sugerido:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));
        jPanel2.add(sugerido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 550, 170));

        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Estado del Cliente");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 450));

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem1.setText("informacion");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("crear");

        venta.setText("Venta");
        venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaActionPerformed(evt);
            }
        });
        jMenu3.add(venta);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fecha(){
        Calendar fecha=new GregorianCalendar();
        int año=fecha.get(Calendar.YEAR);
        int mes=fecha.get(Calendar.MONTH);
        int dia=fecha.get(Calendar.DAY_OF_MONTH);
        
        jLabel13.setText(" "+año+"/"+(mes+1)+"/"+dia);
    }
    
     public void venta(){
        Ventas_Socios vs=new Ventas_Socios();
        vs.cliente.setText(numero.getText());
        vs.nombre.setText(nombre.getText());
        vs.apellido.setText(paterno.getText());
        
        vs.setVisible(true);
    }
    private void ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaActionPerformed
        // TODO add your handling code here:
        venta();
    }//GEN-LAST:event_ventaActionPerformed

    
    private void articulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articulosMouseClicked
        // TODO add your handling code here:
        if(evt.getButton()==1){
            int fila=articulos.getSelectedRow();
            //sentenciaSQL.executeUpdate("INSERT INTO alumnos (id_Alumnos,Nombre,Apellido,Curso,Titulacion) VALUES ("+Integer.parseInt(txtidalumno.getText())+",'"+txtalumno.getText()+"','"+txtapellido.getText()+"',"+Integer.parseInt(txtcurso.getText())+","+Integer.parseInt(txttitulacion.getText())+")");
            try
            {
                cnn=new conexion();
                sentenciaSQL=cnn.Conectarse().createStatement();
                String sql="SELECT * FROM abonos WHERE id="+articulos.getValueAt(fila,0);
                rs=sentenciaSQL.executeQuery(sql);
                rs.next();
                
                articulo.setText(rs.getString("descripcion"));
                saldo.setText(rs.getString("saldo"));
                precio.setText(rs.getString("costo"));
                sugerido.setText(rs.getString("sugerido"));
                
                rs.close();
                sentenciaSQL.close();
                cnn.CerrarConexion();
                
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        }
    }//GEN-LAST:event_articulosMouseClicked

    private void RealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarActionPerformed
        // TODO add your handling code here:
        
        int resta=0;
        int n1=Integer.parseInt(saldo.getText());
        int n2=Integer.parseInt(abono.getText());
        
        resta=n1-n2;
        
        try{
            cnn=new conexion();
            sentenciaSQL=cnn.Conectarse().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sentenciaSQL.executeUpdate("insert into abonos(id,nombre,apellido,descripcion,costo,sugerido,abono,saldo,fecha)values("+Integer.parseInt(numero.getText())
                    +",'"+nombre.getText()+"','"+paterno.getText()+"','"+articulo.getText()+"',"+Integer.parseInt(precio.getText())
                    +","+Integer.parseInt(sugerido.getText())+","+Integer.parseInt(abono.getText())+","+resta+",'"+jLabel13.getText()+"')");
            JOptionPane.showMessageDialog(null, "Se ha realizado el abono");
            /*MostrarTabla();
            Limpiar();*/
            sentenciaSQL.close();
            cnn.CerrarConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_RealizarActionPerformed

    public void MostrarTabla(){
        String sql;
        try{
            cnn=new conexion();
            sentenciaSQL=cnn.Conectarse().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sql="SELECT * FROM abonos ";
            ResultSet rsth=sentenciaSQL.executeQuery(sql);
            ResultSetMetaData rsmd= rsth.getMetaData();
            int col=rsmd.getColumnCount();
            DefaultTableModel modelo= new DefaultTableModel();
            
            for(int i=1; i<=col; i++){
                //se rellena con encabezados de la tabla
                modelo.addColumn(rsmd.getColumnLabel(i));
            }
            while(rsth.next()){//se llena la tabla con registros
            String fila[]=new String[col];
            for(int j=0;j<col;j++){
                fila[j]=rsth.getString(j+1);
            }
            modelo.addRow(fila);
           }
            articulos.setModel(modelo);
            cnn.CerrarConexion();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Realizar;
    public javax.swing.JTextField Telefono;
    private javax.swing.JTextField abono;
    private javax.swing.JTextField articulo;
    private javax.swing.JTable articulos;
    public javax.swing.JTextField direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextField materno;
    public javax.swing.JTextField nombre;
    public javax.swing.JTextField numero;
    public javax.swing.JTextField paterno;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField saldo;
    private javax.swing.JTextField sugerido;
    private javax.swing.JMenuItem venta;
    // End of variables declaration//GEN-END:variables
}