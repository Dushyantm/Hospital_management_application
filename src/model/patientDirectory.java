/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    
     public PatientDirectory(){
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public void addNewPatient(Patient patient){
        patientList.add(patient);
    }
    
    public void deletePatient(Patient patient){
        patientList.remove(patient);
    }
    
}
