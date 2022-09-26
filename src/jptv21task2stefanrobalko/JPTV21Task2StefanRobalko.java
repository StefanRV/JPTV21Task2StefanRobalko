/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21task2stefanrobalko;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21Task2StefanRobalko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num > 99 && num <= 999){
        int fir =(num%10);
        int sec =(num/10%10);
        int third = (num/100);
        int sum = fir + sec + third;
        System.out.println("Sum = "+sum);
        }
        else{
            System.out.println("Wrong number");
        }
    }
    
}
