package View;


import DAO.DAOGerenciamentoCaixa;
import Model.ModelGerenciamentoCaixa;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class FormGerenciamentoCaixa extends javax.swing.JFrame {
   
    ModelGerenciamentoCaixa caixa;
    
    DAOGerenciamentoCaixa DAOCaixa = new DAOGerenciamentoCaixa();
    DefaultTableModel modelTB = new DefaultTableModel();
    Object[] columns = {"Número do Caixa","Status"};
    //DefaultComboBoxModel<ModelCaixa> model = new DefaultComboBoxModel<ModelCaixa>();
    
    public FormGerenciamentoCaixa() {
        initComponents();          
        verificarUsuario();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        status = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCaixa = new javax.swing.JTable();
        btnAbrir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        lblCaixaAbertura1 = new javax.swing.JLabel();
        btnExcluir1 = new javax.swing.JButton();
        lblGerenciamentoDeCaixa = new javax.swing.JLabel();
        lblCaixaAbertura = new javax.swing.JLabel();
        cbCaixa = new javax.swing.JComboBox<>();

        status.setText("lblStatus");

        lblNumero.setText("lblNumero");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtStatus.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(0, 204, 204));
        txtStatus.setText("-----");

        tbCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Número do Caixa", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbCaixa);

        btnAbrir.setBackground(new java.awt.Color(255, 255, 255));
        btnAbrir.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(0, 204, 204));
        btnAbrir.setText("Abrir Caixa");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnFechar.setBackground(new java.awt.Color(255, 255, 255));
        btnFechar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(0, 204, 204));
        btnFechar.setText("Fechar Caixa");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblCaixaAbertura1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lblCaixaAbertura1.setForeground(new java.awt.Color(0, 204, 204));
        lblCaixaAbertura1.setText("Status");

        btnExcluir1.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnExcluir1.setForeground(new java.awt.Color(0, 204, 204));
        btnExcluir1.setText("Voltar");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        lblGerenciamentoDeCaixa.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        lblGerenciamentoDeCaixa.setForeground(new java.awt.Color(0, 102, 102));
        lblGerenciamentoDeCaixa.setText("Gerenciamento de Caixa");

        lblCaixaAbertura.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lblCaixaAbertura.setForeground(new java.awt.Color(0, 204, 204));
        lblCaixaAbertura.setText("Caixa");

        cbCaixa.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cbCaixa.setForeground(new java.awt.Color(0, 204, 204));
        cbCaixa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbCaixa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCaixaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCaixaAbertura)
                                .addGap(18, 18, 18)
                                .addComponent(cbCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(lblCaixaAbertura1)
                                .addGap(18, 18, 18)
                                .addComponent(txtStatus))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnExcluir1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnFechar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24))
                    .addComponent(lblGerenciamentoDeCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblGerenciamentoDeCaixa)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCaixaAbertura)
                    .addComponent(cbCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus)
                    .addComponent(lblCaixaAbertura1))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnFechar))
                .addGap(39, 39, 39)
                .addComponent(btnExcluir1)
                .addGap(41, 41, 41))
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

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
       abrirCaixa();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
       fecharCaixa();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void cbCaixaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCaixaItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            lblNumero.setText((String)cbCaixa.getSelectedItem());
        }
    }//GEN-LAST:event_cbCaixaItemStateChanged

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(FormGerenciamentoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGerenciamentoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGerenciamentoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGerenciamentoCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGerenciamentoCaixa().setVisible(true);
            }
        });
    }
            
    private void abrirCaixa() {
        
        caixa = new ModelGerenciamentoCaixa(); 
        String ncaixa = (String) cbCaixa.getSelectedItem();         
        caixa.setNumCaixa(ncaixa);
        caixa.getDataHora();
        caixa.setStatus("ABERTO");                   
    try {
            if(DAOCaixa.inserir(caixa)) {
                buscarStatus();
                JOptionPane.showMessageDialog(this,
                        "Caixa Aberto",
                        "Mensagem ao Usuário",
                        JOptionPane.INFORMATION_MESSAGE);
                
                status.setText(caixa.getStatus());
                
                modelTB.setColumnIdentifiers(columns);
                
                tbCaixa.setModel(modelTB);
                Object[] row = new Object[2];
                row[0] = lblNumero.getText();
                row[1] = status.getText();
                
                modelTB.addRow(row);
                
            }
            else {
                JOptionPane.showMessageDialog(this,
                        "Erro ao Abrir",
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
    
    private void fecharCaixa() {
        caixa = new ModelGerenciamentoCaixa();           
        String ncaixa = (String) cbCaixa.getSelectedItem();         
        caixa.setNumCaixa(ncaixa);
        //caixa.setNumCaixa(2);
        caixa.getDataHora();
        caixa.setStatus("FECHADO");                  
    try {
            if(DAOCaixa.inserir(caixa)) {
                buscarStatus();
                JOptionPane.showMessageDialog(this,
                        "Caixa Fechado",
                        "Mensagem ao Usuário",
                        JOptionPane.INFORMATION_MESSAGE);
                
                status.setText(caixa.getStatus());
                
                modelTB.setColumnIdentifiers(columns);
                
                tbCaixa.setModel(modelTB);
                Object[] row = new Object[2];
                row[0] = lblNumero.getText();
                row[1] = status.getText();
                
                modelTB.addRow(row);
                
            }
            else {
                JOptionPane.showMessageDialog(this,
                        "Erro ao Fechar",
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
    
    private void buscarStatus() throws SQLException, ClassNotFoundException{
        ModelGerenciamentoCaixa c = new ModelGerenciamentoCaixa();       
        //String numDoCaixa = "2";  
        String numDoCaixa = (String) cbCaixa.getSelectedItem();         
        caixa.setNumCaixa(numDoCaixa);
        c.setStatus(numDoCaixa);
          
        c = DAOCaixa.buscar(c);
            
        if(c == null) {
            JOptionPane.showMessageDialog(this,
                "Erro ao Buscar Status",
                "Mensagem ao Usuário",
                JOptionPane.INFORMATION_MESSAGE); 
        } else {
            txtStatus.setText(c.getStatus());
        }
    }        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnFechar;
    private javax.swing.JComboBox<String> cbCaixa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCaixaAbertura;
    private javax.swing.JLabel lblCaixaAbertura1;
    private javax.swing.JLabel lblGerenciamentoDeCaixa;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel status;
    private javax.swing.JTable tbCaixa;
    private javax.swing.JLabel txtStatus;
    // End of variables declaration//GEN-END:variables

    private void verificarUsuario() {
        
       String usuario = "Gerente";
       
       if (usuario.equals("Atendente")){
           btnFechar.setVisible(false);
       }
    
    }
}
