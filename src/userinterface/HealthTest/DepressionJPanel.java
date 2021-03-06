/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.HealthTest;

import Business.EcoSystem;
import Business.Hospital.TestReport;
import Business.Patient.Patient;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Patient.PatientWorkAreaJPanel;

/**
 *
 * @author Nidhi Goyal
 */
public class DepressionJPanel extends javax.swing.JPanel {
    private final JPanel userProcessContainer;
    private final Patient patient;
    
    public DepressionJPanel(JPanel userContainer, Patient patient, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userContainer;
        this.patient = patient;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        Question3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Question2 = new javax.swing.JComboBox();
        Question1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Question4 = new javax.swing.JComboBox();
        Question7 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        Question5 = new javax.swing.JComboBox();
        Question8 = new javax.swing.JComboBox();
        Question6 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Depression Test");

        jLabel2.setText("Please answer following question:");

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        Question3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one", "Not at all", "Several days", "More than half the days", "Nearly every day" }));
        Question3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question3ActionPerformed(evt);
            }
        });

        jLabel3.setText("1. Little interest or pleasure in doing things:");

        jLabel4.setText("2. Feeling down, depressed or hopeless:");

        jLabel5.setText("3. Trouble falling or staying asleep or sleeping too much:");

        Question2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one", "Not at all", "Several days", "More than half the days", "Nearly every day" }));
        Question2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question2ActionPerformed(evt);
            }
        });

        Question1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one", "Not at all", "Several days", "More than half the days", "Nearly every day" }));
        Question1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question1ActionPerformed(evt);
            }
        });

        jLabel6.setText("4. Feeling tired or having little energy or Poor appetite or overeating:");

        jLabel7.setText("5. Feeling bad about yourself or that you are a failure:");

        Question4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one", "Not at all", "Several days", "More than half the days", "Nearly every day" }));
        Question4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question4ActionPerformed(evt);
            }
        });

        Question7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one", "Not at all", "Several days", "More than half the days", "Nearly every day" }));
        Question7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question7ActionPerformed(evt);
            }
        });

        jLabel8.setText("7. Trouble concentrating on things:");

        Question5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one", "Not at all", "Several days", "More than half the days", "Nearly every day" }));
        Question5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question5ActionPerformed(evt);
            }
        });

        Question8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one", "Not at all", "Several days", "More than half the days", "Nearly every day" }));
        Question8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question8ActionPerformed(evt);
            }
        });

        Question6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one", "Not at all", "Several days", "More than half the days", "Nearly every day" }));
        Question6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question6ActionPerformed(evt);
            }
        });

        jLabel9.setText("6. Moving or speaking so slowly that other people could have noticed: ");

        jLabel10.setText("8. Thoughts that you would be better off dead or of hurting yourself");

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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(submitBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Question8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Question7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Question1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Question2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Question3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Question4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Question5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Question7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Question6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Question8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(submitBtn)
                .addGap(92, 92, 92))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        Object selectedItem  = Question1.getSelectedItem();
        Object selectedItem1 = Question2.getSelectedItem();
        Object selectedItem2 = Question3.getSelectedItem();
        Object selectedItem3 = Question4.getSelectedItem();
        Object selectedItem4 = Question5.getSelectedItem();
        Object selectedItem5 = Question6.getSelectedItem();
        Object selectedItem6 = Question7.getSelectedItem();
        Object selectedItem7 = Question8.getSelectedItem();
        ArrayList<String> allInputs = new ArrayList<>();
        allInputs.add(selectedItem.toString());
        allInputs.add(selectedItem1.toString());
        allInputs.add(selectedItem2.toString());
        allInputs.add(selectedItem3.toString());
        allInputs.add(selectedItem4.toString());
        allInputs.add(selectedItem5.toString());
        allInputs.add(selectedItem6.toString());
        allInputs.add(selectedItem7.toString());
        //get countOfNearlyEveryday
        String recommendation = "" ;
        int score = 0;
        int everyday = 0;
        int severaldays = 0;
        int morethanhalf = 0 ;
        int notatall = 0;
        for(String s : allInputs) {
            if(s.equals("Nearly every day")) {
                everyday++;
            }
            else if(s.equals("Several days")) {
                severaldays++;
            }
            else if(s.equals("More than half the days")) {
                morethanhalf++;
            }
            else if(s.equals("Not at all")) {
                notatall++;
            }
        }

        if(everyday >= 2) {
            JOptionPane.showMessageDialog(null, "Score: " + everyday + ". Consult a Doctor Immediately");
            recommendation = "Consult a doctor right away";
            score = everyday;
        }
        else if(severaldays > everyday) {
            JOptionPane.showMessageDialog(null, "Score: " + severaldays + ". We suggest you to attend fun events and seminar");
            recommendation = "Attend fun events and seminar";
            score = severaldays;
        }
        else if(morethanhalf > severaldays) {
            JOptionPane.showMessageDialog(null, "Score: " + morethanhalf + ". Moderate Depression ");
            recommendation = "Attend yoga sessions";
            score = morethanhalf;
        }
        else if(notatall > morethanhalf) {
            JOptionPane.showMessageDialog(null, "Score: "+ notatall + ". Relax you are fine!!");
            recommendation = "You are fine";
            score = notatall;
        }

        TestReport report = new TestReport("Depression", score, recommendation);
        this.patient.addTestReport(report);
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientWorkAreaJPanel dwjp = (PatientWorkAreaJPanel) component;
        dwjp.populateTestHistory();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }                                         

    private void Question3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Question3ActionPerformed

    private void Question2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Question2ActionPerformed

    private void Question1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Question1ActionPerformed

    private void Question4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Question4ActionPerformed

    private void Question7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Question7ActionPerformed

    private void Question5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Question5ActionPerformed

    private void Question8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Question8ActionPerformed

    private void Question6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Question6ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Question1;
    private javax.swing.JComboBox Question2;
    private javax.swing.JComboBox Question3;
    private javax.swing.JComboBox Question4;
    private javax.swing.JComboBox Question5;
    private javax.swing.JComboBox Question6;
    private javax.swing.JComboBox Question7;
    private javax.swing.JComboBox Question8;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
