/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 * Patient business class
 *
 * @author Divyansh
 */
public class Patient {

    private String name;
    private String PatientID;
    private Date dob;
    private String primaryDoctor;
    private String prefPharmacy;
    private VitalSignHistory vitalSignList;

    public Patient() {
        this.vitalSignList = new VitalSignHistory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(String primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    public String getPrefPharmacy() {
        return prefPharmacy;
    }

    public void setPrefPharmacy(String prefPharmacy) {
        this.prefPharmacy = prefPharmacy;
    }

    public VitalSignHistory getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(VitalSignHistory vitalSignList) {
        this.vitalSignList = vitalSignList;
    }

}
