/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GeneralTherapistRole;



import UserInterface.OnlineReceptionistRole.*;
import UserInterface.User.*;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.GeneralTherapist.GeneralTherapist;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.GeneralTherapistRole;
import Business.User.User;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Prescription;
import Business.WorkQueue.Request;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juhip
 */
public class ManagePrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount userAccount;
    private Organization org;
    private Ecosystem system;
    private Request request;
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
       
    public ManagePrescriptionJPanel(JPanel userProcessContainer, Ecosystem system, UserAccount userAccount, Organization org, Enterprise ent, Request request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.ent=ent;
        this.org = org;
        this.request = request;
        populateRequestTable();
        
    }
     public class HeaderColor extends DefaultTableCellRenderer {
        public HeaderColor() {
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);         
           setBackground(new java.awt.Color(74,122,193));
            return this;
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

        jPanel1 = new javax.swing.JPanel();
        lblDoctorslist1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestDetailsTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblDoctorslist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblDoctorslist1.setText("Manage All requests");

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 255, 204));
        btnAdd.setText("Add New");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        requestDetailsTable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        requestDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prescription Date", "Details", "Comment"
            }
        ));
        requestDetailsTable.setGridColor(new java.awt.Color(204, 204, 204));
        requestDetailsTable.setRowHeight(24);
        jScrollPane1.setViewportView(requestDetailsTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(lblDoctorslist1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblDoctorslist1)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 840, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        PrescriptionJPanel addNewPrescription=new PrescriptionJPanel(userProcessContainer,system, userAccount,ent, org, request);
        userProcessContainer.add("receptionistRequestDetails", addNewPrescription);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
        btnAdd.setBackground(new Color(0,255,204));
btnAdd.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        // TODO add your handling code here:
        btnAdd.setForeground(new Color(0,255,204));
btnAdd.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnAddMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoctorslist1;
    private javax.swing.JTable requestDetailsTable;
    // End of variables declaration//GEN-END:variables
        public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) requestDetailsTable.getModel();
           model.setRowCount(0);
           for(Prescription pres : request.getPrescriptionDirectry().getPrescriptionList()){
            Object[] row = new Object[5];
            row[0] = pres;
            row[1] = pres.getPrescriptionDetails();
            row[2] = pres.getComment();
            model.addRow(row);
        }   
        }
}
