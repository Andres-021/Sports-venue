
package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

// Controllers
import controller.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import models.*;
import utils.Response;

public class jfrmInfoPrincipalOrigin extends javax.swing.JFrame implements ActionListener {
    SoccerController soccerController = new SoccerController();
    SoftballController softballController = new SoftballController();
    
    
    List<String> listErrors = new ArrayList<>();
    
    jpfrmTabla1 tabla1=new jpfrmTabla1();
    jpfrmTabla2 tabla2 =new jpfrmTabla2();
    
    
    public jfrmInfoPrincipalOrigin() {
        initComponents();
        this.setLocationRelativeTo(null);   
        
//        if(typePerson.getSelectedItem() == "Futbolista"){
//            batting.setEditable(false);;
//            pitching.setEditable(false);
//        }
        
        tabla1.setVisible(false);
        tabla2.setVisible(false);
        
        contenedor.add(jPanel5);
        desHabilitarBot();
        
        registrar.addActionListener(this);
        info1.addActionListener(this);
        info2.addActionListener(this);
    }
    
    public void desHabilitarBot(){
        if(jPanel5.isVisible()){
            registrar.setEnabled(false);
            info1.setEnabled(true);
            info2.setEnabled(true);
            
        }else if(tabla1.isVisible()){
            registrar.setEnabled(true);
            info1.setEnabled(false);
            info2.setEnabled(true);
            
        }else if(tabla2.isVisible()){
            registrar.setEnabled(true);
            info1.setEnabled(true);
            info2.setEnabled(false);
            
        }
    }
            
    
    public void viewMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void viewErrors(String title){
        String errors = "";
        int i = 0;
        for (String error : listErrors) {
            errors += error+"\n";
        }
        this.viewMessage(title+"\n\n"+ errors);
        listErrors.clear();
    }
    
    public void clearInputs(){
        cod.setText("");
        name1.setText("");
        name2.setText("");
        lastName1.setText("");
        lastName2.setText("");
        age.setText("");
        speed.setText("");
        position.setText("");
        goals_score.setText("");
        assists.setText("");
        pass.setText("");
        
        batting.setText("");
        pitching.setText("");
        
        
        cod.requestFocus();
        typePerson.setSelectedItem("Seleccionar");
    }
    
