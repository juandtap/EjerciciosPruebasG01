/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejerciciospruebasg01;


public class Algoritmos {
    
    // Ejercicio 02 
    // grados celsius a grados farenheit
    public double celsiusToFarenheit02(double celsius){
        return  (celsius*1.8)+32;
    }
     // Ejercicio 04
    // calcular el descuento con precio normal y precio pagado
    public double calculateDiscount04(double normalPrice, double paidPrice ){
        var des =  (100*(normalPrice-paidPrice))/normalPrice;
        return Math.round(des);
    }
    
    // Ejercicio 06
    // calcular el area y perimetro de un triangulo rectangulo dado su base y altura
    public double calculateArea06(double base, double height){
        var area = (base*height)/2;
        return area;
    }
    
    public double calculatePerimeter06(double base, double height){
        var c = Math.sqrt(Math.pow(base,2d)+Math.pow(height, 2));
        
        return base + height + c;
        
    }
    
    // Ejercicio 08
    // calcular perimetro , semiperimetro y area dado 3 lados de un triangulo 
    // A^2 = s(s-a)(s-b)(s-c)
    public double calculatePerimeterTriangle08(double a, double b, double c){
           var perimeter = a + b + c;
           return perimeter;
            
    }
    
    public double calculateSemiPerimeterTriangle08(double a, double b, double c){
           var semiPerimeter = calculatePerimeterTriangle08(a, b, c)/2;
           return semiPerimeter;
            
    }
    
    public double calculateAreaTriangle08(double a, double b, double c){
        var s = calculateSemiPerimeterTriangle08(a, b, c);
        var area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
            
    }
    
    // Ejercicio 10
    // Leer A y B  y pase el valor  de A  a B y B a A sin usar variables auxiliares
    public String swapValues10(int valueA, int valueB){
        
        var A = valueA;
        var B = valueB;
        
        A = A + B;
        
        B = A - B;
        A = A - B;
        
        var values = A+" y "+B;
        
        return values;
        
    }
    
    /*
    Ejercicio 12
    Crear un programa que reciba por teclado 3 y luego muestre en pantalla la 
    multiplicación entre el primero y la suma de los dos últimos.
    */
    public int calculateMultiplication12(int a, int b, int c){
        return a*(b+c);
    }
    
    
    /*
    Ejercicio 14
    Elaborar un programa que reciba 5 números y muestre la suma de la mitad de 
    los tres primeros más el tercio de la multiplicación de los dos últimos.
    */
    
    public int calculateMultiplication14(int a, int b, int c, int d, int e){
        var sum = (a + b +c)/2;
        var product = (d*e)/3; 
        return sum + product;
    }
    
    /*
    
    Ejericio 16
    Crear un programa que reciba el peso de un archivo en KB y el peso de un 
    pendrive en GB, para mostrar en pantalla el número de archivos que se puede 
    almacenar en el pendrive
    
    */
    
    public int fileNumber16(double fileInKB, double driveInGB){
        var driveInKB = driveInGB * Math.pow(10,6);
        var fileNum = driveInKB / fileInKB;
        
        return (int) fileNum;
    }
    
    /*
    Ejercicio 18
    Mostrar los números del 1 al 10 en forma descendente
    */
    
    public String reverseCount18(){
        var revCount = "";
        var start = 10;
        var end = 0;
        for (int i = start; i > end; i--) {
            revCount = revCount + String.valueOf(i)+" ";
        }
        return revCount;
        
    }
    
    /*
    Ejercicio 20
    Mostrar todos los números pares entre 8 y 30
    */
    public String evenNumbers20(){
        var start = 8;
        var end = 30;
        var count = "";
        for (int i = start; i <= end; i++) {
            if (i%2 == 0) {
                count = count + String.valueOf(i)+" ";
                         
            }
        }
        
        return count;
    }
    
        
    

}
    
