/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author ACER
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah = 3;
        
        for (int i = 1; i <= jumlah; i++) {
            for (int f = 1; f <= jumlah; f++) {
                if (f == 1 || f == jumlah || i == 1 || i == jumlah) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
                
            }
            System.out.println("");
            
        }    
                }
            }
