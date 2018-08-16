/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Bill;
import entities.Product;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anhquan12
 */
public class ProductController {

    private Scanner s = new Scanner(System.in);
    private ArrayList<Product> list = new ArrayList<>();

    public void addProduct() {

        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            Product p = new Product();
            System.out.println("Hello Customer , Please enter product !");
            System.out.println("Enter quantity product" + (i + 1) + ":");
            System.out.println("Enter id :");
            String id = new Scanner(System.in).nextLine();
            System.out.println("Enter count :");
            int count = new Scanner(System.in).nextInt();
            System.out.println("Enter price :");
            float price = new Scanner(System.in).nextFloat();
            System.out.println("Enter name  :");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Enter created at  :");
            String createdAt = new Scanner(System.in).nextLine();
            list.add(p);
        }

//        Bill b = new Bill();
//        System.out.println("Enter nameEmployee :");
//        String name = new Scanner(System.in).nextLine();
//        System.out.println("Enter createdAt :");
//        String createdAt = new Scanner(System.in).nextLine();
//        list.add(b);
    }

    public ArrayList<Product> getList() {
        for (int i = 0; i < list.size(); i++) {
            Product temp = list.get(i);
            System.out.println(temp.toString());
        }
        return list;
    }
}
