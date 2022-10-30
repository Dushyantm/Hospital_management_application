/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Doctor {
    
    private int doctorId;
    private String doctorFirstName;
    private String doctorLastName;
    private int doctorAge;
    private String doctorHospital;
    private int doctorHosId;
    private String docUsername;
    private String docPassword;

    public Doctor(int id, String fName, String lName, int age, String hospital, int hosId, String uname,String pass) {
        this.doctorId = id;
        this.doctorFirstName = fName;
        this.doctorLastName = lName;
        this.doctorAge = age;
        this.doctorHospital = hospital;
        this.doctorHosId = hosId;
        this.docUsername = uname;
        this.docPassword = pass;
    }

    public Doctor() {
        
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public void setDoctorFirstName(String doctorFirstName) {
        this.doctorFirstName = doctorFirstName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public void setDoctorLastName(String doctorLastName) {
        this.doctorLastName = doctorLastName;
    }

    public int getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(int doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getDoctorHospital() {
        return doctorHospital;
    }

    public void setDoctorHospital(String doctorHospital) {
        this.doctorHospital = doctorHospital;
    }

    public int getDoctorHosId() {
        return doctorHosId;
    }

    public void setDoctorHosId(int doctorHosId) {
        this.doctorHosId = doctorHosId;
    }

    public String getDocUsername() {
        return docUsername;
    }

    public void setDocUsername(String docUsername) {
        this.docUsername = docUsername;
    }

    public String getDocPassword() {
        return docPassword;
    }

    public void setDocPassword(String docPassword) {
        this.docPassword = docPassword;
    }
    
       @Override
    public String toString(){
        return String.valueOf(doctorId);
    }
}
