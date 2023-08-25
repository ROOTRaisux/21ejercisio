import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class MinusMayus {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("digite una letra");
        char letra = teclado.nextLine().charAt(0);
        
        if (Character.isUpperCase(letra)){
            System.out.println("la letra es Mayuscula");
            
        }else {
            System.out.println("la letra es minuscula");
        }
        
    }
}