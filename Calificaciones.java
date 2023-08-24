
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisp
 */
public class Calificaciones {
    public static void main(String[] args) {
        //declarar las variables
        
        float nota1,nota2,nota3,suma,div;
        
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("escriba su primera calificacion"));
        
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("escriba su segunda calificacion"));
        
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("escriba su tercera calificacion"));
        
        //proceso
        
        suma = nota1 + nota2 + nota3 + 1;
        div = suma/3;
        
        //muestro el resultado
        
        JOptionPane.showMessageDialog(null,"la media del trimestre es "+suma);
        
    }
}