package Interface.Formularios.Registrar;

import Banco.CRUD.crudNcm;
import Banco.Conexao.ConectaBanco;
import Funcoes.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public final class frmNcmRegistrar extends javax.swing.JDialog {

    private final JDialog parente;
    crudNcm crudNcm = new crudNcm();
    ConectaBanco conBanco = new ConectaBanco();
    int xx, yy, id_Cest, num = 1;
    String num_Ncm, desc_Ncm, num_Cest;

    public frmNcmRegistrar(java.awt.Frame parent, boolean modal, JDialog p, String numCest) {

        super(parent, modal);
        initComponents();
        txtNumNcm.requestFocus();
        this.parente = p;
        consultaCest(numCest);
        lbNumCest.setText(numCest);
        atualizaTabelaNcm(numCest);
        num_Cest = numCest;
    }

    public void consultaCest(String nmCest) {

        conBanco.conexao();
        conBanco.executaSQL("Select * from tab_cest where num_cest ='" + nmCest + "'");
        try {
            conBanco.rs.first();
            id_Cest = conBanco.rs.getInt("id_cest");
        } catch (SQLException ex) {
        }
        conBanco.desconecta();
    }

    public void consultarRegistroNcm() {

        try {
            Integer.parseInt(txtConsultarRegistroNcm.getText());
        } catch (Exception e) {
            num = 0;
        }
        if (num == 0) {
            preencherTabelaNcm(" select * from tab_ncm where desc_ncm like '%" + txtConsultarRegistroNcm.getText() + "%' and status_ncm = 'ativo'");
            num = 1;
        } else {
            if (num == 1) {
                preencherTabelaNcm(" select * from tab_ncm where num_ncm like '%" + txtConsultarRegistroNcm.getText() + "%' and status_ncm = 'ativo' ");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evaluatorEllipse2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D();
        rSLabelVerticalD1 = new rojerusan.RSLabelVerticalD();
        rSLabelVerticalD2 = new rojerusan.RSLabelVerticalD();
        menuTabelaRegistroIcmsSt = new javax.swing.JPanel();
        btDeletarRegistro6 = new rojeru_san.RSButtonRiple();
        btEditarRegistroBcIcmsSt = new rojeru_san.RSButtonRiple();
        popupMenuRegistroIcmsSt = new javax.swing.JPopupMenu();
        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btSair = new rojeru_san.RSButtonRiple();
        btSalvarRegistro = new rojeru_san.RSButtonRiple();
        btCancelarRegistro = new rojeru_san.RSButtonRiple();
        txtNumNcm = new rojerusan.RSMetroTextPlaceHolder();
        txtDescNcm = new rojerusan.RSMetroTextPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        lbNumCest = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaNcm = new rojerusan.RSTableMetro();
        btNovoRegistroNcm = new rojeru_san.RSButtonRiple();
        txtConsultarRegistroNcm = new rojerusan.RSMetroTextPlaceHolder();
        jLabel4 = new javax.swing.JLabel();
        btFinalizarRegistro = new rojeru_san.RSButtonRiple();

        rSLabelVerticalD1.setText("rSLabelVerticalD1");

        rSLabelVerticalD2.setText("rSLabelVerticalD2");

        menuTabelaRegistroIcmsSt.setBackground(new java.awt.Color(255, 255, 255));
        menuTabelaRegistroIcmsSt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btDeletarRegistro6.setBackground(new java.awt.Color(0, 2, 61));
        btDeletarRegistro6.setBorder(null);
        btDeletarRegistro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Remover Registro.png"))); // NOI18N
        btDeletarRegistro6.setText("Deletar Registro");
        btDeletarRegistro6.setToolTipText("Novo Registro");
        btDeletarRegistro6.setColorHover(new java.awt.Color(1, 6, 167));
        btDeletarRegistro6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletarRegistro6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDeletarRegistro6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDeletarRegistro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarRegistro6ActionPerformed(evt);
            }
        });
        menuTabelaRegistroIcmsSt.add(btDeletarRegistro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, -1));

        btEditarRegistroBcIcmsSt.setBackground(new java.awt.Color(0, 2, 61));
        btEditarRegistroBcIcmsSt.setBorder(null);
        btEditarRegistroBcIcmsSt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Editar Registro.png"))); // NOI18N
        btEditarRegistroBcIcmsSt.setText("Editar NCM");
        btEditarRegistroBcIcmsSt.setToolTipText("Novo Registro");
        btEditarRegistroBcIcmsSt.setColorHover(new java.awt.Color(1, 6, 167));
        btEditarRegistroBcIcmsSt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditarRegistroBcIcmsSt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEditarRegistroBcIcmsSt.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btEditarRegistroBcIcmsSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarRegistroBcIcmsStActionPerformed(evt);
            }
        });
        menuTabelaRegistroIcmsSt.add(btEditarRegistroBcIcmsSt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jPanel2.setPreferredSize(new java.awt.Dimension(364, 254));

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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Cadastrar NCM");

        btSair.setBackground(new java.awt.Color(0, 2, 61));
        btSair.setBorder(null);
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesMenus/Sair.png"))); // NOI18N
        btSair.setToolTipText("Sair");
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btSalvarRegistro.setBackground(new java.awt.Color(0, 2, 61));
        btSalvarRegistro.setBorder(null);
        btSalvarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Salvar Registro.png"))); // NOI18N
        btSalvarRegistro.setText("Salvar Registro");
        btSalvarRegistro.setToolTipText("Salvar Registro");
        btSalvarRegistro.setColorHover(new java.awt.Color(0, 153, 51));
        btSalvarRegistro.setEnabled(false);
        btSalvarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSalvarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btSalvarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarRegistroActionPerformed(evt);
            }
        });

        btCancelarRegistro.setBackground(new java.awt.Color(0, 2, 61));
        btCancelarRegistro.setBorder(null);
        btCancelarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Cancelar Registro.png"))); // NOI18N
        btCancelarRegistro.setText("Cancelar");
        btCancelarRegistro.setToolTipText("Cancelar Registro");
        btCancelarRegistro.setColorHover(new java.awt.Color(255, 0, 0));
        btCancelarRegistro.setEnabled(false);
        btCancelarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCancelarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarRegistroActionPerformed(evt);
            }
        });

        txtNumNcm.setForeground(new java.awt.Color(0, 2, 61));
        txtNumNcm.setToolTipText("Digite o número do NCM");
        txtNumNcm.setBorderColor(new java.awt.Color(0, 2, 61));
        txtNumNcm.setBotonColor(new java.awt.Color(0, 2, 61));
        txtNumNcm.setEnabled(false);
        txtNumNcm.setPhColor(new java.awt.Color(0, 2, 61));
        txtNumNcm.setPlaceholder("Digite o número do NCM");
        txtNumNcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumNcmActionPerformed(evt);
            }
        });

        txtDescNcm.setForeground(new java.awt.Color(0, 2, 61));
        txtDescNcm.setToolTipText("Digite a descrição do NCM");
        txtDescNcm.setBorderColor(new java.awt.Color(0, 2, 61));
        txtDescNcm.setBotonColor(new java.awt.Color(0, 2, 61));
        txtDescNcm.setEnabled(false);
        txtDescNcm.setPhColor(new java.awt.Color(0, 2, 61));
        txtDescNcm.setPlaceholder("Digite a descrição do NCM");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 2, 61));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nº CEST :");

        lbNumCest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNumCest.setForeground(new java.awt.Color(0, 2, 61));
        lbNumCest.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaNcm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaNcm.setAltoHead(30);
        tabelaNcm.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaNcm.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaNcm.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaNcm.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaNcm.setGrosorBordeFilas(0);
        tabelaNcm.setGrosorBordeHead(0);
        tabelaNcm.getTableHeader().setReorderingAllowed(false);
        tabelaNcm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaNcmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaNcm);

        btNovoRegistroNcm.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroNcm.setBorder(null);
        btNovoRegistroNcm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroNcm.setText("Novo Registro");
        btNovoRegistroNcm.setToolTipText("Novo Registro");
        btNovoRegistroNcm.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroNcm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroNcm.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroNcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroNcmActionPerformed(evt);
            }
        });

        txtConsultarRegistroNcm.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroNcm.setToolTipText("Consultas Registros");
        txtConsultarRegistroNcm.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroNcm.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroNcm.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroNcm.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroNcm.setPlaceholder("Consultar registro");
        txtConsultarRegistroNcm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroNcmKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroNcmKeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        btFinalizarRegistro.setBackground(new java.awt.Color(0, 2, 61));
        btFinalizarRegistro.setBorder(null);
        btFinalizarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Finalizar.png"))); // NOI18N
        btFinalizarRegistro.setText("Finalizar");
        btFinalizarRegistro.setToolTipText("Cancelar Registro");
        btFinalizarRegistro.setColorHover(new java.awt.Color(0, 204, 102));
        btFinalizarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btFinalizarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btFinalizarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSalvarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFinalizarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btNovoRegistroNcm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroNcm, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNumNcm, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescNcm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNumCest, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lbNumCest, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumNcm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescNcm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNovoRegistroNcm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistroNcm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFinalizarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        rSPanelShadow1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limpaCampos() {

        txtNumNcm.setText("");
        txtDescNcm.setText("");
        txtConsultarRegistroNcm.setText("");
    }

    public void habilitaDesbilitaCampos(boolean txtNmNcm, boolean txtDscNcm, boolean txtConRegNcm, boolean tbNcm) {

        txtNumNcm.setEnabled(txtNmNcm);
        txtDescNcm.setEnabled(txtDscNcm);
        txtConsultarRegistroNcm.setEnabled(txtConRegNcm);
        tabelaNcm.setEnabled(tbNcm);
    }

    public void ativaDesativaBotoesTabela(boolean btNvReg, boolean btCanReg, boolean btSvRg, boolean btFinReg) {

        btNovoRegistroNcm.setEnabled(btNvReg);
        btCancelarRegistro.setEnabled(btCanReg);
        btSalvarRegistro.setEnabled(btSvRg);
        btFinalizarRegistro.setEnabled(btFinReg);
    }

    public void atualizaTabelaNcm(String numCest) {

        preencherTabelaNcm(" select * from vw_ncm where num_cest ='" + numCest + "'and status_ncm = 'ativo'");
    }

    public void preencherTabelaNcm(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Nº NCM", "Descrição NCM"};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("num_ncm"), conBanco.rs.getString("desc_ncm")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaNcm.setModel(modTabela);
        tabelaNcm.getColumnModel().getColumn(0).setPreferredWidth(200);
        tabelaNcm.getColumnModel().getColumn(0).setResizable(false);
        tabelaNcm.getColumnModel().getColumn(1).setPreferredWidth(516);
        tabelaNcm.getColumnModel().getColumn(1).setResizable(false);
        tabelaNcm.getTableHeader().setReorderingAllowed(false);
        tabelaNcm.setAutoResizeMode(tabelaNcm.AUTO_RESIZE_OFF);
        tabelaNcm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }

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

    public void verificarRegistro() {

        conBanco.conexao();
        conBanco.executaSQL("Select * from tab_ncm where num_ncm ='" + txtNumNcm.getText() + "'");
        try {
            conBanco.rs.first();
            num_Ncm = conBanco.rs.getString("num_cest");
        } catch (SQLException ex) {
        }
        conBanco.desconecta();
    }

    public void salvarRegistro() {

        if (txtNumNcm.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite o número do NCM!!");
            txtNumNcm.requestFocus();
        } else {
            if (txtDescNcm.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Digite a descrição do NCM!!");
                txtNumNcm.requestFocus();
            } else {
                verificarRegistro();
                if (txtNumNcm.getText().equals((String) num_Ncm)) {
                    JOptionPane.showMessageDialog(rootPane, "Já existe " + txtNumNcm.getText() + " cadastrado no sistema!!");
                    txtNumNcm.requestFocus();
                } else {
                    crudNcm.InserirNcm(txtNumNcm.getText(), txtDescNcm.getText(), id_Cest, "ativo");
                    limpaCampos();
                    habilitaDesbilitaCampos(false, false, true, true);
                    ativaDesativaBotoesTabela(true, false, false, true);
                    atualizaTabelaNcm(num_Cest);
                }
            }

        }
    }

    private void btSalvarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarRegistroActionPerformed

        salvarRegistro();
    }//GEN-LAST:event_btSalvarRegistroActionPerformed

    private void btCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarRegistroActionPerformed

        limpaCampos();
        habilitaDesbilitaCampos(false, false, true, true);
        ativaDesativaBotoesTabela(true, false, false, true);
    }//GEN-LAST:event_btCancelarRegistroActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_formMouseDragged

    private void txtNumNcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumNcmActionPerformed

        salvarRegistro();
    }//GEN-LAST:event_txtNumNcmActionPerformed

    private void tabelaNcmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaNcmMouseClicked

