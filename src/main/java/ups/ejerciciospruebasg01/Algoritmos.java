/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejerciciospruebasg01;


public class Algoritmos {
    
    public double celsiusToFarenheit(double celsius){
        return  (celsius*1.8)+32;
    }
    
    public double calculateDiscount(double normalPrice, double paidPrice ){
        var des =  (100*(normalPrice-paidPrice))/normalPrice;
        return des;
    }
    
    public double calculateArea(double base, double height){
        var area = (base*height)/2;
        return area;
    }
    
    public double calculatePerimeter(double base, double height){
        var c = Math.sqrt(Math.pow(base,2d)+Math.pow(height, 2));
        
        return base + height + c;
        
    }

}
    
