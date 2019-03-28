/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.muir.u1Alex;

import java.util.Scanner;

/**
 *
 * @author 1laiale
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Scanner input = new Scanner(System.in);
        System.out.println("Enter change value");
        int change = input.nextInt();


        int quarters = change/25;
        change = change - (quarters * 25);

        int dimes = change/10;
        change = change - (dimes * 10);

        int nickles = change/5;
        change = change - (dimes * 5);

       int pennies = change/1;
        change = change - (pennies * 1);
                
        System.out.println(change );

    }

}
