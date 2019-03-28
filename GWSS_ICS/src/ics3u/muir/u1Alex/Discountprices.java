package edu.hdsb.gwss.ics3u.muir.u1Alex;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1laiale
 */
public class Discountprices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of item");
        int price = input.nextInt();


        if (price >= 1000) {
            price = price - (int) (0.1 * price);
            System.out.println("discount" + price);
        } else {
            System.out.println("p" + price);
        }

    }
}
