/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorent;

import conexion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import warnings.Warning1;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcelo Cazon <sandman.net@gmail.com>
 */
public class CajaCliente1 extends javax.swing.JFrame {

    private int i = 0;
    private Integer[] dni = new Integer[i];
    private String[] dni1 = new String[i];

    /**
     * Creates new form CajaCliente
     */
    public CajaCliente1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        

        videorentPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("videorentPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : videorentPUEntityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        clienteQuery1 = java.beans.Beans.isDesignTime() ? null : videorentPUEntityManager.createQuery("SELECT c FROM Cliente c");
        clienteList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery1.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("SELECCIONE CLIENTE");

        jButton1.setText("BUSCAR");

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[]{}));
        jComboBox2.setName("jComboBox2"); // NOI18N
        jComboBox2.addAncestorListener(new javax.swing.event.AncestorListener() {
            @Override
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }

            @Override
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox2AncestorAdded(evt);
            }

            @Override
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jButton1))
                .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1))
                .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(55, Short.MAX_VALUE)));

        

        pack();
    }// </editor-fold>                        

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        Cliente c = new Cliente();
        Caja cc = new Caja();
        int datos;
        try {
            c.setDni(Integer.parseInt((String) jComboBox2.getSelectedItem()));
            cc.setDni(c.getDni());
            cc.setVisible(true);
            dispose();

        } catch (Exception e) {
            Warning1 a = new Warning1();
            a.setVisible(true);

        }
    }

    private void jComboBox2AncestorAdded(javax.swing.event.AncestorEvent evt) {

        conexionBD con = new conexionBD();
        ResultSet datos = null;
        datos = con.Consulta("SELECT * FROM cliente");
        try {
            while (datos.next()) {
                this.jComboBox2.addItem(datos.getString("dni"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Nuevocliente.class.getName()).log(Level.SEVERE, null, ex);
        }


        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(CajaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CajaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CajaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CajaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CajaCliente1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private java.util.List<videorent.Cliente> clienteList;
    private java.util.List<videorent.Cliente> clienteList1;
    private javax.persistence.Query clienteQuery;
    private javax.persistence.Query clienteQuery1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.persistence.EntityManager videorentPUEntityManager;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration                   
}