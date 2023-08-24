
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class CrecienteDecreciente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
    
        int num1,num2,num3;
        
        System.out.println("digite el primer numero");
        num1 = teclado.nextInt();
        
        System.out.println("digite el segundo numero");
        num2 = teclado.nextInt();
        
        System.out.println("digite el tercer numero");
        num3 = teclado.nextInt();
        
        if (num1<num2 && num2<num3 && num3>num1){
            System.out.println("estan en orden creciente");
            
        } else if (num1>num2 && num2>num3 && num3<num1){
            System.out.println("estan en orden decreciente");
        }else {
            System.out.println("no aumenta ni disminuye el orden");
        }
    }
}