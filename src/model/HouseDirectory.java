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
public class HouseDirectory {
    
    private ArrayList<House> houseList;
    
     public HouseDirectory(){
        houseList = new ArrayList<>();
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    
    public void addNewHouse(House house){
        houseList.add(house);
    }
    
    public void deleteHouse(House house){
        houseList.remove(house);
    }
    
}
