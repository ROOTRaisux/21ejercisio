/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class Descuento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double compra, descuento, total;
        
        System.out.println("escribe de cuanto fue su compra");
        compra = teclado.nextInt();
        
        descuento = compra*0.20;
        total = compra - descuento;
        
        if (compra>300){
            System.out.println("el descuento es de "+descuento);
            
            System.out.println("el total a pagar es " +total);
        }else{
            System.out.println("sin descuentos el total es "+total);
        }
                
    }
}