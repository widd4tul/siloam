/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import javax.swing.SwingUtilities;
import main.main;

/**
 *
 * @author RESCOM-1
 */
public class Dasboard extends javax.swing.JPanel {

    /**
     * Creates new form Dasboard
     */
    public Dasboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btndatamaster = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1366, 768));
        setLayout(null);

        btndatamaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btndatamaster1.png"))); // NOI18N
        btndatamaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndatamasterMouseClicked(evt);
            }
        });
        add(btndatamaster);
        btndatamaster.setBounds(200, 150, 380, 100);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/bg dasboard.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, -2, 1366, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void btndatamasterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndatamasterMouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showdatamaster();
    }//GEN-LAST:event_btndatamasterMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btndatamaster;
    // End of variables declaration//GEN-END:variables
}
