/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;
import java.util.List;
import models.Soccer;

/**
 *
 * @author andre
 */
public class Response {
    private boolean success;
    private String message;
    private List<Object> list = new ArrayList<>();
    //private [] obj;
    
    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Response(boolean success, String message, List<Object> list) {
        this.success = success;
        this.message = message;
        this.list.clear();
        this.list = list;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }
    
    public List<Object> getList(){
        return this.list;
    }
}

