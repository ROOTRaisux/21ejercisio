/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class MasaPeso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int peso;
        double alt, imc;
        
        System.out.println("digite su peso");
        peso = teclado.nextInt();
        
        System.out.println("digite su altura");
        alt = teclado.nextInt();
        
        //proceso
        
        imc = peso / (alt*alt);
        
        if (imc >= 16 && imc<17){
            System.out.println("tiene infra peso");
                    
        }else if(imc >17 && imc<18){
            System.out.println("tiene bajo peso");
            
        }else if(imc>18 && imc<25){
            System.out.println("tiene buen peso saludable");
            
        }else if(imc >25 && imc<30){
            System.out.println("tiene sobre peso (obesidad de grado 1)");
            
        }else if(imc>30 && imc>35){
            System.out.println("tiene sobrepeso cronico (obesidad de grado 2)");
            
        }else{
            System.out.println("no existe clasificacion");
            
        }
                
    }
}
