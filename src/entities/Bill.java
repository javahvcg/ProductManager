/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author anhquan12
 */
public  class Bill {
    private String nameEmployee;
    private String createdAt;

    public Bill() {
    }
    
    

    public Bill(String nameEmployee, String createdAt) {
        this.nameEmployee = nameEmployee;
        this.createdAt = createdAt;
    }
    
    

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    
}
