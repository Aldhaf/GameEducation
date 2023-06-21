/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gameeducation;

/**
 *
 * @author User
 */
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TebakGambar1 extends javax.swing.JFrame {
    
    int angka = 1;
    int Angka = 0;
    int number = 0;
    String jawaban = "";
    String betul = "";
    int benar = 0;
    int salah = 0;
    String answer;
    
    public TebakGambar1() {
        initComponents();
        Seticon();
        setLocationRelativeTo(this);
        this.setTitle("Kuis Seputar TIK");
        // Import ImageIcon     
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/ASSET GAME EDU/Mouse.png"));
        labelGambar.setIcon(iconLogo);
        labelNum.setText(""+angka);
        btnResult.setVisible(false);
    }
    
    public void Clear () {
        txtJawaban.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtJawaban = new javax.swing.JTextField();
        labelGambar = new javax.swing.JLabel();
        btnResult = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        labelStat = new javax.swing.JLabel();
        labelNum = new javax.swing.JLabel();
        labelAngka = new javax.swing.JLabel();
        bgTb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtJawaban.setBackground(new java.awt.Color(255, 153, 102));
        txtJawaban.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        txtJawaban.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJawaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJawabanActionPerformed(evt);
            }
        });
        jPanel1.add(txtJawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 390, 50));

        labelGambar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelGambar.setForeground(new java.awt.Color(255, 255, 255));
        labelGambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelGambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 380, 210));

        btnResult.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btnResult.setText("Result");
        btnResult.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });
        jPanel1.add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 70, 40));

        btnNext.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btnNext.setText("Next & Submit");
        btnNext.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 110, 40));

        btnCheck.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        btnCheck.setText("Check Answer");
        btnCheck.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 110, 40));

        labelStat.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelStat.setForeground(new java.awt.Color(255, 51, 51));
        labelStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStat.setText("-");
        jPanel1.add(labelStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 80, 70));

        labelNum.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNum.setForeground(new java.awt.Color(255, 255, 255));
        labelNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNum.setText("1.");
        jPanel1.add(labelNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 30, 50));

        labelAngka.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAngka.setForeground(new java.awt.Color(255, 255, 255));
        labelAngka.setText("NO.");
        jPanel1.add(labelAngka, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, 50));

        bgTb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSET GAME EDU/bg tebak gambar.png"))); // NOI18N
        jPanel1.add(bgTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        Angka+=1;
        angka+=1;
        
        answer = String.valueOf(txtJawaban.getText());
        labelNum.setText(""+angka);
        txtJawaban.setEnabled(true);
        if (Angka == 1){
            if (answer.equalsIgnoreCase("mouse")) {
                benar += 1;
            }else {
                salah += 1;
            }
        } if (angka == 2) {
            labelStat.setText("");
            ImageIcon iconLogo = new ImageIcon(getClass().getResource("/ASSET GAME EDU/floppy disk (1).jpg"));
            labelGambar.setIcon(iconLogo);
        } if (Angka == 2) {
            if (answer.equalsIgnoreCase("floppy disk")){
                benar += 1;
            } else {
                salah += 1;
            }
        } if (angka == 3) {
            labelStat.setText("");
            ImageIcon iconLogo = new ImageIcon(getClass().getResource("/ASSET GAME EDU/Monitor.png"));
            labelGambar.setIcon(iconLogo);
        } if (Angka == 3) {
            if (answer.equalsIgnoreCase("Monitor")){
                benar += 1;
            } else {
                salah += 1;
            }
        } if (angka == 4) {
            labelStat.setText("");
            ImageIcon iconLogo = new ImageIcon(getClass().getResource("/ASSET GAME EDU/VGA FIX.png"));
            labelGambar.setIcon(iconLogo);
        } if (Angka == 4) {
            if (answer.equalsIgnoreCase("VGA")){
                benar += 1;
            } else {
                salah += 1;
            }
        } if (angka == 5) {
            labelStat.setText("");
            ImageIcon iconLogo = new ImageIcon(getClass().getResource("/ASSET GAME EDU/RAM.jpg"));
            labelGambar.setIcon(iconLogo);
            btnResult.setVisible(true);
        } if (Angka == 5) {
            if (answer.equalsIgnoreCase("RAM")){
                benar += 1;
            } else {
                salah += 1;
            }
            labelNum.setText("5");
            labelGambar.setIcon(null);
            labelGambar.setText("COMPLETE!");
            txtJawaban.setEnabled(false);
            labelNum.setText("");
        }
        
        Clear();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        // TODO add your handling code here:
        new Result(benar, salah).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResultActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        number+=1;
        answer = String.valueOf(txtJawaban.getText());
        if (answer.equalsIgnoreCase(null)){
            JOptionPane.showMessageDialog(null, "Tolong pilih jawaban");
        }
        if (number == 1){
            if (answer.equalsIgnoreCase("mouse")) {
                labelStat.setText("V");
                labelStat.setForeground(Color.green);
            }else {
                labelStat.setText("X");
                labelStat.setForeground(Color.red);
            }
        } if (number == 2) {
            if (answer.equalsIgnoreCase("floppy disk")){
                labelStat.setText("V");
                labelStat.setForeground(Color.green);
            } else {
                labelStat.setText("X");
                labelStat.setForeground(Color.red);
            }
        } if (number == 3) {
            if (answer.equalsIgnoreCase("monitor")){
                labelStat.setText("V");
                labelStat.setForeground(Color.green);
            } else {
                labelStat.setText("X");
                labelStat.setForeground(Color.red);
            }
        } if (number == 4) {
            if (answer.equalsIgnoreCase("vga")){
                labelStat.setText("V");
                labelStat.setForeground(Color.green);
            } else {
                labelStat.setText("X");
                labelStat.setForeground(Color.red);
            }
        } if (number == 5) {
            if (answer.equalsIgnoreCase("RAM")){
                labelStat.setText("V");
                labelStat.setForeground(Color.green);
            } else {
                labelStat.setText("X");
                labelStat.setForeground(Color.red);
            }
        }
        txtJawaban.setEnabled(false);
    }//GEN-LAST:event_btnCheckActionPerformed

    private void txtJawabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJawabanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJawabanActionPerformed

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
            java.util.logging.Logger.getLogger(TebakGambar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakGambar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakGambar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakGambar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakGambar1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgTb;
    private javax.swing.JButton btnCheck;
    private javax.swing.ButtonGroup btnGrup;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnResult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAngka;
    private javax.swing.JLabel labelGambar;
    private javax.swing.JLabel labelNum;
    private javax.swing.JLabel labelStat;
    private javax.swing.JTextField txtJawaban;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}