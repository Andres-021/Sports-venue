
package ui;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
// Controllador
import controller.SoftballController;
import javax.swing.JOptionPane;

// Model
import models.Softball;

// Utils
import utils.Response;

public class jpfrmTabla2 extends javax.swing.JPanel {
    SoftballController softballController;
    Response res;
    
    public jpfrmTabla2(){
        initComponents();
        softballController = new SoftballController();
        res = softballController.getAll();
        this.setLLenatJTable(jTable1, res.getList());
    }
    
    public void setAgregarFilaJTable(DefaultTableModel miModelo, int fila, Softball softball){
        miModelo.setValueAt(softball.getCod(), fila, 0);
        miModelo.setValueAt(softball.getName1(), fila, 1);
        miModelo.setValueAt(softball.getName2(), fila, 2);
        miModelo.setValueAt(softball.getLastName1(), fila, 3); 
        miModelo.setValueAt(softball.getLastName2(), fila, 4);
        miModelo.setValueAt(softball.getAge(), fila, 5);
        miModelo.setValueAt(softball.getSpeed(), fila, 6);
        miModelo.setValueAt(softball.getPosition(), fila, 7);
        miModelo.setValueAt(softball.getBatting(), fila, 8);
        miModelo.setValueAt(softball.getPitching(), fila, 9);
        
    }
    
    public void setLLenatJTable(JTable table, List<Object> list){
        
        int i=0;
        
        DefaultTableModel miModelo=new DefaultTableModel();
        miModelo.addColumn("Codigo");
        miModelo.addColumn("Primer nombre");
        miModelo.addColumn("Segundo nombre");
        miModelo.addColumn("Primer apellido");
        miModelo.addColumn("Segundo apellido");
        miModelo.addColumn("Edad");
        miModelo.addColumn("Velocidad");
        miModelo.addColumn("Posicion");
        miModelo.addColumn("Bateo");
        miModelo.addColumn("Lanzamiento");
        
        for(Object data: list){
            Softball softball = (Softball) data;
            
            miModelo.addRow(new Object[]{"", "", "", "", "", "", "", "", "", ""}); 
            setAgregarFilaJTable(miModelo,i,softball);
            
            i++;
        }
        table.setModel(miModelo);
    } 
    
    
    public void viewMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem2.setText("Eliminar");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setBackground(new java.awt.Color(255, 51, 51));
        setMinimumSize(new java.awt.Dimension(644, 221));
        setPreferredSize(new java.awt.Dimension(889, 220));
        setLayout(new java.awt.GridBagLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 863;
        gridBagConstraints.ipady = 149;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        add(jScrollPane1, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 6, 0);
        add(jButton1, gridBagConstraints);

        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 6, 0, 10);
        add(cod, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 620, 0, 0);
        add(jLabel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
        res = softballController.getAll();
        this.setLLenatJTable(jTable1, res.getList());
        this.viewMessage(res.getMessage());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        String cods = cod.getText();
        try {
            int number = Integer.parseInt(cods);
            
            res = softballController.getById(number);
            this.viewMessage(res.getMessage());
            this.setLLenatJTable(jTable1, res.getList());
            
        } catch (NumberFormatException e) {
            this.viewMessage("El codigo no es un numero o es vacio");
        }
    }//GEN-LAST:event_codActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int cod = Integer.parseInt(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString());
        res = softballController.delete(cod);
        this.viewMessage(res.getMessage());
        
        res = softballController.getAll();
        this.setLLenatJTable(jTable1, res.getList());
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cod;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
