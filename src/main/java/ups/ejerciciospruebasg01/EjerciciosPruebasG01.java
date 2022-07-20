/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.ejerciciospruebasg01;

import java.util.Scanner;

/**
 *
 * @author PC-1
 */
public class EjerciciosPruebasG01 {

    public static void main(String[] args) {
        
        Algoritmos algoritmos = new Algoritmos();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 1\ngrados Celsius a Farenheit");
        System.out.println("Ingrese cantidad grados Celsius : ");
        double gcelsius = sc.nextDouble();
        System.out.println("Grados Farenheit: "+algoritmos.celsiusToFarenheit(gcelsius));
        System.out.println("Ejercicio 2\nCalcular descuento de un producto");
        System.out.println("Ingrese precio normal : ");
        double pnormal = sc.nextDouble();
        System.out.println("Ingrese precio pagado : ");
        double ppagado = sc.nextDouble();
        System.out.println("Descuento de : "+algoritmos.calculateDiscount(pnormal, ppagado)+"%");
        
        
    }
}
