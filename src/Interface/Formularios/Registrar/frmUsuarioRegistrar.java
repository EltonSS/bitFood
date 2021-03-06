package Interface.Formularios.Registrar;

import Banco.CRUD.crudUsuario;
import Interface.Formularios.frmUsuario;
import Banco.Conexao.ConectaBanco;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class frmUsuarioRegistrar extends javax.swing.JDialog {

    private final JDialog parente;
    crudUsuario crudUsu = new crudUsuario();
    ConectaBanco conBanco = new ConectaBanco();
    int xx, yy;
    String nome_Usu, login_Usu;

    public frmUsuarioRegistrar(java.awt.Frame parent, boolean modal, JDialog p) {

        super(parent, modal);
        initComponents();
        txtNomeUsuario.requestFocus();
        this.parente = p;
        cbFuncaoUsuario();
        cbPermissaoUsuario();
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
        jLabel1 = new javax.swing.JLabel();
        btSair = new rojeru_san.RSButtonRiple();
        btSalvarRegistro = new rojeru_san.RSButtonRiple();
        btCancelarRegistro = new rojeru_san.RSButtonRiple();
        txtNomeUsuario = new rojerusan.RSMetroTextPlaceHolder();
        txtLoginAcessoUsuario = new rojerusan.RSMetroTextPlaceHolder();
        txtPwdAcessoUsuario = new rojerusan.RSPasswordTextPlaceHolder();
        cbPermissaoUsuario = new rojerusan.RSComboMetro();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbFuncaoUsuario = new rojerusan.RSComboMetro();

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
        jLabel1.setText("Cadastrar Usuário");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btSalvarRegistro.setBackground(new java.awt.Color(0, 2, 61));
        btSalvarRegistro.setBorder(null);
        btSalvarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Salvar Registro.png"))); // NOI18N
        btSalvarRegistro.setText("Salvar Registro");
        btSalvarRegistro.setToolTipText("Salvar Registro");
        btSalvarRegistro.setColorHover(new java.awt.Color(0, 153, 51));
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
        btCancelarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCancelarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarRegistroActionPerformed(evt);
            }
        });

        txtNomeUsuario.setForeground(new java.awt.Color(0, 2, 61));
        txtNomeUsuario.setToolTipText("Digite o nome completo do usuário");
        txtNomeUsuario.setBorderColor(new java.awt.Color(0, 2, 61));
        txtNomeUsuario.setBotonColor(new java.awt.Color(0, 2, 61));
        txtNomeUsuario.setPhColor(new java.awt.Color(0, 2, 61));
        txtNomeUsuario.setPlaceholder("Digite o nome do usuário");
        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });

        txtLoginAcessoUsuario.setForeground(new java.awt.Color(0, 2, 61));
        txtLoginAcessoUsuario.setToolTipText("Digite o login do usuário");
        txtLoginAcessoUsuario.setBorderColor(new java.awt.Color(0, 2, 61));
        txtLoginAcessoUsuario.setBotonColor(new java.awt.Color(0, 2, 61));
        txtLoginAcessoUsuario.setPhColor(new java.awt.Color(0, 2, 61));
        txtLoginAcessoUsuario.setPlaceholder("Digite o login de acesso");
        txtLoginAcessoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginAcessoUsuarioActionPerformed(evt);
            }
        });

        txtPwdAcessoUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 2, 61)));
        txtPwdAcessoUsuario.setForeground(new java.awt.Color(0, 2, 61));
        txtPwdAcessoUsuario.setToolTipText("Digite a senha do usuário");
        txtPwdAcessoUsuario.setSelectionColor(new java.awt.Color(0, 2, 61));

        cbPermissaoUsuario.setToolTipText("Escolha a permissão do usuário");
        cbPermissaoUsuario.setColorArrow(new java.awt.Color(0, 2, 61));
        cbPermissaoUsuario.setColorBorde(new java.awt.Color(0, 2, 61));
        cbPermissaoUsuario.setColorFondo(new java.awt.Color(0, 2, 61));
        cbPermissaoUsuario.setFocusCycleRoot(true);
        cbPermissaoUsuario.setFocusTraversalPolicyProvider(true);
        cbPermissaoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Senha.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Chave Permissao.png"))); // NOI18N

        cbFuncaoUsuario.setToolTipText("Escolha a permissão do usuário");
        cbFuncaoUsuario.setColorArrow(new java.awt.Color(0, 2, 61));
        cbFuncaoUsuario.setColorBorde(new java.awt.Color(0, 2, 61));
        cbFuncaoUsuario.setColorFondo(new java.awt.Color(0, 2, 61));
        cbFuncaoUsuario.setFocusCycleRoot(true);
        cbFuncaoUsuario.setFocusTraversalPolicyProvider(true);
        cbFuncaoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLoginAcessoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 114, Short.MAX_VALUE)
                        .addComponent(btSalvarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbFuncaoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPwdAcessoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPermissaoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFuncaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLoginAcessoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPwdAcessoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPermissaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        rSPanelShadow1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void cbFuncaoUsuario() {

        cbFuncaoUsuario.removeAllItems();
        cbFuncaoUsuario.addItem("Escolha a função do usuário");
        try {
            conBanco.conexao();
            conBanco.executaSQL("select * from tab_funcao");
            conBanco.rs.first();
            do {
                cbFuncaoUsuario.addItem(conBanco.rs.getString("desc_func"));
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
        }
        conBanco.desconecta();
    }

    public void cbPermissaoUsuario() {

        cbPermissaoUsuario.removeAllItems();
        cbPermissaoUsuario.addItem("Escolha a permissão do usuário");
        try {
            conBanco.conexao();
            conBanco.executaSQL("select * from tab_permissao where status_prm ='ativo'");
            conBanco.rs.first();
            do {
                cbPermissaoUsuario.addItem(conBanco.rs.getString("desc_prm"));
            } while (conBanco.rs.next());
        } catch (SQLException ex) {
        }
        conBanco.desconecta();
    }

    public void limpaCampos() {

        txtNomeUsuario.setText("");
        cbFuncaoUsuario();
        txtLoginAcessoUsuario.setText("");
        txtPwdAcessoUsuario.setText("");
        cbPermissaoUsuario();
    }

    public void atualizaTabela() {

        frmUsuario frmUsu = (frmUsuario) parente;
        frmUsu.atualizaTabela();
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
        conBanco.executaSQL("Select * from tab_usuario where nome_usu ='" + txtNomeUsuario.getText() + "'");
        try {
            conBanco.rs.first();
            nome_Usu = conBanco.rs.getString("nome_usu");
            login_Usu = conBanco.rs.getString("login_usu");
        } catch (SQLException ex) {
        }
        conBanco.desconecta();
    }

    public void salvarRegistro() {

        if (txtNomeUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite o nome do usuário!!");
            txtNomeUsuario.requestFocus();
        } else {
            if (cbFuncaoUsuario.getSelectedItem().equals("Escolha a função do usuário")) {
                JOptionPane.showMessageDialog(rootPane, "Escolha a função do usuário!!");
                cbFuncaoUsuario.requestFocus();
            } else {
                if (txtLoginAcessoUsuario.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Digite o login do usuário!!");
                    txtLoginAcessoUsuario.requestFocus();
                } else {
                    if (txtPwdAcessoUsuario.getText().equals("")) {
                        JOptionPane.showMessageDialog(rootPane, "Digite a senha do usuário!!");
                        txtPwdAcessoUsuario.requestFocus();
                    } else {
                        if (cbPermissaoUsuario.getSelectedItem().equals("Escolha a permissão do usuário")) {
                            JOptionPane.showMessageDialog(rootPane, "Escolha a permissão do usuário!!");
                            cbPermissaoUsuario.requestFocus();
                        } else {
                            verificarRegistro();
                            if (txtNomeUsuario.getText().equals((String) nome_Usu)) {
                                JOptionPane.showMessageDialog(rootPane, "Já existe " + txtNomeUsuario.getText() + " cadastrado no sistema!!");
                            } else {
                                if (txtLoginAcessoUsuario.getText().equals((String) login_Usu)) {
                                    JOptionPane.showMessageDialog(rootPane, "Esse login já está cadastro no sistema, por favor digite outro login válido!! ");
                                    txtLoginAcessoUsuario.requestDefaultFocus();
                                } else {
                                    crudUsu.InserirUsuario(txtNomeUsuario.getText(), txtLoginAcessoUsuario.getText(),
                                            txtPwdAcessoUsuario.getText(), (String) cbPermissaoUsuario.getSelectedItem(),
                                            (String) cbFuncaoUsuario.getSelectedItem(), "ativo");
                                    limpaCampos();
                                    atualizaTabela();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void btSalvarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarRegistroActionPerformed

        salvarRegistro();
    }//GEN-LAST:event_btSalvarRegistroActionPerformed

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

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed

        salvarRegistro();
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void txtLoginAcessoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginAcessoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginAcessoUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btCancelarRegistro;
    private rojeru_san.RSButtonRiple btSair;
    private rojeru_san.RSButtonRiple btSalvarRegistro;
    private rojerusan.RSComboMetro cbFuncaoUsuario;
    private rojerusan.RSComboMetro cbPermissaoUsuario;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D evaluatorEllipse2D1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSLabelVerticalD rSLabelVerticalD1;
    private rojerusan.RSLabelVerticalD rSLabelVerticalD2;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojerusan.RSMetroTextPlaceHolder txtLoginAcessoUsuario;
    private rojerusan.RSMetroTextPlaceHolder txtNomeUsuario;
    private rojerusan.RSPasswordTextPlaceHolder txtPwdAcessoUsuario;
    // End of variables declaration//GEN-END:variables
}
