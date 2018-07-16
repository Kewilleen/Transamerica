/*
 * Projeto destribuido por DEVKEWI COMPANY - Todos os direitos reservados.
 * Para alteração do código fonte estará disposto a concordar com termos.
 */
package me.kewi.interfaces;

/**
 *
 * @author DEVKEWI COMPANY - Kewilleen
 */
public class Representante extends javax.swing.JFrame {

    /**
     * Creates new form Representante
     */
    public Representante() {
        initComponents();
        setTitle("Versão de exibição");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bSolicitar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bSolicitar.setText("REQUISITANTE");
        bSolicitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSolicitarMouseClicked(evt);
            }
        });

        jButton1.setText("CONFEITEIRO");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bSolicitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(bSolicitar)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSolicitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSolicitarMouseClicked
        Requisitos r = new Requisitos();
        this.setVisible(false);
        r.setVisible(true);
    }//GEN-LAST:event_bSolicitarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        Pedidos p = new Pedidos();
        p.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSolicitar;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}