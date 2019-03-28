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
public class Studentaverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String name = input.nextLine();

        
        System.out.println("first mark");
        double firstMark = input.nextDouble();
        System.out.println("second mark");
        double secondMark = input.nextDouble();
        System.out.println("third mark");
        double thirdMark = input.nextDouble();
        System.out.println("fourth mark");
        double fourthMark = input.nextDouble();

        System.out.println("Your average" + ((firstMark +  secondMark + thirdMark + fourthMark) /4));






    }
}
