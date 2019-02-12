package Interface.Principal;

import Interface.Formularios.frmTributacao;


public class pnlFiscal extends javax.swing.JPanel {

    public pnlFiscal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        btTributacoes = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1380, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel1.setText("FISCAL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 120, 30));

        jPanel1.setBackground(new java.awt.Color(0, 2, 61));
        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1450, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1450, 2));

        jLabel41.setBackground(new java.awt.Color(0, 102, 0));
        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Tributações");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel41.setOpaque(true);
        add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 30));

        btTributacoes.setBackground(new java.awt.Color(255, 255, 255));
        btTributacoes.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btTributacoes.setForeground(new java.awt.Color(255, 255, 255));
        btTributacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btTributacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Parametros Tributarios.png"))); // NOI18N
        btTributacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTributacoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTributacoes.setOpaque(true);
        btTributacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTributacoesMouseClicked(evt);
            }
        });
        add(btTributacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 130));

        jLabel42.setBackground(new java.awt.Color(153, 153, 153));
        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel42.setOpaque(true);
        add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 170, 20));

        jLabel7.setBackground(new java.awt.Color(0, 0, 204));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Impostos");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 170, 30));

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Impostos.png"))); // NOI18N
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel43.setOpaque(true);
        add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 170, 130));

        jLabel44.setBackground(new java.awt.Color(153, 153, 153));
        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel44.setOpaque(true);
        add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 170, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btTributacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTributacoesMouseClicked

        frmTributacao frmTrib = new frmTributacao(null, true, null);
        frmTrib.setVisible(true);
    }//GEN-LAST:event_btTributacoesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btTributacoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
