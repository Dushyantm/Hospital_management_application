/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Person {
    
    
    private String firstName;
    private String lastName;
    private int personAge;
    private String personCityName;
    private String personCommunityName;
    private String personHouseNo;
    private int personId;
    private String personUserName;
    private String personPassword;
    private String gender;
    
    public Person(){
    
    }
    
    public Person(String fName, String lName, int age, String cityName, String commName, String HouseName, int id, String Uname, String pass
    , String gender){
      this.firstName = fName;
      this.lastName = lName;
      this.personAge = age;
      this.personCityName = cityName;
      this.personCommunityName = commName;
      this.personHouseNo = HouseName;
      this.personId = id;
      this.personUserName = Uname;
      this.personPassword = pass;
      this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonCityName() {
        return personCityName;
    }

    public void setPersonCityName(String personCityName) {
        this.personCityName = personCityName;
    }

    public String getPersonCommunityName() {
        return personCommunityName;
    }

    public void setPersonCommunityName(String personCommunityName) {
        this.personCommunityName = personCommunityName;
    }

    public String getPersonHouseNo() {
        return personHouseNo;
    }

    public void setPersonHouseNo(String personHouseNo) {
        this.personHouseNo = personHouseNo;
    }
    
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonPassword() {
        return personPassword;
    }

    public void setPersonPassword(String personPassword) {
        this.personPassword = personPassword;
    }

    public String getPersonUserName() {
        return personUserName;
    }

    public void setPersonUserName(String personUserName) {
        this.personUserName = personUserName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
      @Override
    public String toString(){
        return String.valueOf(personId);
    }
      
}
