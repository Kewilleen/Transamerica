/*
 * Projeto destribuido por DEVKEWI COMPANY - Todos os direitos reservados.
 * Para alteração do código fonte estará disposto a concordar com termos.
 */
package frigobar.display.validade;

import frigobar.display.Menu;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import me.kewi.Frigobar;

/**
 *
 * @author DEVKEWI COMPANY - Kewilleen
 */
public class Editar extends javax.swing.JFrame {

    private frigobar.manager.Validation v = Frigobar.getValidation();
    private Menu m = v.getMenu();

    /**
     * Creates new form Editar
     */
    public Editar() {
        initComponents();
        Frigobar.getValidation().minimizar(this);
        setTitle("Editar validade");
        setLocationRelativeTo(null);
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/frigobar/imagens/Icon/logo16x16.png"));
        setIconImage(img);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lId = new javax.swing.JLabel();
        bPesquisar = new javax.swing.JButton();
        tID = new javax.swing.JTextField();
        bMenuBar = new javax.swing.JMenuBar();
        bMenu = new javax.swing.JMenu();
        bVoltar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lId.setText("Digite o ID do produto que deseja editar");

        bPesquisar.setText("Pesquisar");
        bPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bPesquisarMouseClicked(evt);
            }
        });

        tID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frigobar/imagens/Icon/home16x16.png"))); // NOI18N
        bMenu.setText("Menu");
        bMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMenuMouseClicked(evt);
            }
        });
        bMenuBar.add(bMenu);

        bVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frigobar/imagens/Icon/back16x16.png"))); // NOI18N
        bVoltar.setText("Voltar");
        bVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVoltarMouseClicked(evt);
            }
        });
        bMenuBar.add(bVoltar);

        setJMenuBar(bMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bPesquisar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMenuMouseClicked
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_bMenuMouseClicked

    private void bVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseClicked
        Validation display = this.v.getValidation();
        this.setVisible(false);
        display.setVisible(true);
    }//GEN-LAST:event_bVoltarMouseClicked

    private void bPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPesquisarMouseClicked
        String indice = tID.getText();
        if (!Frigobar.isNumeric(indice)) {
            Frigobar.sendInfo(2, "A pesquisa de ID deve ser númerico", "ID inadequado");
            return;
        }
        double id = Double.parseDouble(indice);
        if (!v.getValidade().hasProduto(id)) {
            Frigobar.sendInfo(2, "Não há um produto com esse ID", "ID incorreto");
            return;
        }
        int i = JOptionPane.showConfirmDialog(null, "Deseja editar o produto \"" + v.getValidade().getProduto(id)+ "\" tendo vencimento para o dia " + v.getValidade().getValidade(id), "Confirmar Edição", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            Validar validar = new Validar(id);
            validar.setVisible(true);
        }
    }//GEN-LAST:event_bPesquisarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bMenu;
    private javax.swing.JMenuBar bMenuBar;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JMenu bVoltar;
    private javax.swing.JLabel lId;
    private javax.swing.JTextField tID;
    // End of variables declaration//GEN-END:variables
}
