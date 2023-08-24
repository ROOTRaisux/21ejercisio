/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */

import javax.swing.JOptionPane;

 class Division {
    public static void main(String[] args) {
        //declarar variables
        
        int numero1, numero2, resultado;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("escriba un numero"));
        
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("escriba otro numero"));
        
        //proceso
        
        resultado = numero1 / numero2 + 12;
        
        //muestro el resultado
        
        JOptionPane.showMessageDialog(null,"el numero total es "+resultado);
        
        
    }
}