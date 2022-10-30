/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Hospital {
    
    private int hospitalId;
    private String hospitalName;
    private int hospitalStrength;
    private int hospitalCommId;
    private String hospitalCommunity;
    private String hospitalCity;
    
    public Hospital(){
    
    }
    
    public Hospital(int hospitalId, String hospitalName, int hosStrength, int hosComId, String hosComm, String hosCity){
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.hospitalStrength = hosStrength;
        this.hospitalCommId = hosComId;
        this.hospitalCommunity = hosComm;
        this.hospitalCity = hosCity;
    }

    public String getHospitalCommunity() {
        return hospitalCommunity;
    }

    public void setHospitalCommunity(String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getHospitalStrength() {
        return hospitalStrength;
    }

    public void setHospitalStrength(int hospitalStrength) {
        this.hospitalStrength = hospitalStrength;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public int getHospitalCommId() {
        return hospitalCommId;
    }

    public void setHospitalCommId(int hospitalCommId) {
        this.hospitalCommId = hospitalCommId;
    }
    
     @Override
    public String toString(){
        return String.valueOf(hospitalId);
    }
}
