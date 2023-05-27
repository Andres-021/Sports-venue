/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author andre
 */
public class Person {
    private int cod = 0;
    private String name1 = "";
    private String name2 = "";
    private String lastName1 = "";
    private String lastName2 = "";
    private int age = 0;
    private int speed = 0;
    private String position = "";
    
    // CONSTRUCTOR
    public Person (
            int cod,
            String name1, 
            String name2, 
            String lastName1, 
            String lastName2,
            int age ,
            int speed,
            String position
    ){
        this.cod = cod;
        this.name1 = name1;
        this.name2 = name2;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.age  = age ;
        this.speed = speed;
        this.position = position;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    
    
}
