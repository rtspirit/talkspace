/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GOVTRepresentative;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author rtspi
 */
public class GOVTRepresentativeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GOVTRepresentativeWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    public GOVTRepresentativeWorkAreaJPanel(JPanel userProcessContainer, Ecosystem system,Enterprise enterprise,UserAccount account,Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.organization = organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnManageRationRequests = new javax.swing.JButton();
        btnManageVolunteerRequest = new javax.swing.JButton();
        rightGOVTRepresentativeJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Government Representative");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnManageRationRequests.setBackground(new java.awt.Color(0, 255, 204));
        btnManageRationRequests.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnManageRationRequests.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRationRequests.setText("Ration Requests");
        btnManageRationRequests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageRationRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageRationRequestsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageRationRequestsMouseExited(evt);
            }
        });
        btnManageRationRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRationRequestsActionPerformed(evt);
            }
        });

        btnManageVolunteerRequest.setBackground(new java.awt.Color(0, 255, 204));
        btnManageVolunteerRequest.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnManageVolunteerRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnManageVolunteerRequest.setText("Volunteer Requests");
        btnManageVolunteerRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageVolunteerRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageVolunteerRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageVolunteerRequestMouseExited(evt);
            }
        });
        btnManageVolunteerRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVolunteerRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageVolunteerRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageRationRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(btnManageVolunteerRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnManageRationRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(509, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(736, Short.MAX_VALUE)))
        );

        rightGOVTRepresentativeJPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightGOVTRepresentativeJPanel.setLayout(new java.awt.CardLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/whitehouse-7050391.jpg"))); // NOI18N
        rightGOVTRepresentativeJPanel.add(jLabel2, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightGOVTRepresentativeJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightGOVTRepresentativeJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageRationRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRationRequestsActionPerformed
        // TODO add your handling code here:
        ManageRationRequestsRepresentativeJPanel manageRequestsHistoryJPanel = new ManageRationRequestsRepresentativeJPanel(rightGOVTRepresentativeJPanel, enterprise, userAccount, enterprise.getOrganizationDirectory(), organization);
        rightGOVTRepresentativeJPanel.add("manageRequestsHistoryJPanel", manageRequestsHistoryJPanel);
        CardLayout layout = (CardLayout) rightGOVTRepresentativeJPanel.getLayout();
        layout.next(rightGOVTRepresentativeJPanel);
    }//GEN-LAST:event_btnManageRationRequestsActionPerformed

    private void btnManageVolunteerRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVolunteerRequestActionPerformed
        // TODO add your handling code here:
        ManageVolunteerRequestsRepresentativeJPanel createUnitRequestsJPanel = new ManageVolunteerRequestsRepresentativeJPanel(rightGOVTRepresentativeJPanel, enterprise, userAccount, enterprise.getOrganizationDirectory(), organization);
        rightGOVTRepresentativeJPanel.add("createUnitRequestsJPanel", createUnitRequestsJPanel);
        CardLayout layout = (CardLayout) rightGOVTRepresentativeJPanel.getLayout();
        layout.next(rightGOVTRepresentativeJPanel);
    }//GEN-LAST:event_btnManageVolunteerRequestActionPerformed

    private void btnManageVolunteerRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageVolunteerRequestMouseEntered
        // TODO add your handling code here:
        btnManageVolunteerRequest.setBackground(new Color(0,255,204));
btnManageVolunteerRequest.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnManageVolunteerRequestMouseEntered

    private void btnManageVolunteerRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageVolunteerRequestMouseExited
        // TODO add your handling code here:
        btnManageVolunteerRequest.setForeground(new Color(0,255,204));
btnManageVolunteerRequest.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnManageVolunteerRequestMouseExited

    private void btnManageRationRequestsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageRationRequestsMouseEntered
        // TODO add your handling code here:
        btnManageRationRequests.setBackground(new Color(0,255,204));
btnManageRationRequests.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnManageRationRequestsMouseEntered

    private void btnManageRationRequestsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageRationRequestsMouseExited
        // TODO add your handling code here:
        btnManageRationRequests.setForeground(new Color(0,255,204));
btnManageRationRequests.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnManageRationRequestsMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageRationRequests;
    private javax.swing.JButton btnManageVolunteerRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel rightGOVTRepresentativeJPanel;
    // End of variables declaration//GEN-END:variables
}
