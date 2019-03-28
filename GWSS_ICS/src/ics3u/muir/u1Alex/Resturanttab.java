/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.muir.u1Alex;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1laiale
 */
public class Resturanttab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here



        Scanner input = new Scanner(System.in);
        System.out.println("Enter price value");
        double price = input.nextDouble();

        double tax = price * .13;
        double total = price + tax;

        // Money (localized)
        NumberFormat money = NumberFormat.getCurrencyInstance();



        System.out.println("The price of the hst " + money.format( tax ) );
        System.out.println("The total bill " + money.format( total ) );

    }
}
