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
        System.out.println("Ejercicio 2\ngrados Celsius a Farenheit");
        System.out.println("Ingrese cantidad grados Celsius : ");
        double gcelsius = sc.nextDouble();
        System.out.println("Grados Farenheit: "+algoritmos.celsiusToFarenheit02(gcelsius));
        
        
        System.out.println("Ejercicio 4\nCalcular descuento de un producto");
        System.out.println("Ingrese precio normal : ");
        double pnormal = sc.nextDouble();
        System.out.println("Ingrese precio pagado : ");
        double ppagado = sc.nextDouble();
        System.out.println("Descuento de : "+algoritmos.calculateDiscount04(pnormal, ppagado)+"%");
        
        
        System.out.println("Ejercicio 6\nArea y perimetro triangulo rectangulo");
        System.out.println("Ingrese base: ");
        var base = sc.nextDouble();
        System.out.println("Ingrese altura: ");
        var altura = sc.nextDouble();
        System.out.println("Area del triangulo rectangulo : "+algoritmos.calculateArea06(base, altura));
        System.out.println("Perimetro del triangulo rectangulo: "+algoritmos.calculatePerimeter06(base, altura));
        
        
        System.out.println("Ejercicio 8\nperimetro , semiperimetro y area de un triangulo");
        System.out.println("Ingrese lado a: ");
        var ladoA = sc.nextDouble();
        System.out.println("Ingrese lado b: ");
        var ladoB = sc.nextDouble();
        System.out.println("Ingrese lado c: ");
        var ladoC = sc.nextDouble();
        System.out.println("Area del triangulo: "+algoritmos.calculateAreaTriangle08(ladoA, ladoB, ladoC));
        System.out.println("Perimetro del triangulo: "+algoritmos.calculatePerimeterTriangle08(ladoA, ladoB, ladoC));
        System.out.println("Semiperimetro del triangulo: "+algoritmos.calculateSemiPerimeterTriangle08(ladoA, ladoB, ladoC));
        
        
        System.out.println("Ejercicio 10");
        System.out.println("Leer A y B  e intercambiar valores sin usar variables auxiliares");
        System.out.println("Ingrese A: ");
        var valorA = sc.nextInt();
        System.out.println("Ingrese B");
        var valorB = sc.nextInt();
        System.out.println("valores intercambiados: "+algoritmos.swapValues10(valorA, valorB));
        
        
        System.out.println("Ejercicio 12");
        System.out.println("multiplicacion entre el primero y la suma de los dos ultimos");
        System.out.println("ingrese a: ");
        var a = sc.nextInt();
        System.out.println("ingrese b: ");
        var b = sc.nextInt();
        System.out.println("ingrese c: ");
        var c = sc.nextInt();
        System.out.println("Resultado: "+algoritmos.calculateMultiplication12(a, b, c));
        
        System.out.println("Ejercicio 14");
        System.out.println("5 números y muestre la suma de la mitad de \n" +
                "    los tres primeros más el tercio de la multiplicación de los dos últimos");
        System.out.println("ingrse a: ");
        a = sc.nextInt();
        System.out.println("ingrese b: ");
        b = sc.nextInt();
        System.out.println("ingrse c: ");
        c = sc.nextInt();
        System.out.println("ingrese d: ");
        var d = sc.nextInt();
        System.out.println("ingrese e: ");
        var e = sc.nextInt();
        System.out.println("Resultado: "+algoritmos.calculateMultiplication14(a, b, c, d, e));
        
        
        System.out.println("Ejercicio 16");
        System.out.println("programa que reciba el peso de un archivo en KB y el peso de un \n" +
        "    pendrive en GB, para mostrar en pantalla el numero de archivos que se puede \n" +
        "    almacenar en el pendrive");
        System.out.println("Ingrese peso del archivo en KB: ");
        var archivoKB = sc.nextDouble();
        System.out.println("Ingrese tamanio del pendrive en GB: ");
        var pendriveGb = sc.nextDouble();
        System.out.println("Numero de archivos que se pueden almacenar: "+algoritmos.fileNumber16(archivoKB, pendriveGb));
        
        
        System.out.println("Ejercicio 18");
        System.out.println("Mostrar los numeros del 1 al 10 en forma descendente");
        System.out.println(algoritmos.reverseCount18());
        System.out.println("Ejercicio 20");
        System.out.println("Mostrar todos los numeros pares entre 8 y 30");
        System.out.println(algoritmos.evenNumbers20());
        
    }
}
