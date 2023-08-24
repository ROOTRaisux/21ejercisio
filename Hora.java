/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class Hora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int H,M,S;
        
        System.out.println("introduzca una hora: ");
        H = (int) teclado.nextInt();
        
        System.out.println("introduzca minutos");
        M = (int) teclado.nextInt();
        
        System.out.println("introduzca segundos");
        S = (int) teclado.nextInt();
        
        if (H>=0 && H<21 && M>=0 && M<60 && S>=0 && S<60){
            System.out.println("su hora es: "+H+" : "+M+" : "+S);
        }else{
            System.out.println("hora incorrecta");
        }
        
    }
}