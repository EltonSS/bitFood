package Interface.Formularios;

import Interface.Formularios.Registrar.frmCestRegistrar;
import Interface.Formularios.Registrar.frmOrigemMercadoriaRegistrar;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Banco.Conexao.ConectaBanco;
import Banco.CRUD.crudCest;
import Funcoes.ModeloTabela;
import Funcoes.TratamentoCampos;
import Interface.Formularios.Alterar.FrmCestAlterar;
import Interface.Formularios.Registrar.frmBcIcmsRegistrar;
import Interface.Formularios.Registrar.frmBcIcmsStRegistrar;
import Interface.Formularios.Registrar.frmCrtRegistrar;
import Interface.Formularios.Registrar.frmCsosnRegistrar;
import Interface.Formularios.Registrar.frmCstRegistrar;
import javax.swing.JDialog;
import rojerusan.RSTableMetro;

public final class frmTributos extends javax.swing.JDialog {

    private final JDialog parente;
    ConectaBanco conBanco = new ConectaBanco();
    crudCest crudCest = new crudCest();
    TratamentoCampos tratCampo = new TratamentoCampos();
    int xx, yy, num = 1, id_Cest, id_Org_Merc;
    String desc_Cest, desc_Org_Merc, status_Cest, status_Org_Merc;

    public frmTributos(java.awt.Frame parent, boolean modal, JDialog p) {

        initComponents();
        this.setLocationRelativeTo(null);
        atualizaTabelaCest();
        atualizaTabelaCsosn();
        atualizaTabelaOrigemMercadoria();
        atualizaTabelaCst();
        atualizaTabelaCrt();
        atualizaTabelaIcms();
        atualizaTabelaIcmsSt();
        popupMenuRegistroCest.add(menuTabelaRegistroCest);
        popupMenuRegistroOrigemMercadoria.add(menuTabelaRegistroOrigemMercadoria);
        popupMenuRegistroIcmsSt.add(menuTabelaRegistroIcmsSt);
        popupMenuRegistroCst.add(menuTabelaRegistroCst);
        popupMenuRegistroCsosn.add(menuTabelaRegistroCsosn);
        popupMenuRegistroCrt.add(menuTabelaRegistroCrt);
        popupMenuRegistroIcms.add(menuTabelaRegistroIcms);
        popupMenuRegistroIcmsSt.add(menuTabelaRegistroIcmsSt);
        this.parente = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evaluatorEllipse2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D();
        jTabbedPaneAbas = new javax.swing.JTabbedPane();
        menuTabelaRegistroCest = new javax.swing.JPanel();
        btDeletarRegistro = new rojeru_san.RSButtonRiple();
        btEditarRegistro = new rojeru_san.RSButtonRiple();
        btInserirRegistroNcm = new rojeru_san.RSButtonRiple();
        popupMenuRegistroCest = new javax.swing.JPopupMenu();
        menuTabelaRegistroOrigemMercadoria = new javax.swing.JPanel();
        btDeletarRegistro1 = new rojeru_san.RSButtonRiple();
        btEditarRegistro1 = new rojeru_san.RSButtonRiple();
        popupMenuRegistroOrigemMercadoria = new javax.swing.JPopupMenu();
        menuTabelaRegistroCst = new javax.swing.JPanel();
        btDeletarRegistro2 = new rojeru_san.RSButtonRiple();
        btEditarRegistro2 = new rojeru_san.RSButtonRiple();
        popupMenuRegistroCst = new javax.swing.JPopupMenu();
        menuTabelaRegistroCsosn = new javax.swing.JPanel();
        btDeletarRegistro3 = new rojeru_san.RSButtonRiple();
        btEditarRegistro3 = new rojeru_san.RSButtonRiple();
        popupMenuRegistroCsosn = new javax.swing.JPopupMenu();
        menuTabelaRegistroCrt = new javax.swing.JPanel();
        btDeletarRegistro4 = new rojeru_san.RSButtonRiple();
        btEditarRegistro4 = new rojeru_san.RSButtonRiple();
        popupMenuRegistroCrt = new javax.swing.JPopupMenu();
        menuTabelaRegistroIcms = new javax.swing.JPanel();
        btDeletarRegistro5 = new rojeru_san.RSButtonRiple();
        btEditarRegistro5 = new rojeru_san.RSButtonRiple();
        popupMenuRegistroIcms = new javax.swing.JPopupMenu();
        menuTabelaRegistroIcmsSt = new javax.swing.JPanel();
        btDeletarRegistro6 = new rojeru_san.RSButtonRiple();
        btEditarRegistro6 = new rojeru_san.RSButtonRiple();
        popupMenuRegistroIcmsSt = new javax.swing.JPopupMenu();
        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btSair = new rojeru_san.RSButtonRiple();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        abaCestNcm = new javax.swing.JPanel();
        txtConsultarRegistroCest = new rojerusan.RSMetroTextPlaceHolder();
        jLabel3 = new javax.swing.JLabel();
        btNovoRegistroCest = new rojeru_san.RSButtonRiple();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCest = new rojerusan.RSTableMetro();
        abaOrigemMercadoria = new javax.swing.JPanel();
        btNovoRegistroOrigemMercadoria = new rojeru_san.RSButtonRiple();
        jLabel5 = new javax.swing.JLabel();
        txtConsultarRegistroOrigemMercadoria = new rojerusan.RSMetroTextPlaceHolder();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaOrigemMercadoria = new rojerusan.RSTableMetro();
        abaCST = new javax.swing.JPanel();
        btNovoRegistroCst = new rojeru_san.RSButtonRiple();
        jLabel6 = new javax.swing.JLabel();
        txtConsultarRegistroCst = new rojerusan.RSMetroTextPlaceHolder();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaCst = new rojerusan.RSTableMetro();
        abaCsosn = new javax.swing.JPanel();
        btNovoRegistroCsosn = new rojeru_san.RSButtonRiple();
        jLabel4 = new javax.swing.JLabel();
        txtConsultarRegistroCsosn = new rojerusan.RSMetroTextPlaceHolder();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCsosn = new rojerusan.RSTableMetro();
        abaCrt = new javax.swing.JPanel();
        btNovoRegistroCrt = new rojeru_san.RSButtonRiple();
        jLabel7 = new javax.swing.JLabel();
        txtConsultarRegistroCrt = new rojerusan.RSMetroTextPlaceHolder();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaCrt = new rojerusan.RSTableMetro();
        abaBcIcms = new javax.swing.JPanel();
        btNovoRegistroBcIcms = new rojeru_san.RSButtonRiple();
        jLabel8 = new javax.swing.JLabel();
        txtConsultarRegistroBcIcms = new rojerusan.RSMetroTextPlaceHolder();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaIcms = new rojerusan.RSTableMetro();
        abaBcIcmsSt = new javax.swing.JPanel();
        btNovoRegistroBcIcmsSt = new rojeru_san.RSButtonRiple();
        jLabel9 = new javax.swing.JLabel();
        txtConsultarRegistroBcIcmsSt = new rojerusan.RSMetroTextPlaceHolder();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaIcmsSt = new rojerusan.RSTableMetro();
        abaBcIcmsSt1 = new javax.swing.JPanel();
        btNovoRegistroBcIcmsSt1 = new rojeru_san.RSButtonRiple();
        jLabel10 = new javax.swing.JLabel();
        txtConsultarRegistroBcIcmsSt1 = new rojerusan.RSMetroTextPlaceHolder();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelaIcmsSt1 = new rojerusan.RSTableMetro();
        abaBcIcmsSt2 = new javax.swing.JPanel();
        btNovoRegistroBcIcmsSt2 = new rojeru_san.RSButtonRiple();
        jLabel11 = new javax.swing.JLabel();
        txtConsultarRegistroBcIcmsSt2 = new rojerusan.RSMetroTextPlaceHolder();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabelaIcmsSt2 = new rojerusan.RSTableMetro();
        abaBcIcmsSt3 = new javax.swing.JPanel();
        btNovoRegistroBcIcmsSt3 = new rojeru_san.RSButtonRiple();
        jLabel12 = new javax.swing.JLabel();
        txtConsultarRegistroBcIcmsSt3 = new rojerusan.RSMetroTextPlaceHolder();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabelaIcmsSt3 = new rojerusan.RSTableMetro();

        menuTabelaRegistroCest.setBackground(new java.awt.Color(255, 255, 255));
        menuTabelaRegistroCest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        menuTabelaRegistroCest.add(btDeletarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, -1));

