/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.Playerdetail;
import DAO.ScoreDetails;
import DAO.ScoreDetails2;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 5632-27
 */
public class StartMatch extends javax.swing.JFrame {

    /**
     * Creates new form StartMatch
     */
    public StartMatch() {
        initComponents();
        Image image = new ImageIcon("E:\\CDAC\\Data Structure and algorithm\\Neatbeans IDE\\Miniproject\\Cricket Img\\logo.png").getImage();
        setIconImage(image);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        inning = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        totalover = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BowlingTeam = new javax.swing.JLabel();
        BattingTeam = new javax.swing.JLabel();
        getteam = new javax.swing.JButton();
        inningsLabel = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");
        popupMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupMenu1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setMaximumSize(new java.awt.Dimension(360, 390));
        setMinimumSize(new java.awt.Dimension(360, 390));
        setPreferredSize(new java.awt.Dimension(360, 390));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        inning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        inning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inningActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Number of total overs");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 30));

        totalover.setMaximumSize(new java.awt.Dimension(70, 30));
        totalover.setMinimumSize(new java.awt.Dimension(70, 30));
        totalover.setPreferredSize(new java.awt.Dimension(70, 30));
        totalover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaloverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Batting Team");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Match details");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Bowling Team");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 30));

        BowlingTeam.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BowlingTeam.setForeground(new java.awt.Color(255, 255, 0));
        BowlingTeam.setMaximumSize(new java.awt.Dimension(70, 30));
        BowlingTeam.setMinimumSize(new java.awt.Dimension(70, 30));
        BowlingTeam.setPreferredSize(new java.awt.Dimension(70, 30));

        BattingTeam.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BattingTeam.setForeground(new java.awt.Color(255, 255, 0));
        BattingTeam.setMaximumSize(new java.awt.Dimension(70, 30));
        BattingTeam.setMinimumSize(new java.awt.Dimension(70, 30));
        BattingTeam.setPreferredSize(new java.awt.Dimension(70, 30));

        getteam.setText("Get Team");
        getteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getteamActionPerformed(evt);
            }
        });

        inningsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inningsLabel.setForeground(new java.awt.Color(0, 153, 255));
        inningsLabel.setText("Innings");
        inningsLabel.setMaximumSize(new java.awt.Dimension(100, 30));
        inningsLabel.setMinimumSize(new java.awt.Dimension(100, 30));
        inningsLabel.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BowlingTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BattingTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(getteam))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inningsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(totalover, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel3)))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inningsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalover, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BowlingTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BattingTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(getteam)))
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 563, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void totaloverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaloverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totaloverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ScoreDetails sd = new ScoreDetails();
        ScoreDetails2 s = new ScoreDetails2();
        
        int overs=Integer.parseInt(totalover.getText());
        System.out.println("Overs:"+overs);
        
        if(inning.getSelectedItem().toString().equals("1")){
            if(sd.updateTotalOvers(overs))
            {
                JOptionPane.showMessageDialog(null, "1st innings Total Overs updated");
             }else{
                JOptionPane.showMessageDialog(null, "1st innings Total Overs not updated");
             }
        }else{
        
        if(inning.getSelectedItem().toString().equals("2")){
            if(s.updateTotalOvers2(overs))
            {
                JOptionPane.showMessageDialog(null, "2nd innings Total Overs updated");
             }else{
                JOptionPane.showMessageDialog(null, "2nd innings Total Overs not updated");
             }
        }
        }
        ScoreUpdater su = new ScoreUpdater();
        //Code of innings in updater
        if(inning.getSelectedItem().toString().equals("1")){
            su.innANSWER.setText("1");
        }
        else {if(inning.getSelectedItem().toString().equals("2")){
//            su.setVisible(true);
            su.innANSWER.setText("2");
        }
        }
        su.setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void popupMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popupMenu1ActionPerformed

    private void getteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getteamActionPerformed
        // Get Team Code
        Playerdetail p = new Playerdetail();
        if((inning.getSelectedItem().toString()).equals("1")){
            BattingTeam.setText(p.getBattingTeamName());
            BowlingTeam.setText(p.getBowlingTeamName());
        }
        if((inning.getSelectedItem().toString()).equals("2")){
            BattingTeam.setText(p.getBowlingTeamName());
            BowlingTeam.setText(p.getBattingTeamName());
        }
    }//GEN-LAST:event_getteamActionPerformed

    private void inningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inningActionPerformed

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
            java.util.logging.Logger.getLogger(StartMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartMatch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BattingTeam;
    private javax.swing.JLabel BowlingTeam;
    private javax.swing.JButton getteam;
    private javax.swing.JComboBox<String> inning;
    private javax.swing.JLabel inningsLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField totalover;
    // End of variables declaration//GEN-END:variables
}
