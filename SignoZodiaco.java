import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class SignoZodiaco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int dia, mes;
        
        System.out.println("introduce tu dia");
        dia = teclado.nextInt();
        
        System.out.println("introduce tu mes");
        mes = teclado.nextInt();
        
        if (mes == 1){
            if (dia >= 21){
                
                System.out.println("acuario");
            }else {
                System.out.println("capricornio");
                
                if (mes == 2){
                    if (dia >= 19){
                        System.out.println("piscis");
                        
                    }else {
                        System.out.println("acuario");
                        
                        if (mes == 3){
                            if (dia >= 20){
                                
                                System.out.println("aries");
                            }else {
                                System.out.println("piscis");
                                
                                if (mes == 4){
                                    if (dia >= 21){
                                        System.out.println("geminis");
                                    }else {
                                        System.out.println("tauro");
                                        
                                        if (mes == 6){
                                            if (dia >= 20){
                                                System.out.println("cancer");
                                            }else {
                                                System.out.println("geminis");
                                                
                                                if (mes == 7){
                                                    if (dia >=22){
                                                        System.out.println("leo");
                                                    }else {
                                                        System.out.println("cancer");
                                                        
                                                        if (mes == 8){
                                                            if (dia>= 21){
                                                                System.out.println("virgo");
                                                            }else {
                                                                System.out.println("leo");
                                                                
                                                                if (mes == 9){
                                                                    if (dia >= 22){
                                                                        System.out.println("libra");
                                                                    }else {
                                                                        System.out.println("virgo");
                                                                        
                                                                        if (mes == 10){
                                                                            if (dia >= 22){
                                                                                System.out.println("escorpion");
                                                                            }else {
                                                                                System.out.println("libra");
                                                                                
                                                                                if (mes == 11){
                                                                                    if (dia >=21){
                                                                                        System.out.println("sagitario");
                                                                                    }else {
                                                                                        System.out.println("escorpion");
                                                                                        
                                                                                        if (mes == 12){
                                                                                            if (dia >= 21){
                                                                                                System.out.println("capricornio");
                                                                                            }else {
                                                                                                System.out.println("sagitario");
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } 
                                                                    
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
