/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;
import java.awt.Color;
import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.SwingUtilities;
import main.main;
import service.Auth;
import util.Conn;
import view.swing.dialog_mintakode;

/**
 *
 * @author RESCOM-1
 */

public class kirimkode extends javax.swing.JPanel {
    Auth a = new Auth();
    private String username = a.username;
    private String email;
        class poo{
    private String text;
//    private String email;
    public poo() {
        this.text = generateText();
    }

    private String generateText() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
    

    public String getText() {
        return this.text;
    }
}
private String apa1;
    public String randomNumber(){
    poo apa =new poo();
    String randomNumbera = apa.getText();
    apa1 = apa.getText();
//        System.out.println(randomNumbera);
    return randomNumbera;
}
    public String getapa(){
        return apa1;
        
    }
    /**
     * Creates new form NewJPanel
     */
    public kirimkode() {
        initComponents();
    }
public void kirim()throws AddressException, MessagingException {
           String host = "smtp.gmail.com";
    int port = 587;
    String username = "travelrahmatan@gmail.com";
    String password = "adifmmdndqeehmwq";
    
    Properties props = new Properties();
    props.put("mail.smtp.auth","true");
    props.put("mail.smtp.starttls.enable","true");
    props.put("mail.smtp.host",host);
    props.put("mail.smtp.port",port);
    
    Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username, password);
            }
            });
    String from    = "travelrahmatan@gmail.com";
    String to      = email ;
    String subject = "Kode Verifikasi Ganti Password Rahmatan App";
    String body = randomNumber();

        Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress(from));
    message.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse(to));
    message.setSubject(subject);
//    message.setText(body);
    String html = "<html>\n" +
