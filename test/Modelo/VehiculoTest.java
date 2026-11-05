/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author valer
 */
public class VehiculoTest {
    
    public VehiculoTest() {
    }

    /**
     * Test of calcularCostoBase method, of class Vehiculo.
     */
    @Test
    public void testCalcularCostoBase_menor() {
        System.out.println("testCalcularCostoBase_menor");
        Vehiculo instance = new Vehiculo("ABC 123", "Martha", 1000.0, new RegistroTecnico("123", "Cali", 2019));
        double expResult = 800.0;
        double result = instance.calcularCostoBase();
        assertEquals(expResult, result, 0.01);

    }

    
    @Test
    public void testCalcularCostoBase_Año021() {
        System.out.println("calcularCostoBase - Año 2021 (mayor a 2020)");
        
       
        RegistroTecnico registro = new RegistroTecnico("123", "Cali", 2021);
        Vehiculo instance = new Vehiculo("ABC 123", "Martha", 1000.0, registro);
        
        
        double expResult = 1200.0;
        double result = instance.calcularCostoBase();
        
        assertEquals(expResult, result, 0.01);
    }


    @Test
    public void testCalcularCostoBase_Año2020() {
        System.out.println("calcularCostoBase - Año 2020 (igual a 2020)");
        
        
        RegistroTecnico registro = new RegistroTecnico("123", "Cali", 2020);
        Vehiculo instance = new Vehiculo("ABC 123", "Martha", 1000.0, registro);
        
        
        double expResult = 1200.0;
        double result = instance.calcularCostoBase();
        
        assertEquals(expResult, result, 0.01);
    }
    
    
    
     public void testCalcularCostoBase_factor() {
        System.out.println("calcularCostoBase");
        double factor = 1.1;
        RegistroTecnico objRT = new RegistroTecnico("123", "CALI", 2019);
        Vehiculo instance = new Vehiculo("ABC 123", "Martha", 1000.0, objRT);
        String expResult = "880.0 INCREMENTO MODERADO";
        String result = instance.calcularCostoBase(factor);
        assertEquals(expResult, result);
    }

    public void testCalcularCostoBase_double_moderado12() {
        System.out.println("testCalcularCostoBase_double_moderado12");
        double factor = 1.2;
        Vehiculo instance = new Vehiculo("ABC 123", "Martha", 1000.0, new RegistroTecnico("123", "Cali", 2019));
        String expResult = "960.0 INCREMENTO MODERADO";
        String result = instance.calcularCostoBase(factor);
        assertEquals(expResult, result);
    }

       
    /**
     * Test of calcularCostoBase method, of class Vehiculo.
     */
    @Test
    public void testCalcularCostoBase_double() {
        System.out.println("calcularCostoBase");
        double factor = 0.0;
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.calcularCostoBase(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCostoTotal method, of class Vehiculo.
     */
    @Test
    public void testCalcularCostoTotal() {
        System.out.println("calcularCostoTotal");
        Vehiculo instance = null;
        double expResult = 0.0;
        double result = instance.calcularCostoTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlaca method, of class Vehiculo.
     */
    @Test
    public void testGetPlaca() {
        System.out.println("getPlaca");
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.getPlaca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlaca method, of class Vehiculo.
     */
    @Test
    public void testSetPlaca() {
        System.out.println("setPlaca");
        String placa = "";
        Vehiculo instance = null;
        instance.setPlaca(placa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreConductor method, of class Vehiculo.
     */
    @Test
    public void testGetNombreConductor() {
        System.out.println("getNombreConductor");
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.getNombreConductor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreConductor method, of class Vehiculo.
     */
    @Test
    public void testSetNombreConductor() {
        System.out.println("setNombreConductor");
        String nombreConductor = "";
        Vehiculo instance = null;
        instance.setNombreConductor(nombreConductor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKilometraje method, of class Vehiculo.
     */
    @Test
    public void testGetKilometraje() {
        System.out.println("getKilometraje");
        Vehiculo instance = null;
        double expResult = 0.0;
        double result = instance.getKilometraje();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKilometraje method, of class Vehiculo.
     */
    @Test
    public void testSetKilometraje() {
        System.out.println("setKilometraje");
        double kilometraje = 0.0;
        Vehiculo instance = null;
        instance.setKilometraje(kilometraje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuRegistro method, of class Vehiculo.
     */
    @Test
    public void testGetSuRegistro() {
        System.out.println("getSuRegistro");
        Vehiculo instance = null;
        RegistroTecnico expResult = null;
        RegistroTecnico result = instance.getSuRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSuRegistro method, of class Vehiculo.
     */
    @Test
    public void testSetSuRegistro() {
        System.out.println("setSuRegistro");
        RegistroTecnico suRegistro = null;
        Vehiculo instance = null;
        instance.setSuRegistro(suRegistro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vehiculo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
