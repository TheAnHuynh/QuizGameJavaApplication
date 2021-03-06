package model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class StarMenuJPanel extends javax.swing.JPanel {
        
    private BufferedImage backgroundImage;
    
    public StarMenuJPanel() {
        try{
            backgroundImage = ImageIO.read(new File("src/image/miku.png"));
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

        btnStarGame = new javax.swing.JButton();
        btnGuide = new javax.swing.JButton();
        btnExitGame = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        setName("Start Game Menu JPanel"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStarGame.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnStarGame.setText("Bắt Đầu Chơi");
        btnStarGame.setMaximumSize(new java.awt.Dimension(200, 40));
        btnStarGame.setMinimumSize(new java.awt.Dimension(200, 40));
        btnStarGame.setPreferredSize(new java.awt.Dimension(200, 40));
        btnStarGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStarGameActionPerformed(evt);
            }
        });
        add(btnStarGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));
        btnStarGame.getAccessibleContext().setAccessibleName("");

        btnGuide.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnGuide.setText("Hướng Dẫn");
        btnGuide.setPreferredSize(new java.awt.Dimension(200, 40));
        add(btnGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        btnExitGame.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnExitGame.setText("Thoát");
        btnExitGame.setPreferredSize(new java.awt.Dimension(200, 40));
        btnExitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitGameActionPerformed(evt);
            }
        });
        add(btnExitGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        btnSetting.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnSetting.setText("Cài Đặt");
        btnSetting.setPreferredSize(new java.awt.Dimension(200, 40));
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });
        add(btnSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnStarGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStarGameActionPerformed
        MainFrame gameFrame = (MainFrame) SwingUtilities.getRoot(this);
        gameFrame.setContentPane(new GameModeMenuJPanel());
        gameFrame.validate();
        gameFrame.repaint();
    }//GEN-LAST:event_btnStarGameActionPerformed

    private void btnExitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitGameActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitGameActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        MainFrame gameFrame = (MainFrame) SwingUtilities.getRoot(this);
        gameFrame.setContentPane(new SettingJPanel());
        gameFrame.validate();
        gameFrame.repaint();
    }//GEN-LAST:event_btnSettingActionPerformed
    
   
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitGame;
    private javax.swing.JButton btnGuide;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnStarGame;
    // End of variables declaration//GEN-END:variables
}
