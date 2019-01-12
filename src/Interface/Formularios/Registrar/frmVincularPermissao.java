package Interface.Formularios.Registrar;

import Banco.CRUD.crudPermissao;
import Banco.Conexao.ConectaBanco;
import Funcoes.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;

public class frmVincularPermissao extends javax.swing.JDialog {

    crudPermissao crudPrm = new crudPermissao();
    ConectaBanco conBanco = new ConectaBanco();
    int xx, yy, idPrm;
    String descPrm;

    public frmVincularPermissao(java.awt.Frame parent, boolean modal, String desc_Prm, String status, int IdPrm) {

        super(parent, modal);
        initComponents();
        txtDescricaoPermissao.requestFocus();
        preencherCampos(desc_Prm, IdPrm);
        atualizaTabelaFormulariosAPermitir();
        atualizaTabelaFormulariosPermitidos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evaluatorEllipse2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D();
        rSLabelVerticalD1 = new rojerusan.RSLabelVerticalD();
        rSLabelVerticalD2 = new rojerusan.RSLabelVerticalD();
        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btSair = new rojeru_san.RSButtonRiple();
        jLabel2 = new javax.swing.JLabel();
        btCancelarRegistro = new rojeru_san.RSButtonRiple();
        txtDescricaoPermissao = new rojerusan.RSMetroTextPlaceHolder();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFormulariosAPermitir = new rojerusan.RSTableMetro();
        btLiberarPermissaoFormulario = new rojeru_san.RSButtonRiple();
        btDesabilitarPermissaoFormulario = new rojeru_san.RSButtonRiple();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFormulariosPermitidos = new rojerusan.RSTableMetro();

        rSLabelVerticalD1.setText("rSLabelVerticalD1");

        rSLabelVerticalD2.setText("rSLabelVerticalD2");

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

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Vincular Permissões");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addGap(14, 14, 14)
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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btCancelarRegistro.setBackground(new java.awt.Color(0, 2, 61));
        btCancelarRegistro.setBorder(null);
        btCancelarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Finalizar.png"))); // NOI18N
        btCancelarRegistro.setText("Finalizar");
        btCancelarRegistro.setToolTipText("Cancelar Registro");
        btCancelarRegistro.setColorHover(new java.awt.Color(0, 204, 102));
        btCancelarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCancelarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarRegistroActionPerformed(evt);
            }
        });

        txtDescricaoPermissao.setForeground(new java.awt.Color(0, 2, 61));
        txtDescricaoPermissao.setBorderColor(new java.awt.Color(0, 2, 61));
        txtDescricaoPermissao.setBotonColor(new java.awt.Color(0, 2, 61));
        txtDescricaoPermissao.setDisabledTextColor(new java.awt.Color(0, 2, 61));
        txtDescricaoPermissao.setEnabled(false);
        txtDescricaoPermissao.setPhColor(new java.awt.Color(0, 2, 61));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaFormulariosAPermitir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaFormulariosAPermitir.setAltoHead(30);
        tabelaFormulariosAPermitir.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaFormulariosAPermitir.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tabelaFormulariosAPermitir.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaFormulariosAPermitir.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaFormulariosAPermitir.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaFormulariosAPermitir.setGrosorBordeFilas(0);
        tabelaFormulariosAPermitir.setGrosorBordeHead(0);
        tabelaFormulariosAPermitir.getTableHeader().setReorderingAllowed(false);
        tabelaFormulariosAPermitir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFormulariosAPermitirMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaFormulariosAPermitir);

        btLiberarPermissaoFormulario.setBackground(new java.awt.Color(255, 255, 255));
        btLiberarPermissaoFormulario.setBorder(null);
        btLiberarPermissaoFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Direita.png"))); // NOI18N
        btLiberarPermissaoFormulario.setToolTipText("");
        btLiberarPermissaoFormulario.setColorHover(new java.awt.Color(204, 204, 255));
        btLiberarPermissaoFormulario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btLiberarPermissaoFormulario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btLiberarPermissaoFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLiberarPermissaoFormularioActionPerformed(evt);
            }
        });

        btDesabilitarPermissaoFormulario.setBackground(new java.awt.Color(255, 255, 255));
        btDesabilitarPermissaoFormulario.setBorder(null);
        btDesabilitarPermissaoFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Esquerda.png"))); // NOI18N
        btDesabilitarPermissaoFormulario.setToolTipText("");
        btDesabilitarPermissaoFormulario.setColorHover(new java.awt.Color(204, 204, 255));
        btDesabilitarPermissaoFormulario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDesabilitarPermissaoFormulario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btDesabilitarPermissaoFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesabilitarPermissaoFormularioActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 2, 61), 2));

        tabelaFormulariosPermitidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaFormulariosPermitidos.setAltoHead(30);
        tabelaFormulariosPermitidos.setColorBackgoundHead(new java.awt.Color(0, 2, 61));
        tabelaFormulariosPermitidos.setColorFilasForeground1(new java.awt.Color(0, 2, 61));
        tabelaFormulariosPermitidos.setColorFilasForeground2(new java.awt.Color(0, 2, 61));
        tabelaFormulariosPermitidos.setColorSelBackgound(new java.awt.Color(1, 6, 167));
        tabelaFormulariosPermitidos.setGrosorBordeFilas(0);
        tabelaFormulariosPermitidos.setGrosorBordeHead(0);
        tabelaFormulariosPermitidos.getTableHeader().setReorderingAllowed(false);
        tabelaFormulariosPermitidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFormulariosPermitidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFormulariosPermitidos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(btCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDescricaoPermissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLiberarPermissaoFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btDesabilitarPermissaoFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDescricaoPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btLiberarPermissaoFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btDesabilitarPermissaoFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rSPanelShadow1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limpaCampos() {

        txtDescricaoPermissao.setText("");
    }

    public void preencherCampos(String desc_crudPrm, int id_Prm) {

        txtDescricaoPermissao.setText(desc_crudPrm);
        idPrm = id_Prm;
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

    public void atualizaTabelaFormulariosAPermitir() {

        preencherTabelaFormulariosAPermitir(" select * from tab_formulario frm where not exists (select * from tab_itens_permissao iPrm where frm.id_frm = iPrm.id_frm and iPrm.status_it_prm = 'ativo' and iPrm.id_prm ='" + idPrm + "')");
    }

    public void atualizaTabelaFormulariosPermitidos() {

        preencherTabelaFormulariosPermitidos(" select * from vw_item_permissao where id_prm = '" + idPrm + "' and status_it_prm = 'ativo'");
    }

    public void preencherTabelaFormulariosAPermitir(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Formulários à permitir"};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("desc_frm")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaFormulariosAPermitir.setModel(modTabela);
        tabelaFormulariosAPermitir.getColumnModel().getColumn(0).setPreferredWidth(235);
        tabelaFormulariosAPermitir.getColumnModel().getColumn(0).setResizable(false);
        tabelaFormulariosAPermitir.getTableHeader().setReorderingAllowed(false);
        tabelaFormulariosAPermitir.setAutoResizeMode(tabelaFormulariosAPermitir.AUTO_RESIZE_OFF);
        tabelaFormulariosAPermitir.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }

    public void preencherTabelaFormulariosPermitidos(String SQL) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Formulários permitidos"};
        conBanco.conexao();
        conBanco.executaSQL(SQL);
        try {
            conBanco.rs.first();
            do {
                dados.add(new Object[]{conBanco.rs.getString("desc_frm")});
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
        }
        ModeloTabela modTabela = new ModeloTabela(dados, Colunas);
        tabelaFormulariosPermitidos.setModel(modTabela);
        tabelaFormulariosPermitidos.getColumnModel().getColumn(0).setPreferredWidth(235);
        tabelaFormulariosPermitidos.getColumnModel().getColumn(0).setResizable(false);
        tabelaFormulariosPermitidos.getTableHeader().setReorderingAllowed(false);
        tabelaFormulariosPermitidos.setAutoResizeMode(tabelaFormulariosPermitidos.AUTO_RESIZE_OFF);
        tabelaFormulariosPermitidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conBanco.desconecta();
    }

    public void verificarRegistro() {

        conBanco.conexao();
        conBanco.executaSQL("Select * from tab_permissao where desc_prm ='" + txtDescricaoPermissao.getText() + "'");
        try {
            conBanco.rs.first();
            descPrm = conBanco.rs.getString("desc_prm");
        } catch (SQLException ex) {
        }
        conBanco.desconecta();
    }


    private void btCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarRegistroActionPerformed

        dispose();
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

    private void tabelaFormulariosAPermitirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFormulariosAPermitirMouseClicked

        if (evt.getClickCount() > 1) {
            String mensagem;
            String descForm = "" + tabelaFormulariosAPermitir.getValueAt(tabelaFormulariosAPermitir.getSelectedRow(), 0);
            crudPrm.ConsultarItemPermitido(idPrm, descForm);
            mensagem = crudPrm.getMensagem();
            if (mensagem.equals("registro inexistente")) {
                liberarPermissao();
            } else {
                reabilitarPermissao();
            }
        }
    }//GEN-LAST:event_tabelaFormulariosAPermitirMouseClicked

    public void liberarPermissao() {

        String descForm = "" + tabelaFormulariosAPermitir.getValueAt(tabelaFormulariosAPermitir.getSelectedRow(), 0);
        crudPrm.InserirItemPermissao(idPrm, descForm, "ativo");
        atualizaTabelaFormulariosAPermitir();
        atualizaTabelaFormulariosPermitidos();
    }

    public void desabilitarPermissao() {

        String descForm = "" + tabelaFormulariosPermitidos.getValueAt(tabelaFormulariosPermitidos.getSelectedRow(), 0);
        crudPrm.DesabilitarFormularioPermitido(idPrm, descForm);
        atualizaTabelaFormulariosAPermitir();
        atualizaTabelaFormulariosPermitidos();
    }

    public void reabilitarPermissao() {

        String descForm = "" + tabelaFormulariosAPermitir.getValueAt(tabelaFormulariosAPermitir.getSelectedRow(), 0);
        crudPrm.ReabilitarFormularioPermitido(idPrm, descForm);
        atualizaTabelaFormulariosAPermitir();
        atualizaTabelaFormulariosPermitidos();
    }

    private void btLiberarPermissaoFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLiberarPermissaoFormularioActionPerformed

        String mensagem;
        String descForm = "" + tabelaFormulariosAPermitir.getValueAt(tabelaFormulariosAPermitir.getSelectedRow(), 0);
        crudPrm.ConsultarItemPermitido(idPrm, descForm);
        mensagem = crudPrm.getMensagem();
        if (mensagem .equals("registro inexistente")) {
            liberarPermissao();
        } else {
            reabilitarPermissao();
        }
    }//GEN-LAST:event_btLiberarPermissaoFormularioActionPerformed

    private void btDesabilitarPermissaoFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesabilitarPermissaoFormularioActionPerformed

        desabilitarPermissao();
    }//GEN-LAST:event_btDesabilitarPermissaoFormularioActionPerformed

    private void tabelaFormulariosPermitidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFormulariosPermitidosMouseClicked

        if (evt.getClickCount() > 1) {
            desabilitarPermissao();
        }
    }//GEN-LAST:event_tabelaFormulariosPermitidosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btCancelarRegistro;
    private rojeru_san.RSButtonRiple btDesabilitarPermissaoFormulario;
    private rojeru_san.RSButtonRiple btLiberarPermissaoFormulario;
    private rojeru_san.RSButtonRiple btSair;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D evaluatorEllipse2D1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSLabelVerticalD rSLabelVerticalD1;
    private rojerusan.RSLabelVerticalD rSLabelVerticalD2;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojerusan.RSTableMetro tabelaFormulariosAPermitir;
    private rojerusan.RSTableMetro tabelaFormulariosPermitidos;
    private rojerusan.RSMetroTextPlaceHolder txtDescricaoPermissao;
    // End of variables declaration//GEN-END:variables
}
