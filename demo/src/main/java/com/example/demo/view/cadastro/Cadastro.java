/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.demo.view.cadastro;

import java.util.Arrays;

import javax.swing.JOptionPane;

import com.example.demo.view.ControleView;
import com.example.demo.view.login.JFLogin;

/**
 *
 * @author Dev
 */
public class Cadastro extends javax.swing.JFrame {
    private final ControleView controleView;

    /**
     * Creates new form Cadastro
     */
    public Cadastro(ControleView controleView) {
        initComponents();
        this.controleView = controleView;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        conteinerNome = new javax.swing.JPanel();
        conteinerTitulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        conteinerTxtField = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        conteinerCPF = new javax.swing.JPanel();
        conteinerTitulo1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        conteinerTxtField1 = new javax.swing.JPanel();
        txtCPF = new javax.swing.JTextField();
        conteinerCargo = new javax.swing.JPanel();
        conteinerTitulo2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        conteinerTxtField2 = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        conteinerEntrar = new javax.swing.JPanel();
        conteinerEntrar1 = new javax.swing.JPanel();
        conteinerTitulo4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        conteinerTitulo3 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro SGDS © PanasTech");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel2.setBackground(new java.awt.Color(4, 56, 79));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(95, 133, 138));
        jPanel4.setPreferredSize(new java.awt.Dimension(350, 500));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jPanel6.setBackground(new java.awt.Color(87, 122, 137));
        jPanel6.setAutoscrolls(true);
        jPanel6.setPreferredSize(new java.awt.Dimension(350, 75));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro da Saúde");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap(68, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addContainerGap(67, Short.MAX_VALUE)));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(20, 20, 20)));

        jPanel4.add(jPanel6);

        jPanel5.setBackground(new java.awt.Color(95, 133, 138));
        jPanel5.setAutoscrolls(true);
        jPanel5.setPreferredSize(new java.awt.Dimension(350, 425));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        conteinerNome.setBackground(new java.awt.Color(87, 122, 137));
        conteinerNome.setAutoscrolls(true);
        conteinerNome.setOpaque(false);
        conteinerNome.setPreferredSize(new java.awt.Dimension(350, 80));
        conteinerNome.setRequestFocusEnabled(false);
        conteinerNome.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        conteinerTitulo.setOpaque(false);
        conteinerTitulo.setPreferredSize(new java.awt.Dimension(350, 40));
        conteinerTitulo.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nome Completo");
        conteinerTitulo.add(jLabel2, java.awt.BorderLayout.CENTER);

        conteinerNome.add(conteinerTitulo);

        conteinerTxtField.setOpaque(false);
        conteinerTxtField.setPreferredSize(new java.awt.Dimension(350, 40));
        conteinerTxtField.setLayout(new java.awt.GridBagLayout());

        txtNome.setPreferredSize(new java.awt.Dimension(300, 30));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        conteinerTxtField.add(txtNome, gridBagConstraints);

        conteinerNome.add(conteinerTxtField);

        jPanel5.add(conteinerNome);

        conteinerCPF.setBackground(new java.awt.Color(87, 122, 137));
        conteinerCPF.setAutoscrolls(true);
        conteinerCPF.setOpaque(false);
        conteinerCPF.setPreferredSize(new java.awt.Dimension(350, 80));
        conteinerCPF.setRequestFocusEnabled(false);
        conteinerCPF.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        conteinerTitulo1.setOpaque(false);
        conteinerTitulo1.setPreferredSize(new java.awt.Dimension(350, 40));
        java.awt.GridBagLayout conteinerTitulo1Layout = new java.awt.GridBagLayout();
        new java.awt.GridBagLayout().columnWidths = new int[] { 2 };
        conteinerTitulo1.setLayout(conteinerTitulo1Layout);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" CPF");
        conteinerTitulo1.add(jLabel3, new java.awt.GridBagConstraints());

        conteinerCPF.add(conteinerTitulo1);

        conteinerTxtField1.setOpaque(false);
        conteinerTxtField1.setPreferredSize(new java.awt.Dimension(350, 40));
        conteinerTxtField1.setLayout(new java.awt.GridBagLayout());

        txtCPF.setPreferredSize(new java.awt.Dimension(300, 30));
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        conteinerTxtField1.add(txtCPF, new java.awt.GridBagConstraints());

        conteinerCPF.add(conteinerTxtField1);

        jPanel5.add(conteinerCPF);

        conteinerCargo.setBackground(new java.awt.Color(87, 122, 137));
        conteinerCargo.setAutoscrolls(true);
        conteinerCargo.setOpaque(false);
        conteinerCargo.setPreferredSize(new java.awt.Dimension(350, 80));
        conteinerCargo.setRequestFocusEnabled(false);
        conteinerCargo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        conteinerTitulo2.setOpaque(false);
        conteinerTitulo2.setPreferredSize(new java.awt.Dimension(350, 40));
        conteinerTitulo2.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Senha");
        conteinerTitulo2.add(jLabel4, new java.awt.GridBagConstraints());

