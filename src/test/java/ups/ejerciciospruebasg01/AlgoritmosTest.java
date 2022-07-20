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
    public void testCelsiusToFarenheit02() {
        System.out.println("celsiusToFarenheit02");
        double celsius = 15;
        Algoritmos instance = new Algoritmos();
        double expResult = 59;
        double result = instance.celsiusToFarenheit02(celsius);
        assertEquals(expResult, result, 0.0);
       
    }

    @Test
    public void testCalculateDiscount04() {
        System.out.println("calculateDiscount04");
        double normalPrice = 100;
        double paidPrice = 75;
        Algoritmos instance = new Algoritmos();
        double expResult = 25;
        double result = instance.calculateDiscount04(normalPrice, paidPrice);
        assertEquals(expResult, result, 0.0);
      
    }

    @Test
    public void testCalculateArea06() {
        System.out.println("calculateArea06");
        double base = 3;
        double height = 4;
        Algoritmos instance = new Algoritmos();
        double expResult = 6;
        double result = instance.calculateArea06(base, height);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testCalculatePerimeter06() {
        System.out.println("calculatePerimeter06");
        double base = 3;
        double height = 4;
        Algoritmos instance = new Algoritmos();
        double expResult = 12;
        double result = instance.calculatePerimeter06(base, height);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testCalculatePerimeterTriangle08() {
        System.out.println("calculatePerimeterTriangle08");
        double a = 6;
        double b = 6;
        double c = 6;
        Algoritmos instance = new Algoritmos();
        double expResult = 18;
        double result = instance.calculatePerimeterTriangle08(a, b, c);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testCalculateSemiPerimeterTriangle08() {
        System.out.println("calculateSemiPerimeterTriangle08");
        double a = 6;
        double b = 6;
        double c = 6;
        Algoritmos instance = new Algoritmos();
        double expResult = 9;
        double result = instance.calculateSemiPerimeterTriangle08(a, b, c);
        assertEquals(expResult, result, 0.0);
       
    }

    @Test
    public void testCalculateAreaTriangle08() {
        System.out.println("calculateAreaTriangle08");
        double a = 6;
        double b = 6;
        double c = 6;
        Algoritmos instance = new Algoritmos();
        double expResult = 9*Math.sqrt(3);
        double result = instance.calculateAreaTriangle08(a, b, c);
        assertEquals(expResult, result, 0.0001);
      
    }

     @Test
    public void testSwapValues10() {
        System.out.println("swapValues10");
        int valueA = 5;
        int valueB = 4;
        Algoritmos instance = new Algoritmos();
        String expResult = "4 y 5";
        String result = instance.swapValues10(valueA, valueB);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testCalculateMultiplication12() {
        System.out.println("calculateMultiplication12");
        int a = 3;
        int b = 4;
        int c = 5;
        Algoritmos instance = new Algoritmos();
        int expResult = 27;
        int result = instance.calculateMultiplication12(a, b, c);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testCalculateMultiplication14() {
        System.out.println("calculateMultiplication14");
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 6;
        int e = 7;
        Algoritmos instance = new Algoritmos();
        int expResult = 20;
        int result = instance.calculateMultiplication14(a, b, c, d, e);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testFileNumber16() {
        System.out.println("fileNumber16");
        double fileInKB = 256;
        double driveInGB = 1;
        Algoritmos instance = new Algoritmos();
        int expResult = 3906;
        int result = instance.fileNumber16(fileInKB, driveInGB);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testReverseCount18() {
        System.out.println("reverseCount18");
        Algoritmos instance = new Algoritmos();
        String expResult = "10 9 8 7 6 5 4 3 2 1 ";
        String result = instance.reverseCount18();
        assertEquals(expResult, result);
       
    }

    @Test
    public void testEvenNumbers20() {
        System.out.println("evenNumbers20");
        Algoritmos instance = new Algoritmos();
        String expResult = "8 10 12 14 16 18 20 22 24 26 28 30 ";
        String result = instance.evenNumbers20();
        assertEquals(expResult, result);
       
    }

   
    
}
