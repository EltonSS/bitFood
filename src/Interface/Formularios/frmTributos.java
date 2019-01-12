package Interface.Formularios;

import Interface.Formularios.Registrar.frmFabricanteRegistrar;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Banco.Conexao.ConectaBanco;
import Banco.CRUD.crudFabricante;
import Funcoes.ModeloTabela;
import Funcoes.TratamentoCampos;
import Interface.Formularios.Alterar.FrmFabricanteAlterar;
import javax.swing.JDialog;

public class frmTributos extends javax.swing.JDialog {

    private final JDialog parente;
    ConectaBanco conBanco = new ConectaBanco();
    crudFabricante crudFabProd = new crudFabricante();
    TratamentoCampos tratCampo = new TratamentoCampos();
    int xx, yy, num = 1, id_Fab_Prod;
    String desc_Fab_Prod, status_Fab_Prod;

    public frmTributos(java.awt.Frame parent, boolean modal, JDialog p) {

        initComponents();
        this.setLocationRelativeTo(null);
        atualizaTabela();
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
        txtConsultarRegistro = new rojerusan.RSMetroTextPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        btNovoRegistro = new rojeru_san.RSButtonRiple();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaForm = new rojerusan.RSTableMetro();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();

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
        jLabel1.setText("Tributos");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtConsultarRegistro.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistro.setToolTipText("Consultas Registros");
        txtConsultarRegistro.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistro.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistro.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistro.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistro.setPlaceholder("Consultar registro");
        txtConsultarRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        btNovoRegistro.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistro.setBorder(null);
        btNovoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistro.setText("Novo Registro");
        btNovoRegistro.setToolTipText("Novo Registro");
        btNovoRegistro.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaForm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaForm.setAltoHead(30);
        tabelaForm.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaForm.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaForm.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaForm.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaForm.setComponentPopupMenu(popupMenuRegistro);
        tabelaForm.setGrosorBordeFilas(0);
        tabelaForm.setGrosorBordeHead(0);
        tabelaForm.getTableHeader().setReorderingAllowed(false);
        tabelaForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFormMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaForm);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btNovoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("CEST", new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Chave Permissao.png")), jPanel3); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Comprar.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/Submenus/Recebimento.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel16.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(153, 0, 153));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("NCM");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(255, 153, 0));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CEST");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CST / CSOSN", new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Chave Permissao.png")), jPanel4); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("BC ICMS / ICMS ST", new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Chave Permissao.png")), jPanel5); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("CEST", new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Chave Permissao.png")), jPanel6); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("CEST", new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Chave Permissao.png")), jPanel7); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("CEST", new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Chave Permissao.png")), jPanel8); // NOI18N

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("CEST", new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Chave Permissao.png")), jPanel9); // NOI18N

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("CEST", new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Chave Permissao.png")), jPanel10); // NOI18N

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("CEST", new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Chave Permissao.png")), jPanel11); // NOI18N

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
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        rSPanelShadow1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void consultarRegistro() {

        try {
            Integer.parseInt(txtConsultarRegistro.getText());
        } catch (Exception e) {
            num = 0;
        }
        if (num == 0) {
            preencherTabela(" select * from tab_fabricante_produto where desc_fab_prod like '%" + txtConsultarRegistro.getText() + "%' and status_fab_prod = 'ativo' order by desc_fab_prod asc");
            num = 1;
        } else {
            if (num == 1) {
                preencherTabela(" select * from tab_fabricante_produto where id_fab_prod = '" + txtConsultarRegistro.getText() + "' and status_fab_prod = 'ativo' ");
            }
        }
    }

    public void atualizaTabela() {

        preencherTabela(" select * from tab_fabricante_produto where status_fab_prod = 'ativo'");
    }

    public void preencherTabela(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Descrição Fabricante Produto"};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("desc_fab_prod")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaForm.setModel(modTabela);
        tabelaForm.getColumnModel().getColumn(0).setPreferredWidth(686);
        tabelaForm.getColumnModel().getColumn(0).setResizable(false);
        tabelaForm.getTableHeader().setReorderingAllowed(false);
        tabelaForm.setAutoResizeMode(tabelaForm.AUTO_RESIZE_OFF);
        tabelaForm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }

    private void btNovoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroActionPerformed

        frmFabricanteRegistrar frmFormReg = new frmFabricanteRegistrar(null, true, this);
        frmFormReg.setVisible(true);
    }//GEN-LAST:event_btNovoRegistroActionPerformed

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

        String pergunta = "Você deseja deletar o registro:'" + tabelaForm.getValueAt(tabelaForm.getSelectedRow(), 0) + "'";
        int opcao_escolhida = JOptionPane.showConfirmDialog(null, pergunta, "", JOptionPane.YES_NO_OPTION);
        if (opcao_escolhida == JOptionPane.YES_OPTION) {
            String descFabProd = "" + tabelaForm.getValueAt(tabelaForm.getSelectedRow(), 0);
            crudFabProd.DesativarFabricanteProduto(descFabProd, "não ativo");
            atualizaTabela();
        }
    }//GEN-LAST:event_btDeletarRegistroActionPerformed

    public void chamarFormularioAtualizarUnidadeMedida() {

        String descFabProd = "" + tabelaForm.getValueAt(tabelaForm.getSelectedRow(), 0);
        crudFabProd.ConsultarFabricanteProduto(descFabProd);
        desc_Fab_Prod = crudFabProd.getDesc_Fab_Prod();
        status_Fab_Prod = crudFabProd.getStatus_Fab_Prod();
        id_Fab_Prod = crudFabProd.getId_Fab_Prod();
        FrmFabricanteAlterar frmFabProd = new FrmFabricanteAlterar(null, true, id_Fab_Prod, desc_Fab_Prod, status_Fab_Prod, this);
        frmFabProd.setVisible(true);
    }

    private void btEditarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRegistroActionPerformed

        chamarFormularioAtualizarUnidadeMedida();
    }//GEN-LAST:event_btEditarRegistroActionPerformed

    private void tabelaFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFormMouseClicked

        if (evt.getClickCount() > 1) {
            chamarFormularioAtualizarUnidadeMedida();
        }
    }//GEN-LAST:event_tabelaFormMouseClicked

    private void txtConsultarRegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroKeyReleased

        if (txtConsultarRegistro.getText().equals("")) {
            atualizaTabela();
        } else {
            consultarRegistro();
        }
    }//GEN-LAST:event_txtConsultarRegistroKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btDeletarRegistro;
    private rojeru_san.RSButtonRiple btEditarRegistro;
    private rojeru_san.RSButtonRiple btNovoRegistro;
    private rojeru_san.RSButtonRiple btSair;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D evaluatorEllipse2D1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel menuTabelaRegistro;
    private javax.swing.JPopupMenu popupMenuRegistro;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojerusan.RSTableMetro tabelaForm;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistro;
    // End of variables declaration//GEN-END:variables
}
