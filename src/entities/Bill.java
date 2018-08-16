/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author anhquan12
 */
public class Bill {
    private String name;
    private String createdAt;

    public Bill() {
    }
    
    

    public Bill(String name, String createdAt) {
        this.name = name;
        this.createdAt = createdAt;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Bill{" + "name=" + name + ", createdAt=" + createdAt + '}';
    }
    
    
}
