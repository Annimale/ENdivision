/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proyecto_division;

import java.util.InputMismatchException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ivamar
 */
public class DivisionTest {

    public DivisionTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Iniciando test");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Test finalizado");
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCalcularDivision() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 10.0F;
        float divisor = 5.0F;
        float expResult = 2.0F;
        float result = Division.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testCalcularDivisionPorCero() throws Exception{
        System.out.println("testCalcularDivisionPorCero");

        float dividendo = 10.0F;
        float divisor = 0.0F;

        assertThrows(Exception.class, () -> {
            Division.calcularDivision(dividendo, divisor);
        });
    }
}


