import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class Redondear {
    public static void main(String[] args) {
       double numero,redon;
       
       numero = Double.parseDouble(JOptionPane.showInputDialog("digite el numero que quiera redondear "));
       
       redon = Math.round(numero);
       
       JOptionPane.showMessageDialog(null,"el numero " +numero+ " redondeado es "+redon);
         
    }
}