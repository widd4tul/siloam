/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.SwingUtilities;
import main.main;
import service.Auth;
import util.Conn;
/**
 *
 * @author RESCOM-1
 */
public class verifikasi extends javax.swing.JPanel {

    /**
     * Creates new form verifikasi
     */
    Auth a = new Auth();
    private String username = a.username;
//    public String username(){
//    username = a.username;
//    return username;
//    } 
    
//    public  String getaaa(){
//        return username;
//    }
    public verifikasi() {
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

        btnverif = new javax.swing.JLabel();
        inputverifikasi = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setLayout(null);

        btnverif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnverifikasi1.png"))); // NOI18N
        btnverif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnverifMouseClicked(evt);
            }
        });
        add(btnverif);
        btnverif.setBounds(470, 510, 426, 80);

        inputverifikasi.setBackground(new Color(0,0,0,0));
        inputverifikasi.setBorder(null);
        add(inputverifikasi);
        inputverifikasi.setBounds(490, 360, 390, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/verifikasi kode.png"))); // NOI18N
        add(bg);
        bg.setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void btnverifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnverifMouseClicked
    String token = inputverifikasi.getText();
        
         String queryCek = "SELECT token FROM user WHERE username = ?";
         
        try {
        Connection koneksi = (Connection) Conn.configDB();
        PreparedStatement pst = koneksi.prepareStatement(queryCek);
        pst.setString(1, username);
        ResultSet res = pst.executeQuery();
        if(res.next()){
            if(inputverifikasi.getText().equals(res.getString("token"))){
             
                a.hapusToken(username);
//                a.username = "";
                buatpasswordbaru apa = new buatpasswordbaru();
                this.setVisible(false);
                main main1 =(main)SwingUtilities.getWindowAncestor(this); 
                main1.showpass();
                
            }else{
               
            }
        }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnverifMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnverif;
    private javax.swing.JTextField inputverifikasi;
    // End of variables declaration//GEN-END:variables
}
