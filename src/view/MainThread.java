/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProductController;
import java.util.Scanner;

/**
 *
 * @author anhquan12
 */
public class MainThread {

    private static Scanner s = new Scanner(System.in);
    private static ProductController controller = new ProductController();

    public static void main(String[] args) {
        int choice = 0;
        while (true) {
            System.out.println("=================== Menu ==================");
            System.out.println("1. Enter infomation");
            System.out.println("2. Display information");
            System.out.println("3. : ");
            System.out.println("4. Exit !");
            System.out.println("Error, Try again !: ");
            System.out.println("===========================================");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    controller.sellProduct();
                    break;
                case 2:
                    controller.getList();
                    break;
                case 3:

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Error ! .");
                    break;
            }
        }
    }
}
