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
public class HallCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("Your name?:");
        String username = input.nextLine();
        System.out.println("Number of guests?:");
        double amountOfguests = input.nextDouble();
        System.out.println("Cost per person");
        double cost = input.nextDouble();
        System.out.println("Cost total "  + (350 + (amountOfguests * cost)));



    }
}