        btEditarRegistro.setBackground(new java.awt.Color(0, 2, 61));
        btEditarRegistro.setBorder(null);
        btEditarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Editar Registro.png"))); // NOI18N
        btEditarRegistro.setText("Editar CEST");
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
        menuTabelaRegistroCest.add(btEditarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, -1));

        btInserirRegistroNcm.setBackground(new java.awt.Color(0, 2, 61));
        btInserirRegistroNcm.setBorder(null);
        btInserirRegistroNcm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Editar Registro.png"))); // NOI18N
        btInserirRegistroNcm.setText("Inserir NCM");
        btInserirRegistroNcm.setToolTipText("Novo Registro");
        btInserirRegistroNcm.setColorHover(new java.awt.Color(1, 6, 167));
        btInserirRegistroNcm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInserirRegistroNcm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btInserirRegistroNcm.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btInserirRegistroNcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirRegistroNcmActionPerformed(evt);
            }
        });
        menuTabelaRegistroCest.add(btInserirRegistroNcm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        menuTabelaRegistroOrigemMercadoria.setBackground(new java.awt.Color(255, 255, 255));
        menuTabelaRegistroOrigemMercadoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btDeletarRegistro1.setBackground(new java.awt.Color(0, 2, 61));
        btDeletarRegistro1.setBorder(null);
        btDeletarRegistro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Remover Registro.png"))); // NOI18N
        btDeletarRegistro1.setText("Deletar Registro");
        btDeletarRegistro1.setToolTipText("Novo Registro");
        btDeletarRegistro1.setColorHover(new java.awt.Color(1, 6, 167));
        btDeletarRegistro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletarRegistro1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDeletarRegistro1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDeletarRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarRegistro1ActionPerformed(evt);
            }
        });
        menuTabelaRegistroOrigemMercadoria.add(btDeletarRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, -1));

        btEditarRegistro1.setBackground(new java.awt.Color(0, 2, 61));
        btEditarRegistro1.setBorder(null);
        btEditarRegistro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Editar Registro.png"))); // NOI18N
        btEditarRegistro1.setText("Editar Registro");
        btEditarRegistro1.setToolTipText("Novo Registro");
        btEditarRegistro1.setColorHover(new java.awt.Color(1, 6, 167));
        btEditarRegistro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditarRegistro1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEditarRegistro1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btEditarRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarRegistro1ActionPerformed(evt);
            }
        });
        menuTabelaRegistroOrigemMercadoria.add(btEditarRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        menuTabelaRegistroCst.setBackground(new java.awt.Color(255, 255, 255));
        menuTabelaRegistroCst.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btDeletarRegistro2.setBackground(new java.awt.Color(0, 2, 61));
        btDeletarRegistro2.setBorder(null);
        btDeletarRegistro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Remover Registro.png"))); // NOI18N
        btDeletarRegistro2.setText("Deletar Registro");
        btDeletarRegistro2.setToolTipText("Novo Registro");
        btDeletarRegistro2.setColorHover(new java.awt.Color(1, 6, 167));
        btDeletarRegistro2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletarRegistro2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDeletarRegistro2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDeletarRegistro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarRegistro2ActionPerformed(evt);
            }
        });
        menuTabelaRegistroCst.add(btDeletarRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, -1));

        btEditarRegistro2.setBackground(new java.awt.Color(0, 2, 61));
        btEditarRegistro2.setBorder(null);
        btEditarRegistro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Editar Registro.png"))); // NOI18N
        btEditarRegistro2.setText("Editar Registro");
        btEditarRegistro2.setToolTipText("Novo Registro");
        btEditarRegistro2.setColorHover(new java.awt.Color(1, 6, 167));
        btEditarRegistro2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditarRegistro2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEditarRegistro2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btEditarRegistro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarRegistro2ActionPerformed(evt);
            }
        });
        menuTabelaRegistroCst.add(btEditarRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        menuTabelaRegistroCsosn.setBackground(new java.awt.Color(255, 255, 255));
        menuTabelaRegistroCsosn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btDeletarRegistro3.setBackground(new java.awt.Color(0, 2, 61));
        btDeletarRegistro3.setBorder(null);
        btDeletarRegistro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Remover Registro.png"))); // NOI18N
        btDeletarRegistro3.setText("Deletar Registro");
        btDeletarRegistro3.setToolTipText("Novo Registro");
        btDeletarRegistro3.setColorHover(new java.awt.Color(1, 6, 167));
        btDeletarRegistro3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletarRegistro3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDeletarRegistro3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDeletarRegistro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarRegistro3ActionPerformed(evt);
            }
        });
        menuTabelaRegistroCsosn.add(btDeletarRegistro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, -1));

        btEditarRegistro3.setBackground(new java.awt.Color(0, 2, 61));
        btEditarRegistro3.setBorder(null);
        btEditarRegistro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Editar Registro.png"))); // NOI18N
        btEditarRegistro3.setText("Editar Registro");
        btEditarRegistro3.setToolTipText("Novo Registro");
        btEditarRegistro3.setColorHover(new java.awt.Color(1, 6, 167));
        btEditarRegistro3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditarRegistro3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEditarRegistro3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btEditarRegistro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarRegistro3ActionPerformed(evt);
            }
        });
        menuTabelaRegistroCsosn.add(btEditarRegistro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        menuTabelaRegistroCrt.setBackground(new java.awt.Color(255, 255, 255));
        menuTabelaRegistroCrt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btDeletarRegistro4.setBackground(new java.awt.Color(0, 2, 61));
        btDeletarRegistro4.setBorder(null);
        btDeletarRegistro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Remover Registro.png"))); // NOI18N
        btDeletarRegistro4.setText("Deletar Registro");
        btDeletarRegistro4.setToolTipText("Novo Registro");
        btDeletarRegistro4.setColorHover(new java.awt.Color(1, 6, 167));
        btDeletarRegistro4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletarRegistro4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDeletarRegistro4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDeletarRegistro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarRegistro4ActionPerformed(evt);
            }
        });
        menuTabelaRegistroCrt.add(btDeletarRegistro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, -1));

        btEditarRegistro4.setBackground(new java.awt.Color(0, 2, 61));
        btEditarRegistro4.setBorder(null);
        btEditarRegistro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Editar Registro.png"))); // NOI18N
        btEditarRegistro4.setText("Editar Registro");
        btEditarRegistro4.setToolTipText("Novo Registro");
        btEditarRegistro4.setColorHover(new java.awt.Color(1, 6, 167));
        btEditarRegistro4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditarRegistro4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEditarRegistro4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btEditarRegistro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarRegistro4ActionPerformed(evt);
            }
        });
        menuTabelaRegistroCrt.add(btEditarRegistro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        menuTabelaRegistroIcms.setBackground(new java.awt.Color(255, 255, 255));
        menuTabelaRegistroIcms.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btDeletarRegistro5.setBackground(new java.awt.Color(0, 2, 61));
        btDeletarRegistro5.setBorder(null);
        btDeletarRegistro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Remover Registro.png"))); // NOI18N
        btDeletarRegistro5.setText("Deletar Registro");
        btDeletarRegistro5.setToolTipText("Novo Registro");
        btDeletarRegistro5.setColorHover(new java.awt.Color(1, 6, 167));
        btDeletarRegistro5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletarRegistro5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDeletarRegistro5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDeletarRegistro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarRegistro5ActionPerformed(evt);
            }
        });
        menuTabelaRegistroIcms.add(btDeletarRegistro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, -1));

        btEditarRegistro5.setBackground(new java.awt.Color(0, 2, 61));
        btEditarRegistro5.setBorder(null);
        btEditarRegistro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Editar Registro.png"))); // NOI18N
        btEditarRegistro5.setText("Editar Registro");
        btEditarRegistro5.setToolTipText("Novo Registro");
        btEditarRegistro5.setColorHover(new java.awt.Color(1, 6, 167));
        btEditarRegistro5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditarRegistro5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEditarRegistro5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btEditarRegistro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarRegistro5ActionPerformed(evt);
            }
        });
        menuTabelaRegistroIcms.add(btEditarRegistro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

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

        btEditarRegistro6.setBackground(new java.awt.Color(0, 2, 61));
        btEditarRegistro6.setBorder(null);
        btEditarRegistro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Editar Registro.png"))); // NOI18N
        btEditarRegistro6.setText("Editar Registro");
        btEditarRegistro6.setToolTipText("Novo Registro");
        btEditarRegistro6.setColorHover(new java.awt.Color(1, 6, 167));
        btEditarRegistro6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEditarRegistro6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEditarRegistro6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btEditarRegistro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarRegistro6ActionPerformed(evt);
            }
        });
        menuTabelaRegistroIcmsSt.add(btEditarRegistro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

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

        abaCestNcm.setBackground(new java.awt.Color(255, 255, 255));
        abaCestNcm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtConsultarRegistroCest.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCest.setToolTipText("Consultas Registros");
        txtConsultarRegistroCest.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCest.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCest.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroCest.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCest.setPlaceholder("Consultar registro");
        txtConsultarRegistroCest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroCestKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        btNovoRegistroCest.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroCest.setBorder(null);
        btNovoRegistroCest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroCest.setText("Novo Registro");
        btNovoRegistroCest.setToolTipText("Novo Registro");
        btNovoRegistroCest.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroCest.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroCest.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroCest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroCestActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaCest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaCest.setAltoHead(30);
        tabelaCest.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaCest.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaCest.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaCest.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaCest.setComponentPopupMenu(popupMenuRegistroCest);
        tabelaCest.setGrosorBordeFilas(0);
        tabelaCest.setGrosorBordeHead(0);
        tabelaCest.getTableHeader().setReorderingAllowed(false);
        tabelaCest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCest);

        javax.swing.GroupLayout abaCestNcmLayout = new javax.swing.GroupLayout(abaCestNcm);
        abaCestNcm.setLayout(abaCestNcmLayout);
        abaCestNcmLayout.setHorizontalGroup(
            abaCestNcmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCestNcmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCestNcmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(abaCestNcmLayout.createSequentialGroup()
                        .addComponent(btNovoRegistroCest, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroCest, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        abaCestNcmLayout.setVerticalGroup(
            abaCestNcmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCestNcmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCestNcmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoRegistroCest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaCestNcmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistroCest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("CEST / NCM", abaCestNcm);

        abaOrigemMercadoria.setBackground(new java.awt.Color(255, 255, 255));

        btNovoRegistroOrigemMercadoria.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroOrigemMercadoria.setBorder(null);
        btNovoRegistroOrigemMercadoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroOrigemMercadoria.setText("Novo Registro");
        btNovoRegistroOrigemMercadoria.setToolTipText("Novo Registro");
        btNovoRegistroOrigemMercadoria.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroOrigemMercadoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroOrigemMercadoria.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroOrigemMercadoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroOrigemMercadoriaActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        txtConsultarRegistroOrigemMercadoria.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroOrigemMercadoria.setToolTipText("Consultas Registros");
        txtConsultarRegistroOrigemMercadoria.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroOrigemMercadoria.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroOrigemMercadoria.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroOrigemMercadoria.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroOrigemMercadoria.setPlaceholder("Consultar registro");
        txtConsultarRegistroOrigemMercadoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroOrigemMercadoriaKeyReleased(evt);
            }
        });

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaOrigemMercadoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaOrigemMercadoria.setAltoHead(30);
        tabelaOrigemMercadoria.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaOrigemMercadoria.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaOrigemMercadoria.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaOrigemMercadoria.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaOrigemMercadoria.setComponentPopupMenu(popupMenuRegistroOrigemMercadoria);
        tabelaOrigemMercadoria.setGrosorBordeFilas(0);
        tabelaOrigemMercadoria.setGrosorBordeHead(0);
        tabelaOrigemMercadoria.getTableHeader().setReorderingAllowed(false);
        tabelaOrigemMercadoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaOrigemMercadoriaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaOrigemMercadoria);

        javax.swing.GroupLayout abaOrigemMercadoriaLayout = new javax.swing.GroupLayout(abaOrigemMercadoria);
        abaOrigemMercadoria.setLayout(abaOrigemMercadoriaLayout);
        abaOrigemMercadoriaLayout.setHorizontalGroup(
            abaOrigemMercadoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaOrigemMercadoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaOrigemMercadoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(abaOrigemMercadoriaLayout.createSequentialGroup()
                        .addComponent(btNovoRegistroOrigemMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroOrigemMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        abaOrigemMercadoriaLayout.setVerticalGroup(
            abaOrigemMercadoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaOrigemMercadoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaOrigemMercadoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoRegistroOrigemMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaOrigemMercadoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistroOrigemMercadoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Origem Mercadoria", abaOrigemMercadoria);

        abaCST.setBackground(new java.awt.Color(255, 255, 255));

        btNovoRegistroCst.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroCst.setBorder(null);
        btNovoRegistroCst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroCst.setText("Novo Registro");
        btNovoRegistroCst.setToolTipText("Novo Registro");
        btNovoRegistroCst.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroCst.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroCst.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroCst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroCstActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        txtConsultarRegistroCst.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCst.setToolTipText("Consultas Registros");
        txtConsultarRegistroCst.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCst.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCst.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroCst.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCst.setPlaceholder("Consultar registro");
        txtConsultarRegistroCst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroCstKeyReleased(evt);
            }
        });

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaCst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaCst.setAltoHead(30);
        tabelaCst.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaCst.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaCst.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaCst.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaCst.setComponentPopupMenu(popupMenuRegistroCst);
        tabelaCst.setGrosorBordeFilas(0);
        tabelaCst.setGrosorBordeHead(0);
        tabelaCst.getTableHeader().setReorderingAllowed(false);
        tabelaCst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCstMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaCst);

        javax.swing.GroupLayout abaCSTLayout = new javax.swing.GroupLayout(abaCST);
        abaCST.setLayout(abaCSTLayout);
        abaCSTLayout.setHorizontalGroup(
            abaCSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCSTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(abaCSTLayout.createSequentialGroup()
                        .addComponent(btNovoRegistroCst, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroCst, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        abaCSTLayout.setVerticalGroup(
            abaCSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCSTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoRegistroCst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaCSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistroCst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("CST", abaCST);

        abaCsosn.setBackground(new java.awt.Color(255, 255, 255));

        btNovoRegistroCsosn.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroCsosn.setBorder(null);
        btNovoRegistroCsosn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroCsosn.setText("Novo Registro");
        btNovoRegistroCsosn.setToolTipText("Novo Registro");
        btNovoRegistroCsosn.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroCsosn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroCsosn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroCsosn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroCsosnActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        txtConsultarRegistroCsosn.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCsosn.setToolTipText("Consultas Registros");
        txtConsultarRegistroCsosn.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCsosn.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCsosn.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroCsosn.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCsosn.setPlaceholder("Consultar registro");
        txtConsultarRegistroCsosn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroCsosnKeyReleased(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaCsosn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaCsosn.setAltoHead(30);
        tabelaCsosn.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaCsosn.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaCsosn.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaCsosn.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaCsosn.setComponentPopupMenu(popupMenuRegistroCsosn);
        tabelaCsosn.setGrosorBordeFilas(0);
        tabelaCsosn.setGrosorBordeHead(0);
        tabelaCsosn.getTableHeader().setReorderingAllowed(false);
        tabelaCsosn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCsosnMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCsosn);

        javax.swing.GroupLayout abaCsosnLayout = new javax.swing.GroupLayout(abaCsosn);
        abaCsosn.setLayout(abaCsosnLayout);
        abaCsosnLayout.setHorizontalGroup(
            abaCsosnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCsosnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCsosnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(abaCsosnLayout.createSequentialGroup()
                        .addComponent(btNovoRegistroCsosn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroCsosn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        abaCsosnLayout.setVerticalGroup(
            abaCsosnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCsosnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCsosnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoRegistroCsosn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaCsosnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistroCsosn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("CSOSN", abaCsosn);

        abaCrt.setBackground(new java.awt.Color(255, 255, 255));

        btNovoRegistroCrt.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroCrt.setBorder(null);
        btNovoRegistroCrt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroCrt.setText("Novo Registro");
        btNovoRegistroCrt.setToolTipText("Novo Registro");
        btNovoRegistroCrt.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroCrt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroCrt.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroCrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroCrtActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        txtConsultarRegistroCrt.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCrt.setToolTipText("Consultas Registros");
        txtConsultarRegistroCrt.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCrt.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCrt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroCrt.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroCrt.setPlaceholder("Consultar registro");
        txtConsultarRegistroCrt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroCrtKeyReleased(evt);
            }
        });

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaCrt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaCrt.setAltoHead(30);
        tabelaCrt.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaCrt.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaCrt.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaCrt.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaCrt.setComponentPopupMenu(popupMenuRegistroCrt);
        tabelaCrt.setGrosorBordeFilas(0);
        tabelaCrt.setGrosorBordeHead(0);
        tabelaCrt.getTableHeader().setReorderingAllowed(false);
        tabelaCrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCrtMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabelaCrt);

        javax.swing.GroupLayout abaCrtLayout = new javax.swing.GroupLayout(abaCrt);
        abaCrt.setLayout(abaCrtLayout);
        abaCrtLayout.setHorizontalGroup(
            abaCrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCrtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5)
                    .addGroup(abaCrtLayout.createSequentialGroup()
                        .addComponent(btNovoRegistroCrt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroCrt, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        abaCrtLayout.setVerticalGroup(
            abaCrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCrtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoRegistroCrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaCrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistroCrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("CRT", abaCrt);

        abaBcIcms.setBackground(new java.awt.Color(255, 255, 255));

        btNovoRegistroBcIcms.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroBcIcms.setBorder(null);
        btNovoRegistroBcIcms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroBcIcms.setText("Novo Registro");
        btNovoRegistroBcIcms.setToolTipText("Novo Registro");
        btNovoRegistroBcIcms.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroBcIcms.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroBcIcms.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroBcIcms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroBcIcmsActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        txtConsultarRegistroBcIcms.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcms.setToolTipText("Consultas Registros");
        txtConsultarRegistroBcIcms.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcms.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcms.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroBcIcms.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcms.setPlaceholder("Consultar registro");
        txtConsultarRegistroBcIcms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroBcIcmsKeyReleased(evt);
            }
        });

        jScrollPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaIcms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaIcms.setAltoHead(30);
        tabelaIcms.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaIcms.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaIcms.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaIcms.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaIcms.setComponentPopupMenu(popupMenuRegistroIcms);
        tabelaIcms.setGrosorBordeFilas(0);
        tabelaIcms.setGrosorBordeHead(0);
        tabelaIcms.getTableHeader().setReorderingAllowed(false);
        tabelaIcms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaIcmsMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabelaIcms);

        javax.swing.GroupLayout abaBcIcmsLayout = new javax.swing.GroupLayout(abaBcIcms);
        abaBcIcms.setLayout(abaBcIcmsLayout);
        abaBcIcmsLayout.setHorizontalGroup(
            abaBcIcmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaBcIcmsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBcIcmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(abaBcIcmsLayout.createSequentialGroup()
                        .addComponent(btNovoRegistroBcIcms, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroBcIcms, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        abaBcIcmsLayout.setVerticalGroup(
            abaBcIcmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBcIcmsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBcIcmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoRegistroBcIcms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaBcIcmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistroBcIcms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("BC ICMS", abaBcIcms);

        abaBcIcmsSt.setBackground(new java.awt.Color(255, 255, 255));

        btNovoRegistroBcIcmsSt.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroBcIcmsSt.setBorder(null);
        btNovoRegistroBcIcmsSt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroBcIcmsSt.setText("Novo Registro");
        btNovoRegistroBcIcmsSt.setToolTipText("Novo Registro");
        btNovoRegistroBcIcmsSt.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroBcIcmsSt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroBcIcmsSt.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroBcIcmsSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroBcIcmsStActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        txtConsultarRegistroBcIcmsSt.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt.setToolTipText("Consultas Registros");
        txtConsultarRegistroBcIcmsSt.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroBcIcmsSt.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt.setPlaceholder("Consultar registro");
        txtConsultarRegistroBcIcmsSt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroBcIcmsStKeyReleased(evt);
            }
        });

        jScrollPane7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaIcmsSt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaIcmsSt.setAltoHead(30);
        tabelaIcmsSt.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaIcmsSt.setComponentPopupMenu(popupMenuRegistroIcmsSt);
        tabelaIcmsSt.setGrosorBordeFilas(0);
        tabelaIcmsSt.setGrosorBordeHead(0);
        tabelaIcmsSt.getTableHeader().setReorderingAllowed(false);
        tabelaIcmsSt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaIcmsStMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tabelaIcmsSt);

        javax.swing.GroupLayout abaBcIcmsStLayout = new javax.swing.GroupLayout(abaBcIcmsSt);
        abaBcIcmsSt.setLayout(abaBcIcmsStLayout);
        abaBcIcmsStLayout.setHorizontalGroup(
            abaBcIcmsStLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaBcIcmsStLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBcIcmsStLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7)
                    .addGroup(abaBcIcmsStLayout.createSequentialGroup()
                        .addComponent(btNovoRegistroBcIcmsSt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroBcIcmsSt, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        abaBcIcmsStLayout.setVerticalGroup(
            abaBcIcmsStLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBcIcmsStLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBcIcmsStLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoRegistroBcIcmsSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaBcIcmsStLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistroBcIcmsSt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("BC ICMS ST", abaBcIcmsSt);

        abaBcIcmsSt1.setBackground(new java.awt.Color(255, 255, 255));

        btNovoRegistroBcIcmsSt1.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroBcIcmsSt1.setBorder(null);
        btNovoRegistroBcIcmsSt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroBcIcmsSt1.setText("Novo Registro");
        btNovoRegistroBcIcmsSt1.setToolTipText("Novo Registro");
        btNovoRegistroBcIcmsSt1.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroBcIcmsSt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroBcIcmsSt1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroBcIcmsSt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroBcIcmsSt1ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        txtConsultarRegistroBcIcmsSt1.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt1.setToolTipText("Consultas Registros");
        txtConsultarRegistroBcIcmsSt1.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt1.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroBcIcmsSt1.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt1.setPlaceholder("Consultar registro");
        txtConsultarRegistroBcIcmsSt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroBcIcmsSt1KeyReleased(evt);
            }
        });

        jScrollPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaIcmsSt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaIcmsSt1.setAltoHead(30);
        tabelaIcmsSt1.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt1.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt1.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt1.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaIcmsSt1.setComponentPopupMenu(popupMenuRegistroIcmsSt);
        tabelaIcmsSt1.setGrosorBordeFilas(0);
        tabelaIcmsSt1.setGrosorBordeHead(0);
        tabelaIcmsSt1.getTableHeader().setReorderingAllowed(false);
        tabelaIcmsSt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaIcmsSt1MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tabelaIcmsSt1);

        javax.swing.GroupLayout abaBcIcmsSt1Layout = new javax.swing.GroupLayout(abaBcIcmsSt1);
        abaBcIcmsSt1.setLayout(abaBcIcmsSt1Layout);
        abaBcIcmsSt1Layout.setHorizontalGroup(
            abaBcIcmsSt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaBcIcmsSt1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBcIcmsSt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8)
                    .addGroup(abaBcIcmsSt1Layout.createSequentialGroup()
                        .addComponent(btNovoRegistroBcIcmsSt1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroBcIcmsSt1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        abaBcIcmsSt1Layout.setVerticalGroup(
            abaBcIcmsSt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBcIcmsSt1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBcIcmsSt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoRegistroBcIcmsSt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaBcIcmsSt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistroBcIcmsSt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Tipo Ambiente NF-e", null, abaBcIcmsSt1, "");

        abaBcIcmsSt2.setBackground(new java.awt.Color(255, 255, 255));

        btNovoRegistroBcIcmsSt2.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroBcIcmsSt2.setBorder(null);
        btNovoRegistroBcIcmsSt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroBcIcmsSt2.setText("Novo Registro");
        btNovoRegistroBcIcmsSt2.setToolTipText("Novo Registro");
        btNovoRegistroBcIcmsSt2.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroBcIcmsSt2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroBcIcmsSt2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroBcIcmsSt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroBcIcmsSt2ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        txtConsultarRegistroBcIcmsSt2.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt2.setToolTipText("Consultas Registros");
        txtConsultarRegistroBcIcmsSt2.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt2.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroBcIcmsSt2.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt2.setPlaceholder("Consultar registro");
        txtConsultarRegistroBcIcmsSt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroBcIcmsSt2KeyReleased(evt);
            }
        });

        jScrollPane9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaIcmsSt2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaIcmsSt2.setAltoHead(30);
        tabelaIcmsSt2.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt2.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt2.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt2.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaIcmsSt2.setComponentPopupMenu(popupMenuRegistroIcmsSt);
        tabelaIcmsSt2.setGrosorBordeFilas(0);
        tabelaIcmsSt2.setGrosorBordeHead(0);
        tabelaIcmsSt2.getTableHeader().setReorderingAllowed(false);
        tabelaIcmsSt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaIcmsSt2MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tabelaIcmsSt2);

        javax.swing.GroupLayout abaBcIcmsSt2Layout = new javax.swing.GroupLayout(abaBcIcmsSt2);
        abaBcIcmsSt2.setLayout(abaBcIcmsSt2Layout);
        abaBcIcmsSt2Layout.setHorizontalGroup(
            abaBcIcmsSt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaBcIcmsSt2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBcIcmsSt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9)
                    .addGroup(abaBcIcmsSt2Layout.createSequentialGroup()
                        .addComponent(btNovoRegistroBcIcmsSt2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroBcIcmsSt2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        abaBcIcmsSt2Layout.setVerticalGroup(
            abaBcIcmsSt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBcIcmsSt2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBcIcmsSt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoRegistroBcIcmsSt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaBcIcmsSt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistroBcIcmsSt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Tipo Ambiente NFC-e", abaBcIcmsSt2);

        abaBcIcmsSt3.setBackground(new java.awt.Color(255, 255, 255));

        btNovoRegistroBcIcmsSt3.setBackground(new java.awt.Color(0, 2, 61));
        btNovoRegistroBcIcmsSt3.setBorder(null);
        btNovoRegistroBcIcmsSt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Novo Registro.png"))); // NOI18N
        btNovoRegistroBcIcmsSt3.setText("Novo Registro");
        btNovoRegistroBcIcmsSt3.setToolTipText("Novo Registro");
        btNovoRegistroBcIcmsSt3.setColorHover(new java.awt.Color(1, 6, 167));
        btNovoRegistroBcIcmsSt3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovoRegistroBcIcmsSt3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btNovoRegistroBcIcmsSt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoRegistroBcIcmsSt3ActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Lupa Consultar.png"))); // NOI18N

        txtConsultarRegistroBcIcmsSt3.setForeground(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt3.setToolTipText("Consultas Registros");
        txtConsultarRegistroBcIcmsSt3.setBorderColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt3.setBotonColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtConsultarRegistroBcIcmsSt3.setPhColor(new java.awt.Color(0, 2, 61));
        txtConsultarRegistroBcIcmsSt3.setPlaceholder("Consultar registro");
        txtConsultarRegistroBcIcmsSt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsultarRegistroBcIcmsSt3KeyReleased(evt);
            }
        });

        jScrollPane10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaIcmsSt3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaIcmsSt3.setAltoHead(30);
        tabelaIcmsSt3.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt3.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt3.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaIcmsSt3.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaIcmsSt3.setComponentPopupMenu(popupMenuRegistroIcmsSt);
        tabelaIcmsSt3.setGrosorBordeFilas(0);
        tabelaIcmsSt3.setGrosorBordeHead(0);
        tabelaIcmsSt3.getTableHeader().setReorderingAllowed(false);
        tabelaIcmsSt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaIcmsSt3MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tabelaIcmsSt3);

        javax.swing.GroupLayout abaBcIcmsSt3Layout = new javax.swing.GroupLayout(abaBcIcmsSt3);
        abaBcIcmsSt3.setLayout(abaBcIcmsSt3Layout);
        abaBcIcmsSt3Layout.setHorizontalGroup(
            abaBcIcmsSt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaBcIcmsSt3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBcIcmsSt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane10)
                    .addGroup(abaBcIcmsSt3Layout.createSequentialGroup()
                        .addComponent(btNovoRegistroBcIcmsSt3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultarRegistroBcIcmsSt3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        abaBcIcmsSt3Layout.setVerticalGroup(
            abaBcIcmsSt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBcIcmsSt3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaBcIcmsSt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btNovoRegistroBcIcmsSt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaBcIcmsSt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtConsultarRegistroBcIcmsSt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Cód Sit Op Simples Nacional", abaBcIcmsSt3);

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

//-------------------------------------- CONSULTAS REGISTROS -----------------------------------
    public void consultarRegistroCest() {

        try {
            Integer.parseInt(txtConsultarRegistroCest.getText());
        } catch (Exception e) {
            num = 0;
        }
        if (num == 0) {
            preencherTabelaCest(" select * from tab_cest where num_cest like '%" + txtConsultarRegistroCest.getText() + "%' and status_cest = 'ativo'");
            num = 1;
        } else {
            if (num == 1) {
                preencherTabelaCest(" select * from tab_cest where num_cest like '%" + txtConsultarRegistroCest.getText() + "%' and status_cest = 'ativo' ");
            }
        }
    }

    public void consultarRegistroOrigemMercadoria() {

        try {
            Integer.parseInt(txtConsultarRegistroOrigemMercadoria.getText());
        } catch (Exception e) {
            num = 0;
        }
        if (num == 0) {
            preencherTabelaOrigemMercadoria(" select * from tab_origem_mercadoria where num_cest like '%" + txtConsultarRegistroOrigemMercadoria.getText() + "%' and status_org_merc = 'ativo'");
            num = 1;
        } else {
            if (num == 1) {
                preencherTabelaOrigemMercadoria(" select * from tab_origem_mercadoria where id_cest like '%" + txtConsultarRegistroOrigemMercadoria.getText() + "%' and status_org_merc = 'ativo' ");
            }
        }
    }

    public void consultarRegistroCsosn() {

        try {
            Integer.parseInt(txtConsultarRegistroCsosn.getText());
        } catch (Exception e) {
            num = 0;
        }
        if (num == 0) {
            preencherTabelaCsosn(" select * from tab_csosn where desc_csosn like '%" + txtConsultarRegistroCsosn.getText() + "%' and status_csosn = 'ativo'");
            num = 1;
        } else {
            if (num == 1) {
                preencherTabelaCsosn(" select * from tab_csosn where id_csosn like '%" + txtConsultarRegistroCsosn.getText() + "%' and status_csosn = 'ativo' ");
            }
        }
    }

    public void consultarRegistroCst() {

        try {
            Integer.parseInt(txtConsultarRegistroCst.getText());
        } catch (Exception e) {
            num = 0;
        }
        if (num == 0) {
            preencherTabelaCst(" select * from tab_cst where desc_cst like '%" + txtConsultarRegistroCst.getText() + "%' and status_cst = 'ativo'");
            num = 1;
        } else {
            if (num == 1) {
                preencherTabelaCst(" select * from tab_cst where id_cst like '%" + txtConsultarRegistroCst.getText() + "%' and status_cst = 'ativo' ");
            }
        }
    }

    public void consultarRegistroCrt() {

        try {
            Integer.parseInt(txtConsultarRegistroCrt.getText());
        } catch (Exception e) {
            num = 0;
        }
        if (num == 0) {
            preencherTabelaCrt(" select * from tab_crt where desc_crt like '%" + txtConsultarRegistroCrt.getText() + "%' and status_crt = 'ativo'");
            num = 1;
        } else {
            if (num == 1) {
                preencherTabelaCrt(" select * from tab_crt where id_crt like '%" + txtConsultarRegistroCrt.getText() + "%' and status_crt = 'ativo' ");
            }
        }
    }

    public void consultarRegistroBcIcms() {

        try {
            Integer.parseInt(txtConsultarRegistroBcIcms.getText());
        } catch (Exception e) {
            num = 0;
        }
        if (num == 0) {
            preencherTabelaBcIcms(" select * from tab_bc_icms where desc_bc_icms like '%" + txtConsultarRegistroBcIcms.getText() + "%' and status_bc_icms = 'ativo'");
            num = 1;
        } else {
            if (num == 1) {
                preencherTabelaBcIcms(" select * from tab_bc_icms where id_bc_icms like '%" + txtConsultarRegistroBcIcms.getText() + "%' and status_bc_icms = 'ativo' ");
            }
        }
    }

    public void consultarRegistroBcIcmsSt() {

        try {
            Integer.parseInt(txtConsultarRegistroBcIcmsSt.getText());
        } catch (Exception e) {
            num = 0;
        }
        if (num == 0) {
            preencherTabelaBcIcmsSt(" select * from tab_bc_icms_st where desc_bc_icms_st like '%" + txtConsultarRegistroBcIcmsSt.getText() + "%' and status_bc_icms_st = 'ativo'");
            num = 1;
        } else {
            if (num == 1) {
                preencherTabelaBcIcmsSt(" select * from tab_bc_icms_st where id_bc_icms_st like '%" + txtConsultarRegistroBcIcmsSt.getText() + "%' and status_bc_icms_st = 'ativo' ");
            }
        }
    }

//-------------------------------------- ATUALIZAÇÕES TABELAS -----------------------------------
    public void atualizaTabelaCest() {

        preencherTabelaCest(" select * from tab_cest where status_cest = 'ativo'");
    }

    public void atualizaTabelaCsosn() {

        preencherTabelaCsosn(" select * from tab_csosn where status_csosn = 'ativo'");
    }

    public void atualizaTabelaOrigemMercadoria() {

        preencherTabelaOrigemMercadoria(" select * from tab_origem_mercadoria where status_org_merc = 'ativo'");
    }

    public void atualizaTabelaCst() {

        preencherTabelaCst(" select * from tab_cst where status_cst = 'ativo'");
    }

    public void atualizaTabelaCrt() {

        preencherTabelaCrt(" select * from tab_crt where status_crt = 'ativo'");
    }

    public void atualizaTabelaIcms() {

        preencherTabelaBcIcms(" select * from tab_bc_icms where status_bc_icms = 'ativo'");
    }

    public void atualizaTabelaIcmsSt() {

        preencherTabelaBcIcmsSt(" select * from tab_bc_icms_st where status_bc_icms_st = 'ativo'");
    }

//-------------------------------------- PREENCHER TABELAS -----------------------------------
    public void preencherTabelaCest(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"CEST"};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("num_cest")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaCest.setModel(modTabela);
        tabelaCest.getColumnModel().getColumn(0).setPreferredWidth(653);
        tabelaCest.getColumnModel().getColumn(0).setResizable(false);
        tabelaCest.getTableHeader().setReorderingAllowed(false);
        tabelaCest.setAutoResizeMode(tabelaCest.AUTO_RESIZE_OFF);
        tabelaCest.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }

    public void preencherTabelaCsosn(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"CSOSN"};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("desc_csosn")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaCsosn.setModel(modTabela);
        tabelaCsosn.getColumnModel().getColumn(0).setPreferredWidth(653);
        tabelaCsosn.getColumnModel().getColumn(0).setResizable(false);
        tabelaCsosn.getTableHeader().setReorderingAllowed(false);
        tabelaCsosn.setAutoResizeMode(tabelaCsosn.AUTO_RESIZE_OFF);
        tabelaCsosn.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }

    public void preencherTabelaOrigemMercadoria(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Origem da Mercadoria"};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("desc_org_merc")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaOrigemMercadoria.setModel(modTabela);
        tabelaOrigemMercadoria.getColumnModel().getColumn(0).setPreferredWidth(653);
        tabelaOrigemMercadoria.getColumnModel().getColumn(0).setResizable(false);
        tabelaOrigemMercadoria.getTableHeader().setReorderingAllowed(false);
        tabelaOrigemMercadoria.setAutoResizeMode(tabelaOrigemMercadoria.AUTO_RESIZE_OFF);
        tabelaOrigemMercadoria.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }

    public void preencherTabelaCst(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"CST"};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("desc_cst")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaCst.setModel(modTabela);
        tabelaCst.getColumnModel().getColumn(0).setPreferredWidth(653);
        tabelaCst.getColumnModel().getColumn(0).setResizable(false);
        tabelaCst.getTableHeader().setReorderingAllowed(false);
        tabelaCst.setAutoResizeMode(RSTableMetro.AUTO_RESIZE_OFF);
        tabelaCst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }

    public void preencherTabelaCrt(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"CRT - Código de Regime Tributário"};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("desc_crt")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaCrt.setModel(modTabela);
        tabelaCrt.getColumnModel().getColumn(0).setPreferredWidth(653);
        tabelaCrt.getColumnModel().getColumn(0).setResizable(false);
        tabelaCrt.getTableHeader().setReorderingAllowed(false);
        tabelaCrt.setAutoResizeMode(tabelaCrt.AUTO_RESIZE_OFF);
        tabelaCrt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }

    public void preencherTabelaBcIcms(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"BC ICMS"};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("desc_bc_icms")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaIcms.setModel(modTabela);
        tabelaIcms.getColumnModel().getColumn(0).setPreferredWidth(653);
        tabelaIcms.getColumnModel().getColumn(0).setResizable(false);
        tabelaIcms.getTableHeader().setReorderingAllowed(false);
        tabelaIcms.setAutoResizeMode(tabelaIcms.AUTO_RESIZE_OFF);
        tabelaIcms.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }

    public void preencherTabelaBcIcmsSt(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"BC ICMS ST"};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("desc_bc_icms_st")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao tentar exibir a permissão:" + ex);
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaIcmsSt.setModel(modTabela);
        tabelaIcmsSt.getColumnModel().getColumn(0).setPreferredWidth(653);
        tabelaIcmsSt.getColumnModel().getColumn(0).setResizable(false);
        tabelaIcmsSt.getTableHeader().setReorderingAllowed(false);
        tabelaIcmsSt.setAutoResizeMode(tabelaIcmsSt.AUTO_RESIZE_OFF);
        tabelaIcmsSt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }

    private void btNovoRegistroCestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroCestActionPerformed

        frmCestRegistrar frmCest = new frmCestRegistrar(null, true, this);
        frmCest.setVisible(true);
    }//GEN-LAST:event_btNovoRegistroCestActionPerformed

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

        String pergunta = "Você deseja deletar o registro:'" + tabelaCest.getValueAt(tabelaCest.getSelectedRow(), 0) + "'";
        int opcao_escolhida = JOptionPane.showConfirmDialog(null, pergunta, "", JOptionPane.YES_NO_OPTION);
        if (opcao_escolhida == JOptionPane.YES_OPTION) {
            String descCest = "" + tabelaCest.getValueAt(tabelaCest.getSelectedRow(), 0);
            crudCest.DesativarCest(descCest, "não ativo");
            atualizaTabelaCest();
        }
    }//GEN-LAST:event_btDeletarRegistroActionPerformed

    public void chamarFormularioAtualizarCest() {

        String descCest = "" + tabelaCest.getValueAt(tabelaCest.getSelectedRow(), 0);
        crudCest.ConsultarCest(descCest);
        desc_Cest = crudCest.getNum_Cest();
        status_Cest = crudCest.getStatus_Cest();
        id_Cest = crudCest.getId_Cest();
        FrmCestAlterar frmCestAlterar = new FrmCestAlterar(null, true, id_Cest, desc_Cest, status_Cest, this);
        frmCestAlterar.setVisible(true);
    }

    private void btEditarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRegistroActionPerformed

        chamarFormularioAtualizarCest();
    }//GEN-LAST:event_btEditarRegistroActionPerformed

    private void tabelaCestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCestMouseClicked

        if (evt.getClickCount() > 1) {
            chamarFormularioAtualizarCest();
        }
    }//GEN-LAST:event_tabelaCestMouseClicked

    private void txtConsultarRegistroCestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroCestKeyReleased

        if (txtConsultarRegistroCest.getText().equals("")) {
            atualizaTabelaCest();
        } else {
            consultarRegistroCest();
        }
    }//GEN-LAST:event_txtConsultarRegistroCestKeyReleased

    private void btNovoRegistroCsosnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroCsosnActionPerformed

        frmCsosnRegistrar frmCsosnRegistrar = new frmCsosnRegistrar(null, true, this);
        frmCsosnRegistrar.setVisible(true);
    }//GEN-LAST:event_btNovoRegistroCsosnActionPerformed

    private void txtConsultarRegistroCsosnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroCsosnKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroCsosnKeyReleased

    private void tabelaCsosnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCsosnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaCsosnMouseClicked

    private void btNovoRegistroOrigemMercadoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroOrigemMercadoriaActionPerformed

        frmOrigemMercadoriaRegistrar frmOrigemMercadoria = new frmOrigemMercadoriaRegistrar(null, true, this);
        frmOrigemMercadoria.setVisible(true);
    }//GEN-LAST:event_btNovoRegistroOrigemMercadoriaActionPerformed

    private void txtConsultarRegistroOrigemMercadoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroOrigemMercadoriaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroOrigemMercadoriaKeyReleased

    private void tabelaOrigemMercadoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaOrigemMercadoriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaOrigemMercadoriaMouseClicked

    private void btNovoRegistroCstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroCstActionPerformed

        frmCstRegistrar frmCstRegistrar = new frmCstRegistrar(null, true, this);
        frmCstRegistrar.setVisible(true);
    }//GEN-LAST:event_btNovoRegistroCstActionPerformed

    private void txtConsultarRegistroCstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroCstKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroCstKeyReleased

    private void tabelaCstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCstMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaCstMouseClicked

    private void btNovoRegistroCrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroCrtActionPerformed

        frmCrtRegistrar frmCrtRegistrar = new frmCrtRegistrar(null, true, this);
        frmCrtRegistrar.setVisible(true);
    }//GEN-LAST:event_btNovoRegistroCrtActionPerformed

    private void txtConsultarRegistroCrtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroCrtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroCrtKeyReleased

    private void tabelaCrtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCrtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaCrtMouseClicked

    private void btNovoRegistroBcIcmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroBcIcmsActionPerformed

        frmBcIcmsRegistrar frmBcIcmsRegistrar = new frmBcIcmsRegistrar(null, true, this);
        frmBcIcmsRegistrar.setVisible(true);
    }//GEN-LAST:event_btNovoRegistroBcIcmsActionPerformed

    private void txtConsultarRegistroBcIcmsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroBcIcmsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroBcIcmsKeyReleased

    private void tabelaIcmsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaIcmsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaIcmsMouseClicked

    private void btNovoRegistroBcIcmsStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroBcIcmsStActionPerformed

        frmBcIcmsStRegistrar frmBcIcmsStRegistrar = new frmBcIcmsStRegistrar(null, true, this);
        frmBcIcmsStRegistrar.setVisible(true);
    }//GEN-LAST:event_btNovoRegistroBcIcmsStActionPerformed

    private void txtConsultarRegistroBcIcmsStKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroBcIcmsStKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroBcIcmsStKeyReleased

    private void tabelaIcmsStMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaIcmsStMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaIcmsStMouseClicked

    private void btDeletarRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarRegistro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarRegistro1ActionPerformed

    private void btEditarRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRegistro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarRegistro1ActionPerformed

    private void btDeletarRegistro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarRegistro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarRegistro2ActionPerformed

    private void btEditarRegistro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRegistro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarRegistro2ActionPerformed

    private void btDeletarRegistro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarRegistro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarRegistro3ActionPerformed

    private void btEditarRegistro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRegistro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarRegistro3ActionPerformed

    private void btDeletarRegistro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarRegistro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarRegistro4ActionPerformed

    private void btEditarRegistro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRegistro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarRegistro4ActionPerformed

    private void btDeletarRegistro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarRegistro5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarRegistro5ActionPerformed

    private void btEditarRegistro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRegistro5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarRegistro5ActionPerformed

    private void btDeletarRegistro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarRegistro6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarRegistro6ActionPerformed

    private void btEditarRegistro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRegistro6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarRegistro6ActionPerformed

    private void btNovoRegistroBcIcmsSt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroBcIcmsSt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovoRegistroBcIcmsSt1ActionPerformed

    private void txtConsultarRegistroBcIcmsSt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroBcIcmsSt1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroBcIcmsSt1KeyReleased

    private void tabelaIcmsSt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaIcmsSt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaIcmsSt1MouseClicked

    private void btNovoRegistroBcIcmsSt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroBcIcmsSt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovoRegistroBcIcmsSt2ActionPerformed

    private void txtConsultarRegistroBcIcmsSt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroBcIcmsSt2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroBcIcmsSt2KeyReleased

    private void tabelaIcmsSt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaIcmsSt2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaIcmsSt2MouseClicked

    private void btNovoRegistroBcIcmsSt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoRegistroBcIcmsSt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovoRegistroBcIcmsSt3ActionPerformed

    private void txtConsultarRegistroBcIcmsSt3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultarRegistroBcIcmsSt3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultarRegistroBcIcmsSt3KeyReleased

    private void tabelaIcmsSt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaIcmsSt3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaIcmsSt3MouseClicked

    private void btInserirRegistroNcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirRegistroNcmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInserirRegistroNcmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaBcIcms;
    private javax.swing.JPanel abaBcIcmsSt;
    private javax.swing.JPanel abaBcIcmsSt1;
    private javax.swing.JPanel abaBcIcmsSt2;
    private javax.swing.JPanel abaBcIcmsSt3;
    private javax.swing.JPanel abaCST;
    private javax.swing.JPanel abaCestNcm;
    private javax.swing.JPanel abaCrt;
    private javax.swing.JPanel abaCsosn;
    private javax.swing.JPanel abaOrigemMercadoria;
    private rojeru_san.RSButtonRiple btDeletarRegistro;
    private rojeru_san.RSButtonRiple btDeletarRegistro1;
    private rojeru_san.RSButtonRiple btDeletarRegistro2;
    private rojeru_san.RSButtonRiple btDeletarRegistro3;
    private rojeru_san.RSButtonRiple btDeletarRegistro4;
    private rojeru_san.RSButtonRiple btDeletarRegistro5;
    private rojeru_san.RSButtonRiple btDeletarRegistro6;
    private rojeru_san.RSButtonRiple btEditarRegistro;
    private rojeru_san.RSButtonRiple btEditarRegistro1;
    private rojeru_san.RSButtonRiple btEditarRegistro2;
    private rojeru_san.RSButtonRiple btEditarRegistro3;
    private rojeru_san.RSButtonRiple btEditarRegistro4;
    private rojeru_san.RSButtonRiple btEditarRegistro5;
    private rojeru_san.RSButtonRiple btEditarRegistro6;
    private rojeru_san.RSButtonRiple btInserirRegistroNcm;
    private rojeru_san.RSButtonRiple btNovoRegistroBcIcms;
    private rojeru_san.RSButtonRiple btNovoRegistroBcIcmsSt;
    private rojeru_san.RSButtonRiple btNovoRegistroBcIcmsSt1;
    private rojeru_san.RSButtonRiple btNovoRegistroBcIcmsSt2;
    private rojeru_san.RSButtonRiple btNovoRegistroBcIcmsSt3;
    private rojeru_san.RSButtonRiple btNovoRegistroCest;
    private rojeru_san.RSButtonRiple btNovoRegistroCrt;
    private rojeru_san.RSButtonRiple btNovoRegistroCsosn;
    private rojeru_san.RSButtonRiple btNovoRegistroCst;
    private rojeru_san.RSButtonRiple btNovoRegistroOrigemMercadoria;
    private rojeru_san.RSButtonRiple btSair;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D evaluatorEllipse2D1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPaneAbas;
    private javax.swing.JPanel menuTabelaRegistroCest;
    private javax.swing.JPanel menuTabelaRegistroCrt;
    private javax.swing.JPanel menuTabelaRegistroCsosn;
    private javax.swing.JPanel menuTabelaRegistroCst;
    private javax.swing.JPanel menuTabelaRegistroIcms;
    private javax.swing.JPanel menuTabelaRegistroIcmsSt;
    private javax.swing.JPanel menuTabelaRegistroOrigemMercadoria;
    private javax.swing.JPopupMenu popupMenuRegistroCest;
    private javax.swing.JPopupMenu popupMenuRegistroCrt;
    private javax.swing.JPopupMenu popupMenuRegistroCsosn;
    private javax.swing.JPopupMenu popupMenuRegistroCst;
    private javax.swing.JPopupMenu popupMenuRegistroIcms;
    private javax.swing.JPopupMenu popupMenuRegistroIcmsSt;
    private javax.swing.JPopupMenu popupMenuRegistroOrigemMercadoria;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojerusan.RSTableMetro tabelaCest;
    private rojerusan.RSTableMetro tabelaCrt;
    private rojerusan.RSTableMetro tabelaCsosn;
    private rojerusan.RSTableMetro tabelaCst;
    private rojerusan.RSTableMetro tabelaIcms;
    private rojerusan.RSTableMetro tabelaIcmsSt;
    private rojerusan.RSTableMetro tabelaIcmsSt1;
    private rojerusan.RSTableMetro tabelaIcmsSt2;
    private rojerusan.RSTableMetro tabelaIcmsSt3;
    private rojerusan.RSTableMetro tabelaOrigemMercadoria;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroBcIcms;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroBcIcmsSt;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroBcIcmsSt1;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroBcIcmsSt2;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroBcIcmsSt3;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroCest;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroCrt;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroCsosn;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroCst;
    private rojerusan.RSMetroTextPlaceHolder txtConsultarRegistroOrigemMercadoria;
    // End of variables declaration//GEN-END:variables
}
