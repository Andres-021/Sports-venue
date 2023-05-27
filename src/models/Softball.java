/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author andre
 */
public class Softball extends Person{
    private int batting = 0; // bateo
    private int pitching = 0; // lanzamiento
    
    public Softball (
            String name1,
            String name2,
            String lastName1,
            String lastName2,
            int age,
            int speed,
            String position,
            int batting,
            int pitching
    ){
        super(name1,name2, lastName1, lastName2, age, speed, position);
        this.batting = batting;
        this.pitching = pitching;
    }

    public int getBatting() {
        return batting;
    }

    public void setBatting(int batting) {
        this.batting = batting;
    }

    public int getPitching() {
        return pitching;
    }

    public void setPitching(int pitching) {
        this.pitching = pitching;
    }
    
    
    
}
