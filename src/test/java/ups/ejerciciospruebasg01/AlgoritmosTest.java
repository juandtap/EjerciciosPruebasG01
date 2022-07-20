/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ups.ejerciciospruebasg01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC-1
 */
public class AlgoritmosTest {
    
    public AlgoritmosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCelsiusToFarenheit() {
        System.out.println("celsiusToFarenheit");
        //valor de entrada
        double celsius = 15;
        Algoritmos instance = new Algoritmos();
        double expResult = 59;
        double result = instance.celsiusToFarenheit02(celsius);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testCalculateDiscount() {
        System.out.println("calculateDiscount");
        double normalPrice = 100;
        double paidPrice = 75;
        Algoritmos instance = new Algoritmos();
        double expResult = 25;
        double result = instance.calculateDiscount04(normalPrice, paidPrice);
        assertEquals(expResult, result, 0.0);
      
    }

    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double base = 3;
        double height = 4;
        Algoritmos instance = new Algoritmos();
        double expResult = 6;
        double result = instance.calculateArea06(base, height);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        double base = 3;
        double height = 4;
        Algoritmos instance = new Algoritmos();
        double expResult = 12;
        double result = instance.calculatePerimeter06(base, height);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
