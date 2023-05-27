/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author andre
 */
public class Soccer extends Person{
    private int goals_score = 0;
    private int assists = 0;
    private int pass = 0; // Pase
    
    public Soccer (
        String name1, 
        String name2, 
        String lastName1, 
        String lastName2,
        int age ,
        int speed,
        String position,
        int goals_score,
        int assists,
        int pass
    ){
        super(name1,name2, lastName1, lastName2, age, speed, position);
        this.goals_score = goals_score;
        this.assists = assists;
        this.pass = pass;
    }

    public int getGoals_score() {
        return goals_score;
    }

    public void setGoals_score(int goals_score) {
        this.goals_score = goals_score;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }


    
}
