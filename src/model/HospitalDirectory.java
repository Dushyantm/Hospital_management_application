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
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalList;
    
     public HospitalDirectory(){
        hospitalList = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
     public void addNewHospital(Hospital hospital){
        hospitalList.add(hospital);
    }
    
    public void deleteHospital(Hospital hospital){
        hospitalList.remove(hospital);
    }
    
}
