package Interface.Formularios.Alterar;

import Banco.CRUD.crudCrt;
import javax.swing.JOptionPane;
import Banco.Conexao.ConectaBanco;
import Interface.Formularios.frmTributos;
import java.sql.SQLException;
import javax.swing.JDialog;

public class FrmCrtAlterar extends javax.swing.JDialog {

    private final JDialog parente;
    crudCrt crudCrt = new crudCrt();
    ConectaBanco conBanco = new ConectaBanco();
    int xx, yy, id_Crt;
    String desc_Crt, status_Crt;

    public FrmCrtAlterar(java.awt.Frame parent, boolean modal, int idCrt, String descCrt, String statusCrt, JDialog p) {

        super(parent, modal);
        initComponents();
        this.parente = p;
        txtDescCrt.requestFocus();
        preencherCampos(idCrt, descCrt, statusCrt);
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
        btAlterarRegistro = new rojeru_san.RSButtonRiple();
        btCancelarRegistro = new rojeru_san.RSButtonRiple();
        chkStatus = new javax.swing.JCheckBox();
        txtDescCrt = new rojerusan.RSMetroTextPlaceHolder();

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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Alterar CRT");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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

        btAlterarRegistro.setBackground(new java.awt.Color(0, 2, 61));
        btAlterarRegistro.setBorder(null);
        btAlterarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/BotoesFormularios/Salvar Registro.png"))); // NOI18N
        btAlterarRegistro.setText("Alterar Registro");
        btAlterarRegistro.setToolTipText("Salvar Registro");
        btAlterarRegistro.setColorHover(new java.awt.Color(0, 153, 51));
        btAlterarRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btAlterarRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btAlterarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarRegistroActionPerformed(evt);
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

        chkStatus.setBackground(new java.awt.Color(255, 255, 255));
        chkStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkStatus.setForeground(new java.awt.Color(0, 2, 61));
        chkStatus.setText("Ativo");
        chkStatus.setToolTipText("");
        chkStatus.setAutoscrolls(true);
        chkStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkStatusActionPerformed(evt);
            }
        });

        txtDescCrt.setForeground(new java.awt.Color(0, 2, 61));
        txtDescCrt.setToolTipText("Digite a descrição do CRT");
        txtDescCrt.setBorderColor(new java.awt.Color(0, 2, 61));
        txtDescCrt.setBotonColor(new java.awt.Color(0, 2, 61));
        txtDescCrt.setPhColor(new java.awt.Color(0, 2, 61));
        txtDescCrt.setPlaceholder("Digite a descrição do CRT");
        txtDescCrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescCrtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescCrt, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btAlterarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkStatus))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(chkStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescCrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        txtDescCrt.getAccessibleContext().setAccessibleName("");

        rSPanelShadow1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 240));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaTabela() {

        frmTributos frmCrt = (frmTributos) parente;
        frmCrt.atualizaTabelaCrt();
    }

    public void preencherCampos(int idCrt, String descCrt, String statusCrt) {

        id_Crt = idCrt;
        txtDescCrt.setText(descCrt);
        if (statusCrt.equals("ativo")) {
            status_Crt = statusCrt;
            chkStatus.setSelected(true);
        } else {
            chkStatus.setSelected(false);
        }
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
        conBanco.executaSQL("Select * from tab_crt where desc_crt ='" + txtDescCrt.getText() + "'");
        try {
            conBanco.rs.first();
            desc_Crt = conBanco.rs.getString("desc_crt");
        } catch (SQLException ex) {
        }
        conBanco.desconecta();
    }

    public void atualizarRegistro() {

        if (txtDescCrt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite a descrição do CRT!!");
            txtDescCrt.requestFocus();
        } else {
            verificarRegistro();
            if (txtDescCrt.getText().equals((String) desc_Crt)) {
                JOptionPane.showMessageDialog(rootPane, "Não é possível realizar essa alteração pois já existe esse nome registrado no sistema!!");
            txtDescCrt.requestFocus();
            } else {
                crudCrt.AlterarCrt(id_Crt, txtDescCrt.getText(), status_Crt);
                atualizaTabela();
                dispose();
            }
        }
    }

    private void btAlterarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarRegistroActionPerformed

        atualizarRegistro();
    }//GEN-LAST:event_btAlterarRegistroActionPerformed

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

    private void chkStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkStatusActionPerformed

        if (!chkStatus.isSelected()) {
            status_Crt = "não ativo";
        } else {
            status_Crt = "ativo";
        }
    }//GEN-LAST:event_chkStatusActionPerformed

    private void txtDescCrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescCrtActionPerformed

        atualizarRegistro();
    }//GEN-LAST:event_txtDescCrtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btAlterarRegistro;
    private rojeru_san.RSButtonRiple btCancelarRegistro;
    private rojeru_san.RSButtonRiple btSair;
    private javax.swing.JCheckBox chkStatus;
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorEllipse2D evaluatorEllipse2D1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSLabelVerticalD rSLabelVerticalD1;
    private rojerusan.RSLabelVerticalD rSLabelVerticalD2;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojerusan.RSMetroTextPlaceHolder txtDescCrt;
    // End of variables declaration//GEN-END:variables
}
