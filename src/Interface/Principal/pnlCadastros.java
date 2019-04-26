package Interface.Principal;

import Interface.Formularios.frmUsuario;

public class pnlCadastros extends javax.swing.JPanel {

    public pnlCadastros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btUsuarios = new rojerusan.RSButtonMetro();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btClientes = new rojerusan.RSButtonMetro();
        jLabel31 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        rSButtonMetro8 = new rojerusan.RSButtonMetro();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        rSButtonMetro9 = new rojerusan.RSButtonMetro();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btFornecedores = new rojerusan.RSButtonMetro();
        jLabel39 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btEnderecos = new rojerusan.RSButtonMetro();
        jLabel33 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        btEnderecos1 = new rojerusan.RSButtonMetro();
        jLabel41 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1380, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel1.setText("CADASTROS");
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

        jLabel28.setBackground(new java.awt.Color(0, 102, 102));
        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Usuários");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel28.setOpaque(true);
        add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 55, 120, 30));

        btUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        btUsuarios.setForeground(new java.awt.Color(255, 0, 0));
        btUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Usuario.png"))); // NOI18N
        btUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuariosActionPerformed(evt);
            }
        });
        add(btUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, 120, 120));

        jLabel29.setBackground(new java.awt.Color(153, 153, 153));
        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel29.setOpaque(true);
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 208, 120, 20));

        jLabel30.setBackground(new java.awt.Color(0, 102, 102));
        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Clientes");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel30.setOpaque(true);
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 55, 120, 30));

        btClientes.setBackground(new java.awt.Color(255, 255, 255));
        btClientes.setForeground(new java.awt.Color(255, 0, 0));
        btClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Cliente.png"))); // NOI18N
        btClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(btClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 87, 120, 120));

        jLabel31.setBackground(new java.awt.Color(153, 153, 153));
        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel31.setOpaque(true);
        add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 208, 120, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1380, 480));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel2.setText("CADASTROS");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 120, 30));

        jPanel4.setBackground(new java.awt.Color(0, 2, 61));
        jPanel4.setPreferredSize(new java.awt.Dimension(1370, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1313, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1313, 2));

        jPanel5.setBackground(new java.awt.Color(0, 2, 61));
        jPanel5.setPreferredSize(new java.awt.Dimension(1370, 3));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1313, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 1313, 2));

        jLabel34.setBackground(new java.awt.Color(0, 102, 102));
        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Cadastrar Usuários");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel34.setOpaque(true);
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 55, 120, 30));

        rSButtonMetro8.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMetro8.setForeground(new java.awt.Color(255, 0, 0));
        rSButtonMetro8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Usuario.png"))); // NOI18N
        rSButtonMetro8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonMetro8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(rSButtonMetro8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, 120, 120));

        jLabel35.setBackground(new java.awt.Color(153, 153, 153));
        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel35.setOpaque(true);
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 208, 120, 20));

        jLabel36.setBackground(new java.awt.Color(0, 102, 102));
        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Cadastrar Clientes");
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel36.setOpaque(true);
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 55, 120, 30));

        rSButtonMetro9.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMetro9.setForeground(new java.awt.Color(255, 0, 0));
        rSButtonMetro9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Cliente.png"))); // NOI18N
        rSButtonMetro9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonMetro9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(rSButtonMetro9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 87, 120, 120));

        jLabel37.setBackground(new java.awt.Color(153, 153, 153));
        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel37.setOpaque(true);
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 120, 20));

        jLabel38.setBackground(new java.awt.Color(0, 102, 102));
        jLabel38.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Fornecedores");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel38.setOpaque(true);
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 55, 120, 30));

        btFornecedores.setBackground(new java.awt.Color(255, 255, 255));
        btFornecedores.setForeground(new java.awt.Color(255, 0, 0));
        btFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Cliente.png"))); // NOI18N
        btFornecedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFornecedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btFornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 87, 120, 120));

        jLabel39.setBackground(new java.awt.Color(153, 153, 153));
        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel39.setOpaque(true);
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 208, 120, 20));

        jLabel32.setBackground(new java.awt.Color(0, 102, 102));
        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Endereços");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel32.setOpaque(true);
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 55, 120, 30));

        btEnderecos.setBackground(new java.awt.Color(255, 255, 255));
        btEnderecos.setForeground(new java.awt.Color(255, 0, 0));
        btEnderecos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Cliente.png"))); // NOI18N
        btEnderecos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEnderecos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btEnderecos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 87, 120, 120));

        jLabel33.setBackground(new java.awt.Color(153, 153, 153));
        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel33.setOpaque(true);
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 208, 120, 20));

        jLabel40.setBackground(new java.awt.Color(0, 102, 102));
        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Empresa");
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel40.setOpaque(true);
        jPanel3.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 55, 120, 30));

        btEnderecos1.setBackground(new java.awt.Color(255, 255, 255));
        btEnderecos1.setForeground(new java.awt.Color(255, 0, 0));
        btEnderecos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Cliente.png"))); // NOI18N
        btEnderecos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEnderecos1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btEnderecos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 87, 120, 120));

        jLabel41.setBackground(new java.awt.Color(153, 153, 153));
        jLabel41.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel41.setOpaque(true);
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 208, 120, 20));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuariosActionPerformed
        
        frmUsuario frmUsu = new frmUsuario(null, true, null);
        frmUsu.setVisible(true);
    }//GEN-LAST:event_btUsuariosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonMetro btClientes;
    private rojerusan.RSButtonMetro btEnderecos;
    private rojerusan.RSButtonMetro btEnderecos1;
    private rojerusan.RSButtonMetro btFornecedores;
    private rojerusan.RSButtonMetro btUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private rojerusan.RSButtonMetro rSButtonMetro8;
    private rojerusan.RSButtonMetro rSButtonMetro9;
    // End of variables declaration//GEN-END:variables
}
