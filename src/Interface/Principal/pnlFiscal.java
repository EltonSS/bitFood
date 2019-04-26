package Interface.Principal;

import Interface.Formularios.frmTributos;

public class pnlFiscal extends javax.swing.JPanel {

    public pnlFiscal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btTributos = new rojerusan.RSButtonMetro();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btNotaFiscal = new rojerusan.RSButtonMetro();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        rSButtonMetro7 = new rojerusan.RSButtonMetro();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        rSButtonMetro8 = new rojerusan.RSButtonMetro();
        jLabel43 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        rSButtonMetro9 = new rojerusan.RSButtonMetro();
        jLabel44 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        rSButtonMetro10 = new rojerusan.RSButtonMetro();
        jLabel45 = new javax.swing.JLabel();

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
            .addGap(0, 1313, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1313, 2));

        jPanel2.setBackground(new java.awt.Color(0, 2, 61));
        jPanel2.setPreferredSize(new java.awt.Dimension(1370, 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1313, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 1313, 2));

        jLabel28.setBackground(new java.awt.Color(63, 65, 68));
        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Tributos");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel28.setOpaque(true);
        add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 55, 120, 30));

        btTributos.setBackground(new java.awt.Color(255, 255, 255));
        btTributos.setForeground(new java.awt.Color(255, 0, 0));
        btTributos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Parametros Tributarios.png"))); // NOI18N
        btTributos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTributos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btTributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTributosActionPerformed(evt);
            }
        });
        add(btTributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, 120, 120));

        jLabel32.setBackground(new java.awt.Color(153, 153, 153));
        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel32.setOpaque(true);
        add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 208, 120, 20));

        jLabel33.setBackground(new java.awt.Color(63, 65, 68));
        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Nota Fiscal");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel33.setOpaque(true);
        add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 55, 120, 30));

        btNotaFiscal.setBackground(new java.awt.Color(255, 255, 255));
        btNotaFiscal.setForeground(new java.awt.Color(255, 0, 0));
        btNotaFiscal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Nota Fiscal.png"))); // NOI18N
        btNotaFiscal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNotaFiscal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNotaFiscalActionPerformed(evt);
            }
        });
        add(btNotaFiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 87, 120, 120));

        jLabel34.setBackground(new java.awt.Color(153, 153, 153));
        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel34.setOpaque(true);
        add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 208, 120, 20));

        jLabel38.setBackground(new java.awt.Color(63, 65, 68));
        jLabel38.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("TEF");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel38.setOpaque(true);
        add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 55, 120, 30));

        rSButtonMetro7.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMetro7.setForeground(new java.awt.Color(255, 0, 0));
        rSButtonMetro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Delivery.png"))); // NOI18N
        rSButtonMetro7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonMetro7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(rSButtonMetro7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 87, 120, 120));

        jLabel39.setBackground(new java.awt.Color(153, 153, 153));
        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel39.setOpaque(true);
        add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 208, 120, 20));

        jLabel40.setBackground(new java.awt.Color(63, 65, 68));
        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("PDV");
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel40.setOpaque(true);
        add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 55, 120, 30));

        rSButtonMetro8.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMetro8.setForeground(new java.awt.Color(255, 0, 0));
        rSButtonMetro8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Caixa.png"))); // NOI18N
        rSButtonMetro8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonMetro8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(rSButtonMetro8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 87, 120, 120));

        jLabel43.setBackground(new java.awt.Color(153, 153, 153));
        jLabel43.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel43.setOpaque(true);
        add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 208, 120, 20));

        jLabel41.setBackground(new java.awt.Color(63, 65, 68));
        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("PDV");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel41.setOpaque(true);
        add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 55, 120, 30));

        rSButtonMetro9.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMetro9.setForeground(new java.awt.Color(255, 0, 0));
        rSButtonMetro9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Caixa.png"))); // NOI18N
        rSButtonMetro9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonMetro9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(rSButtonMetro9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 87, 120, 120));

        jLabel44.setBackground(new java.awt.Color(153, 153, 153));
        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel44.setOpaque(true);
        add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 208, 120, 20));

        jLabel42.setBackground(new java.awt.Color(63, 65, 68));
        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("PDV");
        jLabel42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel42.setOpaque(true);
        add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 55, 120, 30));

        rSButtonMetro10.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMetro10.setForeground(new java.awt.Color(255, 0, 0));
        rSButtonMetro10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Caixa.png"))); // NOI18N
        rSButtonMetro10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonMetro10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(rSButtonMetro10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 87, 120, 120));

        jLabel45.setBackground(new java.awt.Color(153, 153, 153));
        jLabel45.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel45.setOpaque(true);
        add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 208, 120, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNotaFiscalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNotaFiscalActionPerformed

    private void btTributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTributosActionPerformed
       
        frmTributos frmTrib = new frmTributos(null, true, null);
        frmTrib.setVisible(true);
    }//GEN-LAST:event_btTributosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonMetro btNotaFiscal;
    private rojerusan.RSButtonMetro btTributos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSButtonMetro rSButtonMetro10;
    private rojerusan.RSButtonMetro rSButtonMetro7;
    private rojerusan.RSButtonMetro rSButtonMetro8;
    private rojerusan.RSButtonMetro rSButtonMetro9;
    // End of variables declaration//GEN-END:variables
}
