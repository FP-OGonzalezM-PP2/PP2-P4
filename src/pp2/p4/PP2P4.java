/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p4;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class PP2P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double g, f;
        //use un metodo para pedir la variable
        f = pedirGrados();
        //otro metodo para calcularla
        g = Calcular(f);
        //y un ultimo metodo para mostarlo al usuario
        Mostrar(f,g);
    }
    public static double pedirGrados (){
        double grados;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba los grados centigrados ");
        grados = entrada.nextDouble();
        return grados;
    }
    public static double Calcular(double g){
        double fahrenheit;
        //esta es la formula para convertir los grados centigrados a fahrenheit
        fahrenheit = g * (9/5) + 32;
        return fahrenheit;
    }
    public static void Mostrar(double g, double f){
        System.out.println("Los " +g +" grados centigrados, equivalen a : " +f +" grados fahrenheit");
    }
}
