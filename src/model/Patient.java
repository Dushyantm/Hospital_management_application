/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Patient {
    
    Person person;
    private int patientId;
    /*
    private String patientFirstName;
    private String patientLastName;
    private int PatientAge;
    private String PatientCommunity;
    private String PatientCity;
    private int PatientHouse;
    */
    private int patientDoctorId;
    private String patientDoctorName;
    private String patientHospitalName;
    
    public Patient(Person person){
        
        this.person = person;
    
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientFirstName() {
        return person.getFirstName();
    }

    public String getPatientLastName() {
        return person.getLastName();
    }

    public int getPatientAge() {
        return person.getPersonAge();
    }

    public String getPatientCommunity() {
        return person.getPersonCommunityName();
    }

    public String getPatientCity() {
        return person.getPersonCityName();
    }

    public String getPatientHouse() {
        return person.getPersonHouseNo();
    }
    
    public int getPatientDoctorId() {
        return patientDoctorId;
    }

    public void setPatientDoctorId(int patientDoctorId) {
        this.patientDoctorId = patientDoctorId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getPatientHospitalName() {
        return patientHospitalName;
    }

    public void setPatientHospitalName(String patientHospitalName) {
        this.patientHospitalName = patientHospitalName;
    }

    public String getPatientDoctorName() {
        return patientDoctorName;
    }

    public void setPatientDoctorName(String patientDoctorName) {
        this.patientDoctorName = patientDoctorName;
    }
    
    
    public String getPatientGender(){
           return person.getGender();
    }
    

    
        @Override
    public String toString(){
        return String.valueOf(patientId);
    }
    
    
}
