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
public class CommunityDirectory {
    private ArrayList<Community> communityList;
    
     public CommunityDirectory(){
        communityList = new ArrayList<>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public void addNewCommunity(Community community){
        communityList.add(community);
    }
    
    public void deleteCommunity(Community community){
        communityList.remove(community);
    }
}
