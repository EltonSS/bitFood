package Interface.Formularios;

import Interface.Formularios.Registrar.frmCstOrigemRegistrar;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Banco.Conexao.ConectaBanco;
import Banco.CRUD.crudTributacao;
import Funcoes.ModeloTabela;
import Funcoes.TratamentoCampos;
import Interface.Formularios.Alterar.FrmCstOrigemAlterar;
import javax.swing.JDialog;

public class frmTributacao extends javax.swing.JDialog {

    private final JDialog parente;
    ConectaBanco conBanco = new ConectaBanco();
    crudTributacao crudTrib = new crudTributacao();
    TratamentoCampos tratCampo = new TratamentoCampos();
    int xx, yy, num = 1, id_Fab_Prod;
    String desc_Fab_Prod, status_Fab_Prod;
    String colunaTabela, rsDados;

    public frmTributacao(java.awt.Frame parent, boolean modal, JDialog p) {

        initComponents();
        this.setLocationRelativeTo(null);
        atualizaTabelaCstOrigem();
//        atualizaTabelaCstTributacaoIcms();
//        atualizaTabelaCstTributacaoSimplesNacional();
        popupMenuRegistro.add(menuTabelaRegistro);
        this.parente = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evaluatorEllipse2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D();
        menuTabelaRegistro = new javax.swing.JPanel();
        btDeletarRegistro = new rojeru_san.RSButtonRiple();
        btEditarRegistro = new rojeru_san.RSButtonRiple();
        popupMenuRegistro = new javax.swing.JPopupMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btSair = new rojeru_san.RSButtonRiple();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtConsultarRegistroCstOrg = new rojerusan.RSMetroTextPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        btNovoRegistroCstOrigem = new rojeru_san.RSButtonRiple();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFormCstOrigem = new rojerusan.RSTableMetro();
        jPanel4 = new javax.swing.JPanel();
        btNovoRegistroCstTributacaoIcms = new rojeru_san.RSButtonRiple();
        jLabel4 = new javax.swing.JLabel();
        txtConsultarRegistroCstTribIcms = new rojerusan.RSMetroTextPlaceHolder();
        jPanel12 = new javax.swing.JPanel();
        btNovoRegistroCstTributacaoSimplesNacional = new rojeru_san.RSButtonRiple();
        txtConsultarRegistroCstTribSplNac = new rojerusan.RSMetroTextPlaceHolder();
        jLabel5 = new javax.swing.JLabel();

        menuTabelaRegistro.setBackground(new java.awt.Color(255, 255, 255));
        menuTabelaRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btDeletarRegistro.setBackground(new java.awt.Color(0, 2, 61));
        btDeletarRegistro.setBorder(null);
        btDeletarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Remover Registro.png"))); // NOI18N
        btDeletarRegistro.setText("Deletar Registro");
        btDeletarRegistro.setToolTipText("Novo Registro");
        btDeletarRegistro.setColorHover(new java.awt.Color(1, 6, 167));
        btDeletarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDeletarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDeletarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarRegistroActionPerformed(evt);
            }
        });
        menuTabelaRegistro.add(btDeletarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, -1));

        btEditarRegistro.setBackground(new java.awt.Color(0, 2, 61));
        btEditarRegistro.setBorder(null);
        btEditarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Editar Registro.png"))); // NOI18N
        btEditarRegistro.setText("Editar Registro");
        btEditarRegistro.setToolTipText("Novo Registro");
        btEditarRegistro.setColorHover(new java.awt.Color(1, 6, 167));
        btEditarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEditarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btEditarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarRegistroActionPerformed(evt);
            }
        });
        menuTabelaRegistro.add(btEditarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelShadow1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 2, 61));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Tributações");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/FachadasFormularios/Tributos.png"))); // NOI18N

        btSair.setBackground(new java.awt.Color(0, 2, 61));
        btSair.setBorder(null);
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Sair.png"))); // NOI18N
        btSair.setColorHover(new java.awt.Color(255, 0, 0));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 2, 61)));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtConsultarRegistroCstOrg.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstOrg.setToolTipText("Consultas Registros");
        txtConsultarRegistroCstOrg.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstOrg.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstOrg.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroCstOrg.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstOrg.setPlaceholder("Consultar registro");
        txtConsultarRegistroCstOrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroCstOrgKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        btNovoRegistroCstOrigem.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroCstOrigem.setBorder(null);
        btNovoRegistroCstOrigem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroCstOrigem.setText("Novo Registro");
        btNovoRegistroCstOrigem.setToolTipText("Novo Registro");
        btNovoRegistroCstOrigem.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroCstOrigem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroCstOrigem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroCstOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroCstOrigemActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaFormCstOrigem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaFormCstOrigem.setAltoHead(30);
        tabelaFormCstOrigem.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaFormCstOrigem.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaFormCstOrigem.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaFormCstOrigem.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaFormCstOrigem.setGrosorBordeFilas(0);
        tabelaFormCstOrigem.setGrosorBordeHead(0);
        tabelaFormCstOrigem.getTableHeader().setReorderingAllowed(false);
        tabelaFormCstOrigem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFormCstOrigemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFormCstOrigem);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btNovoRegistroCstOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroCstOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtConsultarRegistroCstOrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovoRegistroCstOrigem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CST (Origem)", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btNovoRegistroCstTributacaoIcms.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroCstTributacaoIcms.setBorder(null);
        btNovoRegistroCstTributacaoIcms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroCstTributacaoIcms.setText("Novo Registro");
        btNovoRegistroCstTributacaoIcms.setToolTipText("Novo Registro");
        btNovoRegistroCstTributacaoIcms.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroCstTributacaoIcms.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroCstTributacaoIcms.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroCstTributacaoIcms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroCstTributacaoIcmsActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        txtConsultarRegistroCstTribIcms.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstTribIcms.setToolTipText("Consultas Registros");
        txtConsultarRegistroCstTribIcms.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstTribIcms.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstTribIcms.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroCstTribIcms.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstTribIcms.setPlaceholder("Consultar registro");
        txtConsultarRegistroCstTribIcms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroCstTribIcmsKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovoRegistroCstTributacaoIcms, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConsultarRegistroCstTribIcms, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtConsultarRegistroCstTribIcms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovoRegistroCstTributacaoIcms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(303, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CST (Tributação pelo ICMS)", jPanel4);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        btNovoRegistroCstTributacaoSimplesNacional.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroCstTributacaoSimplesNacional.setBorder(null);
        btNovoRegistroCstTributacaoSimplesNacional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroCstTributacaoSimplesNacional.setText("Novo Registro");
        btNovoRegistroCstTributacaoSimplesNacional.setToolTipText("Novo Registro");
        btNovoRegistroCstTributacaoSimplesNacional.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroCstTributacaoSimplesNacional.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroCstTributacaoSimplesNacional.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroCstTributacaoSimplesNacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroCstTributacaoSimplesNacionalActionPerformed(evt);
            }
        });

        txtConsultarRegistroCstTribSplNac.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstTribSplNac.setToolTipText("Consultas Registros");
        txtConsultarRegistroCstTribSplNac.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstTribSplNac.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstTribSplNac.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroCstTribSplNac.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCstTribSplNac.setPlaceholder("Consultar registro");
        txtConsultarRegistroCstTribSplNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroCstTribSplNacKeyReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovoRegistroCstTributacaoSimplesNacional, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConsultarRegistroCstTribSplNac, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtConsultarRegistroCstTribSplNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovoRegistroCstTributacaoSimplesNacional, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(303, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CST (Tributação pelo Simples Nacional)", jPanel12);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rSPanelShadow1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//-------------------------------------------- CST ORIGEM ------------------------------------------------------------------------
    public void consultarRegistroCstOrigem() {

        try {
            Integer.parseInt(txtConsultarRegistroCstOrg.getText());
        } catch (Exception e) {
            num = 0;
        }
        if (num == 0) {
            preencherTabelaCstOrigem(" select * from tab_cst_origem where desc_cst_org like '%" + txtConsultarRegistroCstOrg.getText() + "%' and status_cst_org = 'ativo' order by desc_cst_org asc");
            num = 1;
        } else {
            if (num == 1) {
                preencherTabelaCstOrigem(" select * from tab_cst_origem where id_cst_org = '" + txtConsultarRegistroCstOrg.getText() + "' and status_cst_org = 'ativo' ");
            }
        }
    }

    public void atualizaTabelaCstOrigem() {

        preencherTabelaCstOrigem(" select * from tab_cst_origem where status_cst_org = 'ativo'");
    }

    public void preencherTabelaCstOrigem(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{colunaTabela};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("desc_cst_org")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaFormCstOrigem.setModel(modTabela);
        tabelaFormCstOrigem.getColumnModel().getColumn(0).setPreferredWidth(684);
        tabelaFormCstOrigem.getColumnModel().getColumn(0).setResizable(false);
        tabelaFormCstOrigem.getTableHeader().setReorderingAllowed(false);
        tabelaFormCstOrigem.setAutoResizeMode(tabelaFormCstOrigem.AUTO_RESIZE_OFF);
        tabelaFormCstOrigem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }
//----------------------------- CST TRIBUTAÇÃO PELO ICMS -----------------------------------------------------------

//    public void consultarRegistroCstTributacaoIcms() {
//
//        try {
//            Integer.parseInt(txtConsultarRegistroCstOrg.getText());
//        } catch (Exception e) {
//            num = 0;
//        }
//        if (num == 0) {
//            preencherTabelaCstTributacaoIcms(" select * from tab_cst_tributacao_icms where desc_fab_prod like '%" + txtConsultarRegistroCstOrg.getText() + "%' and status_cst_trib_icms = 'ativo' order by desc_cst_trib_icms asc");
//            num = 1;
//        } else {
//            if (num == 1) {
//                preencherTabelaCstTributacaoIcms(" select * from tab_cst_tributacao_icms where id_cst_trib_icms = '" + txtConsultarRegistroCstOrg.getText() + "' and status_cst_trib_icms = 'ativo' ");
//            }
//        }
//    }
    
//    public void atualizaTabelaCstTributacaoIcms() {
//
//        preencherTabelaCstTributacaoIcms(" select * from tab_cst_tributacao_icms where status_cst_trib_icms = 'ativo'");
//    }

//    public void preencherTabelaCstTributacaoIcms(String SQL) {
//
//        ArrayList dados = new ArrayList();
//        String[] Colunas = new String[]{colunaTabela};
//        conBanco.conexao();
//        conBanco.executaSQL(SQL);
//        try {
//            conBanco.rs.first();
//            do {
//                dados.add(new Object[]{conBanco.rs.getString("desc_cst_trib_icms")});
//            } while (conBanco.rs.next());
//        } catch (SQLException ex) {
////            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
//        }
//        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
//        tabelaFormCstTributacaoIcms.setModel(modTabela);
//        tabelaFormCstTributacaoIcms.getColumnModel().getColumn(0).setPreferredWidth(684);
//        tabelaFormCstTributacaoIcms.getColumnModel().getColumn(0).setResizable(false);
//        tabelaFormCstTributacaoIcms.getTableHeader().setReorderingAllowed(false);
//        tabelaFormCstTributacaoIcms.setAutoResizeMode(tabelaFormCstTributacaoIcms.AUTO_RESIZE_OFF);
//        tabelaFormCstTributacaoIcms.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        conBanco.desconecta();
//    }
//----------------------------- CST TRIBUTAÇÃO PELO SIMPLES NACIONAL----------------------------------------------------------- 

//    public void consultarRegistroCstTributacaoSimplesNacional() {
//
//        try {
//            Integer.parseInt(txtConsultarRegistroCstOrg.getText());
//        } catch (Exception e) {
//            num = 0;
//        }
//        if (num == 0) {
//            preencherTabelaCstTributacaoSimplesNacional(" select * from tab_cst_tributacao_simples_nacional where desc_cst_trib_spl_nac like '%" + txtConsultarRegistroCstOrg.getText() + "%' and status_fab_prod = 'ativo' order by desc_cst_trib_spl_nac asc");
//            num = 1;
//        } else {
//            if (num == 1) {
//                preencherTabelaCstTributacaoSimplesNacional(" select * from tab_cst_tributacao_simples_nacional where id_cst_trib_spl_nac = '" + txtConsultarRegistroCstOrg.getText() + "' and status_fab_prod = 'ativo' ");
//            }
//        }
//    }
    
//    public void atualizaTabelaCstTributacaoSimplesNacional() {
//
//        preencherTabelaCstTributacaoSimplesNacional(" select * from tab_cst_tributacao_simples_nacional where status_cst_trib_spl_nac = 'ativo'");
//    }

//    public void preencherTabelaCstTributacaoSimplesNacional(String SQL) {
//
//        ArrayList dados = new ArrayList();
//        String[] Colunas = new String[]{colunaTabela};
//        conBanco.conexao();
//        conBanco.executaSQL(SQL);
//        try {
//            conBanco.rs.first();
//            do {
//                dados.add(new Object[]{conBanco.rs.getString("desc_cst_trib_spl_nac")});
//            } while (conBanco.rs.next());
//        } catch (SQLException ex) {
////            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
//        }
//        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
//        tabelaFormCstTributacaoSimplesNacional.setModel(modTabela);
//        tabelaFormCstTributacaoSimplesNacional.getColumnModel().getColumn(0).setPreferredWidth(686);
//        tabelaFormCstTributacaoSimplesNacional.getColumnModel().getColumn(0).setResizable(false);
//        tabelaFormCstTributacaoSimplesNacional.getTableHeader().setReorderingAllowed(false);
//        tabelaFormCstTributacaoSimplesNacional.setAutoResizeMode(tabelaFormCstTributacaoSimplesNacional.AUTO_RESIZE_OFF);
//        tabelaFormCstTributacaoSimplesNacional.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        conBanco.desconecta();
//    }

    private void btNovoRegistroCstOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroCstOrigemActionPerformed

        frmCstOrigemRegistrar frmCstOrg = new frmCstOrigemRegistrar(null, true, this);
        frmCstOrg.setVisible(true);
    }//GEN-LAST:event_btNovoRegistroCstOrigemActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed

        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_formMouseDragged

    private void btDeletarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarRegistroActionPerformed

        String pergunta = "Você deseja deletar o registro:'" + tabelaFormCstOrigem.getValueAt(tabelaFormCstOrigem.getSelectedRow(), 0) + "'";
        int opcao_escolhida = JOptionPane.showConfirmDialog(null, pergunta, "", JOptionPane.YES_NO_OPTION);
        if (opcao_escolhida == JOptionPane.YES_OPTION) {
            String descFabProd = "" + tabelaFormCstOrigem.getValueAt(tabelaFormCstOrigem.getSelectedRow(), 0);
            crudTrib.DesativarCstOrigem(descFabProd, "não ativo");
//            atualizaTabela();
        }
    }//GEN-LAST:event_btDeletarRegistroActionPerformed