"<div style=\"background:#f9f9f9;background-color:#f9f9f9;Margin:0px auto;max-width:600px;\">\n" +
"    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"background:#f9f9f9;background-color:#f9f9f9;width:100%;\">\n" +
"        <tbody>\n" +
"            <tr>\n" +
"                <td style=\"border-bottom:#333957 solid 5px;direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;\"></td>\n" +
"            </tr>\n" +
"        </tbody>\n" +
"    </table>\n" +
"</div>\n" +
"\n" +
"<div style=\"background:#fff;background-color:#fff;Margin:0px auto;max-width:600px;\">\n" +
"    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"background:#fff;background-color:#fff;width:100%;\">\n" +
"        <tbody>\n" +
"            <tr>\n" +
"                <td style=\"border:#dddddd solid 1px;border-top:0px;direction:ltr;font-size:0px;padding:20px 0;text-align:center;vertical-align:top;\">\n" +
"                    <div class=\"mj-column-per-100 outlook-group-fix\" style=\"font-size:13px;text-align:left;direction:ltr;display:inline-block;vertical-align:bottom;width:100%;\">\n" +
"                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"vertical-align:bottom;\" width=\"100%\">\n" +
"                            <tr>\n" +
"                                <td align=\"center\" style=\"font-size:0px;padding:10px 25px;word-break:break-word;\">\n" +
"                                    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"border-collapse:collapse;border-spacing:0px;\">\n" +
"                                        <tbody>\n" +
"                                            <tr>\n" +
"                                                <td style=\"width:64px;\">\n" +
"                                                    <!-- <img height=\"auto\" src=\"https://i.imgur.com/KO1vcE9.png\" style=\"border:0;display:block;outline:none;text-decoration:none;width:100%;\" width=\"64\" /> -->\n" +
"                                                </td>\n" +
"                                            </tr>\n" +
"                                        </tbody>\n" +
"                                    </table>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                            <tr>\n" +
"                                <td align=\"center\" style=\"font-size:0px;padding:10px 25px;padding-bottom:40px;word-break:break-word;\">\n" +
"                                    <div style=\"font-family:'Helvetica Neue',Arial,sans-serif;font-size:32px;font-weight:bold;line-height:1;text-align:center;color:#555;\">Kode Verifikasi</div>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                            <tr>\n" +
"                                <td align=\"center\" style=\"font-size:0px;padding:10px 25px;padding-bottom:20px;word-break:break-word;\">\n" +
"                                    <div style=\"font-family:'Helvetica Neue',Arial,sans-serif;font-size:16px;line-height:22px;text-align:center;color:#555;\">Gunakan kode di bawah untuk mereset password anda</div>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                            <tr>\n" +
"                                <td align=\"center\" style=\"font-size:0px;padding:10px 25px;padding-top:30px;padding-bottom:40px;word-break:break-word;\">\n" +
"                                    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"border-collapse:separate;line-height:100%;\">\n" +
"                                        <tr>\n" +
"                                            <td align=\"center\" bgcolor=\"#2F67F6\" role=\"presentation\" style=\"border:none;border-radius:3px;color:#ffffff;cursor:auto;padding:10px 20px;\" valign=\"middle\">\n" +
"                                                <p style=\"background:#2F67F6;color:#ffffff;font-family:'Helvetica Neue',Arial,sans-serif;font-size:30px;letter-spacing:4px;font-weight:bold;line-height:120%;Margin:0;text-decoration:none;text-transform:none;\" id=\"code\">"+body+"</p>\n" +
"                                            </td>\n" +
"                                        </tr>\n" +
"                                    </table>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                            <tr>\n" +
"                                <td align=\"center\" style=\"font-size:0px;padding:10px 25px;word-break:break-word;\">\n" +
"                                    <div style=\"font-family:'Helvetica Neue',Arial,sans-serif;font-size:14px;line-height:22px;text-align:center;color:#555;\">Rahmatan Transaction System<br> <a href=\"mailto:info@example.com\" style=\"color:#2F67F6\">travelrahmatan@gmail.com</a>\n" +
"                                    </div>\n" +
"                                </td>\n" +
"                            </tr>\n" +
"                        </table>\n" +
"                    </div>\n" +
"                </td>\n" +
"            </tr>\n" +
"        </tbody>\n" +
"    </table>\n" +
"</div>" +
"</html>";
    message.setContent(html, "text/html");
    Transport.send(message);
    }
    /**
     * Creates new form kirimkode
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnkir = new javax.swing.JLabel();
        inputusername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        btnkir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnkirimkode1.png"))); // NOI18N
        btnkir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnkirMouseEntered(evt);
            }
        });
        jPanel1.add(btnkir);
        btnkir.setBounds(460, 530, 426, 70);
        jPanel1.add(inputusername);
        inputusername.setBounds(492, 354, 386, 61);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebtn/btnkembali1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 710, 190, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagebg/ko ferifikasi.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1370, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnkirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkirMouseClicked
            Auth wew = new Auth();
            String sql = "SELECT * FROM user WHERE username = ?";
            System.out.println(getapa());
//        try {
//                        kirim();
//                        System.out.println(getapa());
//                         } catch (MessagingException ex) {
//                        
//                        System.out.println(ex.getMessage());
//                    }
            
                try {
                        Connection koneksi = (Connection)Conn.configDB();
                                PreparedStatement pst = koneksi.prepareStatement(sql);
                                pst.setString(1, inputusername.getText());
                                ResultSet res = pst.executeQuery();
                                if (res.next()) {
                                email = res.getString("email");
                                System.out.println(email);
                                kirim();
                                wew.username = inputusername.getText();
                                System.out.println(inputusername.getText());
                                String token = getapa();
                                wew.kirimTokenDB(inputusername.getText(), token);
                                System.out.println(token);
                                    try {
//                                        verifikasi apa = new verifikasi();
//                                 this.setVisible(false);
//                                 apa.setVisible(true);
                                main main =(main)SwingUtilities.getWindowAncestor(this);
//                                dialog_mintakode a = new dialog_mintakode(main);
//                                a.showPopUp();
                                this.setVisible(false);
                                main.showver();
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                 
//                               jPanel1.setVisible(false);
//                               jPanel2.setVisible(true);
                            }
                    } catch (Exception e) {
                        System.out.println(e.getMessage().toString());
                        System.out.println("gagall");
                    }
        

    }//GEN-LAST:event_btnkirMouseClicked

    private void btnkirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkirMouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    main main =(main)SwingUtilities.getWindowAncestor(this);
    this.setVisible(false);
    main.showlogin();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnkir;
    private javax.swing.JTextField inputusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
