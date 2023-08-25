
import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class SaldoBanco {
    public static void main(String[] args) {
        //declarar variables 
        Scanner teclado = new Scanner (System.in);
        
        int gasto1, gasto2, gasto3, resultado;
        
        gasto1 = Integer.parseInt(JOptionPane.showInputDialog("digite su primer gasto"));
        
        gasto2 = Integer.parseInt(JOptionPane.showInputDialog("digite su segundo gasto"));
        
        gasto3 = Integer.parseInt(JOptionPane.showInputDialog("digite su tercer gasto"));
        
        //proceso
        
        resultado = gasto1 - gasto2 - gasto3;
        
        
        //muestro el resultado
        
        JOptionPane.showMessageDialog(null,"su saldo final es "+resultado);
        
    }
}