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
import javax.swing.JOptionPane;

public class NewCoba extends javax.swing.JFrame {
    
    int angka = 1;
    int Angka = 0;
    int number = 0;
    String jawaban = "";
    String betul = "";
    int benar = 0;
    int salah = 0;
    String soal1[] = {"Berikut ini yang termasuk perangkat output adalah?","A. Mouse","B. Monitor","C. Keyboard","D. CPU"};
    String soal2[] = {"Jenis memory yang hanya bisa membaca data saja adalah","A. ROM","B. RAM","C. Memory Card","D. Hard Disk"};
    String soal3[] = {"Perangkat komputer yang bisa disebut juga mikroprosesor adalah","A. Monitor","B. Mouse","C. CPU","D. Printer"};
    String soal4[] = {"Di bawah ini yang bukan termasuk elemen – elemen komputer adalah","A. Hardware","B. Software ","C. Hard Disk","D. Brainware"};
    String soal5[] = {"Harddisk, CD, DVD, USB Flashdisk merupakan perangkat keras komputer yang berfungsi sebagai","A. Perangkat Input","B. Media Penyimpan","C. Perangkat Output","D. Perangkat Pemproses"};
    
    public NewCoba() {
        initComponents();
        Seticon();
        setLocationRelativeTo(this);
        this.setTitle("Kuis Seputar TIK");
        jLabel_Quest.setText(""+soal1[0]);
        btnA.setText(""+soal1[1]);
        btnB.setText(""+soal1[2]);
        btnC.setText(""+soal1[3]);
        btnD.setText(""+soal1[4]);
        txt_Angka.setText(""+angka);
        btnResult.setVisible(false);
    }
    public void Clear () {
        btnGrup.clearSelection();
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
        jLabel_Quest = new javax.swing.JLabel();
        btnA = new javax.swing.JRadioButton();
        btnB = new javax.swing.JRadioButton();
        btnC = new javax.swing.JRadioButton();
        btnD = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Angka = new javax.swing.JLabel();
        btnSelanjutnya = new javax.swing.JButton();
        jButton_Check = new javax.swing.JButton();
        jLabel_Stat = new javax.swing.JLabel();
        btnResult = new javax.swing.JButton();
        jLabel_Bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Quest.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel_Quest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Quest.setText("QUESTION");
        jPanel1.add(jLabel_Quest, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 540, 80));

