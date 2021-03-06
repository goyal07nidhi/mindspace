/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Patient;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.EventOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EventWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amruta
 */
public class PatientFeedbackJPanel extends javax.swing.JPanel {

    /**
     * Creates new form patientFeedbackJPanel
     */
     private final JPanel userProcessContainer;
    private final EcoSystem system;
    private final Patient patient;
    private ArrayList<Enterprise> hospitalEnt,ngoEnt;
    public PatientFeedbackJPanel(JPanel container, Patient patient, EcoSystem system) {
        initComponents();
        this.userProcessContainer = container;
        this.patient = patient;
        this.system = system;
        this.hospitalEnt = system.getEnterprise(patient.getLocation(), Enterprise.EnterpriseType.Hospital);
        this.ngoEnt = system.getEnterprise(patient.getLocation(), Enterprise.EnterpriseType.NGO);

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
        patientTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        structRateComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orgRateComboBox = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        doctorTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        patientTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment Date", "Doctor", "Appointment Reason", "Enterprise", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTbl);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        structRateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excellent", "Moderate", "Not Useful" }));

        jLabel1.setText("Rate Event Structure:");

        jLabel2.setText("Rate Event Organizer:");

        orgRateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excellent", "Moderate", "Not Friendly" }));

        doctorTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City", "Hospital Name", "Doctor Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctorTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(doctorTbl);

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Malayalam Sangam MN", 3, 14)); // NOI18N
        jLabel3.setText("You can visit following doctors for further counseling:");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Rate your event experience:");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(structRateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(orgRateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(structRateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orgRateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int structureRating=0;
        int eventOrganizationRating=0;
        String stuctureFeedback=(String)structRateComboBox.getSelectedItem();
        String eventOrganizerFeedback=(String)orgRateComboBox.getSelectedItem();
        if(stuctureFeedback.equals("Excellent"))
        {
            structureRating=90;
        }
        else if(stuctureFeedback.equals("Moderate"))
        {
            structureRating=50;
        }
        else if(stuctureFeedback.equals("Not Useful"))
        {
            structureRating=20;
        }
        if(eventOrganizerFeedback.equals("Excellent"))
        {
            eventOrganizationRating=90;
        }
        else if(eventOrganizerFeedback.equals("Moderate"))
        {
            eventOrganizationRating=50;
        }
        else if(eventOrganizerFeedback.equals("Not Useful"))
        {
            eventOrganizationRating=20;
        }
        if(structureRating<50 && eventOrganizationRating<50)
        {
            System.out.println("inside");
            populateDoctorTable(system.getDoctorsByNetwork(patient.getLocation()));
        }
        
        
        
        //patientProgressBar.setValue(value);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

public void populateDoctorTable(ArrayList<UserAccount> doctorList) {
    DefaultTableModel model = (DefaultTableModel) doctorTbl.getModel();
        model.setRowCount(0);   
        for (Enterprise ent : this.hospitalEnt) {          
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof DoctorOrganization) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getRole().getRoleType() == Role.RoleType.Doctor) {
                            Object[] row = new Object[4];
                            row[0] = patient.getLocation();
                            row[1] = ent;
                            row[2] = ua;
                            row[3] = org;
                            model.addRow(row);
                        }
                    }
                }
            }
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable doctorTbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> orgRateComboBox;
    private javax.swing.JTable patientTbl;
    private javax.swing.JComboBox<String> structRateComboBox;
    // End of variables declaration//GEN-END:variables
}
