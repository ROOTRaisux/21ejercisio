import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class Meses {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int mes;
        
        System.out.println("ingrese el numero del mes");
        mes = teclado.nextInt();
        
        if (mes == 1 && mes == 3 && mes == 5 && mes == 7 && mes == 8 && mes == 10 && mes == 12){
            System.out.println("el mes seleccionado tiene 31 dias");
            
        }else if (mes ==2){
            System.out.println("febrero tiene 28 dias");
            
        }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            System.out.println("el mes seleccionado tiene 30 dias");
        }
                
                
    }
}