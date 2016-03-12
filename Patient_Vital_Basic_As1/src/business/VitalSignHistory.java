/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 * Vital Sign History List
 *
 * @author Divyansh
 */
public class VitalSignHistory {

    private ArrayList<VitalSign> vsList;

    public VitalSignHistory() {
        this.vsList = new ArrayList<>();
    }

    public ArrayList<VitalSign> getVsList() {
        return vsList;
    }

    public void setVsList(ArrayList<VitalSign> vsList) {
        this.vsList = vsList;
    }

    public VitalSign addVitalSign() {
        VitalSign v = new VitalSign();
        vsList.add(v);
        return v;
    }

    public void deleteVitalSign(VitalSign vitalSign) {
        vsList.remove(vitalSign);
    }
}
