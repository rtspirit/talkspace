/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.User;



import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.GeneralTherapistRole;
import Business.TestDefiner.Test;
import Business.TestDefiner.TestDefiner;
import Business.User.TestResult;
import Business.User.User;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Request;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juhip
 */
public class TakeTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount userAccount;
    private Organization org;
    private Ecosystem system;
    private Request request;
    private Test test;
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    ArrayList<Test> tableListTest= new ArrayList<>();
       
    public TakeTestJPanel(JPanel userProcessContainer, Ecosystem system, UserAccount userAccount, Request request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.ent=ent;
        this.org = org;
        this.request = request;
        populateTable();
        answerJPanel.setVisible(false);
        
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionOneTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        answerJPanel = new javax.swing.JPanel();
        answerComboBox = new javax.swing.JComboBox<>();
        btnSubmitAnswer = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblDoctorslist1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblDoctorslist1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoctorslist1.setText("Take the Test");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 204));
        jButton1.setText("Select answer");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        questionOneTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        questionOneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Questions", "Test Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        questionOneTable.setGridColor(new java.awt.Color(204, 204, 204));
        questionOneTable.setRowHeight(24);
        jScrollPane1.setViewportView(questionOneTable);
        if (questionOneTable.getColumnModel().getColumnCount() > 0) {
            questionOneTable.getColumnModel().getColumn(0).setResizable(false);
            questionOneTable.getColumnModel().getColumn(0).setPreferredWidth(600);
        }

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setText("Select question one-by-one and select appropriate answer");

        btnSubmitAnswer.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmitAnswer.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSubmitAnswer.setForeground(new java.awt.Color(0, 255, 204));
        btnSubmitAnswer.setText("Submit answer");
        btnSubmitAnswer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmitAnswer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitAnswerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitAnswerMouseExited(evt);
            }
        });
        btnSubmitAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitAnswerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout answerJPanelLayout = new javax.swing.GroupLayout(answerJPanel);
        answerJPanel.setLayout(answerJPanelLayout);
        answerJPanelLayout.setHorizontalGroup(
            answerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerJPanelLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(answerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(answerJPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btnSubmitAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        answerJPanelLayout.setVerticalGroup(
            answerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(answerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmitAnswer)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lblDoctorslist1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(answerJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorslist1)
                .addGap(41, 41, 41)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(answerJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 840, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int row = questionOneTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
              test=(Test)questionOneTable.getValueAt(row, 1);
              answerJPanel.setVisible(true);
               populateComboBox(test);
              
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSubmitAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitAnswerActionPerformed
        String answer = answerComboBox.getSelectedItem().toString();
        TestResult testResult = new TestResult(test.getTestName(),test.getQuestions(),answer);
        request.getTestResultDirectory().addResult(testResult);
        tableListTest.remove(test);
        JOptionPane.showMessageDialog(this, "Question's answer recorded successfully!");
        answerJPanel.setVisible(false);
        
        if(!tableListTest.isEmpty()){
            populateTable();
        }else{
             RequestDetailsIndividual requestDetails=new RequestDetailsIndividual(userProcessContainer,system,userAccount,request);
            userProcessContainer.add("requestDetails", requestDetails);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_btnSubmitAnswerActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new Color(0,255,204));
jButton1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setForeground(new Color(0,255,204));
jButton1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jButton1MouseExited

    private void btnSubmitAnswerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitAnswerMouseEntered
        // TODO add your handling code here:
        btnSubmitAnswer.setBackground(new Color(0,255,204));
btnSubmitAnswer.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnSubmitAnswerMouseEntered

    private void btnSubmitAnswerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitAnswerMouseExited
        // TODO add your handling code here:
        btnSubmitAnswer.setForeground(new Color(0,255,204));
btnSubmitAnswer.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnSubmitAnswerMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> answerComboBox;
    private javax.swing.JPanel answerJPanel;
    private javax.swing.JButton btnSubmitAnswer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoctorslist1;
    private javax.swing.JTable questionOneTable;
    // End of variables declaration//GEN-END:variables

       public void populateTable(){
            DefaultTableModel model = (DefaultTableModel) questionOneTable.getModel();
            model.setRowCount(0);
        if(tableListTest.isEmpty()){
            for(Network netwrk:system.getNetworkList()){
                for(Enterprise ent:netwrk.getEnterpriseDirectory().getEntList()){
                    if(ent.getEnterpriseType().getValue().equalsIgnoreCase("TestProviderEnterprise")){
                        for(Organization orga: ent.getOrganizationDirectory().getOrgList()){
                            if(orga.getType().getValue().equalsIgnoreCase("Test Definer")){
                                for(TestDefiner testdef: orga.getTestDefinerDirectory().getTestDefinerList()){
                                    for(Test test: testdef.getTestDirectory().getTestList()){
                                        for(Test testReq:request.getUserAssignedTestDirectory().getTestList()){
                                            if(test.getTestName().equalsIgnoreCase(testReq.getTestName())){
                                                tableListTest.add(test);
                                            }
                                        
                                        }
                                                
  
                                    }
                                }
                            }
                        }
                    }
                }
                }
        }
         for(Test t:tableListTest){
               Object[] row = new Object[2];
                  row[0] = t.getQuestions();
                  row[1] = t;
                  model.addRow(row);
         
         }
   
        
        }
        
        public void populateComboBox(Test test){
        answerComboBox.removeAllItems();
        for(String str: test.getAnswerList()){
        answerComboBox.addItem(str);
        }
        
        }


}
