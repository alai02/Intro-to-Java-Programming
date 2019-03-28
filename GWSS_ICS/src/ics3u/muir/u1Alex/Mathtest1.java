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
public class Mathtest1 {

    public static void main(String[] args) {

        // Decimal (localized)
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(0);
        decimal.setMaximumFractionDigits(2);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter length value");
        double length = input.nextDouble();
        System.out.println("Enter width value");
        double width = input.nextDouble();


        double area = length * width;
        double premiter = (length * 2 + width * 2);

        System.out.println("The area " + decimal.format (length * width));
        System.out.println("The premiter " + decimal.format (length * 2 + width * 2));




        //Math.pow


    }
}
