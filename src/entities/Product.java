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
public class Product {

    private String id;
    private float price;
    private String nameEmployee;
    private String createdAt;

    public Product() {
    }

    public Product(String id, float price,  String nameEmployee, String createdAt) {
        this.id = id;
        this.price = price;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price +  ", nameEmployee=" + nameEmployee + ", createdAt=" + createdAt + '}';
    }

}
