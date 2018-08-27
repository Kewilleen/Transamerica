/*
 * Projeto destribuido por DEVKEWI COMPANY - Todos os direitos reservados.
 * Para alteração do código fonte estará disposto a concordar com termos.
 */
package frigobar.display;

import frigobar.display.cadastro.Cadastrar;
import frigobar.display.cadastro.Cadastros;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JLabel;
import me.kewi.Frigobar;

/**
 *
 * @author DEVKEWI COMPANY - Kewilleen
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setTitle("Menu Principal - Frigobar");
        setLocationRelativeTo(null);
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/frigobar/imagens/Icon/logo16x16.png"));
        setIconImage(img);
        Frigobar.getValidation().minimizar(this);
    }

    public JLabel getInfo() {
        return lInfo;
    }

        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lBemVindo = new javax.swing.JLabel();
        bCadastrar = new javax.swing.JButton();
        lInfo = new javax.swing.JLabel();
        bVer = new javax.swing.JButton();
        bValidade = new javax.swing.JButton();
        jMenu = new javax.swing.JMenuBar();
        jMenuConfig = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lBemVindo.setText("Bem vindo(a),");

        bCadastrar.setText("Cadastrar");
        bCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCadastrarMouseClicked(evt);
            }
        });

        lInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lInfo.setText("Nenhum item cadastrado ainda");

        bVer.setText("Cadastrados");
        bVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVerMouseClicked(evt);
            }
        });

        bValidade.setText("Validades");
        bValidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bValidadeMouseClicked(evt);
            }
        });

        jMenuConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frigobar/imagens/Icon/config16x16.png"))); // NOI18N
        jMenuConfig.setText("Configurações");
        jMenu.add(jMenuConfig);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(lBemVindo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCadastrar)
                .addGap(18, 18, 18)
                .addComponent(bVer)
                .addGap(18, 18, 18)
                .addComponent(bValidade)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadastrar)
                    .addComponent(bVer)
                    .addComponent(bValidade))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadastrarMouseClicked
        this.setVisible(false);
        Cadastrar c = new Cadastrar();
        c.setVisible(true);
    }//GEN-LAST:event_bCadastrarMouseClicked

    private void bValidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bValidadeMouseClicked
        this.setVisible(false);
        frigobar.display.validade.Validation v = new me.kewi.Frigobar().getValidationDisplay();
        v.setVisible(true);
        v.setVisibled(true);
    }//GEN-LAST:event_bValidadeMouseClicked

    private void bVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVerMouseClicked
        if (lInfo.getText().equalsIgnoreCase("Nenhum item cadastrado ainda")) {
            Frigobar.sendInfo(2, "Não há produto cadastrado para visualização", "Sem produtos");
            return;
        }
        this.setVisible(false);
        Cadastros c = Frigobar.getValidation().getCadastros();
        c.setVisible(true);
    }//GEN-LAST:event_bVerMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bValidade;
    private javax.swing.JButton bVer;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenuConfig;
    private javax.swing.JLabel lBemVindo;
    private javax.swing.JLabel lInfo;
    // End of variables declaration//GEN-END:variables
}
