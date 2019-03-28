/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.muir.u1Alex;

/**
 *
 * @author 1laiale
 */
public class ifstatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {




        int mark = -2;

        if (mark < 0 || mark > 100) {
            System.out.println("Invalid Mark");
        } else if (mark >= 80) {
            System.out.println("A");
        } else if (mark >= 70) {
            System.out.println("B");
        } else if (mark >= 60) {
            System.out.println("C");
        } else if (mark >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


    }
}
