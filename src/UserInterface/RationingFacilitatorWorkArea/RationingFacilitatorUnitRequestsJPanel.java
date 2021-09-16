/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RationingFacilitatorWorkArea;

import Business.Distributor.Distributor;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Executive.Executive;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RationRequest;
import Business.WorkQueue.RationRequestDirectory;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rtspi
 */
public class RationingFacilitatorUnitRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RationingFacilitatorUnitRequestsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private OrganizationDirectory orgDir;
    private RationRequest rationRequest;
    private Ecosystem system;
    private Executive executive;
    private Distributor dist;
    Organization org;
    
    public RationingFacilitatorUnitRequestsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount,OrganizationDirectory orgDir, Ecosystem system, Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.orgDir = orgDir;
        this.system = system;
        this.org = org;
        dist = org.getDistributorDirectory().findUserByUserName(useraccount.getUsername());
        populateSizeComboxBox();
        populateTypeComboBox();
        populateExecutiveComboBox();
        populateTable();
    }
    
    public void populateTypeComboBox(){
        typeJComboBox.removeAllItems();
        typeJComboBox.addItem("Food Packet");
        typeJComboBox.addItem("Daily Essentials");
    }
    
    public void populateSizeComboxBox(){
        sizeJComboBox.removeAllItems();
        sizeJComboBox.addItem("Daily");
        sizeJComboBox.addItem("Weekly");
        sizeJComboBox.addItem("Monthly");
    }
    
    public void populateExecutiveComboBox(){
        executiveJComboBox.removeAllItems();
        for(Network net: system.getNetworkList()){
        for(Enterprise ent : net.getEnterpriseDirectory().getEntList()){
            for(Organization org : ent.getOrganizationDirectory().getOrgList()){
                if(org.getType().getValue().equalsIgnoreCase("Executive Organization")){
                    for(Executive ex: org.getExecutiveDirectory().getExecutiveList()){
                
                    executiveJComboBox.addItem(ex);
                    }
                }
                
            }  
                }
                  
    }
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblRequestHistory.getModel();
        model.setRowCount(0);
        
        for(RationRequest req : dist.getRationRequestDirectory().getRationRequestList()){
            System.out.println(req);
            Object[] row = new Object[5];
            row[0] = req.getRequestName();
            row[1] = req.getTypeOfPacket();
            row[2] = req.getSizeOfPacket();
            row[3] = req.getUnits();
            row[4] = req.getStatus();
            model.addRow(row);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestHistory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtUnits = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        typeJComboBox = new javax.swing.JComboBox<>();
        sizeJComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        executiveJComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));

        tblRequestHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Name", "Type of Packet", "Size of Packet", "# of Units", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblRequestHistory);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Request History");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Type of Packet:");

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 255, 204));
        btnSubmit.setText("Submit Request");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Number of Units:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Size of Packet:");

        typeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sizeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Assign Government Executive:");

        executiveJComboBox.setPreferredSize(new java.awt.Dimension(28, 23));
        executiveJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executiveJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(executiveJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sizeJComboBox, 0, 142, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(typeJComboBox, 0, 142, Short.MAX_VALUE)
                                    .addComponent(txtUnits)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(btnSubmit)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addComponent(sizeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(executiveJComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(113, 113, 113)
                .addComponent(btnSubmit)
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String units = txtUnits.getText();
        String typeofpackets =(String) typeJComboBox.getSelectedItem();
        String sizeofpackets = (String) sizeJComboBox.getSelectedItem();
        executive = (Executive) executiveJComboBox.getSelectedItem();
        if(units.equalsIgnoreCase("") || units.matches("[A-Za-z]+")){
            JOptionPane.showMessageDialog(null, "Please enter valid number of units", "Warning", JOptionPane.PLAIN_MESSAGE);
            txtUnits.setText("");
        }
        else{
            rationRequest = new RationRequest(typeofpackets);
        rationRequest.setUnits(units);
        rationRequest.setTypeOfPacket(typeofpackets);
        rationRequest.setSizeOfPacket(sizeofpackets);
        rationRequest.setStatus("Sent to Government Executive");
        executive.getRationRequestDirectory().addRationRequest(rationRequest);
        dist.getRationRequestDirectory().addRationRequest(rationRequest);
        JOptionPane.showMessageDialog(null, "Request Sent Successfully", "Success", JOptionPane.PLAIN_MESSAGE);
        populateTable();
        txtUnits.setText("");
        }
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void executiveJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executiveJComboBoxActionPerformed
        // TODO add your handling code here:
        executive = (Executive) executiveJComboBox.getSelectedItem();
    }//GEN-LAST:event_executiveJComboBoxActionPerformed

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        // TODO add your handling code here:
        btnSubmit.setBackground(new Color(0,255,204));
btnSubmit.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
        // TODO add your handling code here:
        btnSubmit.setForeground(new Color(0,255,204));
btnSubmit.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnSubmitMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox executiveJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sizeJComboBox;
    private javax.swing.JTable tblRequestHistory;
    private javax.swing.JTextField txtUnits;
    private javax.swing.JComboBox<String> typeJComboBox;
    // End of variables declaration//GEN-END:variables
}