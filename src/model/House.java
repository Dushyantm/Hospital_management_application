/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class House {
   private String houseName;
   private String houseCommunity;
   private int houseId;
   private String houseCity;
   private int houseCommId;
   private int houseCityId;

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseCommunity() {
        return houseCommunity;
    }

    public void setHouseCommunity(String houseCommunity) {
        this.houseCommunity = houseCommunity;
    }

    public String getHouseCity() {
        return houseCity;
    }

    public void setHouseCity(String houseCity) {
        this.houseCity = houseCity;
    }

    public int getHouseCommId() {
        return houseCommId;
    }

    public void setHouseCommId(int houseCommId) {
        this.houseCommId = houseCommId;
    }

    public int getHouseCityId() {
        return houseCityId;
    }

    public void setHouseCityId(int houseCityId) {
        this.houseCityId = houseCityId;
    }
    
    
   
     @Override
    public String toString(){
        return String.valueOf(houseId);
    }
   
}

