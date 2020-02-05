package View;

import DAO.DAOClienteEspecial;
import DAO.DAOMedicamentos;
import Model.Medicamento;
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
public class FormMedicamentos extends javax.swing.JFrame {
    private java.sql.PreparedStatement pst; 
    private java.sql.ResultSet rs;
    static FormMedicamentos medicamento = null;    
    Medicamento med;    
    DAOMedicamentos DAOmed = new DAOMedicamentos();
    DefaultComboBoxModel<Medicamento> model = 
            new DefaultComboBoxModel<Medicamento>();
    
    public FormMedicamentos() {
        initComponents();
        limparCampos();
        preencherCombo();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMedicamentos = new javax.swing.JLabel();
        lblConsultarMedicamento = new javax.swing.JLabel();
        lbIUMCB = new javax.swing.JLabel();
        txtIdCb = new javax.swing.JTextField();
        cbMedicamento = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblDadosCadastrais = new javax.swing.JLabel();
        lblNomeComericalConsulta2 = new javax.swing.JLabel();
        txtIum = new javax.swing.JTextField();
        lblNomeComercial = new javax.swing.JLabel();
        txtNomeComercial = new javax.swing.JTextField();
        lblLaboratorio = new javax.swing.JLabel();
        txtLaboratorio = new javax.swing.JTextField();
        lblValorUnitario = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblUnidade = new javax.swing.JLabel();
        txtUnidade = new javax.swing.JTextField();
        lbl_descricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnInserir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblMedicamentos.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        lblMedicamentos.setForeground(new java.awt.Color(0, 102, 102));
        lblMedicamentos.setText("Medicamentos");

        lblConsultarMedicamento.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblConsultarMedicamento.setForeground(new java.awt.Color(0, 204, 204));
        lblConsultarMedicamento.setText("Consultar Medicamento");

        lbIUMCB.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbIUMCB.setForeground(new java.awt.Color(0, 204, 204));
        lbIUMCB.setText("IUM");

        txtIdCb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdCbFocusLost(evt);
            }
        });

        cbMedicamento.setForeground(new java.awt.Color(0, 204, 204));
        cbMedicamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMedicamentoItemStateChanged(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(0, 204, 204));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 204, 204));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblDadosCadastrais.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblDadosCadastrais.setForeground(new java.awt.Color(0, 204, 204));
        lblDadosCadastrais.setText("Dados Cadastrais");

        lblNomeComericalConsulta2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblNomeComericalConsulta2.setForeground(new java.awt.Color(0, 204, 204));
        lblNomeComericalConsulta2.setText("Ium");

        txtIum.setToolTipText("");

        lblNomeComercial.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblNomeComercial.setForeground(new java.awt.Color(0, 204, 204));
        lblNomeComercial.setText("Nome Comercial");

        txtNomeComercial.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N

        lblLaboratorio.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblLaboratorio.setForeground(new java.awt.Color(0, 204, 204));
        lblLaboratorio.setText("Laboratório");

        txtLaboratorio.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N

        lblValorUnitario.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblValorUnitario.setForeground(new java.awt.Color(0, 204, 204));
        lblValorUnitario.setText("Valor Unitário");

        lblUnidade.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblUnidade.setForeground(new java.awt.Color(0, 204, 204));
        lblUnidade.setText("Unidade");

        txtUnidade.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N

        lbl_descricao.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbl_descricao.setForeground(new java.awt.Color(0, 204, 204));
        lbl_descricao.setText("Descrição");

        jScrollPane1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        btnInserir.setBackground(new java.awt.Color(255, 255, 255));
        btnInserir.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(0, 204, 204));
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(0, 204, 204));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 204, 204));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 204, 204));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMedicamentos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(209, 209, 209))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConsultarMedicamento)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbIUMCB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnConsultar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDadosCadastrais)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomeComericalConsulta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIum, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNomeComercial)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomeComercial))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLaboratorio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblValorUnitario)
                                .addGap(10, 10, 10)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblUnidade)
                                .addGap(18, 18, 18)
                                .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_descricao)
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMedicamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConsultarMedicamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIUMCB)
                    .addComponent(txtIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txtNomeComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorUnitario)
                            .addComponent(lblUnidade)
                            .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLaboratorio)
                            .addComponent(txtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_descricao)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblDadosCadastrais)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeComericalConsulta2)
                            .addComponent(lblNomeComercial))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            Medicamento m = new Medicamento();
            m.setId(txtIdCb.getText());

            m = DAOmed.buscar(m);
            
            if(m != null) {
                txtIum.setText(m.getId());    
                txtNomeComercial.setText(m.getNome());
                txtLaboratorio.setText(m.getLaboratorio());
                txtValor.setText(Double.toString(m.getValor()));
                txtUnidade.setText(Integer.toString(m.getUnidade()));
                txtDescricao.setText(m.getDescricao());  
                btnInserir.setEnabled(false);
                btnAtualizar.setEnabled(true);      //habilita botão atualizar
                btnExcluir.setEnabled(true);        //habilita botão excluir
                txtIum.setEnabled(false);           //desabilita a alteração da pk
            }
            else {
               JOptionPane.showMessageDialog(this,
                    "Medicamento não encontrado!",
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
        excluirMedicamento();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        incluirMedicamento();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        alterarMedicamento();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtIdCbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdCbFocusLost
        if(txtIdCb.getText().length() > 0) {
            Medicamento m = new Medicamento();
            m.setId(txtIdCb.getText());
            cbMedicamento.setSelectedIndex(-1);
            cbMedicamento.setSelectedItem(m);
        }
    }//GEN-LAST:event_txtIdCbFocusLost

    private void cbMedicamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMedicamentoItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            Medicamento m = (Medicamento)evt.getItem();
            txtIdCb.setText(m.getId());
        }
    }//GEN-LAST:event_cbMedicamentoItemStateChanged

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
            java.util.logging.Logger.getLogger(FormMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMedicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<Medicamento> cbMedicamento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIUMCB;
    private javax.swing.JLabel lblConsultarMedicamento;
    private javax.swing.JLabel lblDadosCadastrais;
    private javax.swing.JLabel lblLaboratorio;
    private javax.swing.JLabel lblMedicamentos;
    private javax.swing.JLabel lblNomeComercial;
    private javax.swing.JLabel lblNomeComericalConsulta2;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtIdCb;
    private javax.swing.JTextField txtIum;
    private javax.swing.JTextField txtLaboratorio;
    private javax.swing.JTextField txtNomeComercial;
    private javax.swing.JTextField txtUnidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void excluirMedicamento() {
      med = new Medicamento();
      med.setId(txtIum.getText());
        
        try {
            if(DAOmed.excluir(med)) {
                JOptionPane.showMessageDialog(this,
                        "Medicamento Excluido com Sucesso!!!",
                        "Mensagem ao Usuário",
                        JOptionPane.INFORMATION_MESSAGE);
                        limparCampos();
                        preencherCombo();  
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

    private void incluirMedicamento() {
        if ( this.verificarCamposVazios() == true){
            JOptionPane.showMessageDialog(this,
               "Preencha todos os campos!",
               "Mensagem ao Usuário",
                JOptionPane.INFORMATION_MESSAGE);          
        } else {
            med = new Medicamento();
            med.setId(txtIum.getText());
            med.setNome(txtNomeComercial.getText());
            med.setLaboratorio(txtLaboratorio.getText());
            med.setValor(Double.valueOf(txtValor.getText()));
            med.setUnidade(Integer.parseInt(txtUnidade.getText()));
            med.setDescricao(txtDescricao.getText());
            try {
                if(DAOmed.inserir(med)) {
                    JOptionPane.showMessageDialog(this,
                        "Medicamento Inserido com Sucesso!!!",
                        "Mensagem ao Usuário",
                        JOptionPane.INFORMATION_MESSAGE);
                        limparCampos();
                        preencherCombo();  
                }
                else {
                    JOptionPane.showMessageDialog(this,
                        "Erro ao Inserir",
                        "Mensagem ao Usuário",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                    "Erro SQL " + ex.getMessage(),
                    "Mensagem ao Usuário",
                    JOptionPane.ERROR_MESSAGE);
            }
            catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this,
                "Erro Class " + ex.getMessage(),
                "Mensagem ao Usuário",
                JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void alterarMedicamento() {
        if ( this.verificarCamposVazios() == true){
            JOptionPane.showMessageDialog(this,
               "Preencha todos os campos!",
               "Mensagem ao Usuário",
                JOptionPane.INFORMATION_MESSAGE);          
        } else {
            med = new Medicamento();
            med.setId(txtIum.getText());
            med.setNome(txtNomeComercial.getText());
            med.setLaboratorio(txtLaboratorio.getText());
            med.setValor(Double.valueOf(txtValor.getText()));
            med.setUnidade(Integer.parseInt(txtUnidade.getText()));
            med.setDescricao(txtDescricao.getText());
            try {
                if(DAOmed.alterar(med)) {
                JOptionPane.showMessageDialog(this,
                    "Medicamento Atualizado com Sucesso!!!",
                    "Mensagem ao Usuário",
                    JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();
                    preencherCombo();  
                }
                else {
                JOptionPane.showMessageDialog(this,
                        "Erro ao Atualizar",
                        "Mensagem ao Usuário",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,
                "Erro SQL " + ex.getMessage(),
                "Mensagem ao Usuário",
                JOptionPane.ERROR_MESSAGE);
            }
            catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this,
                "Erro Class " + ex.getMessage(),
                "Mensagem ao Usuário",
                JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void preencherCombo() {
        Vector<Medicamento> dados;
        DAOMedicamentos DAOmed = new DAOMedicamentos();
        try {
            dados = (Vector)DAOmed.listar("");
            model = new DefaultComboBoxModel<>(dados);
            cbMedicamento.setModel(model);
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
        cbMedicamento.setSelectedIndex(-1);
        txtIum.setText("");
        txtNomeComercial.setText("");
        txtLaboratorio.setText("");    
        txtValor.setText("");
        txtUnidade.setText("");
        txtDescricao.setText("");
        txtIdCb.setText("");     
        btnInserir.setEnabled(true);
        btnAtualizar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtIum.setEnabled(true);
        txtIum.requestFocus();
    }
    
    private boolean verificarCamposVazios(){
        if (txtIum.getText().equals("") || txtNomeComercial.getText().equals("") 
            || txtLaboratorio.getText().equals("") || txtValor.getText().equals("") 
            || txtUnidade.getText().equals("") || txtDescricao.getText().equals("")){	
            return true;
        } else {
            return false;
        }
    }
}
