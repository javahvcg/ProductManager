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
    private Bill bill;

    public Product() {
    }

    public Product(String id, float price, Bill bill) {
        this.id = id;
        this.price = price;
        this.bill = bill;
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

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price + ", bill=" + bill + '}';
    }

    
}
