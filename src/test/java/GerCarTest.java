/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sam
 */
public class GerCarTest {
    
    public GerCarTest() {
    }

    @Test
    public void testCadastraCarro() {
        Carro car = new Carro();
        String placa = "ABC1234";
        car.setAno(2010);
        car.setModelo("Gol");
        car.setMarca("Volkswagen");
        car.setPlaca(placa);
        GerCar instance = new GerCar();
        Carro result = instance.cadastraCarro(car);
        assertEquals(placa, result.getPlaca());
    }


    @Test
    public void testConsultaCarro() {
        Carro c1 = new Carro();
        String placa = "ABC1234";
        c1.setAno(2010);
        c1.setModelo("Gol");
        c1.setMarca("Volkswagen");
        c1.setPlaca(placa);
        
        GerCar instance = new GerCar();
        instance.cadastraCarro(c1);
        Carro result = instance.consultaCarro(c1);
        assertNotNull(result);
    }

    @Test
    public void testExcluiCarro() {
        Carro c2 = new Carro();
        String placa = "ABC1234";
        c2.setAno(2010);
        c2.setModelo("Gol");
        c2.setMarca("Volkswagen");
        c2.setPlaca(placa);
        
        GerCar instance = new GerCar();
        instance.cadastraCarro(c2);

        Carro expResult = null;
        Carro result = instance.excluiCarro(c2);
        assertEquals(expResult, result);
    }

    @Test
    public void testAtualizaCarro() {
        System.out.println("atualizaCarro");
        Carro c3 = new Carro();
        String placa = "ABC1234";
        c3.setAno(2010);
        c3.setModelo("Gol");
        c3.setMarca("Volkswagen");
        c3.setPlaca(placa);
        
        GerCar instance = new GerCar();
        instance.cadastraCarro(c3);
        Carro result = instance.atualizaCarro(c3);
        assertFalse(result.getModelo().equals("Gol"));
    }
    
}
