/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author az060_001
 */

//Refactor- Extract Subclass

public class Player extends Person {
    
    private boolean isPlayer;

    public Player(String name, String gender, boolean isPlayer, Room location) {
        super(name, gender, location);
        isPlayer = true;
    }

    /**
     * @return the hasHomework
     */
    public boolean isPlayer() {
        return isPlayer;
    }

    public void setisPlayer(boolean isPlayer) {
        this.isPlayer = isPlayer;
    }

    @Override
    public String getPersonInfo()
    {
        super.getPersonInfo();
        return ", Is Player: "+isPlayer;
    }
}