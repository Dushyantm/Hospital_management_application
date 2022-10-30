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
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList;
    
     public DoctorDirectory(){
        doctorList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public void addNewDoctor(Doctor doctor){
        doctorList.add(doctor);
    }
    
    public void deleteDoctor(Doctor doctor){
        doctorList.remove(doctor);
    }
}
