/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class Edad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int edad;
        
        System.out.println("digite su edad");
        edad = (int) teclado.nextInt();
        
        if (edad>=18){
            System.out.println("es mayor de edad");
        }else {
            System.out.println("es menor de edad");
        }
    }
}