        conteinerCargo.add(conteinerTitulo2);

        conteinerTxtField2.setOpaque(false);
        conteinerTxtField2.setPreferredSize(new java.awt.Dimension(350, 40));
        conteinerTxtField2.setLayout(new java.awt.GridBagLayout());

        txtSenha.setPreferredSize(new java.awt.Dimension(300, 30));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        conteinerTxtField2.add(txtSenha, new java.awt.GridBagConstraints());

        conteinerCargo.add(conteinerTxtField2);

        jPanel5.add(conteinerCargo);

        conteinerEntrar.setBackground(new java.awt.Color(87, 122, 137));
        conteinerEntrar.setAutoscrolls(true);
        conteinerEntrar.setOpaque(false);
        conteinerEntrar.setPreferredSize(new java.awt.Dimension(350, 80));
        conteinerEntrar.setRequestFocusEnabled(false);
        conteinerEntrar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        conteinerEntrar1.setBackground(new java.awt.Color(87, 122, 137));
        conteinerEntrar1.setAutoscrolls(true);
        conteinerEntrar1.setOpaque(false);
        conteinerEntrar1.setPreferredSize(new java.awt.Dimension(350, 80));
        conteinerEntrar1.setRequestFocusEnabled(false);
        conteinerEntrar1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        conteinerTitulo4.setOpaque(false);
        conteinerTitulo4.setPreferredSize(new java.awt.Dimension(350, 40));
        conteinerTitulo4.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email");
        conteinerTitulo4.add(jLabel5, new java.awt.GridBagConstraints());

        conteinerEntrar1.add(conteinerTitulo4);

        txtEmail.setPreferredSize(new java.awt.Dimension(300, 30));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        conteinerEntrar1.add(txtEmail);

        conteinerEntrar.add(conteinerEntrar1);

        jPanel5.add(conteinerEntrar);

        conteinerTitulo3.setOpaque(false);
        conteinerTitulo3.setPreferredSize(new java.awt.Dimension(350, 40));
        conteinerTitulo3.setLayout(new java.awt.GridBagLayout());

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jToggleButton1.setText("Cadastrar");
        jToggleButton1.setIconTextGap(5);
        jToggleButton1.setPreferredSize(new java.awt.Dimension(150, 40));
        conteinerTitulo3.add(jToggleButton1, new java.awt.GridBagConstraints());
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
                String nomeUsuario = txtNome.getText();
                String cpfUsuario = txtCPF.getText();
                String emailUsuario = txtEmail.getText();
                char[] senhaTxt = txtSenha.getPassword();
                String senhaUsuario = new String(senhaTxt);
                Arrays.fill(senhaTxt, '0');
                if (nomeUsuario.equals("") && cpfUsuario.equals("") && emailUsuario.equals("")
                        && senhaUsuario.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "ERRO", 0);
                } else {
                    if (controleView.requisitarCadastro(nomeUsuario, cpfUsuario, emailUsuario,
                            senhaUsuario, "Paciente")) {
                        JFLogin login = new JFLogin(controleView);
                        login.visibilidade(true);
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Deu merda!", "ERRO", 0);
                    }
                }
            }
        });
        jPanel5.add(conteinerTitulo3);

        jPanel4.add(jPanel5);

        jPanel2.add(jPanel4, java.awt.BorderLayout.WEST);

        jPanel3.setBackground(new java.awt.Color(4, 56, 79));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 498, Short.MAX_VALUE));

        jPanel2.add(jPanel3, java.awt.BorderLayout.EAST);

        jPanel7.setBackground(new java.awt.Color(4, 56, 79));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 171, Short.MAX_VALUE));
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 498, Short.MAX_VALUE));

        jPanel2.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCPFActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtSenhaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtEmailActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel conteinerCPF;
    private javax.swing.JPanel conteinerCargo;
    private javax.swing.JPanel conteinerEntrar;
    private javax.swing.JPanel conteinerEntrar1;
    private javax.swing.JPanel conteinerNome;
    private javax.swing.JPanel conteinerTitulo;
    private javax.swing.JPanel conteinerTitulo1;
    private javax.swing.JPanel conteinerTitulo2;
    private javax.swing.JPanel conteinerTitulo3;
    private javax.swing.JPanel conteinerTitulo4;
    private javax.swing.JPanel conteinerTxtField;
    private javax.swing.JPanel conteinerTxtField1;
    private javax.swing.JPanel conteinerTxtField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
