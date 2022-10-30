/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */

public class Encounter {
    private int encounterno;
    private int encpatientid;
    private Date timestamp;
    private ArrayList<VitalSigns> vitalSignList;

    public int getEncpatientid() {
        return encpatientid;
    }

    public void setEncpatientid(int encpatientid) {
        this.encpatientid = encpatientid;
    }
    
    public Encounter(){
    vitalSignList = new ArrayList<>();
    }

    public int getEncounterno() {
        return encounterno;
    }

    public void setEncounterno(int encounterno) {
        this.encounterno = encounterno;
    }

    public ArrayList<VitalSigns> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSigns> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public void addVitalSign(VitalSigns vitalSign){
    this.vitalSignList.add(vitalSign);
            }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(timestamp);
    }
}