//        if (evt.getClickCount() > 1) {
//            chamarFormularioAtualizarCest();
//        }
    }//GEN-LAST:event_tabelaNcmMouseClicked

    private void btNovoRegistroNcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroNcmActionPerformed

        habilitaDesbilitaCampos(true, true, false, false);
        txtNumNcm.requestFocus();
        ativaDesativaBotoesTabela(false, true, true, false);
    }//GEN-LAST:event_btNovoRegistroNcmActionPerformed

    private void txtConsultarRegistroNcmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroNcmKeyReleased

        if (txtConsultarRegistroNcm.getText().equals("")) {
            atualizaTabelaNcm(num_Cest);
        } else {
            consultarRegistroNcm();
        }
    }//GEN-LAST:event_txtConsultarRegistroNcmKeyReleased

    private void btFinalizarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarRegistroActionPerformed

        dispose();
    }//GEN-LAST:event_btFinalizarRegistroActionPerformed

    private void btDeletarRegistro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarRegistro6ActionPerformed

    }//GEN-LAST:event_btDeletarRegistro6ActionPerformed

    private void btEditarRegistroBcIcmsStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRegistroBcIcmsStActionPerformed

    }//GEN-LAST:event_btEditarRegistroBcIcmsStActionPerformed

    private void txtConsultarRegistroNcmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroNcmKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroNcmKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btCancelarRegistro;
    private rojeru_san.RSButtonRiple btDeletarRegistro6;
    private rojeru_san.RSButtonRiple btEditarRegistroBcIcmsSt;
    private rojeru_san.RSButtonRiple btFinalizarRegistro;
    private rojeru_san.RSButtonRiple btNovoRegistroNcm;
    private rojeru_san.RSButtonRiple btSair;
    private rojeru_san.RSButtonRiple btSalvarRegistro;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D evaluatorEllipse2D1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNumCest;
    private javax.swing.JPanel menuTabelaRegistroIcmsSt;
    private javax.swing.JPopupMenu popupMenuRegistroIcmsSt;
    private rojerusan.RSLabelVerticalD rSLabelVerticalD1;
    private rojerusan.RSLabelVerticalD rSLabelVerticalD2;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojerusan.RSTableMetro tabelaNcm;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroNcm;
    private rojerusan.RSMetroTextPlaceHolder txtDescNcm;
    private rojerusan.RSMetroTextPlaceHolder txtNumNcm;
    // End of variables declaration//GEN-END:variables
}
