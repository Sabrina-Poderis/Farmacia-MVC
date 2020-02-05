package View;

import Banco.Banco;
import DAO.DAOClienteEspecial;
import Model.ModelClienteEspecial;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Sabrina
 */

public class FormClienteEspecial extends javax.swing.JFrame {
    private java.sql.PreparedStatement pst; 
    private java.sql.ResultSet rs;
    boolean inserindo = false;
    static FormClienteEspecial clienteEspecial = null;
    DAOClienteEspecial DAOcliente = new DAOClienteEspecial();
    ModelClienteEspecial cliente;
    DefaultComboBoxModel<ModelClienteEspecial> model = 
            new DefaultComboBoxModel<ModelClienteEspecial>();
    
    FormClienteEspecial() {
        initComponents();
        limparCampos();
        preencherCombo();        
        setLocationRelativeTo(null);
  
    }
    
    public static FormClienteEspecial getInstance(){
        if(clienteEspecial == null){
            clienteEspecial = new FormClienteEspecial();
        }
        return clienteEspecial;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblGerenciamentoDeCaixa = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        btnInserir = new javax.swing.JButton();
        lblCPFCB = new javax.swing.JLabel();
        txtCpfCb = new javax.swing.JTextField();
        cbCliente = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        lblConsultarCadastro = new javax.swing.JLabel();
        lblDadosCadastrais = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        lblGerenciamentoDeCaixa.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        lblGerenciamentoDeCaixa.setForeground(new java.awt.Color(0, 102, 102));
        lblGerenciamentoDeCaixa.setText("Clientes Especiais");

        btnAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(0, 204, 204));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(0, 204, 204));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 204, 204));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblCpf.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(0, 204, 204));
        lblCpf.setText("C.P.F");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N

        btnInserir.setBackground(new java.awt.Color(255, 255, 255));
        btnInserir.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(0, 204, 204));
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        lblCPFCB.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblCPFCB.setForeground(new java.awt.Color(0, 204, 204));
        lblCPFCB.setText("CPF");

        txtCpfCb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfCbFocusLost(evt);
            }
        });

        cbCliente.setForeground(new java.awt.Color(0, 204, 204));
        cbCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbClienteItemStateChanged(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 204, 204));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblConsultarCadastro.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblConsultarCadastro.setForeground(new java.awt.Color(0, 204, 204));
        lblConsultarCadastro.setText("Consultar Cadastro");

        lblDadosCadastrais.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblDadosCadastrais.setForeground(new java.awt.Color(0, 204, 204));
        lblDadosCadastrais.setText("Dados Cadastrais");

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 204, 204));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N

        lblNome.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 204, 204));
        lblNome.setText("Nome");

        lblRg.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblRg.setForeground(new java.awt.Color(0, 204, 204));
        lblRg.setText("R.G.");

        lblDataNascimento.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(0, 204, 204));
        lblDataNascimento.setText("Data de Nascimento");

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-*")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N

        txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtDataNascimento.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N

        lblTelefone.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(0, 204, 204));
        lblTelefone.setText("Telefone");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 204, 204));
        lblEmail.setText("E-mail");

        txtEmail.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGerenciamentoDeCaixa)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCpfCb, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblRg)
                                    .addComponent(lblTelefone)
                                    .addComponent(lblEmail))
                                .addComponent(btnInserir))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblDataNascimento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtRG)
                                            .addGap(73, 73, 73)
                                            .addComponent(lblCpf)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtCpf))
                                        .addComponent(txtEmail)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(124, 124, 124)
                                    .addComponent(btnAtualizar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExcluir))))
                        .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCPFCB)
                                .addComponent(lblDadosCadastrais)
                                .addComponent(lblConsultarCadastro)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGerenciamentoDeCaixa)
                .addGap(29, 29, 29)
                .addComponent(lblConsultarCadastro)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPFCB)
                    .addComponent(txtCpfCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblDadosCadastrais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRg)
                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCpf)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelefone)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDataNascimento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInserir)
                            .addComponent(btnAtualizar)
                            .addComponent(btnExcluir))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        alterarCliente();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {            
            inserindo = false;
            ModelClienteEspecial c = new ModelClienteEspecial();

            c.setCpf(txtCpfCb.getText());
            c = DAOcliente.buscar(c);
            
            if(c != null) {
                txtCpf.setText(c.getCpf());
                txtNome.setText(c.getNome());
                txtRG.setText(c.getRg());
                txtTelefone.setText(c.getTelefone());
                txtDataNascimento.setText(c.getDataNac());
                txtEmail.setText(c.getEmail());
                btnAtualizar.setEnabled(true);      //habilita botão atualizar
                btnExcluir.setEnabled(true);        //habilita botão excluir
                btnInserir.setEnabled(false);       //desabilita incluir
                txtCpf.setEnabled(false);           //desabilita a alteração da pk
            }
            else {
               JOptionPane.showMessageDialog(this,
                    "Cliente não encontrado!",
                    "Mensagem ao Usuário",
                    JOptionPane.INFORMATION_MESSAGE); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormClienteEspecial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormClienteEspecial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resp;
        resp = JOptionPane.showConfirmDialog(this, 
                        "Deseja realmente excluir?",
                        "Mensagem ao Usuário",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        if(resp == JOptionPane.YES_OPTION)
            excluirCliente();
            preencherCombo();
            limparCampos();        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        incluirCliente();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtCpfCbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfCbFocusLost
        if(txtCpfCb.getText().length() > 0) {
            ModelClienteEspecial c = new ModelClienteEspecial();
            c.setCpf(txtCpfCb.getText());            
            cbCliente.setSelectedIndex(-1);            
            cbCliente.setSelectedItem(c);
        }
    }//GEN-LAST:event_txtCpfCbFocusLost

    private void cbClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbClienteItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            ModelClienteEspecial c = (ModelClienteEspecial)evt.getItem();
            txtCpfCb.setText(c.getCpf());
        }
    }//GEN-LAST:event_cbClienteItemStateChanged

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormClienteEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormClienteEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormClienteEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormClienteEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormClienteEspecial().setVisible(true);
            }
        });
    }
    
    private void incluirCliente() {        
        if ( this.verificarCamposVazios() == true){
            JOptionPane.showMessageDialog(this,
               "Preencha todos os campos!",
               "Mensagem ao Usuário",
                JOptionPane.INFORMATION_MESSAGE);          
        } else {
            cliente = new ModelClienteEspecial();
            cliente.setCpf(txtCpf.getText());
            cliente.setNome(txtNome.getText());
            cliente.setRg(txtRG.getText());
            cliente.setTelefone(txtTelefone.getText());
            cliente.setDataNac(txtDataNascimento.getText());
            cliente.setEmail(txtEmail.getText());
        
            try {
                if(DAOcliente.inserir(cliente)) {
                    JOptionPane.showMessageDialog(this,
                            "Cliente Inserido com Sucesso!!!",
                            "Mensagem ao Usuário",
                            JOptionPane.INFORMATION_MESSAGE);
                            preencherCombo();
                            limparCampos();
                }
                else {
                    JOptionPane.showMessageDialog(this,
                            "Erro ao Inserir",
                            "Mensagem ao Usuário",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                    "Erro SQL " + ex.getMessage(),
                    "Mensagem ao Usuário",
                    JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this,
                "Erro Class " + ex.getMessage(),
                "Mensagem ao Usuário",
                JOptionPane.ERROR_MESSAGE);
            }  
        }
    }
    
    private void alterarCliente() {
        if ( this.verificarCamposVazios() == true){
            JOptionPane.showMessageDialog(this,
               "Preencha todos os campos!",
               "Mensagem ao Usuário",
                JOptionPane.INFORMATION_MESSAGE);          
        } else {
            cliente = new ModelClienteEspecial();
            cliente.setCpf(txtCpf.getText());
            cliente.setNome(txtNome.getText());
            cliente.setRg(txtRG.getText());
            cliente.setTelefone(txtTelefone.getText());
            cliente.setDataNac(txtDataNascimento.getText());
            cliente.setEmail(txtEmail.getText());
        
            try {
                if(DAOcliente.alterar(cliente)) {
                    JOptionPane.showMessageDialog(this,
                            "Cliente Alterado com Sucesso!!!",
                            "Mensagem ao Usuário",
                            JOptionPane.INFORMATION_MESSAGE);
                            preencherCombo();
                            limparCampos();
                }
                else {
                    JOptionPane.showMessageDialog(this,
                            "Erro ao Atualizar",
                            "Mensagem ao Usuário",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                            "Erro SQL " + ex.getMessage(),
                            "Mensagem ao Usuário",
                            JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this,
                            "Erro Class " + ex.getMessage(),
                            "Mensagem ao Usuário",
                            JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void excluirCliente() {
        cliente = new ModelClienteEspecial();
        cliente.setCpf(txtCpf.getText());
        
        try {
            if(DAOcliente.excluir(cliente)) {
                JOptionPane.showMessageDialog(this,
                        "Cliente Excluido com Sucesso!!!",
                        "Mensagem ao Usuário",
                        JOptionPane.INFORMATION_MESSAGE);
                        preencherCombo();
                        limparCampos();
            }
            else {
                JOptionPane.showMessageDialog(this,
                        "Erro ao Excluir",
                        "Mensagem ao Usuário",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                        "Erro SQL " + ex.getMessage(),
                        "Mensagem ao Usuário",
                        JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this,
                        "Erro Class " + ex.getMessage(),
                        "Mensagem ao Usuário",
                        JOptionPane.ERROR_MESSAGE);
        }
    }

    private void preencherCombo() {
        Vector<ModelClienteEspecial> dados;
        DAOClienteEspecial DAOcliente = new DAOClienteEspecial();
        try {
            dados = (Vector)DAOcliente.listar("");
            model = new DefaultComboBoxModel<>(dados);
            cbCliente.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, 
                    "Erro de SQL na Combo: " + ex.getMessage(),
                    "Mensagem ao Usuario",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, 
                    "Erro de Classe na Combo " + ex.getMessage(),
                    "Mensagem ao Usuario",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limparCampos() {
        cbCliente.setSelectedIndex(-1);
        txtNome.setText("");
        txtRG.setText("");
        txtCpf.setText("");    
        txtTelefone.setText("");
        txtDataNascimento.setText("");
        txtEmail.setText("");
        txtCpfCb.setText("");      
        btnInserir.setEnabled(true);
        btnAtualizar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCpf.setEnabled(true);
        txtNome.requestFocus();
    }
    
    private boolean verificarCamposVazios(){
        if (txtNome.getText().equals("") || txtRG.getText().equals("") 
            || txtCpf.getText().equals("") || txtTelefone.getText().equals("") 
            || txtDataNascimento.getText().equals("") || txtEmail.getText().equals("")){	
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<ModelClienteEspecial> cbCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCPFCB;
    private javax.swing.JLabel lblConsultarCadastro;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDadosCadastrais;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGerenciamentoDeCaixa;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtCpfCb;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