//    public void chamarFormularioCstOrgigem() {
//
//        String descFabProd = "" + tabelaFormCstOrigem.getValueAt(tabelaFormCstOrigem.getSelectedRow(), 0);
//        crudTrib.ConsultarCstOrigem(descFabProd);
//        desc_Fab_Prod = crudTrib.getDesc_Cst_Org();
//        status_Fab_Prod = crudTrib.getStatus_Cst_Org();
//        id_Fab_Prod = crudTrib.getId_Cst_Org();
//        FrmCstOrigemAlterar frmFabProd = new FrmCstOrigemAlterar(null, true, id_Fab_Prod, desc_Fab_Prod, status_Fab_Prod, this);
//        frmFabProd.setVisible(true);
//    }

    private void btEditarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRegistroActionPerformed

//        chamarFormularioAtualizarUnidadeMedida();
    }//GEN-LAST:event_btEditarRegistroActionPerformed

    private void txtConsultarRegistroCstOrgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroCstOrgKeyReleased

        if (txtConsultarRegistroCstOrg.getText().equals("")) {
//            atualizaTabela();
        } else {
//            consultarRegistro();
        }
    }//GEN-LAST:event_txtConsultarRegistroCstOrgKeyReleased

    private void btNovoRegistroCstTributacaoIcmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroCstTributacaoIcmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovoRegistroCstTributacaoIcmsActionPerformed

    private void txtConsultarRegistroCstTribIcmsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroCstTribIcmsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroCstTribIcmsKeyReleased

    private void btNovoRegistroCstTributacaoSimplesNacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroCstTributacaoSimplesNacionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovoRegistroCstTributacaoSimplesNacionalActionPerformed

    private void txtConsultarRegistroCstTribSplNacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroCstTribSplNacKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroCstTribSplNacKeyReleased

    private void tabelaFormCstOrigemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFormCstOrigemMouseClicked

//        if (evt.getClickCount() > 1) {
//            chamarVincularPermissao();
//        }
        //        else {
            //            if (evt.getClickCount() <= 1) {
                //                chamarFormularioAtualizarPermissao();
                //            }
            //        }
    }//GEN-LAST:event_tabelaFormCstOrigemMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btDeletarRegistro;
    private rojeru_san.RSButtonRiple btEditarRegistro;
    private rojeru_san.RSButtonRiple btNovoRegistroCstOrigem;
    private rojeru_san.RSButtonRiple btNovoRegistroCstTributacaoIcms;
    private rojeru_san.RSButtonRiple btNovoRegistroCstTributacaoSimplesNacional;
    private rojeru_san.RSButtonRiple btSair;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D evaluatorEllipse2D1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel menuTabelaRegistro;
    private javax.swing.JPopupMenu popupMenuRegistro;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojerusan.RSTableMetro tabelaFormCstOrigem;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroCstOrg;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroCstTribIcms;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroCstTribSplNac;
    // End of variables declaration//GEN-END:variables
}
