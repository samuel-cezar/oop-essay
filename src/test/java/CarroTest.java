/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sam
 */
public class CarroTest {
    
    public CarroTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void testGetAno() {
        System.out.println("getAno");
        Carro instance = new Carro();
        instance.setAno(2000);
        int maximo = 2024;
        int minimo = 1886;
        int result = instance.getAno();
        assertTrue(maximo > result);
        assertTrue(minimo < result);
    }

    @Test
    public void testSetAno() {
        System.out.println("setAno");
        int ano = 2000;
        int maximo = 2024;
        Carro instance = new Carro();
        instance.setAno(ano);
        assertTrue(maximo > instance.getAno());
        
        instance.setAno(2025);
        assertTrue(maximo < instance.getAno());
    }

    @Test
    public void testGetPlaca() {
        System.out.println("getPlaca");
        Carro instance = new Carro();
        instance.setPlaca("ABC1234");
        String result = instance.getPlaca();
        
        assertTrue(result.length() == 7);
        
        instance.setPlaca("ABC12345");
        String result2 = instance.getPlaca();
        
        assertTrue(result2.length() == 0);
    }

    @Test
    public void testSetPlaca() {
        System.out.println("setPlaca");
        String placa = "ABC1234";
        Carro instance = new Carro();
        instance.setPlaca(placa);
        String result = instance.getPlaca();
        assertTrue(result.length() == 7);
        
        instance.setPlaca("ABC12345");
        String result2 = instance.getPlaca();
        
        assertTrue(result2.length() == 0);
    }
}
