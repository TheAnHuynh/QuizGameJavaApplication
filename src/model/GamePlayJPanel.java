package model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class GamePlayJPanel extends javax.swing.JPanel {
    
    private BufferedImage image;
    
    public GamePlayJPanel() {
        try{
            image = ImageIO.read(new File("src/image/winter.png"));
        }catch(IOException ex){
            System.out.println(ex.toString());
        }
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

        answerButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtCorrect = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtWrong = new javax.swing.JLabel();
        txtQuestion = new javax.swing.JLabel();
        rbnAnswerB = new javax.swing.JRadioButton();
        rbnAnswerD = new javax.swing.JRadioButton();
        rbnAnswerA = new javax.swing.JRadioButton();
        rbnAnswerC = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        txtTimer = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Số Câu Sai:");
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 30));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 90, -1));

        txtCorrect.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtCorrect.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCorrect.setText("0");
        txtCorrect.setPreferredSize(new java.awt.Dimension(50, 30));
        add(txtCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Số Câu Đúng:");
        jLabel3.setPreferredSize(new java.awt.Dimension(90, 30));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        txtWrong.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtWrong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtWrong.setText("0");
        txtWrong.setPreferredSize(new java.awt.Dimension(50, 30));
        add(txtWrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        txtQuestion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtQuestion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtQuestion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtQuestion.setPreferredSize(new java.awt.Dimension(480, 170));
        add(txtQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        answerButtonGroup.add(rbnAnswerB);
        rbnAnswerB.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rbnAnswerB.setText("B.");
        rbnAnswerB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rbnAnswerB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbnAnswerB.setName(""); // NOI18N
        rbnAnswerB.setPreferredSize(new java.awt.Dimension(230, 80));
        add(rbnAnswerB, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 234, -1, -1));
        rbnAnswerB.getAccessibleContext().setAccessibleName("");

        answerButtonGroup.add(rbnAnswerD);
        rbnAnswerD.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rbnAnswerD.setText("D.");
        rbnAnswerD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rbnAnswerD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbnAnswerD.setName(""); // NOI18N
        rbnAnswerD.setPreferredSize(new java.awt.Dimension(230, 80));
        add(rbnAnswerD, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 332, -1, -1));
        rbnAnswerD.getAccessibleContext().setAccessibleName("");

        answerButtonGroup.add(rbnAnswerA);
        rbnAnswerA.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rbnAnswerA.setText("A.");
        rbnAnswerA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rbnAnswerA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbnAnswerA.setName(""); // NOI18N
        rbnAnswerA.setPreferredSize(new java.awt.Dimension(230, 80));
        add(rbnAnswerA, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 234, -1, -1));

        answerButtonGroup.add(rbnAnswerC);
        rbnAnswerC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rbnAnswerC.setText("C.");
        rbnAnswerC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rbnAnswerC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbnAnswerC.setName(""); // NOI18N
        rbnAnswerC.setPreferredSize(new java.awt.Dimension(230, 80));
        add(rbnAnswerC, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 332, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnSubmit.setText("Trả lời");
        btnSubmit.setPreferredSize(new java.awt.Dimension(200, 40));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 430, -1, -1));
        btnSubmit.getAccessibleContext().setAccessibleName("");

        txtTimer.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTimer.setText("00:00");
        txtTimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 7, 77, 30));

        btnBack.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnBack.setText("Trở về");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainFrame mainFrame = (MainFrame) SwingUtilities.getRoot(this);
        mainFrame.setContentPane(new GameModeMenuJPanel());
        mainFrame.validate();
        mainFrame.repaint();
    }//GEN-LAST:event_btnBackActionPerformed

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup answerButtonGroup;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rbnAnswerA;
    private javax.swing.JRadioButton rbnAnswerB;
    private javax.swing.JRadioButton rbnAnswerC;
    private javax.swing.JRadioButton rbnAnswerD;
    private javax.swing.JLabel txtCorrect;
    private javax.swing.JLabel txtQuestion;
    private javax.swing.JLabel txtTimer;
    private javax.swing.JLabel txtWrong;
    // End of variables declaration//GEN-END:variables
}
