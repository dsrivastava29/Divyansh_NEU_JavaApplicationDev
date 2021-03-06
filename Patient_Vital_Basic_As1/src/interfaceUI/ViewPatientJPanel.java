/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceUI;

import business.Patient;
import business.VitalSign;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Divyansh
 */
public class ViewPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createPatientJPanel
     */
    Patient patient;
    String NORMAL = "NORMAL";
    String ABNORMAL = "ABNORMAL";

    public ViewPatientJPanel(Patient patient) {
        initComponents();
        this.patient = patient;
        loadPatientDetails();
        viewPanel.setVisible(false);
        addVitalPanel1.setVisible(false);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        patIdJLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patNameJLbl = new javax.swing.JLabel();
        ageJLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        primDoctorLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        prefPharmacyLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalHistoryJTable = new javax.swing.JTable();
        viewSelectedVitalJButton = new javax.swing.JButton();
        viewPanel = new javax.swing.JPanel();
        addVitalPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        respRateLbl = new javax.swing.JLabel();
        hrtRateLbl = new javax.swing.JLabel();
        bpLbl = new javax.swing.JLabel();
        wtLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        indicatorJTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(698, 598));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Patient Id");

        patIdJLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patIdJLbl.setText("Id");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Patient Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Age");

        patNameJLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patNameJLbl.setText("Name");

        ageJLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ageJLbl.setText("Age");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Vital Sign History");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Primary Doctor");

        primDoctorLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        primDoctorLbl.setText("Doctor");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Preferred Pharmacy");

        prefPharmacyLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prefPharmacyLbl.setText("Pharmacy");

        vitalHistoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Capture Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalHistoryJTable);

        viewSelectedVitalJButton.setBackground(new java.awt.Color(255, 204, 204));
        viewSelectedVitalJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewSelectedVitalJButton.setText("View Selected Vital Sign");
        viewSelectedVitalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSelectedVitalJButtonActionPerformed(evt);
            }
        });

        addVitalPanel1.setBackground(new java.awt.Color(255, 255, 255));
        addVitalPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Respiratory Rate");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Heart Rate");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Systolic Blood Pressure");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Weight");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Date of record");

        respRateLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        respRateLbl.setText("resp");

        hrtRateLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hrtRateLbl.setText("hrt");

        bpLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bpLbl.setText("bp");

        wtLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wtLbl.setText("wt");

        dateLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateLbl.setText("date");

        indicatorJTxt.setEditable(false);

        javax.swing.GroupLayout addVitalPanel1Layout = new javax.swing.GroupLayout(addVitalPanel1);
        addVitalPanel1.setLayout(addVitalPanel1Layout);
        addVitalPanel1Layout.setHorizontalGroup(
            addVitalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addVitalPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addVitalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(addVitalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addGroup(addVitalPanel1Layout.createSequentialGroup()
                        .addGroup(addVitalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hrtRateLbl)
                            .addComponent(bpLbl)
                            .addComponent(wtLbl))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addVitalPanel1Layout.createSequentialGroup()
                        .addComponent(respRateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(indicatorJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addContainerGap())
        );
        addVitalPanel1Layout.setVerticalGroup(
            addVitalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addVitalPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(addVitalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(respRateLbl)
                    .addComponent(indicatorJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addVitalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(hrtRateLbl))
                .addGap(18, 18, 18)
                .addGroup(addVitalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14)
                    .addComponent(bpLbl))
                .addGap(18, 18, 18)
                .addGroup(addVitalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel15)
                    .addComponent(wtLbl))
                .addGap(18, 18, 18)
                .addGroup(addVitalPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(dateLbl))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(593, 593, 593)
                        .addComponent(viewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addVitalPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewSelectedVitalJButton))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patNameJLbl)
                                    .addComponent(primDoctorLbl)
                                    .addComponent(prefPharmacyLbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(patIdJLbl)))
                        .addGap(121, 355, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(ageJLbl))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(patIdJLbl))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(patNameJLbl)
                    .addComponent(ageJLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(primDoctorLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(prefPharmacyLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewSelectedVitalJButton)
                .addGap(0, 0, 0)
                .addComponent(viewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addVitalPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewSelectedVitalJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSelectedVitalJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = vitalHistoryJTable.getSelectedRow();
        if (selectedRow >= 0) {
            VitalSign vs = (VitalSign) vitalHistoryJTable.getValueAt(selectedRow, 0);
            respRateLbl.setText(String.valueOf(vs.getRespRate()));
            hrtRateLbl.setText(String.valueOf(vs.getHeartRate()));
            bpLbl.setText(String.valueOf(vs.getBloodPressure()));
            wtLbl.setText(String.valueOf(vs.getWeight()));
            dateLbl.setText(String.valueOf(vs.getCaptureTime()));
            String status = (String) vitalHistoryJTable.getValueAt(selectedRow, 1);
            if (status.equals(NORMAL)) {
                indicatorJTxt.setBackground(Color.GREEN);
            } else if (status.equals(ABNORMAL)) {
                indicatorJTxt.setBackground(Color.RED);
            } else {
                indicatorJTxt.setBackground(Color.WHITE);
            }
            viewPanel.setVisible(true);
            addVitalPanel1.setVisible(true);
        } else {
            JOptionPane.showConfirmDialog(null, "First, select a row form table", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewSelectedVitalJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addVitalPanel1;
    private javax.swing.JLabel ageJLbl;
    private javax.swing.JLabel bpLbl;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel hrtRateLbl;
    private javax.swing.JTextField indicatorJTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patIdJLbl;
    private javax.swing.JLabel patNameJLbl;
    private javax.swing.JLabel prefPharmacyLbl;
    private javax.swing.JLabel primDoctorLbl;
    private javax.swing.JLabel respRateLbl;
    private javax.swing.JPanel viewPanel;
    private javax.swing.JButton viewSelectedVitalJButton;
    private javax.swing.JTable vitalHistoryJTable;
    private javax.swing.JLabel wtLbl;
    // End of variables declaration//GEN-END:variables

    private void loadPatientDetails() {
        patIdJLbl.setText(String.valueOf(patient.getPatientID()));
        patNameJLbl.setText(patient.getName());
        long timeDiff = 0;
        timeDiff = Calendar.getInstance().getTimeInMillis() - patient.getDob().getTime();
        ageJLbl.setText(String.valueOf(timeDiff / (365L * 24 * 60 * 60 * 1000)));
        primDoctorLbl.setText(patient.getPrimaryDoctor());
        prefPharmacyLbl.setText(patient.getPrefPharmacy());
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) vitalHistoryJTable.getModel();
        int rowCount = vitalHistoryJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
        for (VitalSign vs : patient.getVitalSignList().getVsList()) {
            Object row[] = new Object[2];
            row[0] = vs;
            row[1] = getStatus(vs).toString();
            dtm.addRow(row);
        }
    }

    private Object getStatus(VitalSign vs) {
        long timeDiff = 0;
        timeDiff = vs.getCaptureTime().getTime() - patient.getDob().getTime();
        int captureAge = (int) (timeDiff / (365L * 24 * 60 * 60 * 1000));
        System.out.println("age for " + captureAge);
        int ageGroup = 0;
        if (captureAge >= 1 && captureAge <= 3) {
            ageGroup = 1;
        }
        if (captureAge >= 4 && captureAge <= 5) {
            ageGroup = 2;
        }
        if (captureAge >= 6 && captureAge <= 12) {
            ageGroup = 3;
        }
        if (captureAge >= 13) {
            ageGroup = 4;
        }
        System.out.println("getstatus for check " + ageGroup);
        float respRate = vs.getRespRate();
        float hrtRate = vs.getHeartRate();
        float bp = vs.getBloodPressure();
        float wt = vs.getWeight();
        switch (ageGroup) {
            case 1:
                System.out.println("getstatus for " + ageGroup);
                if (respRate >= 20 && respRate <= 30 && hrtRate >= 80 && hrtRate <= 130 && bp >= 80 && bp <= 110 && wt >= 22 && wt <= 31) {
                    return NORMAL;
                } else {
                    return ABNORMAL;
                }

            case 2:
                System.out.println("getstatus for " + ageGroup);
                if (respRate >= 20 && respRate <= 30 && hrtRate >= 80 && hrtRate <= 120 && bp >= 80 && bp <= 110 && wt >= 31 && wt <= 40) {
                    return NORMAL;
                } else {
                    return ABNORMAL;
                }
            case 3:
                System.out.println("getstatus for " + ageGroup);
                if (respRate >= 20 && respRate <= 30 && hrtRate >= 70 && hrtRate <= 110 && bp >= 80 && bp <= 120 && wt >= 41 && wt <= 92) {
                    return NORMAL;
                } else {
                    return ABNORMAL;
                }
            case 4:
                System.out.println("getstatus for " + ageGroup);
                if (respRate >= 12 && respRate <= 20 && hrtRate >= 55 && hrtRate <= 105 && bp >= 110 && bp <= 120 && wt >= 110) {
                    return NORMAL;
                } else {
                    return ABNORMAL;
                }

        }
        return "No Status";
    }
}
