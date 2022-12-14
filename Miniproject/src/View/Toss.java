/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.Playerdetail;
import DAO.TossFunction;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 5632-27
 */
public class Toss extends javax.swing.JFrame {

    /**
     * Creates new form Toss
     */
    
    public Toss() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        AwayTeam = new javax.swing.JLabel();
        HomeTeam = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TossTitle = new javax.swing.JLabel();
        awayBatting = new javax.swing.JRadioButton();
        awayBowling = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        batting = new javax.swing.JRadioButton();
        bowling = new javax.swing.JRadioButton();
        battingbowlingsubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        away = new javax.swing.JLabel();
        home = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(485, 430));
        setMinimumSize(new java.awt.Dimension(485, 430));
        setPreferredSize(new java.awt.Dimension(485, 430));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        TossTitle.setFont(new java.awt.Font("Bodoni MT Black", 3, 24)); // NOI18N
        TossTitle.setForeground(new java.awt.Color(255, 0, 0));
        TossTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TossTitle.setText("Toss details");

        buttonGroup1.add(awayBatting);
        awayBatting.setFont(new java.awt.Font("Bodoni MT Condensed", 3, 18)); // NOI18N
        awayBatting.setForeground(new java.awt.Color(0, 153, 153));
        awayBatting.setText("Batting");
        awayBatting.setMaximumSize(new java.awt.Dimension(150, 30));
        awayBatting.setMinimumSize(new java.awt.Dimension(150, 30));
        awayBatting.setPreferredSize(new java.awt.Dimension(150, 30));
        awayBatting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awayBattingActionPerformed(evt);
            }
        });

        buttonGroup1.add(awayBowling);
        awayBowling.setFont(new java.awt.Font("Bodoni MT Condensed", 3, 18)); // NOI18N
        awayBowling.setForeground(new java.awt.Color(0, 153, 153));
        awayBowling.setText("Bowling");
        awayBowling.setMaximumSize(new java.awt.Dimension(150, 30));
        awayBowling.setMinimumSize(new java.awt.Dimension(150, 30));
        awayBowling.setPreferredSize(new java.awt.Dimension(150, 30));
        awayBowling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awayBowlingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Away Team Select Preference");
        jLabel1.setMaximumSize(new java.awt.Dimension(250, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(250, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 30));

        buttonGroup2.add(batting);
        batting.setFont(new java.awt.Font("Bodoni MT Condensed", 3, 18)); // NOI18N
        batting.setForeground(new java.awt.Color(0, 153, 153));
        batting.setText("Batting");
        batting.setMaximumSize(new java.awt.Dimension(150, 30));
        batting.setMinimumSize(new java.awt.Dimension(150, 30));
        batting.setPreferredSize(new java.awt.Dimension(150, 30));

        buttonGroup2.add(bowling);
        bowling.setFont(new java.awt.Font("Bodoni MT Condensed", 3, 18)); // NOI18N
        bowling.setForeground(new java.awt.Color(0, 153, 153));
        bowling.setText("Bowling");
        bowling.setMaximumSize(new java.awt.Dimension(150, 30));
        bowling.setMinimumSize(new java.awt.Dimension(150, 30));
        bowling.setPreferredSize(new java.awt.Dimension(150, 30));
        bowling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bowlingActionPerformed(evt);
            }
        });

        battingbowlingsubmit.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        battingbowlingsubmit.setText("Submit");
        battingbowlingsubmit.setMaximumSize(new java.awt.Dimension(80, 25));
        battingbowlingsubmit.setMinimumSize(new java.awt.Dimension(80, 25));
        battingbowlingsubmit.setPreferredSize(new java.awt.Dimension(80, 25));
        battingbowlingsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                battingbowlingsubmitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home Team Select Preference");
        jLabel2.setMaximumSize(new java.awt.Dimension(250, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(250, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 30));

        away.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        away.setForeground(new java.awt.Color(255, 51, 51));
        away.setMaximumSize(new java.awt.Dimension(100, 20));
        away.setMinimumSize(new java.awt.Dimension(100, 20));
        away.setPreferredSize(new java.awt.Dimension(100, 20));

        home.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        home.setForeground(new java.awt.Color(255, 51, 51));
        home.setMaximumSize(new java.awt.Dimension(100, 20));
        home.setMinimumSize(new java.awt.Dimension(100, 20));
        home.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(batting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(bowling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(awayBatting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(awayBowling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TossTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(away, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(battingbowlingsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {awayBatting, awayBowling});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TossTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(away, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(awayBatting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(awayBowling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bowling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(battingbowlingsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {awayBatting, awayBowling});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomeTeam)
                    .addComponent(AwayTeam))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(AwayTeam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomeTeam)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void awayBattingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_awayBattingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_awayBattingActionPerformed

    private void battingbowlingsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_battingbowlingsubmitActionPerformed
        // Batting or Bowling code here
        Playerdetail pd = new Playerdetail();
        
        //Home Side
        if(batting.isSelected()){
            String choice = batting.getText();
            String choice2 = bowling.getText();
            
            if(pd.updateHomeSide(choice,choice2)){
                JOptionPane.showMessageDialog(null, "Home Sides Updated to Batting");
            }else{
                JOptionPane.showMessageDialog(null, "Home Side not updated to Batting");
            }
        }else if(bowling.isSelected()){
            String choice = bowling.getText();
            String choice2 = batting.getText();
            
            if(pd.updateHomeSide(choice,choice2)){
                JOptionPane.showMessageDialog(null, "Home Sides Updated to Bowling");
            }else{
                JOptionPane.showMessageDialog(null, "Home Side not updated to Bowling");
            }
        }
        //Away Side
          if(awayBatting.isSelected()){
            String choice = batting.getText();
            String choice2 = bowling.getText();
            if(pd.updateAwaySide(choice,choice2)){
                JOptionPane.showMessageDialog(null, "Away Sides Updated to Batting");
            }else{
                JOptionPane.showMessageDialog(null, "Away Side not updated to Batting");
            }
        }else if(awayBowling.isSelected()){
            String choice = bowling.getText();
            String choice2 = batting.getText();
            if(pd.updateAwaySide(choice,choice2)){
                JOptionPane.showMessageDialog(null, "Away Sides Updated to Bowling");
            }else{
                JOptionPane.showMessageDialog(null, "Away Side not updated to Bowling");
            }
        }
        this.dispose();
        MatchInformation m = new MatchInformation();
        m.setVisible(true);
    }//GEN-LAST:event_battingbowlingsubmitActionPerformed

    private void bowlingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bowlingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bowlingActionPerformed

    private void awayBowlingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_awayBowlingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_awayBowlingActionPerformed

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
            java.util.logging.Logger.getLogger(Toss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Toss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Toss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Toss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Toss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AwayTeam;
    private javax.swing.JLabel HomeTeam;
    private javax.swing.JLabel TossTitle;
    public javax.swing.JLabel away;
    private javax.swing.JRadioButton awayBatting;
    private javax.swing.JRadioButton awayBowling;
    private javax.swing.JRadioButton batting;
    private javax.swing.JButton battingbowlingsubmit;
    private javax.swing.JRadioButton bowling;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JLabel home;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
