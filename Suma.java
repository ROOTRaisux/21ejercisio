import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class Suma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int num1, num2;
        
        System.out.println("digite el primer numero");
        num1 = teclado.nextInt();
        
        System.out.println("digite el segundo numero");
        num2 = teclado.nextInt();
        
        int respuesta = num1 + num2;
        
        System.out.println("la suma de los dos numeros es: "+respuesta);
    }
}