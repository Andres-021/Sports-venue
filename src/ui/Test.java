/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import utils.Response;
import models.Soccer;
import models.Softball;
import controller.SoccerController;
import controller.SoftballController;
import java.util.List;

/**
 *
 * @author andre
 */
public class Test {
    public static void main(String[] args) { 
       
        softball();
        soccer();
    }
    
    public static void softball(){
        List<Object> list;
        // Creamos una instancia del controllador para acceder al CRUD
        SoftballController softballController = new SoftballController();
        // Luego una instancia del modelo para llenar los datos
        //"name1, name2, lastName1, lastName2, age, speed, position, goals_score, assists, pass"
//        Softball softball = new Softball("Andres","Felipe","Quintero","Bautista", 20, 50, "Bateador",90, 18);
//        Response res = softballController.insert(softball);
//        // Crear un objeto res ya que solo vamos a recibir una respuesta del metodo insert de la clase controller
        
        Response res = softballController.getAll();
        System.out.println(res.getMessage());
        list = res.getList();
        for (Object data: list) {
                Softball softball = (Softball) data;
                System.out.println(
                        softball.getName1()+" "+
                        softball.getName2()+" "+
                        softball.getLastName1()+" "+
                                softball.getLastName2()+" "+
                                softball.getAge()+" "+
                                softball.getSpeed()+" "+
                                softball.getPosition()+" "+
                                softball.getBatting()+" "+
                                softball.getPitching()
                );
        }
    }
    
    public static void soccer(){
        List<Object> list;
        // Creamos una instancia del controllador para acceder al CRUD
        SoccerController soccerController = new SoccerController();
        // Luego una instancia del modelo para llenar los datos
        //"name1, name2, lastName1, lastName2, age, speed, position, goals_score, assists, pass"
//        Soccer soccer = new Soccer("Andres","Felipe","Quintero","Bautista", 20, 50, "Delantero",5, 18, 40);
//        // Crear un objeto res ya que solo vamos a recibir una respuesta del metodo insert de la clase controller
        Response res = soccerController.getAll();
        System.out.println(res.getMessage());
        list = res.getList();
        for (Object data: list) {
                Soccer soccer = (Soccer) data;
                System.out.println(
                        soccer.getName1()+" "+
                        soccer.getName2()+" "+
                        soccer.getLastName1()+" "+
                                soccer.getLastName2()+" "+
                                soccer.getAge()+" "+
                                soccer.getSpeed()+" "+
                                soccer.getPosition()+" "+
                                soccer.getGoals_score()+" "+
                                soccer.getAssists()+" "+
                                soccer.getPass()
                );
        }
    }
}
