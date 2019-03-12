package Interface.Principal;

import Funcoes.EventosBotoes;
import java.awt.BorderLayout;
import Banco.Conexao.ConectaBanco;

public class FrmPrincipal extends javax.swing.JFrame {

    private Object panelPrincipal;
    ConectaBanco con = new ConectaBanco();

    public FrmPrincipal() {

        initComponents();
//        chamandoDashBoard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btCadastros = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btDashboard = new javax.swing.JLabel();
        btEstoque = new javax.swing.JLabel();
        btCompras = new javax.swing.JLabel();
        btFinanceiro = new javax.swing.JLabel();
        btFiscal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btConfiguracoes = new javax.swing.JLabel();
        btQuemSomos = new javax.swing.JLabel();
        btAjuda = new javax.swing.JLabel();
        btSair = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        btAtendimento = new javax.swing.JLabel();
        lbHora = new rojeru_san.RSLabelHora();
        lbData = new rojeru_san.RSLabelFecha();
        btConsultas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panellPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHead.setBackground(new java.awt.Color(1, 6, 167));
        pnlHead.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Logo/icons8_Food_100px_1.png"))); // NOI18N
        pnlHead.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 110));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("bitFood");
        pnlHead.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, 70));

        btCadastros.setBackground(new java.awt.Color(1, 6, 167));
        btCadastros.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btCadastros.setForeground(new java.awt.Color(255, 255, 255));
        btCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Cadastros.png"))); // NOI18N
        btCadastros.setText("Cadastros");
        btCadastros.setToolTipText("Cadastros");
        btCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastros.setOpaque(true);
        btCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrosMouseClicked(evt);
            }
        });
        pnlHead.add(btCadastros, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 140, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sistema para Controle de Restaurante Versão 1.0");
        pnlHead.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 340, 30));

        btDashboard.setBackground(new java.awt.Color(0, 2, 61));
        btDashboard.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Dashboard.png"))); // NOI18N
        btDashboard.setText("DashBoard");
        btDashboard.setToolTipText("Dashboard");
        btDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDashboard.setOpaque(true);
        btDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDashboardMouseClicked(evt);
            }
        });
        pnlHead.add(btDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, 40));

        btEstoque.setBackground(new java.awt.Color(1, 6, 167));
        btEstoque.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Estoque.png"))); // NOI18N
        btEstoque.setText("Estoque");
        btEstoque.setToolTipText("Estoque");
        btEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEstoque.setOpaque(true);
        btEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEstoqueMouseClicked(evt);
            }
        });
        pnlHead.add(btEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 140, 40));

        btCompras.setBackground(new java.awt.Color(1, 6, 167));
        btCompras.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btCompras.setForeground(new java.awt.Color(255, 255, 255));
        btCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Compras.png"))); // NOI18N
        btCompras.setText("Compras");
        btCompras.setToolTipText("Compras");
        btCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCompras.setOpaque(true);
        btCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btComprasMouseClicked(evt);
            }
        });
        pnlHead.add(btCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 140, 40));

        btFinanceiro.setBackground(new java.awt.Color(1, 6, 167));
        btFinanceiro.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        btFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Financeiro.png"))); // NOI18N
        btFinanceiro.setText("Financeiro");
        btFinanceiro.setToolTipText("Financeiro");
        btFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFinanceiro.setOpaque(true);
        btFinanceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFinanceiroMouseClicked(evt);
            }
        });
        pnlHead.add(btFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 140, 40));

        btFiscal.setBackground(new java.awt.Color(1, 6, 167));
        btFiscal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btFiscal.setForeground(new java.awt.Color(255, 255, 255));
        btFiscal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Fiscal.png"))); // NOI18N
        btFiscal.setText("Fiscal");
        btFiscal.setToolTipText("Fiscal");
        btFiscal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFiscal.setOpaque(true);
        btFiscal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFiscalMouseClicked(evt);
            }
        });
        pnlHead.add(btFiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 140, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlHead.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1370, 2));

        btConfiguracoes.setBackground(new java.awt.Color(1, 6, 167));
        btConfiguracoes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btConfiguracoes.setForeground(new java.awt.Color(255, 255, 255));
        btConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Configuracoes.png"))); // NOI18N
        btConfiguracoes.setToolTipText("Configurações");
        btConfiguracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConfiguracoes.setOpaque(true);
        btConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btConfiguracoesMouseClicked(evt);
            }
        });
        pnlHead.add(btConfiguracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 210, -1, -1));

        btQuemSomos.setBackground(new java.awt.Color(1, 6, 167));
        btQuemSomos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btQuemSomos.setForeground(new java.awt.Color(255, 255, 255));
        btQuemSomos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Sobre.png"))); // NOI18N
        btQuemSomos.setToolTipText("Quem Somos");
        btQuemSomos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btQuemSomos.setOpaque(true);
        btQuemSomos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btQuemSomosMouseClicked(evt);
            }
        });
        pnlHead.add(btQuemSomos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btAjuda.setBackground(new java.awt.Color(1, 6, 167));
        btAjuda.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btAjuda.setForeground(new java.awt.Color(255, 255, 255));
        btAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Ajuda.png"))); // NOI18N
        btAjuda.setToolTipText("Ajuda");
        btAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAjuda.setOpaque(true);
        btAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAjudaMouseClicked(evt);
            }
        });
        pnlHead.add(btAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 210, -1, -1));

        btSair.setBackground(new java.awt.Color(0, 2, 61));
        btSair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btSair.setForeground(new java.awt.Color(255, 255, 255));
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Sair.png"))); // NOI18N
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.setOpaque(true);
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairMouseClicked(evt);
            }
        });
        pnlHead.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, -1, -1));

        lbUsuario.setBackground(new java.awt.Color(1, 6, 167));
        lbUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setText("Usuário:");
        lbUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbUsuario.setOpaque(true);
        lbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUsuarioMouseClicked(evt);
            }
        });
        pnlHead.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, 28));

        btAtendimento.setBackground(new java.awt.Color(1, 6, 167));
        btAtendimento.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btAtendimento.setForeground(new java.awt.Color(255, 255, 255));
        btAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Atendimento.png"))); // NOI18N
        btAtendimento.setText("Atendimento");
        btAtendimento.setToolTipText("Atendimento");
        btAtendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtendimento.setOpaque(true);
        btAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAtendimentoMouseClicked(evt);
            }
        });
        pnlHead.add(btAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 140, 40));

        lbHora.setForeground(new java.awt.Color(255, 255, 255));
        lbHora.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pnlHead.add(lbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 90, 30));

        lbData.setForeground(new java.awt.Color(255, 255, 255));
        lbData.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pnlHead.add(lbData, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 80, 30));

        btConsultas.setBackground(new java.awt.Color(1, 6, 167));
        btConsultas.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btConsultas.setForeground(new java.awt.Color(255, 255, 255));
        btConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Consultar Relatorio.png"))); // NOI18N
        btConsultas.setText("Consultas");
        btConsultas.setToolTipText("Atendimento");
        btConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConsultas.setOpaque(true);
        btConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btConsultasMouseClicked(evt);
            }
        });
        pnlHead.add(btConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 210, 140, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sistema para Restaurante");
        pnlHead.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 190, 30));

        getContentPane().add(pnlHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panellPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panellPrincipal.setPreferredSize(new java.awt.Dimension(1370, 480));

        javax.swing.GroupLayout panellPrincipalLayout = new javax.swing.GroupLayout(panellPrincipal);
        panellPrincipal.setLayout(panellPrincipalLayout);
        panellPrincipalLayout.setHorizontalGroup(
            panellPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        panellPrincipalLayout.setVerticalGroup(
            panellPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(panellPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1370, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void chamandoDashBoard() {

        pnlDashBoard pnlDshB = new pnlDashBoard();
        pnlDshB.setSize(1370, 480);
        pnlDshB.setLocation(0, 0);
        panellPrincipal.removeAll();
        panellPrincipal.add(pnlDshB, BorderLayout.CENTER);
        panellPrincipal.revalidate();
        panellPrincipal.repaint();
    }

    public void chamandoCadastros() {

        pnlCadastros pnlCad = new pnlCadastros();
        pnlCad.setSize(1370, 480);
        pnlCad.setLocation(0, 0);
        panellPrincipal.removeAll();
        panellPrincipal.add(pnlCad, BorderLayout.CENTER);
        panellPrincipal.revalidate();
        panellPrincipal.repaint();
    }

    public void chamandoFinanceiro() {

        pnlFinanceiro pnlFin = new pnlFinanceiro();
        pnlFin.setSize(1370, 480);
        pnlFin.setLocation(0, 0);
        panellPrincipal.removeAll();
        panellPrincipal.add(pnlFin, BorderLayout.CENTER);
        panellPrincipal.revalidate();
        panellPrincipal.repaint();
    }

    public void chamandoEstoque() {

        pnlEstoque pnlEstq = new pnlEstoque();
        pnlEstq.setSize(1370, 480);
        pnlEstq.setLocation(0, 0);
        panellPrincipal.removeAll();
        panellPrincipal.add(pnlEstq, BorderLayout.CENTER);
        panellPrincipal.revalidate();
        panellPrincipal.repaint();
    }

    public void chamandoAtendimento() {

        pnlAtendimento pnlAtend = new pnlAtendimento();
        pnlAtend.setSize(1370, 480);
        pnlAtend.setLocation(0, 0);
        panellPrincipal.removeAll();
        panellPrincipal.add(pnlAtend, BorderLayout.CENTER);
        panellPrincipal.revalidate();
        panellPrincipal.repaint();
    }

    public void chamandoConsultas() {

        pnlConsultas pnlCons = new pnlConsultas();
        pnlCons.setSize(1370, 480);
        pnlCons.setLocation(0, 0);
        panellPrincipal.removeAll();
        panellPrincipal.add(pnlCons, BorderLayout.CENTER);
        panellPrincipal.revalidate();
        panellPrincipal.repaint();
    }
    
    public void chamandoParametros() {

        pnlParametros pnlPramSist = new pnlParametros();
        pnlPramSist.setSize(1370, 480);
        pnlPramSist.setLocation(0, 0);
        panellPrincipal.removeAll();
        panellPrincipal.add(pnlPramSist, BorderLayout.CENTER);
        panellPrincipal.revalidate();
        panellPrincipal.repaint();
    }

    public void chamandoCompras() {

        pnlCompras pnlComp = new pnlCompras();
        pnlComp.setSize(1370, 480);
        pnlComp.setLocation(0, 0);
        panellPrincipal.removeAll();
        panellPrincipal.add(pnlComp, BorderLayout.CENTER);
        panellPrincipal.revalidate();
        panellPrincipal.repaint();
    }

    public void chamandoFiscal() {

        pnlFiscal pnlFisc = new pnlFiscal();
        pnlFisc.setSize(1370, 480);
        pnlFisc.setLocation(0, 0);
        panellPrincipal.removeAll();
        panellPrincipal.add(pnlFisc, BorderLayout.CENTER);
        panellPrincipal.revalidate();
        panellPrincipal.repaint();
    }

    private void btDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDashboardMouseClicked

        chamandoDashBoard();
        EventosBotoes.setLblColor(btDashboard);
        EventosBotoes.resetLblColor(btCadastros);
        EventosBotoes.resetLblColor(btCompras);
        EventosBotoes.resetLblColor(btEstoque);
        EventosBotoes.resetLblColor(btFinanceiro);
        EventosBotoes.resetLblColor(btFiscal);
        EventosBotoes.resetLblColor(btConfiguracoes);
        EventosBotoes.resetLblColor(btAjuda);
        EventosBotoes.resetLblColor(btQuemSomos);
        EventosBotoes.resetLblColor(btAtendimento);
        EventosBotoes.resetLblColor(btConsultas);
    }//GEN-LAST:event_btDashboardMouseClicked

    private void btCadastrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrosMouseClicked

        chamandoCadastros();
        EventosBotoes.setLblColor(btCadastros);
        EventosBotoes.resetLblColor(btDashboard);
        EventosBotoes.resetLblColor(btCompras);
        EventosBotoes.resetLblColor(btEstoque);
        EventosBotoes.resetLblColor(btFinanceiro);
        EventosBotoes.resetLblColor(btFiscal);
        EventosBotoes.resetLblColor(btConfiguracoes);
        EventosBotoes.resetLblColor(btAjuda);
        EventosBotoes.resetLblColor(btQuemSomos);
        EventosBotoes.resetLblColor(btAtendimento);
        EventosBotoes.resetLblColor(btConsultas);
    }//GEN-LAST:event_btCadastrosMouseClicked

    private void btComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btComprasMouseClicked

        chamandoCompras();
        EventosBotoes.setLblColor(btCompras);
        EventosBotoes.resetLblColor(btCadastros);
        EventosBotoes.resetLblColor(btDashboard);
        EventosBotoes.resetLblColor(btEstoque);
        EventosBotoes.resetLblColor(btFinanceiro);
        EventosBotoes.resetLblColor(btFiscal);
        EventosBotoes.resetLblColor(btConfiguracoes);
        EventosBotoes.resetLblColor(btAjuda);
        EventosBotoes.resetLblColor(btQuemSomos);
        EventosBotoes.resetLblColor(btAtendimento);
        EventosBotoes.resetLblColor(btConsultas);
    }//GEN-LAST:event_btComprasMouseClicked

    private void btEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEstoqueMouseClicked

        chamandoEstoque();
        EventosBotoes.setLblColor(btEstoque);
        EventosBotoes.resetLblColor(btCompras);
        EventosBotoes.resetLblColor(btCadastros);
        EventosBotoes.resetLblColor(btDashboard);
        EventosBotoes.resetLblColor(btFinanceiro);
        EventosBotoes.resetLblColor(btFiscal);
        EventosBotoes.resetLblColor(btConfiguracoes);
        EventosBotoes.resetLblColor(btAjuda);
        EventosBotoes.resetLblColor(btQuemSomos);
        EventosBotoes.resetLblColor(btAtendimento);
        EventosBotoes.resetLblColor(btConsultas);
    }//GEN-LAST:event_btEstoqueMouseClicked

    private void btFinanceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFinanceiroMouseClicked

        chamandoFinanceiro();
        EventosBotoes.setLblColor(btFinanceiro);
        EventosBotoes.resetLblColor(btEstoque);
        EventosBotoes.resetLblColor(btCompras);
        EventosBotoes.resetLblColor(btCadastros);
        EventosBotoes.resetLblColor(btDashboard);
        EventosBotoes.resetLblColor(btFiscal);
        EventosBotoes.resetLblColor(btConfiguracoes);
        EventosBotoes.resetLblColor(btAjuda);
        EventosBotoes.resetLblColor(btQuemSomos);
        EventosBotoes.resetLblColor(btAtendimento);
        EventosBotoes.resetLblColor(btConsultas);
    }//GEN-LAST:event_btFinanceiroMouseClicked

    private void btFiscalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFiscalMouseClicked

        chamandoFiscal();
        EventosBotoes.setLblColor(btFiscal);
        EventosBotoes.resetLblColor(btFinanceiro);
        EventosBotoes.resetLblColor(btEstoque);
        EventosBotoes.resetLblColor(btCompras);
        EventosBotoes.resetLblColor(btCadastros);
        EventosBotoes.resetLblColor(btDashboard);
        EventosBotoes.resetLblColor(btConfiguracoes);
        EventosBotoes.resetLblColor(btAjuda);
        EventosBotoes.resetLblColor(btQuemSomos);
        EventosBotoes.resetLblColor(btAtendimento);
        EventosBotoes.resetLblColor(btConsultas);
    }//GEN-LAST:event_btFiscalMouseClicked

    private void btSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseClicked

        System.exit(0);
    }//GEN-LAST:event_btSairMouseClicked

    private void lbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbUsuarioMouseClicked

    private void btConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConfiguracoesMouseClicked

        chamandoParametros();
        EventosBotoes.setLblColor(btConfiguracoes);
        EventosBotoes.resetLblColor(btAjuda);
        EventosBotoes.resetLblColor(btQuemSomos);
        EventosBotoes.resetLblColor(btAtendimento);
        EventosBotoes.resetLblColor(btFiscal);
        EventosBotoes.resetLblColor(btFinanceiro);
        EventosBotoes.resetLblColor(btEstoque);
        EventosBotoes.resetLblColor(btCompras);
        EventosBotoes.resetLblColor(btCadastros);
        EventosBotoes.resetLblColor(btDashboard);
        EventosBotoes.resetLblColor(btConsultas);
    }//GEN-LAST:event_btConfiguracoesMouseClicked

    private void btAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAjudaMouseClicked

        EventosBotoes.setLblColor(btAjuda);
        EventosBotoes.resetLblColor(btQuemSomos);
        EventosBotoes.resetLblColor(btConfiguracoes);
        EventosBotoes.resetLblColor(btAtendimento);
        EventosBotoes.resetLblColor(btFiscal);
        EventosBotoes.resetLblColor(btFinanceiro);
        EventosBotoes.resetLblColor(btEstoque);
        EventosBotoes.resetLblColor(btCompras);
        EventosBotoes.resetLblColor(btCadastros);
        EventosBotoes.resetLblColor(btDashboard);
        EventosBotoes.resetLblColor(btConsultas);
    }//GEN-LAST:event_btAjudaMouseClicked

    private void btQuemSomosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btQuemSomosMouseClicked

        EventosBotoes.setLblColor(btQuemSomos);
        EventosBotoes.resetLblColor(btConfiguracoes);
        EventosBotoes.resetLblColor(btAjuda);
        EventosBotoes.resetLblColor(btAtendimento);
        EventosBotoes.resetLblColor(btFiscal);
        EventosBotoes.resetLblColor(btFinanceiro);
        EventosBotoes.resetLblColor(btEstoque);
        EventosBotoes.resetLblColor(btCompras);
        EventosBotoes.resetLblColor(btCadastros);
        EventosBotoes.resetLblColor(btDashboard);
        EventosBotoes.resetLblColor(btConsultas);
    }//GEN-LAST:event_btQuemSomosMouseClicked

    private void btAtendimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtendimentoMouseClicked

        chamandoAtendimento();
        EventosBotoes.setLblColor(btAtendimento);
        EventosBotoes.resetLblColor(btQuemSomos);
        EventosBotoes.resetLblColor(btConfiguracoes);
        EventosBotoes.resetLblColor(btAjuda);
        EventosBotoes.resetLblColor(btFiscal);
        EventosBotoes.resetLblColor(btFinanceiro);
        EventosBotoes.resetLblColor(btEstoque);
        EventosBotoes.resetLblColor(btCompras);
        EventosBotoes.resetLblColor(btCadastros);
        EventosBotoes.resetLblColor(btDashboard);
        EventosBotoes.resetLblColor(btConsultas);
    }//GEN-LAST:event_btAtendimentoMouseClicked

    private void btConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConsultasMouseClicked
        
        chamandoConsultas();
        EventosBotoes.setLblColor(btConsultas);
        EventosBotoes.resetLblColor(btAtendimento);
        EventosBotoes.resetLblColor(btQuemSomos);
        EventosBotoes.resetLblColor(btConfiguracoes);
        EventosBotoes.resetLblColor(btAjuda);
        EventosBotoes.resetLblColor(btFiscal);
        EventosBotoes.resetLblColor(btFinanceiro);
        EventosBotoes.resetLblColor(btEstoque);
        EventosBotoes.resetLblColor(btCompras);
        EventosBotoes.resetLblColor(btCadastros);
        EventosBotoes.resetLblColor(btDashboard);
    }//GEN-LAST:event_btConsultasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btAjuda;
    private javax.swing.JLabel btAtendimento;
    private javax.swing.JLabel btCadastros;
    private javax.swing.JLabel btCompras;
    private javax.swing.JLabel btConfiguracoes;
    private javax.swing.JLabel btConsultas;
    private javax.swing.JLabel btDashboard;
    private javax.swing.JLabel btEstoque;
    private javax.swing.JLabel btFinanceiro;
    private javax.swing.JLabel btFiscal;
    private javax.swing.JLabel btQuemSomos;
    private javax.swing.JLabel btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.RSLabelFecha lbData;
    private rojeru_san.RSLabelHora lbHora;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel panellPrincipal;
    private javax.swing.JPanel pnlHead;
    // End of variables declaration//GEN-END:variables
}
