/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awz5082
 */
public class Person {
    private String name;
    private String gender;
    private Room location;
    
    public Person (String name, String gender, Room location)
    {
        this.name = name;
        this.gender = gender;
        this.location = location;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the location
     */
    public Room getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Room location) {
        this.location = location;
    }
    public String getPersonInfo()
    {
        return "Name: "+name+", Gender: "+gender+", Location: "+location.getName()+" "+location.getRoomNumber();
    }
}
