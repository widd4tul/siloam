/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import panel.Dasboard;
import panel.Login;
import panel.buatpasswordbaru;
import panel.datamaster;
<<<<<<< HEAD
import panel.datamaster_edit;
=======
>>>>>>> 74982d7584591b2a52f6ff5f42d569d188d606ea
import panel.kirimkode;
import panel.verifikasi;


/**
 *
 * @author RESCOM-1
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public main() {
        initComponents();
        showlogin();
    }
     public void showlogin(){
        Login apa = new Login();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showdasboard(){
        Dasboard apa = new Dasboard();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showkode(){
        kirimkode apa = new kirimkode();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showver(){
        verifikasi apa = new verifikasi();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showpass(){
        buatpasswordbaru apa = new buatpasswordbaru();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
    public void showdatamaster(){
        datamaster apa = new datamaster();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
<<<<<<< HEAD
    public void showdatamaster_edit(){
        datamaster_edit apa = new datamaster_edit();
        apa.setSize(1366,768);
        this.add(apa);
        this.revalidate();
        this.repaint();
    }
=======
>>>>>>> 74982d7584591b2a52f6ff5f42d569d188d606ea
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
