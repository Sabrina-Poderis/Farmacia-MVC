package View;
 
import java.awt.Container;

public class FormMenu extends javax.swing.JFrame {

    public FormMenu() {
        initComponents();
        setLocationRelativeTo(null);        
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuClienteEspecial = new javax.swing.JMenu();
        mnuMedicamentos = new javax.swing.JMenu();
        mnuCaixa = new javax.swing.JMenu();
        mnuVenda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(185, 214, 242));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Fairmácia");

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("A farmácia com preço justo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel2)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        mnuClienteEspecial.setBorder(null);
        mnuClienteEspecial.setForeground(new java.awt.Color(255, 255, 255));
        mnuClienteEspecial.setText("Cliente Especial");
        mnuClienteEspecial.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        mnuClienteEspecial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuClienteEspecialMousePressed(evt);
            }
        });
        jMenuBar1.add(mnuClienteEspecial);

        mnuMedicamentos.setBorder(null);
        mnuMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        mnuMedicamentos.setText("Medicamentos");
        mnuMedicamentos.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        mnuMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuMedicamentosMousePressed(evt);
            }
        });
        jMenuBar1.add(mnuMedicamentos);

        mnuCaixa.setBorder(null);
        mnuCaixa.setForeground(new java.awt.Color(255, 255, 255));
        mnuCaixa.setText("Caixa");
        mnuCaixa.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        mnuCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuCaixaMousePressed(evt);
            }
        });
        jMenuBar1.add(mnuCaixa);

        mnuVenda.setBackground(new java.awt.Color(0, 204, 204));
        mnuVenda.setBorder(null);
        mnuVenda.setForeground(new java.awt.Color(255, 255, 255));
        mnuVenda.setText("Venda");
        mnuVenda.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        mnuVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuVendaMousePressed(evt);
            }
        });
        jMenuBar1.add(mnuVenda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuClienteEspecialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuClienteEspecialMousePressed
         new FormClienteEspecial().setVisible(true); 
    }//GEN-LAST:event_mnuClienteEspecialMousePressed

    private void mnuMedicamentosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuMedicamentosMousePressed
         new FormMedicamentos().setVisible(true); 
    }//GEN-LAST:event_mnuMedicamentosMousePressed

    private void mnuCaixaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCaixaMousePressed
         new FormGerenciamentoCaixa().setVisible(true); 
    }//GEN-LAST:event_mnuCaixaMousePressed

    private void mnuVendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuVendaMousePressed
        new FormVenda().setVisible(true); 
    }//GEN-LAST:event_mnuVendaMousePressed

    public static void main(String args[]) {        
        new FormMenu().setVisible(true);        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnuCaixa;
    private javax.swing.JMenu mnuClienteEspecial;
    private javax.swing.JMenu mnuMedicamentos;
    private javax.swing.JMenu mnuVenda;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeto(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
