/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class City {
    private String cityName;
    private int cityId;

    public City(){
        
    }
    
    public City(String cityName, int cityId){
        this.cityName = cityName;
        this.cityId = cityId;
    }
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
    
      @Override
    public String toString(){
        return String.valueOf(cityId);
    }
    
    
}
