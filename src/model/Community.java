/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Community {
    
    private String communityAddress;
    private int communityID;
    private int cityID;
    private int communityZip;
    
    public Community(){
        
    }
    
    public Community(String name, int commId, int cityId){
        this.communityAddress = name;
        this.communityID = commId;
        this.cityID = cityId;
    }

    public String getCommunityAddress() {
        return communityAddress;
    }

    public void setCommunityAddress(String communityName) {
        this.communityAddress = communityName;
    }

    public int getCommunityID() {
        return communityID;
    }

    public void setCommunityID(int communityID) {
        this.communityID = communityID;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getCommunityZip() {
        return communityZip;
    }

    public void setCommunityZip(int communityZip) {
        this.communityZip = communityZip;
    }
    
}
