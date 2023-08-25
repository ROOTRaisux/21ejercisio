import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int 11, 12, 13;
        
        System.out.println("escriba el lado A");
        11 = teclado.nextInt();
        
        System.out.println("escriba el lado B");
        12 = teclado.nextInt();
        
        System.out.println("escriba el lado C");
        13 = teclado.nextInt();
        
        if (11 == 12 && 12 == 13){
            System.out.println("triangulo es equilatero");
            
            else if (11 == 12 || 11 == 13 || 12 == 13);{
            System.out.println("triangulo es isoceles");
        }else if (11!=12 || 11!=13 || 13!=12){
                System.out.println("triangulo es escaleno");
                }
        }        
          
        
        
        