    public boolean isNumeric(String input){
        try {
            int number = Integer.parseInt(input);
            // Paso con exito
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public void isStringValid(JTextField input, JLabel title){
        String data = input.getText();
        if(data.isEmpty()){
            listErrors.add(title.getText());
        }else 
            if(isNumeric(data)){
                listErrors.add(title.getText());
            
        }
        
    }
    
    public void validNumber(JTextField input, JLabel title){
        String data = input.getText();
        if(!isNumeric(data)){
            listErrors.add(title.getText());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        contenedor = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabelLastName2 = new javax.swing.JLabel();
        lastName2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabelCod = new javax.swing.JLabel();
        jLabelName1 = new javax.swing.JLabel();
        jLabelName2 = new javax.swing.JLabel();
        jLabelLastName1 = new javax.swing.JLabel();
        speed = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        name2 = new javax.swing.JTextField();
        lastName1 = new javax.swing.JTextField();
        Añadir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelAge = new javax.swing.JLabel();
        jLabelSpeed = new javax.swing.JLabel();
        jLabelPosition = new javax.swing.JLabel();
        jLabelBatting = new javax.swing.JLabel();
        jLabelGoals = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        position = new javax.swing.JTextField();
        goals_score = new javax.swing.JTextField();
        batting = new javax.swing.JTextField();
        typePerson = new javax.swing.JComboBox<>();
        jLabelAssists = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        pitching = new javax.swing.JTextField();
        jLabelPass = new javax.swing.JLabel();
        jLabelPitching = new javax.swing.JLabel();
        assists = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        registrar = new javax.swing.JButton();
        info1 = new javax.swing.JButton();
        info2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setMinimumSize(new java.awt.Dimension(644, 221));
        jPanel3.setLayout(new java.awt.BorderLayout());

        contenedor.setLayout(new java.awt.BorderLayout());

        jLabelLastName2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLastName2.setText("Segundo apellido");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Sistema de Jugadores");

        jLabelCod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCod.setText("Codigo");

        jLabelName1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelName1.setText("Primer nombre");

        jLabelName2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelName2.setText("Segundo nombre");

        jLabelLastName1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLastName1.setText("Primer apellido");

        speed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedActionPerformed(evt);
            }
        });

        Añadir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Añadir.setText("Añadir");
        Añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelAge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAge.setText("Edad");

        jLabelSpeed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSpeed.setText("Velocidad");

        jLabelPosition.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPosition.setText("Posicion");

        jLabelBatting.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBatting.setText("Bateo");

        jLabelGoals.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelGoals.setText("Goles");

        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });

        goals_score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goals_scoreActionPerformed(evt);
            }
        });

        batting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                battingActionPerformed(evt);
            }
        });

        typePerson.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Futbolista", "Softbolista" }));
        typePerson.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typePersonItemStateChanged(evt);
            }
        });

        jLabelAssists.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAssists.setText("Asistencias");

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        pitching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pitchingActionPerformed(evt);
            }
        });

        jLabelPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPass.setText("Pases");

        jLabelPitching.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPitching.setText("Lanzamiento");

        assists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assistsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(jLabel6))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabelCod, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabelName1)
                .addGap(22, 22, 22)
                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(speed, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabelName2)
                .addGap(6, 6, 6)
                .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelGoals, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(goals_score, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabelLastName1)
                .addGap(22, 22, 22)
                .addComponent(lastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelAssists)
                .addGap(29, 29, 29)
                .addComponent(assists, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabelPass)
                .addGap(6, 6, 6)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabelLastName2)
                .addGap(6, 6, 6)
                .addComponent(lastName2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelBatting, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(batting, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabelPitching)
                .addGap(18, 18, 18)
                .addComponent(pitching, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(Añadir)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addGap(71, 71, 71)
                .addComponent(typePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCod)
                            .addComponent(jLabelAge))))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelName1))
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelSpeed))
                    .addComponent(speed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelName2))
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelGoals))
                    .addComponent(goals_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLastName1)
                            .addComponent(jLabelAssists)
                            .addComponent(jLabelPass))))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLastName2)
                            .addComponent(jLabelBatting))))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPosition)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelPitching))
                    .addComponent(pitching, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typePerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Añadir)
                            .addComponent(jButton1)))))
        );

        contenedor.add(jPanel5, java.awt.BorderLayout.CENTER);

        registrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registrar.setText("Registrar");
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(registrar);

        info1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        info1.setText("Futbolistas");
        info1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(info1);

        info2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        info2.setText("Softbolistas");
        info2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(info2);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cerrar(X)");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);

        contenedor.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel3.add(contenedor, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void speedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedActionPerformed

    }//GEN-LAST:event_speedActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed

        String select = (String) typePerson.getSelectedItem();
        
        if(select == "Seleccionar"){
            this.viewMessage("Por favor seleccione un tipo de persona");
        }else{
            this.isStringValid(name1, jLabelName1);
            this.isStringValid(name2, jLabelName2);
            this.isStringValid(lastName1, jLabelLastName1);
            this.isStringValid(lastName2, jLabelLastName2);
            this.isStringValid(position, jLabelPosition);
            
            if(listErrors.size()> 0){
                this.viewErrors("Los siguientes campos estan vacios o no son de texto");
            }

            this.validNumber(cod, jLabelCod);
            this.validNumber(age, jLabelAge);
            this.validNumber(speed, jLabelSpeed);  
            
            if(select == "Futbolista"){      
                this.validNumber(goals_score, jLabelGoals);
                this.validNumber(assists, jLabelAssists);
                this.validNumber(pass, jLabelPass);
                
                if(listErrors.size() > 0){
                    this.viewErrors("Los siguientes campos estan vacios o no son numericos");
                    return;
                }

                Soccer soccer = new Soccer(
                    Integer.parseInt(cod.getText()),
                    name1.getText(),
                    name2.getText(),
                    lastName1.getText(),
                    lastName2.getText(),
                    Integer.parseInt(age.getText()),
                    Integer.parseInt(speed.getText()),
                    position.getText(),
                    Integer.parseInt(goals_score.getText()),
                    Integer.parseInt(assists.getText()),
                    Integer.parseInt(pass.getText())
                );

                Response res = soccerController.insert(soccer);
                if(res.isSuccess()){
                    this.clearInputs();
                    this.tabla1 = new jpfrmTabla1();
                }
                this.viewMessage(res.getMessage());

            }

            if(select == "Softbolista"){

                this.validNumber(batting, jLabelBatting);
                this.validNumber(pitching, jLabelPitching);
                
                if(listErrors.size() > 0){
                    this.viewErrors("Los siguientes campos estan vacios o no son numericos");
                    return;
                }

                Softball softball = new Softball(
                    Integer.parseInt(cod.getText()),
                    name1.getText(),
                    name2.getText(),
                    lastName1.getText(),
                    lastName2.getText(),
                    Integer.parseInt(age.getText()),
                    Integer.parseInt(speed.getText()),
                    position.getText(),
                    Integer.parseInt(batting.getText()),
                    Integer.parseInt(pitching.getText())
                );

                Response res = softballController.insert(softball);
                if(res.isSuccess()){
                    this.tabla2 = new jpfrmTabla2();
                    this.clearInputs();
                }
                this.viewMessage(res.getMessage());
            }
        }
        
    }//GEN-LAST:event_AñadirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.clearInputs();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionActionPerformed

    private void goals_scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goals_scoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goals_scoreActionPerformed

    private void battingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_battingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_battingActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void pitchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pitchingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pitchingActionPerformed

    private void assistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assistsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assistsActionPerformed

    private void typePersonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typePersonItemStateChanged
        String selected = (String) typePerson.getSelectedItem();
        
        if(selected == "Futbolista"){
            goals_score.setEditable(true);
            goals_score.setBackground(Color.white);
            
            assists.setEditable(true);
            assists.setBackground(Color.white);
            
            pass.setEditable(true);
            pass.setBackground(Color.white);
            
            // Softbolista
            batting.setEditable(false);
            batting.setBackground(Color.gray);
            
            pitching.setEditable(false);
            pitching.setBackground(Color.gray);
        }
        
        if(selected == "Softbolista"){
            batting.setEditable(true);
            batting.setBackground(Color.white);
            
            pitching.setEditable(true);
            pitching.setBackground(Color.white);
            
            // Futbolista
            goals_score.setEditable(false);
            goals_score.setBackground(Color.gray);
            
            assists.setEditable(false);
            assists.setBackground(Color.gray);
            
            pass.setEditable(false);
            pass.setBackground(Color.gray);
            
            
        }
    }//GEN-LAST:event_typePersonItemStateChanged

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
            java.util.logging.Logger.getLogger(jfrmInfoPrincipalOrigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmInfoPrincipalOrigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmInfoPrincipalOrigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmInfoPrincipalOrigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmInfoPrincipalOrigin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JTextField age;
    private javax.swing.JTextField assists;
    private javax.swing.JTextField batting;
    private javax.swing.JTextField cod;
    private javax.swing.JPanel contenedor;
    private javax.swing.JTextField goals_score;
    private javax.swing.JButton info1;
    private javax.swing.JButton info2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelAssists;
    private javax.swing.JLabel jLabelBatting;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelGoals;
    private javax.swing.JLabel jLabelLastName1;
    private javax.swing.JLabel jLabelLastName2;
    private javax.swing.JLabel jLabelName1;
    private javax.swing.JLabel jLabelName2;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelPitching;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelSpeed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField lastName1;
    private javax.swing.JTextField lastName2;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField pitching;
    private javax.swing.JTextField position;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField speed;
    private javax.swing.JComboBox<String> typePerson;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        if(evt.equals(registrar)){
            jPanel5.setVisible(true);
            tabla2.setVisible(false);
            tabla1.setVisible(false);
            
            contenedor.validate();
            
            desHabilitarBot();
            
        }else if(evt.equals(info1)){
            jPanel5.setVisible(false);
            tabla1.setVisible(true);
            tabla2.setVisible(false);
            
            contenedor.add(tabla1);
            contenedor.validate();
            
            desHabilitarBot();
            
        }else if(evt.equals(info2)){
            jPanel5.setVisible(false);
            tabla1.setVisible(false);
            tabla2.setVisible(true);
            
            contenedor.add(tabla2);
            contenedor.validate();
            
            desHabilitarBot();
        }
        
    }
}
