package Interface.Principal;

import Interface.Formularios.frmCategoriaProduto;
import Interface.Formularios.frmFabricante;
import Interface.Formularios.frmFormulario;
import Interface.Formularios.frmFuncao;
import Interface.Formularios.frmPermissao;
import Interface.Formularios.frmUnidadeMedida;

public class pnlParametros extends javax.swing.JPanel {

    public pnlParametros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btCategoriaProduto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btUnidadeMedida = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btFabricante = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btImpressora = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btFuncaoUsuario = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btBancoDados = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btLicenca = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btPermissao = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btComunicacaoNfce = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btFormulario = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btBancoDados1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1380, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(153, 0, 153));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Categoria Produtos");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 30));

        btCategoriaProduto.setBackground(new java.awt.Color(255, 255, 255));
        btCategoriaProduto.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btCategoriaProduto.setForeground(new java.awt.Color(255, 255, 255));
        btCategoriaProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btCategoriaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Categoria Produtos.png"))); // NOI18N
        btCategoriaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCategoriaProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCategoriaProduto.setOpaque(true);
        btCategoriaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCategoriaProdutoMouseClicked(evt);
            }
        });
        add(btCategoriaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 130));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 170, 20));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel1.setText("PARÂMETROS DO SISTEMA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 30));

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

        jLabel8.setBackground(new java.awt.Color(255, 153, 0));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Unidades de Medidas");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 170, 30));

        btUnidadeMedida.setBackground(new java.awt.Color(255, 255, 255));
        btUnidadeMedida.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btUnidadeMedida.setForeground(new java.awt.Color(255, 255, 255));
        btUnidadeMedida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btUnidadeMedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Unidade Medida.png"))); // NOI18N
        btUnidadeMedida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btUnidadeMedida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btUnidadeMedida.setOpaque(true);
        btUnidadeMedida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btUnidadeMedidaMouseClicked(evt);
            }
        });
        add(btUnidadeMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 170, 130));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 170, 20));

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 170, 20));

        btFabricante.setBackground(new java.awt.Color(255, 255, 255));
        btFabricante.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btFabricante.setForeground(new java.awt.Color(255, 255, 255));
        btFabricante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btFabricante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Fabricante.png"))); // NOI18N
        btFabricante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFabricante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFabricante.setOpaque(true);
        btFabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFabricanteMouseClicked(evt);
            }
        });
        add(btFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 170, 130));

        jLabel13.setBackground(new java.awt.Color(255, 51, 51));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Fabricantes");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setOpaque(true);
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 170, 30));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Impressoras");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 170, 30));

        btImpressora.setBackground(new java.awt.Color(255, 255, 255));
        btImpressora.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btImpressora.setForeground(new java.awt.Color(255, 255, 255));
        btImpressora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btImpressora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Impressora Fiscal.png"))); // NOI18N
        btImpressora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btImpressora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btImpressora.setOpaque(true);
        add(btImpressora, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 170, 130));

        jLabel15.setBackground(new java.awt.Color(153, 153, 153));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.setOpaque(true);
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 170, 20));

        btFuncaoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btFuncaoUsuario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btFuncaoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btFuncaoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btFuncaoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Funcao Usuario.png"))); // NOI18N
        btFuncaoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFuncaoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFuncaoUsuario.setOpaque(true);
        btFuncaoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFuncaoUsuarioMouseClicked(evt);
            }
        });
        add(btFuncaoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 130));

        jLabel19.setBackground(new java.awt.Color(51, 102, 255));
        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Banco Dados");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel19.setOpaque(true);
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 170, 30));

        btBancoDados.setBackground(new java.awt.Color(255, 255, 255));
        btBancoDados.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btBancoDados.setForeground(new java.awt.Color(255, 255, 255));
        btBancoDados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btBancoDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Banco Dados.png"))); // NOI18N
        btBancoDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBancoDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBancoDados.setOpaque(true);
        add(btBancoDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 170, 130));

        jLabel21.setBackground(new java.awt.Color(153, 153, 153));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel21.setOpaque(true);
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 170, 20));

        jLabel22.setBackground(new java.awt.Color(153, 0, 153));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Licença Sistema");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel22.setOpaque(true);
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 170, 30));

        btLicenca.setBackground(new java.awt.Color(255, 255, 255));
        btLicenca.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btLicenca.setForeground(new java.awt.Color(255, 255, 255));
        btLicenca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btLicenca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Licença.png"))); // NOI18N
        btLicenca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLicenca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLicenca.setOpaque(true);
        add(btLicenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 170, 130));

        jLabel24.setBackground(new java.awt.Color(153, 153, 153));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel24.setOpaque(true);
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 170, 20));

        jLabel25.setBackground(new java.awt.Color(204, 153, 0));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Permissões Usuários");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel25.setOpaque(true);
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 60, 170, 30));

        btPermissao.setBackground(new java.awt.Color(255, 255, 255));
        btPermissao.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btPermissao.setForeground(new java.awt.Color(255, 255, 255));
        btPermissao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btPermissao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Permissao.png"))); // NOI18N
        btPermissao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPermissao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPermissao.setOpaque(true);
        btPermissao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPermissaoMouseClicked(evt);
            }
        });
        add(btPermissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 90, 170, 130));

        jLabel27.setBackground(new java.awt.Color(153, 153, 153));
        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel27.setOpaque(true);
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 230, 170, 20));

        jLabel28.setBackground(new java.awt.Color(153, 0, 255));
        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Funções Usuários");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel28.setOpaque(true);
        add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, 30));

        jLabel29.setBackground(new java.awt.Color(153, 153, 153));
        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel29.setOpaque(true);
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 170, 20));

        jLabel30.setBackground(new java.awt.Color(78, 199, 100));
        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Comunicação NFe/NFCe");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel30.setOpaque(true);
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 170, 30));

        btComunicacaoNfce.setBackground(new java.awt.Color(255, 255, 255));
        btComunicacaoNfce.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btComunicacaoNfce.setForeground(new java.awt.Color(255, 255, 255));
        btComunicacaoNfce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btComunicacaoNfce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Forma de Pagamento.png"))); // NOI18N
        btComunicacaoNfce.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btComunicacaoNfce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btComunicacaoNfce.setOpaque(true);
        add(btComunicacaoNfce, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 170, 130));

        jLabel31.setBackground(new java.awt.Color(153, 153, 153));
        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel31.setOpaque(true);
        add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 170, 20));

        jLabel32.setBackground(new java.awt.Color(255, 0, 204));
        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Formulários");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel32.setOpaque(true);
        add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 60, 170, 30));

        btFormulario.setBackground(new java.awt.Color(255, 255, 255));
        btFormulario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btFormulario.setForeground(new java.awt.Color(255, 255, 255));
        btFormulario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Formulario.png"))); // NOI18N
        btFormulario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFormulario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFormulario.setOpaque(true);
        btFormulario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFormularioMouseClicked(evt);
            }
        });
        add(btFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 170, 130));

        jLabel34.setBackground(new java.awt.Color(153, 153, 153));
        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel34.setOpaque(true);
        add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, 170, 20));

        jLabel14.setBackground(new java.awt.Color(0, 102, 102));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Endereços");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setOpaque(true);
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 170, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Endereço.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel17.setOpaque(true);
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 170, 130));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setOpaque(true);
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 170, 20));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Endereço.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel18.setOpaque(true);
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, 170, 130));

        jLabel16.setBackground(new java.awt.Color(153, 153, 153));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel16.setOpaque(true);
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 170, 20));

        jLabel20.setBackground(new java.awt.Color(0, 102, 102));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Endereços");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel20.setOpaque(true);
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 280, 170, 30));

        jLabel23.setBackground(new java.awt.Color(0, 102, 0));
        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Parâmetros Tributários");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel23.setOpaque(true);
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 170, 30));

        btBancoDados1.setBackground(new java.awt.Color(255, 255, 255));
        btBancoDados1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btBancoDados1.setForeground(new java.awt.Color(255, 255, 255));
        btBancoDados1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btBancoDados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Parametros Tributarios.png"))); // NOI18N
        btBancoDados1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBancoDados1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBancoDados1.setOpaque(true);
        add(btBancoDados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 170, 130));

        jLabel26.setBackground(new java.awt.Color(153, 153, 153));
        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel26.setOpaque(true);
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 170, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btPermissaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPermissaoMouseClicked

        frmPermissao frmPerm = new frmPermissao(null, true, null);
        frmPerm.setVisible(true);
    }//GEN-LAST:event_btPermissaoMouseClicked

    private void btFormularioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFormularioMouseClicked

        frmFormulario frmForm = new frmFormulario(null, true, null);
        frmForm.setVisible(true);
    }//GEN-LAST:event_btFormularioMouseClicked

    private void btFuncaoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFuncaoUsuarioMouseClicked

        frmFuncao frmFunc = new frmFuncao(null, true, null);
        frmFunc.setVisible(true);
    }//GEN-LAST:event_btFuncaoUsuarioMouseClicked

    private void btCategoriaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCategoriaProdutoMouseClicked

        frmCategoriaProduto frmCatProd = new frmCategoriaProduto(null, true, null);
        frmCatProd.setVisible(true);
    }//GEN-LAST:event_btCategoriaProdutoMouseClicked

    private void btUnidadeMedidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUnidadeMedidaMouseClicked

        frmUnidadeMedida frmUnidMed = new frmUnidadeMedida(null, true, null);
        frmUnidMed.setVisible(true);
    }//GEN-LAST:event_btUnidadeMedidaMouseClicked

    private void btFabricanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFabricanteMouseClicked
        
        frmFabricante frmFabProd = new frmFabricante(null, true, null);
        frmFabProd.setVisible(true);
    }//GEN-LAST:event_btFabricanteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btBancoDados;
    private javax.swing.JLabel btBancoDados1;
    private javax.swing.JLabel btCategoriaProduto;
    private javax.swing.JLabel btComunicacaoNfce;
    private javax.swing.JLabel btFabricante;
    private javax.swing.JLabel btFormulario;
    private javax.swing.JLabel btFuncaoUsuario;
    private javax.swing.JLabel btImpressora;
    private javax.swing.JLabel btLicenca;
    private javax.swing.JLabel btPermissao;
    private javax.swing.JLabel btUnidadeMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
