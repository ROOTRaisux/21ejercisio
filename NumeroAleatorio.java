
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        
        int numero;
        
        numero = (int)(Math.random()*20+1);
        
        JOptionPane.showMessageDialog(null,"numero aleatorio: "+numero);
                
        
        
        
        
    }
}