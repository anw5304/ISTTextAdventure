/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */

//Refactor- Extract Subclass

public class Professor extends Person {
    
    private boolean hasHomework;
    private boolean isProfessor;

    public Professor(String name, String gender, Room location, boolean hasHomework, boolean isProfessor) {
        super(name, gender, location);
        hasHomework = false;
        isProfessor = true;
    }

    /**
     * @return the hasHomework
     */
    public boolean isHasHomework() {
        return hasHomework;
    }

    /**
     * @param hasHomework the hasHomework to set
     */
    public void setHasHomework(boolean hasHomework) {
        this.hasHomework = hasHomework;
    }
    
    @Override
    public String getPersonInfo()
    {
        super.getPersonInfo();
        return ", Is Professor: "+isProfessor;
    }
    
    public boolean isProfessor() {
        return isProfessor;
    }

    public void setIsProfessor(boolean isProfessor) {
        this.isProfessor = isProfessor;
    }
}