        btnA.setBackground(new java.awt.Color(204, 204, 204));
        btnGrup.add(btnA);
        btnA.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        btnA.setText("jRadioButton1");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        jPanel1.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, 30));

        btnB.setBackground(new java.awt.Color(204, 204, 204));
        btnGrup.add(btnB);
        btnB.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        btnB.setText("jRadioButton2");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        jPanel1.add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 265, 170, 30));

        btnC.setBackground(new java.awt.Color(204, 204, 204));
        btnGrup.add(btnC);
        btnC.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        btnC.setText("jRadioButton3");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 195, 180, 30));

        btnD.setBackground(new java.awt.Color(204, 204, 204));
        btnGrup.add(btnD);
        btnD.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        btnD.setText("jRadioButton4");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        jPanel1.add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 265, 170, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NO :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        txt_Angka.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_Angka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Angka.setText("1");
        jPanel2.add(txt_Angka, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, 40));

        btnSelanjutnya.setBackground(new java.awt.Color(204, 204, 204));
        btnSelanjutnya.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        btnSelanjutnya.setText("Next & Submit");
        btnSelanjutnya.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSelanjutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelanjutnyaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelanjutnya, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 120, 40));

        jButton_Check.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Check.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jButton_Check.setText("Check Answer");
        jButton_Check.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CheckActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 110, 40));

        jLabel_Stat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Stat.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Stat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Stat.setText("Status Jawaban");
        jLabel_Stat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel_Stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 250, 40));

        btnResult.setBackground(new java.awt.Color(204, 204, 204));
        btnResult.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        btnResult.setText("Result");
        btnResult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });
        jPanel1.add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 100, 40));

        jLabel_Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASSET GAME EDU/Kuis BG.png"))); // NOI18N
        jPanel1.add(jLabel_Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        // TODO add your handling code here:
        jawaban = "btnA";
    }//GEN-LAST:event_btnAActionPerformed

    private void btnSelanjutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelanjutnyaActionPerformed
        // TODO add your handling code here:
        Angka+=1;
        angka+=1;
        txt_Angka.setText(""+angka);
        if (Angka == 1){
            if (btnB.isSelected()) {
                benar += 1;
            }else {
                salah += 1;
            }
        } if (angka == 2) {
            jLabel_Quest.setText(""+soal2[0]);
            btnA.setText(""+soal2[1]);
            btnB.setText(""+soal2[2]);
            btnC.setText(""+soal2[3]);
            btnD.setText(""+soal2[4]);
        } if (Angka == 2) {
            if (btnA.isSelected()){
                benar += 1;
            } else {
                salah += 1;
            }
        } if (angka == 3) {
            jLabel_Quest.setText(""+soal3[0]);
            btnA.setText(""+soal3[1]);
            btnB.setText(""+soal3[2]);
            btnC.setText(""+soal3[3]);
            btnD.setText(""+soal3[4]);
        } if (Angka == 3) {
            if (btnC.isSelected()){
                benar += 1;
            } else {
                salah += 1;
            }
        } if (angka == 4) {
            jLabel_Quest.setText(""+soal4[0]);
            btnA.setText(""+soal4[1]);
            btnB.setText(""+soal4[2]);
            btnC.setText(""+soal4[3]);
            btnD.setText(""+soal4[4]);
        } if (Angka == 4) {
            if (btnC.isSelected()){
                benar += 1;
            } else {
                salah += 1;
            }
        } if (angka == 5) {
            jLabel_Quest.setText(""+soal5[0]);
            btnA.setText(""+soal5[1]);
            btnB.setText(""+soal5[2]);
            btnC.setText(""+soal5[3]);
            btnD.setText(""+soal5[4]);
            btnResult.setVisible(true);
        } if (Angka == 5) {
            if (btnB.isSelected()){
                benar += 1;
            } else {
                salah += 1;
            }
            txt_Angka.setText("5");
            jLabel_Quest.setText("COMPLETE!");
            btnA.setText("");
            btnB.setText("");
            btnC.setText("");
            btnD.setText("");
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
        }
       
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        jLabel_Stat.setText("Status Jawaban");
        jLabel_Stat.setForeground(Color.white);
        Clear();
        
    }//GEN-LAST:event_btnSelanjutnyaActionPerformed

    private void jButton_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CheckActionPerformed
        // TODO add your handling code here:
        number+=1;
        if (!btnA.isSelected() && !btnB.isSelected() && !btnC.isSelected() && !btnD.isSelected()){
            JOptionPane.showMessageDialog(null, "Tolong pilih jawaban");
        }
        if (number == 1){
            if (btnB.isSelected()) {
                jLabel_Stat.setText("Jawaban Benar");
                jLabel_Stat.setForeground(Color.green);
            }else {
                jLabel_Stat.setText("Jawaban Salah");
                jLabel_Stat.setForeground(Color.red);
            }
        } if (number == 2) {
            if (btnA.isSelected()){
                jLabel_Stat.setText("Jawaban Benar");
                jLabel_Stat.setForeground(Color.green);
            } else {
                jLabel_Stat.setText("Jawaban Salah");
                jLabel_Stat.setForeground(Color.red);
            }
        } if (number == 3) {
            if (btnC.isSelected()){
                jLabel_Stat.setText("Jawaban Benar");
                jLabel_Stat.setForeground(Color.green);
            } else {
                jLabel_Stat.setText("Jawaban Salah");
                jLabel_Stat.setForeground(Color.red);
            }
        } if (number == 4) {
            if (btnC.isSelected()){
                jLabel_Stat.setText("Jawaban Benar");
                jLabel_Stat.setForeground(Color.green);
            } else {
                jLabel_Stat.setText("Jawaban Salah");
                jLabel_Stat.setForeground(Color.red);
            }
        } if (number == 5) {
            if (btnB.isSelected()){
                jLabel_Stat.setText("Jawaban Benar");
                jLabel_Stat.setForeground(Color.green);
            } else {
                jLabel_Stat.setText("Jawaban Salah");
                jLabel_Stat.setForeground(Color.red);
            }
        }
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        
    }//GEN-LAST:event_jButton_CheckActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        // TODO add your handling code here:
        jawaban = "btnB";
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        jawaban = "btnC";
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        // TODO add your handling code here:
        jawaban = "btnD";
    }//GEN-LAST:event_btnDActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(null, "Betul : " + benar + "\n" + "Salah : " + salah);
        new Result(benar, salah).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResultActionPerformed

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
            java.util.logging.Logger.getLogger(NewCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCoba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCoba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnA;
    private javax.swing.JRadioButton btnB;
    private javax.swing.JRadioButton btnC;
    private javax.swing.JRadioButton btnD;
    private javax.swing.ButtonGroup btnGrup;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnSelanjutnya;
    private javax.swing.JButton jButton_Check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Bg;
    private javax.swing.JLabel jLabel_Quest;
    private javax.swing.JLabel jLabel_Stat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txt_Angka;
    // End of variables declaration//GEN-END:variables

    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
