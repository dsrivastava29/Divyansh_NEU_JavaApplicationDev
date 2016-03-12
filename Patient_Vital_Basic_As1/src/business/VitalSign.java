/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 * Vital Sign Business Class
 *
 * @author Divyansh
 */
public class VitalSign {

    private float respRate;
    private float heartRate;
    private float bloodPressure;
    private float weight;
    private Date captureTime;

    public float getRespRate() {
        return respRate;
    }

    public void setRespRate(float respRate) {
        this.respRate = respRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Date getCaptureTime() {
        return captureTime;
    }

    public void setCaptureTime(Date captureTime) {
        this.captureTime = captureTime;
    }

    @Override
    public String toString() {
        return captureTime.toString();
    }

}
